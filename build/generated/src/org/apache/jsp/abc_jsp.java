package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Calendar;

public final class abc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    // Check if the user is logged in
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login1.jsp?message=Please login to access this feature.");
        return;
    }
   
    boolean isDoctor = false;

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
        Statement stmt = conn.createStatement();

        String roleQuery = "SELECT ROLE FROM AV.LOGIN_DETAILS WHERE USERNAME = '" + username + "'";
        ResultSet rsRole = stmt.executeQuery(roleQuery);

        if (rsRole.next()) {
            String role = rsRole.getString("ROLE");
            if ("Doctor".equalsIgnoreCase(role)) {
                isDoctor = true;
            }
        }
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    if (!isDoctor) {
        response.sendRedirect("medicalrec.jsp?message=Access Denied. Doctors Only.");
        return;
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Patient Medical Records</title>\n");
      out.write("    <style>\n");
      out.write("        body { font-family: Arial, sans-serif; margin: 0; padding: 0; }\n");
      out.write("        .header {\n");
      out.write("           \n");
      out.write("             background: linear-gradient(45deg, #b2dfdb, #e1f5fe, #dcedc1);\n");
      out.write("             padding: 15px;\n");
      out.write("             display: flex;\n");
      out.write("             justify-content: space-between;\n");
      out.write("             align-items: center;\n");
      out.write("             border-radius: 15px;\n");
      out.write("             box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("             }\n");
      out.write("\n");
      out.write("           \n");
      out.write("        .header img {\n");
      out.write("            height: 100px;\n");
      out.write("            width: 100px;\n");
      out.write("        }\n");
      out.write("       .menu {\n");
      out.write("            display: flex;\n");
      out.write("            gap: 35px;\n");
      out.write("            position: relative;\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px 30px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("           \n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .menu a {\n");
      out.write("            text-decoration:none;\n");
      out.write("            color: black;\n");
      out.write("            font-weight: bold;\n");
      out.write("            position: relative;\n");
      out.write("             font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .menu-item {\n");
      out.write("            position: relative;\n");
      out.write("           font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .dropdown {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 100%;\n");
      out.write("            left: 0;\n");
      out.write("            display: none;\n");
      out.write("              background: #4db6ac;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);\n");
      out.write("            border-radius: 5px;\n");
      out.write("            z-index: 1000;\n");
      out.write("            min-width: 250px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            transform: translateY(10px);\n");
      out.write("            transition: opacity 0.3s ease, transform 0.3s ease;\n");
      out.write("   \n");
      out.write("   \n");
      out.write("        }\n");
      out.write("        .dropdown a {\n");
      out.write("            display: block;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: #333;\n");
      out.write("    font-weight: bold;\n");
      out.write("    background: white;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    margin: 5px 10px;\n");
      out.write("    transition: background 0.3s ease, transform 0.2s ease;\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("        .dropdown a:hover {\n");
      out.write("            background-color: #b2dfdb;\n");
      out.write("    transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("        .dropdown.show {\n");
      out.write("          display: block;\n");
      out.write("          opacity: 1;\n");
      out.write("          transform: translateY(0);\n");
      out.write("}\n");
      out.write("        .menu-item:hover .dropdown {\n");
      out.write("            display: block;\n");
      out.write("            opacity: 1;\n");
      out.write("            transform: translateY(0);\n");
      out.write("        }\n");
      out.write("        .menu-item:last-child .dropdown {\n");
      out.write("            left: auto;\n");
      out.write("            right: 0;\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("        .main-section\n");
      out.write("              {\n");
      out.write("                     background: white;\n");
      out.write("                     text-align: center;\n");
      out.write("                     padding: 30px;\n");
      out.write("              }\n");
      out.write("         .main-section h1 {\n");
      out.write("            color: black;\n");
      out.write("            font-size: 3.5rem;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("       .search-panel {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            background: linear-gradient(135deg, #26547c, #06d6a0);\n");
      out.write("            padding: 15px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("            width: 50%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("        }\n");
      out.write("        .search-panel input {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px 30px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("            font-weight: bold;\n");
      out.write("            width: 70%;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("        .record-table { margin: auto; width: 80%; border-collapse: collapse; margin-top: 20px; }\n");
      out.write("        .record-table th, .record-table td { border: 1px solid #ddd; padding: 10px; text-align: left; }\n");
      out.write("        .record-table th { background-color: #f2f2f2; font-weight: bold; }\n");
      out.write("         \n");
      out.write("        .edit-button { padding: 5px 10px; background-color: #007bff; color: white; border: none; cursor: pointer; border-radius: 5px; }\n");
      out.write("        .edit-button:hover { background-color: #0056b3; }\n");
      out.write("        .patient-block { margin-bottom: 30px; border: 2px solid #ddd; padding: 15px; border-radius: 10px; background-color: #f9f9f9; }\n");
      out.write("        .patient-name { font-size: 1.2rem; font-weight: bold; margin-bottom: 10px; }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function searchRecords() {\n");
      out.write("            let input = document.getElementById(\"searchInput\").value.toLowerCase();\n");
      out.write("            let patientBlocks = document.getElementsByClassName(\"patient-block\");\n");
      out.write("           \n");
      out.write("            for (let block of patientBlocks) {\n");
      out.write("                let patientName = block.getElementsByClassName(\"patient-name\")[0].innerText.toLowerCase();\n");
      out.write("                block.style.display = patientName.includes(input) ? \"\" : \"none\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     \n");
      out.write("     <div class=\"header\">\n");
      out.write("        <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <div class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Login</a>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <a href=\"login1.jsp\">Are you a Patient?</a>\n");
      out.write("                    <a href=\"login1.jsp\">Are you a Doctor?</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"started.jsp\">Home</a>\n");
      out.write("            <a href=\"#about\">About Us</a>\n");
      out.write("            <a href=\"faq.jsp\">FAQs</a>\n");
      out.write("            <a href=\"contact.html\">Contact Us</a>\n");
      out.write("           \n");
      out.write("            <div class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Profile</a>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <a href=\"profile.jsp\">My Profile</a>\n");
      out.write("                   \n");
      out.write("                    <a href=\"logout.jsp\">Sign Out</a>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    <div class=\"main-section\">\n");
      out.write("        <h1>Patient Medical Records</h1>\n");
      out.write("        <div class=\"search-panel\">\n");
      out.write("            <input type=\"text\" id=\"searchInput\" onkeyup=\"searchRecords()\" placeholder=\"Search by Patient Name...\">\n");
      out.write("        </div>\n");
      out.write("        <div id=\"recordsContainer\">\n");
      out.write("           ");

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
       
        // Fetch the doctor's ID based on the logged-in username
        String doctorIdQuery = "SELECT DOCTOR_ID FROM AV.DOCTORS WHERE USERNAME = ?";
        PreparedStatement pstDoctor = conn.prepareStatement(doctorIdQuery);
        pstDoctor.setString(1, username);
        ResultSet rsDoctor = pstDoctor.executeQuery();
       
        int doctorId = -1; // Default invalid value
        if (rsDoctor.next()) {
            doctorId = rsDoctor.getInt("DOCTOR_ID");
        }
        rsDoctor.close();
        pstDoctor.close();
       
        if (doctorId == -1) {
            out.println("<p>Error: Doctor ID not found.</p>");
        } else {
            // Query to fetch only the records of patients who have booked appointments with this doctor
            String query = "SELECT MR.NAME, MH.RECORD_DATE, MH.DIAGNOSIS, MH.TREATMENT, MR.RECORD_ID " +
                           "FROM AV.MEDICAL_RECORDS MR " +
                           "JOIN AV.MEDICAL_HISTORY MH ON MR.RECORD_ID = MH.RECORD_ID " +
                           "JOIN AV.APPOINTMENTS A ON MR.PATIENT_ID = A.PATIENT_ID " +
                           "WHERE A.DOCTOR_ID = ? " +
                           "ORDER BY MR.NAME, MH.RECORD_DATE DESC";
           
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, doctorId);
            ResultSet rs = pst.executeQuery();
           
            String lastPatient = "";
            boolean firstRecord = true;
           
            while (rs.next()) {
                String recordId = rs.getString("RECORD_ID");
                String patientName = rs.getString("NAME");
                String recordDate = rs.getString("RECORD_DATE");
                String diagnosis = rs.getString("DIAGNOSIS");
                String treatment = rs.getString("TREATMENT");
               
                if (!patientName.equals(lastPatient)) {
                    if (!firstRecord) {
                        out.println("</table></div>"); // Close previous patient block
                    }
                    out.println("<div class='patient-block'>");
                    out.println("<div class='patient-name'>" + patientName + "</div>");
                    out.println("<table class='record-table'>");
                    out.println("<tr><th>Date</th><th>Diagnosis</th><th>Treatment</th><th>Action</th></tr>");
                    lastPatient = patientName;
                    firstRecord = false;
                }

      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( recordDate );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( diagnosis );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( treatment );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"edit.jsp\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" name=\"recordId\" value=\"");
      out.print( recordId );
      out.write("\">\n");
      out.write("                            <button type=\"submit\" class=\"edit-button\">Edit</button>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");

            }
            if (!firstRecord) {
                out.println("</table></div>"); // Close last patient block
            }
            rs.close();
            pst.close();
        }
       
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<p>Error loading records. Please try again later.</p>");
    }

      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    ");

    String message = request.getParameter("message");
    if (message != null) {
    
      out.write("\n");
      out.write("        <script>alert(\"");
      out.print( message );
      out.write("\");</script>\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
