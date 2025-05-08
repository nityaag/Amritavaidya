package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Doctor Entry Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"f2\" method=\"post\" action=\"\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">DOCTOR ENTRY FORM PAGE</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ENTER THE NAME OF DOCTOR:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtname\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ENTER THE USERNAME:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtuid\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ENTER THE PASSWORD:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"txtpwd\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>GENDER:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"radio\" name=\"rdogroup\" value=\"MALE\" checked /> MALE\n");
      out.write("                        <input type=\"radio\" name=\"rdogroup\" value=\"FEMALE\" /> FEMALE\n");
      out.write("                        <input type=\"radio\" name=\"rdogroup\" value=\"OTHERS\" /> OTHERS\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>EMAIL:</td>\n");
      out.write("                    <td><input type=\"email\" name=\"txtemail\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>QUALIFICATION:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"qualification\" required>\n");
      out.write("                            <option>MBBS</option>\n");
      out.write("                            <option>BAMS</option>\n");
      out.write("                            <option>BHMS</option>\n");
      out.write("                            <option>BUMS</option>\n");
      out.write("                            <option>BNYS</option>\n");
      out.write("                            <option>MD</option>\n");
      out.write("                            <option>MS</option>\n");
      out.write("                            <option>DNB</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>BLOOD GROUP:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"bloodgrp\" required>\n");
      out.write("                            <option>A+</option>\n");
      out.write("                            <option>A-</option>\n");
      out.write("                            <option>B+</option>\n");
      out.write("                            <option>B-</option>\n");
      out.write("                            <option>AB+</option>\n");
      out.write("                            <option>AB-</option>\n");
      out.write("                            <option>O+</option>\n");
      out.write("                            <option>O-</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>SPECIALTY:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"specialty\" required>\n");
      out.write("                            <option>MD(General Medicine)</option>\n");
      out.write("                            <option>MS(General Surgery)</option>\n");
      out.write("                            <option>MD(Pediatrics)</option>\n");
      out.write("                            <option>MD(Gynecology)</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>DATE OF BIRTH:</td>\n");
      out.write("                    <td><input type=\"date\" name=\"dob\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>CONTACT NUMBER:</td>\n");
      out.write("                    <td><input type=\"tel\" name=\"txtnumber\" pattern=\"[0-9]{10}\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" value=\"SUBMIT\" name=\"btnin\" />\n");
      out.write("                        <input type=\"reset\" value=\"RESET\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");

    if (request.getParameter("btnin") != null) {
        try {
            String name = request.getParameter("txtname");
            String gender = request.getParameter("rdogroup");
            String email = request.getParameter("txtemail");
            String qualification = request.getParameter("qualification");
            String dob = request.getParameter("dob");
            String specialty = request.getParameter("specialty");
            String bloodgroup = request.getParameter("bloodgrp");
            String username = request.getParameter("txtuid");
            String password = request.getParameter("txtpwd");
            String contact = request.getParameter("txtnumber");

            // Database connection
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av")) {
                String query = "INSERT INTO AV.DOCTOR (NAME, GENDER, EMAIL, QUALIFICATION, DOB, SPECIALTY, USERNAME, PASSWORD, BLOODGROUP, CONTACT) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setString(1, name);
                    pstmt.setString(2, gender);
                    pstmt.setString(3, email);
                    pstmt.setString(4, qualification);
                    pstmt.setDate(5, java.sql.Date.valueOf(dob));
                    pstmt.setString(6, specialty);
                    pstmt.setString(7, username);
                    pstmt.setString(8, password);
                    pstmt.setString(9, bloodgroup);
                    pstmt.setString(10, contact);

                    int rows = pstmt.executeUpdate();
                    if (rows > 0) {
                        response.sendRedirect("login.jsp");
                    } else {
                        response.sendRedirect("error.jsp");
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }

      out.write('\n');
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
