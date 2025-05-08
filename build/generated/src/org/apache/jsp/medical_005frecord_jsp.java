package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Calendar;

public final class medical_005frecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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

        if (rsRole.next() && "Doctor".equalsIgnoreCase(rsRole.getString("ROLE"))) {
            isDoctor = true;
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
      out.write("             background: linear-gradient(45deg, #b2dfdb, #e1f5fe, #dcedc1);\n");
      out.write("             padding: 15px;\n");
      out.write("             display: flex;\n");
      out.write("             justify-content: space-between;\n");
      out.write("             align-items: center;\n");
      out.write("             border-radius: 15px;\n");
      out.write("             box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("             }\n");
      out.write("        .profile-container {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            margin-left: 10px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        .profile-pic {\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            object-fit: cover;\n");
      out.write("            border: 2px solid #0077b6;\n");
      out.write("        }\n");
      out.write("        .header img {\n");
      out.write("            height: 100px;\n");
      out.write("            width: 100px;\n");
      out.write("        }\n");
      out.write("        .main-section {\n");
      out.write("            background-image: url('images/b5.jpg');\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("        .main-section h1 {\n");
      out.write("            color: black;\n");
      out.write("            font-size: 3.5rem;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .patient-block {\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("            border: 2px solid #ddd;\n");
      out.write("            padding: 15px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            background-color: #f9f9f9;\n");
      out.write("        }\n");
      out.write("        .patient-name {\n");
      out.write("            font-size: 1.2rem;\n");
      out.write("            font-weight: bold;\n");
      out.write("            cursor: pointer;\n");
      out.write("            color: blue;\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("        .record-table {\n");
      out.write("            display: none;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("        .record-table th, .record-table td {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        .record-table th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("    position: fixed;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    background: linear-gradient(to right, #b2fefa, #0ed2f7);\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function toggleRecords(patientId) {\n");
      out.write("            var table = document.getElementById(\"records-\" + patientId);\n");
      out.write("            if (table.style.display === \"none\") {\n");
      out.write("                table.style.display = \"table\";\n");
      out.write("            } else {\n");
      out.write("                table.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main-section\">\n");
      out.write("        <h1>Patient Medical Records</h1>\n");
      out.write("        <div id=\"recordsContainer\">\n");
      out.write("            ");

                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
                    String query = "SELECT MR.NAME, MR.PATIENT_USERNAME, MH.RECORD_DATE, MH.DIAGNOSIS, MH.TREATMENT, MR.RECORD_ID " +
                                   "FROM AV.MEDICAL_RECORDS MR " +
                                   "JOIN AV.MEDICAL_HISTORY MH ON MR.RECORD_ID = MH.RECORD_ID " +
                                   "JOIN AV.APPOINTMENT A ON MR.PATIENT_USERNAME = A.PATIENT_USERNAME " +
                                   "WHERE A.DOCTOR_USERNAME = ? " +
                                   "ORDER BY MR.NAME, MH.RECORD_DATE DESC";
                    PreparedStatement pstmt = conn.prepareStatement(query);
                    pstmt.setString(1, username);
                    ResultSet rs = pstmt.executeQuery();
                    String lastPatient = "";
                    boolean hasRecords = false;
                    while (rs.next()) {
                        hasRecords = true;
                        String recordId = rs.getString("RECORD_ID");
                        String patientName = rs.getString("NAME");
                        String patientUsername = rs.getString("PATIENT_USERNAME");
                        String recordDate = rs.getString("RECORD_DATE");
                        String diagnosis = rs.getString("DIAGNOSIS");
                        String treatment = rs.getString("TREATMENT");
                        if (!patientName.equals(lastPatient)) {
                            if (!lastPatient.equals("")) {
                                out.println("</table></div>");
                            }
                            out.println("<div class='patient-block'>");
                            out.println("<div class='patient-name' onclick='toggleRecords(\"" + patientUsername + "\")'>" + patientName + "</div>");
                            out.println("<table id='records-" + patientUsername + "' class='record-table'>");
                            out.println("<tr><th>Date</th><th>Diagnosis</th><th>Treatment</th><th>Action</th></tr>");
                            lastPatient = patientName;
                        }
            
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( recordDate );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( diagnosis );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( treatment );
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"edit.jsp\" method=\"post\">\n");
      out.write("                                <input type=\"hidden\" name=\"recordId\" value=\"");
      out.print( recordId );
      out.write("\">\n");
      out.write("                                <button type=\"submit\">Edit</button>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("            ");

                    }
                    if (hasRecords) {
                        out.println("</table></div>");
                    }
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
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
