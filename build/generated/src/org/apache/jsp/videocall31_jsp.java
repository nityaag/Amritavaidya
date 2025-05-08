package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class videocall31_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    // Check if the user is logged in
    String username = (String) session.getAttribute("username");
   

    // Get today's date in the required format (YYYY-MM-DD)
    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = sdf.format(today);

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String doctorEmail = null;

    try {
        // Database connection
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");

        // Get the doctor's email
        String doctorQuery = "SELECT EMAIL FROM AV.DOCTOR WHERE USERNAME = ?";
        pst = conn.prepareStatement(doctorQuery);
        pst.setString(1, username);
        rs = pst.executeQuery();
        if (rs.next()) {
            doctorEmail = rs.getString("EMAIL");
        }
        rs.close();
        pst.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Today's Appointments</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f4f4f9;\n");
      out.write("    padding: 0px;\n");
      out.write("    color: #26547c;\n");
      out.write("}\n");
      out.write(".header {\n");
      out.write("    background: linear-gradient(45deg, #b2dfdb, #e1f5fe, #dcedc1);\n");
      out.write("    padding: 15px;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    align-items: center;\n");
      out.write("    width: 100%;\n");
      out.write("    border-radius: 0;\n");
      out.write("    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    position: relative;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("}\n");
      out.write("           \n");
      out.write("        .header img {\n");
      out.write("            height: 100px;\n");
      out.write("            width: 100px;\n");
      out.write("        }\n");
      out.write("        .menu {\n");
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
      out.write("\n");
      out.write("h2 {\n");
      out.write("    text-align: center;\n");
      out.write("    color: #26547c;\n");
      out.write("    margin-bottom: 24px;\n");
      out.write("    font-size: 38px;\n");
      out.write("    font-weight: 700;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("    padding-bottom: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2::after {\n");
      out.write("    content: \"\";\n");
      out.write("    position: absolute;\n");
      out.write("    width: 50%;\n");
      out.write("    height: 3px;\n");
      out.write("    background-color: #06d6a0;\n");
      out.write("    left: 25%;\n");
      out.write("    bottom: 0;\n");
      out.write("    border-radius: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".appointments-table {\n");
      out.write("    width: 100%;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    background: #ffffff;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    box-shadow: 0 6px 12px rgba(38, 84, 124, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".appointments-table th, .appointments-table td {\n");
      out.write("    padding: 14px;\n");
      out.write("    text-align: center;\n");
      out.write("    border: 1px solid #e0e0e0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".appointments-table th {\n");
      out.write("    background-color: #26547c;\n");
      out.write("    color: #ffffff;\n");
      out.write("    font-weight: 600;\n");
      out.write("    letter-spacing: 0.5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".appointments-table td {\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".copy-icon {\n");
      out.write("   \n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 18px;\n");
      out.write("    margin-left: 8px;\n");
      out.write("    transition: transform 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".copy-icon:hover {\n");
      out.write("    transform: scale(1.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".continue-btn {\n");
      out.write("    background-color: #06d6a0;\n");
      out.write("    color: #ffffff;\n");
      out.write("    padding: 10px 16px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    transition: background-color 0.3s ease, transform 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".continue-btn:hover {\n");
      out.write("    background-color: #04b68a;\n");
      out.write("    transform: translateY(-2px);\n");
      out.write("}\n");
      out.write(".footer {\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function copyToClipboard(email) {\n");
      out.write("            navigator.clipboard.writeText(email).then(() => {\n");
      out.write("                alert(\"Copied: \" + email);\n");
      out.write("            }).catch(err => {\n");
      out.write("                console.error(\"Error copying text: \", err);\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function startMeet(doctorEmail, patientEmail) {\n");
      out.write("            if (!doctorEmail || !patientEmail) {\n");
      out.write("                alert(\"Doctor or Patient email is missing!\");\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            // Generate a Google Meet link dynamically\n");
      out.write("            var meetLink = \"https://meet.google.com/new\";\n");
      out.write("\n");
      out.write("            // Open Google Meet in a new tab\n");
      out.write("            window.open(meetLink, '_blank');\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
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
      out.write("    </div>\n");
      out.write("\n");
      out.write("<h2>Today's Appointments</h2>\n");
      out.write("\n");
      out.write("<table class=\"appointments-table\">\n");
      out.write("    <tr>\n");
      out.write("        <th>Patient Name</th>\n");
      out.write("        <th>Email</th>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <th>Time Slot</th>\n");
      out.write("        <th>VideoCall</th>\n");
      out.write("    </tr>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("    ");

    try {
        // Fetch today's appointments for the logged-in doctor
        String query = "SELECT A.PATIENT_USERNAME, A.TIMESLOT, P.NAME, P.EMAIL " +
                       "FROM AV.APPOINTMENT A " +
                       "JOIN AV.PATIENT P ON A.PATIENT_USERNAME = P.USERNAME " +
                       "WHERE A.DOCTOR_USERNAME = ? AND A.APPOINTMENT_DATE = ?";
        pst = conn.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, formattedDate);
        rs = pst.executeQuery();

        boolean hasAppointments = false;
        while (rs.next()) {
            hasAppointments = true;
            String patientName = rs.getString("NAME");
            String patientEmail = rs.getString("EMAIL");
            String timeSlot = rs.getString("TIMESLOT");
    
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( patientName );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("    ");
      out.print( patientEmail );
      out.write("\n");
      out.write("    <img src=\"copy_icon.png\" alt=\"Copy\" class=\"copy-icon\" \n");
      out.write("         onclick=\"copyToClipboard('");
      out.print( patientEmail );
      out.write("')\" \n");
      out.write("         style=\"width: 20px; height: 20px; margin-left: 5px; cursor: pointer;\">\n");
      out.write("</td>\n");
      out.write("                <td>");
      out.print( timeSlot );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <button type=\"button\" class=\"continue-btn\" onclick=\"startMeet('");
      out.print( doctorEmail );
      out.write("', '");
      out.print( patientEmail );
      out.write("')\">Start</button>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("    ");

        }
        if (!hasAppointments) {
    
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"4\">No appointments for today.</td>\n");
      out.write("        </tr>\n");
      out.write("    ");

        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (conn != null) conn.close();
    }
    
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
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
