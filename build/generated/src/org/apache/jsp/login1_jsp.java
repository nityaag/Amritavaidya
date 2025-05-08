package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>AmritaVaidya - Login</title>\n");
      out.write("    <style>\n");
      out.write("       \n");
      out.write("    body {\n");
      out.write("        background: radial-gradient(circle, #a8e6cf, #dcedc1, #ffffff, #add8e6);\n");
      out.write("\n");
      out.write("        font-family: Arial, sans-serif;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        display: flex;\n");
      out.write("        height: 100vh;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("\n");
      out.write("   \n");
      out.write("    .container {\n");
      out.write("    display: flex;\n");
      out.write("    width: 80%;\n");
      out.write("    height: 500px;\n");
      out.write("    margin: auto;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("    .left-section {\n");
      out.write("    flex: 1;\n");
      out.write("    position: relative;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    padding: 70px;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    background: url('images/p2.jpg');\n");
      out.write("    background-size: cover;\n");
      out.write("    background-position: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-section::before {\n");
      out.write("    content: \"\";\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    background: rgba(0, 0, 255, 0.5); /* Blue overlay */\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-section * {\n");
      out.write("    position: relative;\n");
      out.write("    z-index: 2;\n");
      out.write("}\n");
      out.write(".left-section h1 {\n");
      out.write("    font-size: 46px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: #ffffff;\n");
      out.write("    text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.3);\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-section p {\n");
      out.write("    font-size: 28px;\n");
      out.write("    color:#ffffff;\n");
      out.write("    opacity: 0.9;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    .right-section {\n");
      out.write("        flex: 1;\n");
      out.write("        background: #f5f5f5;\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        padding: 70px;\n");
      out.write("    }\n");
      out.write("    .login-container {\n");
      out.write("        width: 100%;\n");
      out.write("        text-align: left;\n");
      out.write("    }\n");
      out.write("    .login-container h2 {\n");
      out.write("    font-size: 50px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    color: #26547c; /* Deep blue shade */\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    letter-spacing: 2px;\n");
      out.write("    position: relative;\n");
      out.write("    padding-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-container h2::after {\n");
      out.write("    content: \"\";\n");
      out.write("    width: 60px;\n");
      out.write("    height: 4px;\n");
      out.write("    background: linear-gradient(90deg, #06d6a0, #26547c);\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 50%;\n");
      out.write("    transform: translateX(-50%);\n");
      out.write("    border-radius: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    .input-group {\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("    }\n");
      out.write("    .input-group label {\n");
      out.write("        font-size: 22px;\n");
      out.write("        font-weight: bold;\n");
      out.write("        display: block;\n");
      out.write("        margin-bottom: 5px;\n");
      out.write("    }\n");
      out.write("    .input-group input {\n");
      out.write("        width: 100%;\n");
      out.write("        padding: 10px;\n");
      out.write("        font-size: 22px;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        border-radius: 5px;\n");
      out.write("    }\n");
      out.write("    .login-button {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    background: linear-gradient(135deg, #26547c, #06d6a0);\n");
      out.write("    color: white;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: all 0.3s ease-in-out;\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-button:hover {\n");
      out.write("    background: linear-gradient(135deg, #06d6a0, #26547c);\n");
      out.write("    transform: scale(1.05);\n");
      out.write("    box-shadow: 0 6px 12px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-button:active {\n");
      out.write("    transform: scale(0.98);\n");
      out.write("    box-shadow: 0 2px 6px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-text {\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-text a {\n");
      out.write("    color: #26547c;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-weight: 600;\n");
      out.write("    font-size: 20px;\n");
      out.write("    position: relative;\n");
      out.write("    transition: color 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-text a::after {\n");
      out.write("    content: \"\";\n");
      out.write("    position: absolute;\n");
      out.write("    left: 0;\n");
      out.write("    bottom: -2px;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 2px;\n");
      out.write("    background-color: #06d6a0;\n");
      out.write("    transform: scaleX(0);\n");
      out.write("    transform-origin: right;\n");
      out.write("    transition: transform 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    .signup-text {\n");
      out.write("        text-align: center;\n");
      out.write("        margin-top: 10px;\n");
      out.write("        font-size: 24px;\n");
      out.write("    }\n");
      out.write("    .signup-text a {\n");
      out.write("        color: #03A9F4;\n");
      out.write("        font-weight: bold;\n");
      out.write("        text-decoration: none;\n");
      out.write("    }\n");
      out.write("    .error-message {\n");
      out.write("            color: red;\n");
      out.write("            font-size: 22px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("   \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("\n");
      out.write("       \n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"left-section\">\n");
      out.write("        <h1>Welcome To AmritaVaidya</h1>\n");
      out.write("        <p>Log in to stay connected with us</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"right-section\">\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h2>Login</h2>\n");
      out.write("        ");
 if (request.getParameter("message") != null) { 
      out.write("\n");
      out.write("                    <p class=\"error-message\">");
      out.print( request.getParameter("message") );
      out.write("</p>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("        <form method=\"post\" action=\"login1.jsp\"> <!-- Action to your JSP page -->\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <label>Username:</label>\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"Enter Username\" required> <!-- Added name attribute -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <label>Password:</label>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required> <!-- Added name attribute -->\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"login-button\">Login</button> <!-- Correct button type -->\n");
      out.write("        </form>\n");
      out.write("         <div class=\"footer-text\">\n");
      out.write("            <a href=\"forgotPassword.jsp\">Forgot Password?</a>  <!-- Added Forgot Password Link -->\n");
      out.write("        </div>\n");
      out.write("        <p class=\"signup-text\">Don't have an account? <a href=\"roleSelection.jsp\">Sign Up</a></p>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("       \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("   ");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null) {
            Connection connection = null;
            PreparedStatement statement = null;
            ResultSet resultSet = null;

            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya", "av", "av");
                String sql = "SELECT ROLE FROM LOGIN_DETAILS WHERE USERNAME = ? AND PASSWORD = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);
                resultSet = statement.executeQuery();
               
                if (resultSet.next()) {
                    String role = resultSet.getString("ROLE");
                    session.setAttribute("username", username);
                    session.setAttribute("role", role);
                    if ("admin".equalsIgnoreCase(role)) {
                        response.sendRedirect("webadmin.jsp");
                    } else {
                        response.sendRedirect("website.jsp");
                    }
                } else {
                    response.sendRedirect("login1.jsp?message=Invalid username or password.");
                }
            } catch (Exception e) {
                response.sendRedirect("error.jsp");
                e.printStackTrace();
            }
        }
    
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
