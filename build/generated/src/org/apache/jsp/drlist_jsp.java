package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class drlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Doctor List</title>\n");
      out.write("    <style>\n");
      out.write("        html, body {\n");
      out.write("            height: 100%; /* Ensure full height */\n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column; /* Stack children vertically */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif; /* Ensure consistent font */\n");
      out.write("        }\n");
      out.write("\n");
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
      out.write("        .footer {\n");
      out.write("            background: linear-gradient(to right, #b2fefa, #0ed2f7);\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-top: auto; /* Pushes footer to the bottom */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header img {\n");
      out.write("            height: 100px;\n");
      out.write("            width: 100px;\n");
      out.write("        }\n");
      out.write("\n");
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
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            left: 40%;\n");
      out.write("            font-size: 38px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #26547c;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            letter-spacing: 1px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-bottom: 4px solid #06d6a0;\n");
      out.write("            display: inline-block;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2:hover {\n");
      out.write("            color: #06d6a0;\n");
      out.write("            transition: 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            h2 {\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: rgba(255, 255, 255, 0.95); /* Light transparent background */\n");
      out.write("            border-radius: 8px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.15);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 12px;\n");
      out.write("            text-align: left;\n");
      out.write("            border-bottom: 2px solid #e0e0e0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #26547c; /* Deep Medical Blue */\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            letter-spacing: 1px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            font-size: 14px;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Alternate Row Color for Better Readability */\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: rgba(6, 214, 160, 0.1); /* Light Green Tint */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Hover Effect on Rows */\n");
      out.write("        tr:hover {\n");
      out.write("            background-color: rgba(6, 214, 160, 0.3); /* Subtle Green Glow */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Button Styling */\n");
      out.write("        .btn {\n");
      out.write("            padding: 8px 12px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 14px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Button Colors */\n");
      out.write("        .update { background-color: #06d6a0; } /* Medical Green */\n");
      out.write("        .update:hover { background-color: #05c08c; }\n");
      out.write("\n");
      out.write("        .delete { background-color: #f44336; } /* Danger Red */\n");
      out.write("        .delete:hover { background-color: #d32f2f; }\n");
      out.write("\n");
      out.write("        .enable { background-color: #007bff; } /* Bright Blue */\n");
      out.write("        .enable:hover { background-color: #0056b3; }\n");
      out.write("\n");
      out.write("        .disable { background-color: #888; } /* Greyed Out */\n");
      out.write("        .disable:hover { background-color: #666; }\n");
      out.write("\n");
      out.write("        /* Responsive Design */\n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            th, td {\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                padding: 6px 10px;\n");
      out.write("                font-size: 12px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <a href=\"started.jsp\">Home</a>\n");
      out.write("            <a href=\"#about\">About Us</a>\n");
      out.write("            <a href=\"faq.jsp\">FAQs</a>\n");
      out.write("            <a href=\"contact.html\">Contact Us</a>\n");
      out.write("            <div class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Profile</a>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <a href=\"profile.jsp\">My Profile</a>\n");
      out.write("                    <a href=\"logout.jsp\">Sign Out</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main-content\">\n");
      out.write("        <h2>List of Doctors</h2>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Username</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Qualification</th>\n");
      out.write("                <th>DOB</th>\n");
      out.write("                <th>Specialty</th>\n");
      out.write("                <th>Blood Group</th>\n");
      out.write("                <th>Contact</th>\n");
      out.write("                <th>Actions</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                Connection conn = null;
                PreparedStatement stmt = null;
                ResultSet rs = null;

                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya", "av", "av");
                   
                    // ✅ Added STATUS column to the query
                    String sql = "SELECT USERNAME, NAME, GENDER, QUALIFICATION, DOB, SPECIALTY, BLOODGROUP, CONTACT, STATUS FROM DOCTOR";
                    stmt = conn.prepareStatement(sql);
                    rs = stmt.executeQuery();
                   
                    while (rs.next()) {
                        String doctorStatus = rs.getString("STATUS");

                        if (doctorStatus == null) {
                            doctorStatus = "ACTIVE"; // Default to ACTIVE if null
                        }
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( rs.getString("USERNAME") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("NAME") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("GENDER") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("QUALIFICATION") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("DOB") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("SPECIALTY") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("BLOODGROUP") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("CONTACT") );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <!-- Update Button -->\n");
      out.write("                    <a href=\"updatedr.jsp?username=");
      out.print( rs.getString("USERNAME") );
      out.write("\" class=\"btn update\">Update</a>\n");
      out.write("\n");
      out.write("                    <!-- Delete Button -->\n");
      out.write("                    <a href=\"deletedr.jsp?username=");
      out.print( rs.getString("USERNAME") );
      out.write("\" class=\"btn delete\" onclick=\"return confirm('Are you sure you want to delete this doctor?');\">Delete</a>\n");
      out.write("\n");
      out.write("                    <!-- Disable/Enable Button -->\n");
      out.write("                    <form action=\"toggleDoctorStatus.jsp\" method=\"post\" style=\"display:inline;\">\n");
      out.write("                        <input type=\"hidden\" name=\"username\" value=\"");
      out.print( rs.getString("USERNAME") );
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"currentStatus\" value=\"");
      out.print( doctorStatus );
      out.write("\">\n");
      out.write("                        ");
 if ("DISABLED".equalsIgnoreCase(doctorStatus)) { 
      out.write("\n");
      out.write("                            <input type=\"submit\" value=\"Enable\" class=\"btn enable\">\n");
      out.write("                        ");
 } else { 
      out.write("\n");
      out.write("                            <input type=\"submit\" value=\"Disable\" class=\"btn disable\">\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("    </footer>\n");
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
