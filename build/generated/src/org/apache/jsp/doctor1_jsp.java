package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class doctor1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <title>Doctor Entry Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form name=\"f2\" method=\"POST\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\">DOCTOR ENTRY FORM PAGE</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ENTER THE NAME OF DOCTOR:</td>\n");
      out.write("                <td><input type=\"text\" name=\"txtname\"  /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ENTER THE USERNAME:</td>\n");
      out.write("                <td><input type=\"text\" name=\"txtuid\"  /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ENTER THE PASSWORD:</td>\n");
      out.write("                <td><input type=\"password\" name=\"txtpwd\"  /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>GENDER:</td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"rdogroup\" value=\"MALE\" checked=\"checked\" />MALE\n");
      out.write("                    <input type=\"radio\" name=\"rdogroup\" value=\"FEMALE\" />FEMALE\n");
      out.write("                    <input type=\"radio\" name=\"rdogroup\" value=\"OTHERS\" />OTHERS\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>EMAIL:</td>\n");
      out.write("                <td><input type=\"email\" name=\"txtemail\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>QUALIFICATION:</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"qualification\">\n");
      out.write("                        <option>MBBS(Bachelor Of Medicine,Bachelor Of Surgery)</option>\n");
      out.write("                        <!-- Add other options -->\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>BLOOD GROUP:</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"bloodgrp\">\n");
      out.write("                        <option>A+</option>\n");
      out.write("                        <!-- Add other options -->\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>SPECIALTY:</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"specialty\">\n");
      out.write("                        <option>MD(General Medicine)</option>\n");
      out.write("                        <!-- Add other options -->\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>DATE OF BIRTH:</td>\n");
      out.write("                <td><input type=\"date\" name=\"dob\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>CONTACT NUMBER:</td>\n");
      out.write("                <td><input type=\"text\" name=\"txtnumber\" pattern=\"\\d{10}\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\">\n");
      out.write("                    <input type=\"submit\" value=\"LOGIN\" name=\"btnin\" />\n");
      out.write("                    <input type=\"reset\" value=\"RESET\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
  if (request.getParameter("btnin")!=null) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
            String query = "INSERT INTO AV.DOCTOR(NAME, GENDER, EMAIL, QUALIFICATION, DOB, SPECIALTY, USERNAME, PASSWORD, BLOODGROUP, CONTACT) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, request.getParameter("txtname"));
                pstmt.setString(2, request.getParameter("rdogroup"));
                pstmt.setString(3, request.getParameter("txtemail"));
                pstmt.setString(4, request.getParameter("qualification"));
                pstmt.setString(5, request.getParameter("dob"));
                pstmt.setString(6, request.getParameter("specialty"));
                pstmt.setString(7, request.getParameter("txtuid"));
                pstmt.setString(8, request.getParameter("txtpwd"));
                pstmt.setString(9, request.getParameter("bloodgrp"));
                pstmt.setString(10, request.getParameter("txtnumber"));

                int x = pstmt.executeUpdate();
               
                if (x>0) {
                    response.sendRedirect("website.jsp");
                } else {
                    response.sendRedirect("error.jsp");
                }
        } catch (Exception ex) {
            ex.printStackTrace();
           }
    }

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
