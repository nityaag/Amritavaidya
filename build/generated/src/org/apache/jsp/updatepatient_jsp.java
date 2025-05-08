package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updatepatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Update Patient</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 0px;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("           \n");
      out.write("             background: linear-gradient(45deg, #b2dfdb, #e1f5fe, #dcedc1);\n");
      out.write("             padding: 15px;\n");
      out.write("             display: flex;\n");
      out.write("             justify-content: space-between;\n");
      out.write("             align-items: center;\n");
      out.write("              border-radius: 15px;\n");
      out.write("             box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("             }\n");
      out.write("\n");
      out.write("                  .header img {\n");
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
      out.write("\n");
      out.write("        form {\n");
      out.write("    background: white;\n");
      out.write("    padding: 30px;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.2);\n");
      out.write("    display: inline-block;\n");
      out.write("    text-align: left;\n");
      out.write("    width: 900px;\n");
      out.write("    animation: fadeIn 0.5s ease-in-out;\n");
      out.write("}\n");
      out.write("h2 {\n");
      out.write("    font-size: 42px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-align: center;\n");
      out.write("    color: #26547c; /* Deep blue */\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    letter-spacing: 2px;\n");
      out.write("    position: relative;\n");
      out.write("    padding-bottom: 15px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    font-family: \"Poppins\", sans-serif;\n");
      out.write("    background: linear-gradient(135deg, #06d6a0, #26547c);\n");
      out.write("    -webkit-background-clip: text;\n");
      out.write("    -webkit-text-fill-color: transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2::after {\n");
      out.write("    content: \"\";\n");
      out.write("    width: 80px;\n");
      out.write("    height: 4px;\n");
      out.write("    background: linear-gradient(to right, #06d6a0, #26547c);\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 50%;\n");
      out.write("    transform: translateX(-50%);\n");
      out.write("    border-radius: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("input, select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    margin: 12px 0;\n");
      out.write("    border: 2px solid #06d6a0;\n");
      out.write("    border-radius: 6px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    transition: all 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:focus, select:focus {\n");
      out.write("    border-color: #26547c;\n");
      out.write("    box-shadow: 0 0 8px rgba(38, 84, 124, 0.3);\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[disabled] {\n");
      out.write("    background-color: #e9e9e9;\n");
      out.write("    cursor: not-allowed;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    background: linear-gradient(135deg, #06d6a0, #26547c);\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("    border-radius: 6px;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    transition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    background: linear-gradient(135deg, #26547c, #06d6a0);\n");
      out.write("    transform: scale(1.05);\n");
      out.write("    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fadeIn {\n");
      out.write("    from {\n");
      out.write("        opacity: 0;\n");
      out.write("        transform: translateY(-20px);\n");
      out.write("    }\n");
      out.write("    to {\n");
      out.write("        opacity: 1;\n");
      out.write("        transform: translateY(0);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write(".footer {\n");
      out.write("        position: relative;\n");
      out.write("        background: linear-gradient(to right, #b2fefa, #0ed2f7);\n");
      out.write("        padding: 30px 15px;\n");
      out.write("        text-align: center;\n");
      out.write("        color: white;\n");
      out.write("        font-size: 15px;\n");
      out.write("        font-weight: bold;\n");
      out.write("        margin-top: 50px;\n");
      out.write("        overflow: hidden;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    </style>\n");
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
      out.write("</div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("<h2>Update Patient Details</h2>\n");
      out.write("\n");

    String username = request.getParameter("username");
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya", "av", "av");
        String query = "SELECT * FROM AV.PATIENT WHERE USERNAME=?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);
        rs = pstmt.executeQuery();

        if (rs.next()) {

      out.write("\n");
      out.write("        <form action=\"updatePatientProcess.jsp\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"username\" value=\"");
      out.print( rs.getString("USERNAME") );
      out.write("\">\n");
      out.write("           \n");
      out.write("            <label>Name:</label>\n");
      out.write("            <input type=\"text\" name=\"name\" value=\"");
      out.print( rs.getString("NAME") );
      out.write("\" disabled>\n");
      out.write("\n");
      out.write("            <label>Blood Group:</label>\n");
      out.write("            <select name=\"bloodgroup\" required>\n");
      out.write("                <option value=\"A+\" ");
      out.print( rs.getString("BLOODGROUP").equals("A+") ? "selected" : "" );
      out.write(">A+</option>\n");
      out.write("                <option value=\"A-\" ");
      out.print( rs.getString("BLOODGROUP").equals("A-") ? "selected" : "" );
      out.write(">A-</option>\n");
      out.write("                <option value=\"B+\" ");
      out.print( rs.getString("BLOODGROUP").equals("B+") ? "selected" : "" );
      out.write(">B+</option>\n");
      out.write("                <option value=\"B-\" ");
      out.print( rs.getString("BLOODGROUP").equals("B-") ? "selected" : "" );
      out.write(">B-</option>\n");
      out.write("                <option value=\"AB+\" ");
      out.print( rs.getString("BLOODGROUP").equals("AB+") ? "selected" : "" );
      out.write(">AB+</option>\n");
      out.write("                <option value=\"AB-\" ");
      out.print( rs.getString("BLOODGROUP").equals("AB-") ? "selected" : "" );
      out.write(">AB-</option>\n");
      out.write("                <option value=\"O+\" ");
      out.print( rs.getString("BLOODGROUP").equals("O+") ? "selected" : "" );
      out.write(">O+</option>\n");
      out.write("                <option value=\"O-\" ");
      out.print( rs.getString("BLOODGROUP").equals("O-") ? "selected" : "" );
      out.write(">O-</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label>Gender:</label>\n");
      out.write("            <input type=\"text\" name=\"gender\" value=\"");
      out.print( rs.getString("GENDER") );
      out.write("\" disabled>\n");
      out.write("           \n");
      out.write("            <label>DOB:</label>\n");
      out.write("            <input type=\"date\" name=\"dob\" value=\"");
      out.print( rs.getString("DOB") );
      out.write("\" disabled>\n");
      out.write("           \n");
      out.write("            <label>Email:</label>\n");
      out.write("            <input type=\"email\" name=\"email\" value=\"");
      out.print( rs.getString("EMAIL") );
      out.write("\" required>\n");
      out.write("           \n");
      out.write("            <label>Contact:</label>\n");
      out.write("            <input type=\"text\" name=\"contact\" value=\"");
      out.print( rs.getString("CONTACTNUM") );
      out.write("\" required>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Update\" class=\"btn\">\n");
      out.write("        </form>\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("       \n");
      out.write("    <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");

        } else {
            out.println("<p>Patient not found!</p>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }

      out.write("\n");
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
