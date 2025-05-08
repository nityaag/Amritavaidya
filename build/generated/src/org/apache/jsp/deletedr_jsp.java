package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class deletedr_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Connection conn = null;
    PreparedStatement pstmt1 = null;
    PreparedStatement pstmt2 = null;
    PreparedStatement pstmt3 = null;

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya", "av", "av");

        // First, delete appointments associated with the doctor from AV.APPOINTMENT
        String deleteAppointmentsQuery = "DELETE FROM AV.APPOINTMENT WHERE DOCTOR_USERNAME=?";
        pstmt1 = conn.prepareStatement(deleteAppointmentsQuery);
        pstmt1.setString(1, username);
        pstmt1.executeUpdate();

        // Then, delete the login details from AV.LOGIN_DETAILS
        String deleteLoginQuery = "DELETE FROM AV.LOGIN_DETAILS WHERE USERNAME=?";
        pstmt2 = conn.prepareStatement(deleteLoginQuery);
        pstmt2.setString(1, username);
        pstmt2.executeUpdate();  

        // Finally, delete the doctor record from AV.DOCTOR
        String deleteDoctorQuery = "DELETE FROM AV.DOCTOR WHERE USERNAME=?";
        pstmt3 = conn.prepareStatement(deleteDoctorQuery);
        pstmt3.setString(1, username);
        int deleted = pstmt3.executeUpdate();

        if (deleted > 0) {
            response.sendRedirect("drlist.jsp"); // Redirect to the doctor list after deletion
        } else {
            out.println("<p>Failed to delete doctor record!</p>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (pstmt1 != null) pstmt1.close();
        if (pstmt2 != null) pstmt2.close();
        if (pstmt3 != null) pstmt3.close();
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
