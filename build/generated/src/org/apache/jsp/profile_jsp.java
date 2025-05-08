package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    // Check if the user is logged in
    String username = (String) session.getAttribute("username");

    if (username == null) {
        response.sendRedirect("login1.jsp"); // Redirect to login page if not logged in
        return;
    }

    String userRole = "";
    String name = "";
    String email = "";
    String bloodGroup = "";
    String gender = "";
    String dob = "";
    String contact = "";
    String qualification = "";
    String specialty = "";

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        // Load Derby JDBC driver
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya", "av", "av");

        // Step 1: Fetch role from LOGIN_DETAILS using username
        String sql = "SELECT role FROM LOGIN_DETAILS WHERE username = ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            userRole = resultSet.getString("role");
        }

        resultSet.close();
        statement.close();

        // Step 2: Fetch user details from the appropriate table
        if ("patient".equalsIgnoreCase(userRole)) {
    sql = "SELECT name, email, bloodgroup, gender, dob, contactnum FROM PATIENT WHERE username = ?";
} else if ("doctor".equalsIgnoreCase(userRole)) {
    sql = "SELECT name, email, bloodgroup, gender, dob, qualification, specialty, contact FROM DOCTOR WHERE username = ?";
}

if (!userRole.isEmpty()) {
    statement = connection.prepareStatement(sql);
    statement.setString(1, username);
    resultSet = statement.executeQuery();

    if (resultSet.next()) {
        name = resultSet.getString("name");
        email = resultSet.getString("email");
        bloodGroup = resultSet.getString("bloodgroup");
        gender = resultSet.getString("gender");
        dob = resultSet.getString("dob");

        if ("patient".equalsIgnoreCase(userRole)) {
            contact = resultSet.getString("contactnum"); // Get contactnum from patient
        } else if ("doctor".equalsIgnoreCase(userRole)) {
            contact = resultSet.getString("contact"); // Get contact from doctor
            qualification = resultSet.getString("qualification");
            specialty = resultSet.getString("specialty");
        }
    }
}

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Profile</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("    background-color: #f4f4f9;\n");
      out.write("    font-family: 'Segoe UI', sans-serif;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
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
      out.write(".container {\n");
      out.write("    max-width: 1000px;\n");
      out.write("    margin: 60px auto 50px;\n");
      out.write("    background: #ffffff;\n");
      out.write("    padding: 30px;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    box-shadow: 0 8px 16px rgba(38, 84, 124, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("h4 {\n");
      out.write("    color: #26547c;\n");
      out.write("    font-size: 38px;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h4::after {\n");
      out.write("    content: \"\";\n");
      out.write("    position: absolute;\n");
      out.write("    width: 70px;\n");
      out.write("    height: 3px;\n");
      out.write("    background-color: #06d6a0;\n");
      out.write("    left: 50%;\n");
      out.write("    transform: translateX(-50%);\n");
      out.write("    bottom: -10px;\n");
      out.write("    border-radius: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".account-settings-links .list-group-item {\n");
      out.write("    background: #ffffff;\n");
      out.write("    color: #26547c;\n");
      out.write("    font-weight: 600;\n");
      out.write("    border: none;\n");
      out.write("    border-bottom: 1px solid #e0e0e0;\n");
      out.write("    transition: background 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".account-settings-links .list-group-item:hover {\n");
      out.write("    background-color: #06d6a0;\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".account-settings-links .active {\n");
      out.write("    background-color: #26547c;\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-label {\n");
      out.write("    font-weight: 600;\n");
      out.write("    color: #26547c;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control {\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    padding: 10px;\n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control:focus {\n");
      out.write("    border-color: #06d6a0;\n");
      out.write("    outline: none;\n");
      out.write("    box-shadow: 0 0 5px rgba(6, 214, 160, 0.5);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-primary {\n");
      out.write("    background-color: #06d6a0;\n");
      out.write("    border: none;\n");
      out.write("    color: #ffffff;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    transition: background-color 0.3s ease, transform 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-primary:hover {\n");
      out.write("    background-color: #04b68a;\n");
      out.write("    transform: translateY(-2px);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tab-content {\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (max-width: 768px) {\n");
      out.write("    .container {\n");
      out.write("        margin: 100px 10px 30px;\n");
      out.write("        padding: 20px;\n");
      out.write("    }\n");
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
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("   <div class=\"header\">\n");
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
      out.write("    <div class=\"container light-style flex-grow-1 container-p-y\">\n");
      out.write("        <h4 class=\"font-weight-bold py-3 mb-4\">Account settings</h4>\n");
      out.write("        <div class=\"card overflow-hidden\">\n");
      out.write("            <div class=\"row no-gutters row-bordered row-border-light\">\n");
      out.write("                <div class=\"col-md-3 pt-0\">\n");
      out.write("                    <div class=\"list-group list-group-flush account-settings-links\">\n");
      out.write("                        <a class=\"list-group-item list-group-item-action active\" data-toggle=\"list\" href=\"#account-general\">General</a>\n");
      out.write("                        <a class=\"list-group-item list-group-item-action\" data-toggle=\"list\" href=\"#account-change-password\">Change password</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div class=\"tab-content\">\n");
      out.write("                        <div class=\"tab-pane fade active show\" id=\"account-general\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form method=\"post\" action=\"updateProfile.jsp\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"form-label\">Username</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"username\" value=\"");
      out.print( username );
      out.write("\" readonly>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"form-label\">Name</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"name\" value=\"");
      out.print( name );
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"form-label\">E-mail</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"email\" value=\"");
      out.print( email );
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"form-label\">Blood Group</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"bloodGroup\" value=\"");
      out.print( bloodGroup );
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"form-label\">Gender</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"gender\" value=\"");
      out.print( gender );
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"form-label\">Date of Birth</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"dob\" value=\"");
      out.print( dob );
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                   \n");
      out.write("\n");
      out.write("                                    ");
 if ("doctor".equalsIgnoreCase(userRole)) { 
      out.write("\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"form-label\">Qualification</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"qualification\" value=\"");
      out.print( qualification );
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"form-label\">Specialty</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"specialty\" value=\"");
      out.print( specialty );
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("    <label class=\"form-label\">Contact</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"contact\" value=\"");
      out.print( contact );
      out.write("\">\n");
      out.write("</div>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Save Changes</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"account-change-password\">\n");
      out.write("    <div class=\"card-body pb-2\">\n");
      out.write("        <form action=\"changePassword.jsp\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"form-label\">Current Password</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"currentPassword\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"form-label\">New Password</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"newPassword\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"form-label\">Repeat New Password</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"confirmNewPassword\" required>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Change Password</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("                                     ");

    String success = request.getParameter("success");
    String error = request.getParameter("error");

    if ("true".equals(success)) {

      out.write("\n");
      out.write("        <div class=\"alert alert-success\">Profile updated successfully!</div>\n");

    } else if ("true".equals(error)) {

      out.write("\n");
      out.write("        <div class=\"alert alert-danger\">Error updating profile. Please try again.</div>\n");

    }

      out.write('\n');

    String successMsg = request.getParameter("success");
    String errorMsg = request.getParameter("error");

    if ("passwordChanged".equals(successMsg)) {

      out.write("\n");
      out.write("    <div class=\"alert alert-success\">Password changed successfully!</div>\n");
 } else if ("incorrectPassword".equals(errorMsg)) { 
      out.write("\n");
      out.write("    <div class=\"alert alert-danger\">Incorrect current password. Please try again.</div>\n");
 } else if ("passwordMismatch".equals(errorMsg)) { 
      out.write("\n");
      out.write("    <div class=\"alert alert-danger\">New password and confirm password do not match!</div>\n");
 } else if ("serverError".equals(errorMsg)) { 
      out.write("\n");
      out.write("    <div class=\"alert alert-danger\">An error occurred. Please try again later.</div>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
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
