package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class videocall3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    // Check if the user is logged in
    String username = (String) session.getAttribute("username");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Today's Appointment</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f4f4f9;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background: linear-gradient(45deg, #b2dfdb, #e1f5fe, #dcedc1);\n");
      out.write("            padding: 15px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
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
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .menu a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .menu-item {\n");
      out.write("            position: relative;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .dropdown {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 100%;\n");
      out.write("            left: 0;\n");
      out.write("            display: none;\n");
      out.write("            background: #4db6ac;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);\n");
      out.write("            border-radius: 5px;\n");
      out.write("            z-index: 1000;\n");
      out.write("            min-width: 250px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            transform: translateY(10px);\n");
      out.write("            transition: opacity 0.3s ease, transform 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .dropdown a {\n");
      out.write("            display: block;\n");
      out.write("            padding: 12px 20px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #333;\n");
      out.write("            font-weight: bold;\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            margin: 5px 10px;\n");
      out.write("            transition: background 0.3s ease, transform 0.2s ease;\n");
      out.write("        }\n");
      out.write("        .dropdown a:hover {\n");
      out.write("            background-color: #b2dfdb;\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("        .dropdown.show {\n");
      out.write("            display: block;\n");
      out.write("            opacity: 1;\n");
      out.write("            transform: translateY(0);\n");
      out.write("        }\n");
      out.write("        .menu-item:hover .dropdown {\n");
      out.write("            display: block;\n");
      out.write("            opacity: 1;\n");
      out.write("            transform: translateY(0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin: 60px auto;\n");
      out.write("            background: #ffffff;\n");
      out.write("            padding: 30px 20px;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            box-shadow: 0 8px 16px rgba(38, 84, 124, 0.1);\n");
      out.write("            text-align: center;\n");
      out.write("            transition: transform 0.3s ease, box-shadow 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .container:hover {\n");
      out.write("            transform: translateY(-4px);\n");
      out.write("            box-shadow: 0 12px 24px rgba(38, 84, 124, 0.15);\n");
      out.write("        }\n");
      out.write("        .container h2 {\n");
      out.write("            font-size: 26px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: #26547c;\n");
      out.write("            position: relative;\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("        .container h2::after {\n");
      out.write("            content: \"\";\n");
      out.write("            position: absolute;\n");
      out.write("            width: 60%;\n");
      out.write("            height: 3px;\n");
      out.write("            background-color: #06d6a0;\n");
      out.write("            left: 20%;\n");
      out.write("            bottom: -8px;\n");
      out.write("            border-radius: 2px;\n");
      out.write("        }\n");
      out.write("        .appointment-details {\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #26547c;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            line-height: 1.6;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #06d6a0;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            background: #e1f5fe;\n");
      out.write("            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .appointment-details strong {\n");
      out.write("            color: #06d6a0;\n");
      out.write("        }\n");
      out.write("        .message {\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: #06d6a0;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .no-appointment {\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #d62828;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("            position: fixed;\n");
      out.write("            bottom: 0;\n");
      out.write("            left: 0;\n");
      out.write("            right: 0;\n");
      out.write("            background: linear-gradient(to right, #b2fefa, #0ed2f7);\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("    <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("    <div class=\"menu\">\n");
      out.write("        <div class=\"menu-item\">\n");
      out.write("            <a href=\"#\">Login</a>\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <a href=\"login1.jsp\">Are you a Patient?</a>\n");
      out.write("                <a href=\"login1.jsp\">Are you a Doctor?</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a href=\"started.jsp\">Home</a>\n");
      out.write("        <a href=\"#about\">About Us</a>\n");
      out.write("        <a href=\"faq.jsp\">FAQs</a>\n");
      out.write("        <a href=\"contact.html\">Contact Us</a>\n");
      out.write("        <div class=\"menu-item\">\n");
      out.write("            <a href=\"#\">Profile</a>\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <a href=\"profile.jsp\">My Profile</a>\n");
      out.write("                <a href=\"logout.jsp\">Sign Out</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2>Your Appointments for Today</h2>\n");
      out.write("\n");
      out.write("    ");

        boolean hasAppointments = false;
        try {
            // Database connection
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");

            // Get today's date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String todayDate = sdf.format(new java.util.Date());

            // Query to get all today's appointment details for the patient
            String query = "SELECT a.TIMESLOT, d.NAME AS DOCTOR_NAME " +
                           "FROM APPOINTMENT a " +
                           "JOIN DOCTOR d ON a.DOCTOR_USERNAME = d.USERNAME " +
                           "WHERE a.PATIENT_USERNAME = ? AND a.APPOINTMENT_DATE = ?";

            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, todayDate);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                hasAppointments = true;
    
      out.write("\n");
      out.write("                <div class=\"appointment-details\">\n");
      out.write("                    <p><strong>Doctor:</strong> ");
      out.print( rs.getString("DOCTOR_NAME") );
      out.write("</p>\n");
      out.write("                    <p><strong>Time:</strong> ");
      out.print( rs.getString("TIMESLOT") );
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("    ");

            }

            if (!hasAppointments) {
    
      out.write("\n");
      out.write("                <p class=\"no-appointment\">You do not have any appointments scheduled for today.</p>\n");
      out.write("    ");

            }

            rs.close();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
