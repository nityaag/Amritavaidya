package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    // Ensure the user is logged in
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login1.jsp?message=Please login to access this feature.");
        return;
    }

    String recordId = request.getParameter("recordId");

    if (recordId == null || recordId.trim().isEmpty()) {
        response.sendRedirect("medical_record.jsp?message=Invalid record selection.");
        return;
    }

    boolean isDoctor = false;
    String patientName = "";
   
    try {
        // Database connection
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");

        // Check user role
        String roleQuery = "SELECT ROLE FROM AV.LOGIN_DETAILS WHERE USERNAME = ?";
        PreparedStatement roleStmt = conn.prepareStatement(roleQuery);
        roleStmt.setString(1, username);
        ResultSet rsRole = roleStmt.executeQuery();

        if (rsRole.next()) {
            String role = rsRole.getString("ROLE");
            if ("Doctor".equalsIgnoreCase(role)) {
                isDoctor = true;
            }
        }

        // Restrict non-doctors
        if (!isDoctor) {
            conn.close();
            response.sendRedirect("medical_record.jsp?message=Access Denied. Doctors Only.");
            return;
        }

        // Fetch patient name
        String nameQuery = "SELECT NAME FROM AV.MEDICAL_RECORDS WHERE RECORD_ID = ?";
        PreparedStatement nameStmt = conn.prepareStatement(nameQuery);
        nameStmt.setString(1, recordId);
        ResultSet rsName = nameStmt.executeQuery();
       
        if (rsName.next()) {
            patientName = rsName.getString("NAME");
        }

        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect("medical_record.jsp?message=Error loading record.");
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Edit Medical Record</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f4f4f4;\n");
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
      out.write("\n");
      out.write("        .header img {\n");
      out.write("            height: 100px;\n");
      out.write("            width: 100px;\n");
      out.write("        }\n");
      out.write(".menu {\n");
      out.write("            display: flex;\n");
      out.write("            gap: 35px;\n");
      out.write("            position: relative;\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px 30px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("            font-weight: bold;\n");
      out.write("            position: relative;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu-item {\n");
      out.write("            position: relative;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("\n");
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
      out.write("\n");
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
      out.write("\n");
      out.write("        .dropdown a:hover {\n");
      out.write("            background-color: #b2dfdb;\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dropdown.show {\n");
      out.write("            display: block;\n");
      out.write("            opacity: 1;\n");
      out.write("            transform: translateY(0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu-item:hover .dropdown {\n");
      out.write("            display: block;\n");
      out.write("            opacity: 1;\n");
      out.write("            transform: translateY(0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu-item:last-child .dropdown {\n");
      out.write("            left: auto;\n");
      out.write("            right: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Footer styles */\n");
      out.write("        .footer {\n");
      out.write("            background: linear-gradient(to right, #b2fefa, #0ed2f7);\n");
      out.write("            padding: 40px 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            width: 50%;\n");
      out.write("            margin: auto;\n");
      out.write("            background: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            color: green;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            font-weight: bold;\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"], textarea {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            display: block;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        .back-link {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        .back-link a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: blue;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("    background: linear-gradient(to right, #b2fefa, #0ed2f7);\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-top: auto; /* Pushes footer to the bottom */\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("<div class=\"container\">\n");
      out.write("    <h2>Edit Medical Record for ");
      out.print( patientName );
      out.write("</h2>\n");
      out.write("\n");
      out.write("    <form action=\"update.jsp\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"recordId\" value=\"");
      out.print( recordId );
      out.write("\">\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Diagnosis:</label>\n");
      out.write("            <input type=\"text\" name=\"diagnosis\" required>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Treatment:</label>\n");
      out.write("            <input type=\"text\" name=\"treatment\" required>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button type=\"submit\">Save Changes</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <div class=\"back-link\">\n");
      out.write("        <a href=\"medical_record.jsp\">← Back to Records</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("   \n");
      out.write("    <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
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
