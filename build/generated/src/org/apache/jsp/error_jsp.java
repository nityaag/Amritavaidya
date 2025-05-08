package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>AmritaVaidya - Login</title>\n");
      out.write("    <style>\n");
      out.write("        /* General Styles */\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("            overflow: hidden; /* Prevent scroll when modal is open */\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            padding: 20px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .header img {\n");
      out.write("            height: 100px;\n");
      out.write("            width: 80px;\n");
      out.write("        }\n");
      out.write("        .menu {\n");
      out.write("            display: flex;\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("        .menu a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: blue;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .main-section {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("        .main-section h1 {\n");
      out.write("            color: green;\n");
      out.write("            font-size: 2.5rem;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .icons-section {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            gap: 40px;\n");
      out.write("            margin-top: 40px;\n");
      out.write("        }\n");
      out.write("        .icon-box {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            width: 150px;\n");
      out.write("            transition: transform 0.3s;\n");
      out.write("        }\n");
      out.write("        .icon-box:hover {\n");
      out.write("            transform: scale(1.1);\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Modal Styles */\n");
      out.write("        .modal-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("            visibility: visible;\n");
      out.write("            opacity: 1;\n");
      out.write("            transition: visibility 0s, opacity 0.3s;\n");
      out.write("        }\n");
      out.write("        .modal {\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            max-width: 400px;\n");
      out.write("            width: 90%;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        .modal h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .modal label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 8px;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("        .modal input[type=\"text\"],\n");
      out.write("        .modal input[type=\"password\"] {\n");
      out.write("            width: 95%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .modal input[type=\"submit\"] {\n");
      out.write("            width: 95%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        .modal input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #45a049;\n");
      out.write("        }\n");
      out.write("        .footer-text a {\n");
      out.write("            color: #007BFF;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Main Website -->\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <a href=\"home1.jsp\">Login</a>\n");
      out.write("            <a href=\"about.jsp\">About Us</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-section\">\n");
      out.write("        <h1>Consult with Top Doctors Online, 24x7</h1>\n");
      out.write("        <button onclick=\"window.location.href='consultation.jsp';\">Start Consultation</button>\n");
      out.write("\n");
      out.write("        <div class=\"icons-section\">\n");
      out.write("            <div class=\"icon-box\" onclick=\"window.location.href='videocall.jsp';\">\n");
      out.write("                <img src=\"images/doctor.jpg\" alt=\"Talk to the Doctor\" width=\"140\">\n");
      out.write("                <p>Talk to Doctor</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon-box\" onclick=\"window.location.href='medicine.jsp';\">\n");
      out.write("                <img src=\"images/medicine.jpg\" alt=\"Medicine\" width=\"150\">\n");
      out.write("                <p>Medical Record</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon-box\" onclick=\"window.location.href='bookappointment.jsp';\">\n");
      out.write("                <img src=\"images/appoint.jpg\" alt=\"Book Appointment\" width=\"130\">\n");
      out.write("                <p>Book Appointment</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon-box\" onclick=\"window.location.href='chatwithus.jsp';\">\n");
      out.write("                <img src=\"images/chat.jpeg\" alt=\"Chat With Us\" width=\"170\">\n");
      out.write("                <p>Chat With Us</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        ");

            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
        
      out.write("\n");
      out.write("        <p>&copy; ");
      out.print( year );
      out.write(" AmritaVaidya. All Rights Reserved.</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Login Modal -->\n");
      out.write("    <div class=\"modal-container\" id=\"login-modal\">\n");
      out.write("        <div class=\"modal\">\n");
      out.write("            <h1>Login</h1>\n");
      out.write("            <form method=\"post\" action=\"login1.jsp\">\n");
      out.write("                <label for=\"username\">Username:</label>\n");
      out.write("                <input type=\"text\" name=\"username\" id=\"username\" required>\n");
      out.write("                <label for=\"password\">Password:</label>\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" required>\n");
      out.write("                <input type=\"submit\" value=\"Login\">\n");
      out.write("            </form>\n");
      out.write("            ");

                String message = request.getParameter("message");
                if (message != null) {
            
      out.write("\n");
      out.write("                <p style=\"color: red; font-weight: bold;\">");
      out.print( message );
      out.write("</p>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <div class=\"footer-text\">\n");
      out.write("                Don't have an account? <a href=\"roleSelection1.jsp?defaultRole=Patient\" class=\"signup-link\">SignUp</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

        // Get parameters from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null) {
            // JDBC connection variables
            Connection connection = null;
            PreparedStatement statement = null;
            ResultSet resultSet = null;

            try {
                // Load the Derby driver
                Class.forName("org.apache.derby.jdbc.ClientDriver");

                // Connect to the database
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya", "av", "av");

                // Prepare the SQL query
                String sql = "SELECT * FROM LOGIN_DETAILS WHERE USERNAME = ? AND PASSWORD = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);

                // Execute the query
                resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Successful login
                    session.setAttribute("username", username); // Store username in session
                    response.sendRedirect("website.jsp");
                } else {
                    // Login failed
                    response.sendRedirect("login1.jsp?message=Invalid username or password.");
                }
            } catch (Exception e) {
                response.sendRedirect("error.jsp");
                e.printStackTrace();
            } finally {
                // Close resources
                try {
                    if (resultSet != null) resultSet.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("%");
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
