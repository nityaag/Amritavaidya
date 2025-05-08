package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Calendar;

public final class medicalrec_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    // Ensure the user is logged in
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login1.jsp?message=Please login to access this feature.");
        return;
    }

    boolean isPatient = false;
    String patientName = "";

    try {
        // Database connection
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
        Statement stmt = conn.createStatement();

        // Check if the logged-in user is a patient
        ResultSet rs = stmt.executeQuery("SELECT ROLE FROM AV.LOGIN_DETAILS WHERE USERNAME = '" + username + "'");
        if (rs.next() && "Patient".equalsIgnoreCase(rs.getString("ROLE"))) {
            isPatient = true;
        }
        rs.close();

        if (!isPatient) {
            conn.close();
            response.sendRedirect("medical_record.jsp?message=Access Denied.");
            return;
        }

        // Fetch patient name
        rs = stmt.executeQuery("SELECT NAME FROM AV.PATIENT WHERE USERNAME = '" + username + "'");
        if (rs.next()) {
            patientName = rs.getString("NAME");
        }
        rs.close();


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>AmritaVaidya - Medical Records</title>\n");
      out.write("    <style>\n");
      out.write("        body { font-family: Arial, sans-serif; margin: 0; padding: 0; }\n");
      out.write("        .header { background-color: #ffffff; padding: 20px; display: flex; justify-content: space-between; align-items: center; }\n");
      out.write("        .header img { height: 150px; width:100px; }\n");
      out.write("        .menu { display: flex; gap: 20px; }\n");
      out.write("        .menu a { text-decoration: none; color: blue; font-weight: bold; }\n");
      out.write("        .main-section { text-align: center; padding: 50px; }\n");
      out.write("        .main-section h1 { color: green; font-size: 2.5rem; margin-bottom: 20px; }\n");
      out.write("        .record-table { margin: auto; width: 80%; border-collapse: collapse; margin-top: 20px; }\n");
      out.write("        .record-table th, .record-table td { border: 1px solid #ddd; padding: 10px; text-align: center; }\n");
      out.write("        .record-table th { background-color: #f2f2f2; font-weight: bold; }\n");
      out.write("        .footer { background-color: #f8f9fa; padding: 20px; text-align: center; margin-top: 50px; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Header -->\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <a href=\"website.jsp\">Home</a>\n");
      out.write("            <a href=\"about.jsp\">About Us</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Main Section -->\n");
      out.write("    <div class=\"main-section\">\n");
      out.write("        <h1>My Medical Records</h1>\n");
      out.write("        <table class=\"record-table\">\n");
      out.write("            <tr>\n");
      out.write("               <th>Record ID</th>\n");
      out.write("                <th>Patient Name</th>\n");
      out.write("                <th>Diagnosis</th>\n");
      out.write("                <th>Treatment</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                // Fetch patient's medical records
                ResultSet rsMed = stmt.executeQuery(
                    "SELECT MH.RECORD_ID, MH.DIAGNOSIS, MH.TREATMENT, MH.RECORD_DATE " +
                    "FROM AV.MEDICAL_RECORDS MR " +
                    "JOIN AV.MEDICAL_HISTORY MH ON MR.RECORD_ID = MH.RECORD_ID " +
                    "WHERE MR.NAME = '" + patientName + "' " +
                    "ORDER BY MH.RECORD_DATE DESC"
                );

                while (rsMed.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("               <td>");
      out.print( rsMed.getString("RECORD_ID") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( patientName );
      out.write("</td> \n");
      out.write("                <td>");
      out.print( rsMed.getString("DIAGNOSIS") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rsMed.getString("TREATMENT") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rsMed.getString("RECORD_DATE") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
                rsMed.close();
                conn.close();
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        ");

            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
        
      out.write("\n");
      out.write("        <p>&copy; ");
      out.print( year );
      out.write(" AmritaVaidya. All Rights Reserved.</p>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");

    } catch (Exception e) {
        e.printStackTrace();
        out.println("<p style='color:red; text-align:center;'>Error loading records. Please try again later.</p>");
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
