package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class doctor2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Doctor Entry Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name ='f2'>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan='12' align='right' > \n");
      out.write("                        DOCTOR ENTRY FORM PAGE\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        ENTER THE NAME OF DOCTOR\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtname\" value=\"\" size=\"20\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        ENTER THE USERNAME \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtuid\" value=\"\" size=\"20\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        ENTER THE PASSWORD\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtpwd\" value=\"\" size=\"20\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        GENDER\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"radio\" name=\"rdogroup\" value=\"MALE\" checked=\"checked\" />MALE\n");
      out.write("                        <input type=\"radio\" name=\"rdogroup\" value=\"FEMALE\" />FEMALE\n");
      out.write("                        <input type=\"radio\" name=\"rdogroup\" value=\"OTHERS\"/>OTHERS\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        EMAIL\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtemail\" value=\"\" size=\"30\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        QUALIFICATION\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"qualification\">\n");
      out.write("                            <option>MBBS(Bachelor Of Medicine,Bachelor Of Surgery)</option>\n");
      out.write("                            <option>BAMS(Bachelor Of Ayurvedic Medicine and Surgery)</option>\n");
      out.write("                            <option>BHMS(Bachelor of Homeopathic Medicine and Surgery)</option>\n");
      out.write("                            <option>BUMS(Bachelor of Unani Medicine  and Surgery)</option>\n");
      out.write("                            <option>BNYS(Bachelor of Naturopathy and yogic Science)</option>\n");
      out.write("                            <option>MD(Doctor of Medicine)</option>\n");
      out.write("                            <option>MS(Master of Surgery)</option>\n");
      out.write("                            <option>DNB(Diploma of National Board)</option>\n");
      out.write("                            \n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        BLOOD GROUP\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"bloodgrp\">\n");
      out.write("                            <option>A+</option>\n");
      out.write("                            <option>A-</option>\n");
      out.write("                            <option>B+</option>\n");
      out.write("                            <option>B-</option>\n");
      out.write("                            <option>AB+</option>\n");
      out.write("                            <option>AB-</option>\n");
      out.write("                            <option>O+</option>\n");
      out.write("                            <option>O-</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Specialty\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"specialty\">\n");
      out.write("                            <option> MD(General Medicine)</option>\n");
      out.write("                            <option>MS(General Surgery)</option>\n");
      out.write("                            <option>MD(Pediatrics)</option>\n");
      out.write("                            <option>MD(Gynecology and Obstetrics)</option>\n");
      out.write("                            <option>MD(Dermatology)</option>\n");
      out.write("                            <option>MD(Psychiatry)</option>\n");
      out.write("                            <option>MD(Radiology)</option>\n");
      out.write("                            <option>MS(Orthopedics)</option>\n");
      out.write("                            <option>MS(ENT)</option>\n");
      out.write("                            <option>MS(Ophthalmology)</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        DATE OF BIRTH\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"date\" id=\"dob\" name=\"dob\" required=\"required\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        CONTACT NUMBER\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtnumber\" value=\"\" size=\"20\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"SUBMIT\" name=\"btnin\" />\n");
      out.write("                        <input type=\"submit\" value=\"CANCEL\" name=\"btnc\" />\n");
      out.write("                        <input type=\"reset\" value=\"RESET\" name=\"btnr\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

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
           
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
            Statement stmt = conn.createStatement();
            int x = stmt.executeUpdate("insert into AV.DOCTOR values ('"+name+"','"+gender+"','"+email+"','"+qualification+"','"+dob+"','"+specialty+"','"+username+"','"+password+"','"+bloodgroup+"','"+contact +"')");
            if (x > 0) {
                response.sendRedirect("login.jsp");
                out.print("<script>alert('INSERTION SUCCESSFULL');</script>");

            } else {
                response.sendRedirect("error.jsp");
                out.print("<script>alert('Invalid user id and password');</script>");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    if (request.getParameter("btnc") != null) {
        response.sendRedirect("home.jsp");

    }



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
