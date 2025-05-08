package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updatePatientProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    String username = request.getParameter("username");
    String name = request.getParameter("name"); // Retrieved but not updated
    String bloodgroup = request.getParameter("bloodgroup");
    String gender = request.getParameter("gender"); // Retrieved but not updated
    String dob = request.getParameter("dob"); // Retrieved but not updated
    String email = request.getParameter("email");
    String contact = request.getParameter("contact");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya", "av", "av");

        String query = "UPDATE AV.PATIENT SET BLOODGROUP=?, EMAIL=?, CONTACTNUM=? WHERE USERNAME=?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, bloodgroup);
        pstmt.setString(2, email);
        pstmt.setString(3, contact);
        pstmt.setString(4, username);

        int updated = pstmt.executeUpdate();
        if (updated > 0) {
            response.sendRedirect("patientrec.jsp"); // Redirect to patient list
        } else {
            out.println("<p>Failed to update record!</p>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
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
