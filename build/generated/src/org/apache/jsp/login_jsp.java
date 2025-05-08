package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Login Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Login</h1>\n");
      out.write("    <form method=\"post\" action=\"login.jsp\">\n");
      out.write("        <label for=\"username\">Username:</label>\n");
      out.write("        <input type=\"text\" name=\"username\" id=\"username\" required><br><br>\n");
      out.write("        \n");
      out.write("        <label for=\"password\">Password:</label>\n");
      out.write("        <input type=\"password\" name=\"password\" id=\"password\" required><br><br>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Login\">\n");
      out.write("    </form>\n");
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
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya","av","av");

                // Prepare the SQL query
                String sql = "SELECT * FROM LOGIN_DETAILS WHERE USERNAME = ? AND PASSWORD = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);

                // Execute the query
                resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Successful login
                    response.sendRedirect("website.jsp");
                    out.println("<p>Login successful! Welcome, " + username + ".</p>");
                } else {
                    // Login failed
                    out.println("<p>Invalid username or password. Please try again.</p>");
                }
            } catch (Exception e){
                response.sendRedirect("error.jsp");
                // Display an error message if any exception occurs
                out.println("<p>Error connecting to the database: " + e.getMessage() + "</p>");
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
