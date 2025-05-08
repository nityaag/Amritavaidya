package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class appointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    // Ensure user is logged in
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login1.jsp?message=Please login to access this feature.");
        return;
    }

    boolean isDoctor = false;
    boolean isPatient = false;
    String patientName = ""; // Stores the patient's actual name

    try {
        // Database connection
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");

        // Fetch user's role from LOGIN_DETAILS
        PreparedStatement pstmt = conn.prepareStatement("SELECT ROLE FROM AV.LOGIN_DETAILS WHERE USERNAME = ?");
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            String role = rs.getString("ROLE");
            if ("Doctor".equalsIgnoreCase(role)) {
                isDoctor = true;
            } else if ("Patient".equalsIgnoreCase(role)) {
                isPatient = true;

                // Fetch the patient's name from the PATIENT table
                PreparedStatement pstmtPatient = conn.prepareStatement("SELECT NAME FROM AV.PATIENT WHERE USERNAME = ?");
                pstmtPatient.setString(1, username);
                ResultSet rsPatient = pstmtPatient.executeQuery();

                if (rsPatient.next()) {
                    patientName = rsPatient.getString("NAME");
                }

                rsPatient.close();
                pstmtPatient.close();
            }
        }

        rs.close();
        pstmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    // Redirect if the user is neither a doctor nor a patient
    if (!isDoctor && !isPatient) {
        response.sendRedirect("error.jsp?message=Access Denied.");
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Appointments</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("            background-color: #f0f8ff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header {\n");
      out.write("            background: linear-gradient(45deg, #b2dfdb, #e1f5fe, #dcedc1);\n");
      out.write("            padding: 15px 20px;\n");
      out.write("            height: 10vh;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header img {\n");
      out.write("            height: 120px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 22px;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu a:hover {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main-section {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .record-table {\n");
      out.write("            margin: auto;\n");
      out.write("            width: 80%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .record-table th, .record-table td {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            padding: 12px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 22px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .record-table th {\n");
      out.write("            background-color: #00c6ff;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            color: white;\n");
      out.write("            background: linear-gradient(to right, #007bff, #00c6ff);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            background: linear-gradient(to right, #00c6ff, #007bff);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .footer {\n");
      out.write("            background: linear-gradient(to right, #b2fefa, #0ed2f7);\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function cancelAppointment(appointmentId) {\n");
      out.write("            if (confirm(\"Are you sure you want to cancel this appointment?\")) {\n");
      out.write("                var xhr = new XMLHttpRequest();\n");
      out.write("                xhr.open(\"POST\", \"cancelAppointment.jsp\", true);\n");
      out.write("                xhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                xhr.onreadystatechange = function () {\n");
      out.write("                    if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                        location.reload();\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xhr.send(\"appointmentId=\" + appointmentId);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function confirmAppointment(appointmentId) {\n");
      out.write("        if (confirm(\"Are you sure you want to confirm this appointment?\")) {\n");
      out.write("            var xhr = new XMLHttpRequest();\n");
      out.write("            xhr.open(\"POST\", \"confirmAppointment.jsp\", true);\n");
      out.write("            xhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("            xhr.onreadystatechange = function () {\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                    location.reload();\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            xhr.send(\"appointmentId=\" + appointmentId);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <a href=\"website.jsp\">Home</a>\n");
      out.write("            <a href=\"ocTemplate.jsp\">Search for your patient consultation details</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-section\">\n");
      out.write("        <h1>");
      out.print( isDoctor ? "Doctor's Appointments" : "My Appointments" );
      out.write("</h1>\n");
      out.write("\n");
      out.write("        <table class=\"record-table\">\n");
      out.write("            <tr>\n");
      out.write("                <th>");
      out.print( isDoctor ? "Patient Name" : "Doctor Name" );
      out.write("</th>\n");
      out.write("                <th>Appointment Date</th>\n");
      out.write("                <th>Appointment Time</th>\n");
      out.write("                <th> Appointment</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("           ");

                String query;
                if (isDoctor) {
                    query = "SELECT PATIENT_NAME, APPOINTMENT_DATE, TIMESLOT, ID FROM APPOINTMENT WHERE DOCTOR_USERNAME = ?";
                } else {
                    // Fetch doctor's name instead of username
                    query = "SELECT D.NAME AS DOCTOR_NAME, A.APPOINTMENT_DATE, A.TIMESLOT, A.ID " +
                            "FROM APPOINTMENT A " +
                            "JOIN DOCTOR D ON A.DOCTOR_USERNAME = D.USERNAME " +
                            "WHERE A.PATIENT_NAME = ?";
                }

                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");

                    PreparedStatement stmt = conn.prepareStatement(query);
                    if (isDoctor) {
                        stmt.setString(1, username);
                    } else {
                        stmt.setString(1, patientName);
                    }
                    ResultSet rsMed = stmt.executeQuery();

                    while (rsMed.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( isDoctor ? rsMed.getString("PATIENT_NAME") : rsMed.getString("DOCTOR_NAME") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rsMed.getDate("APPOINTMENT_DATE") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rsMed.getString("TIMESLOT") );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <button onclick=\"cancelAppointment(");
      out.print( rsMed.getInt("ID") );
      out.write(")\">Cancel</button>\n");
      out.write("             <button onclick=\"confirmAppointment(");
      out.print( rsMed.getInt("ID") );
      out.write(")\">Confirm</button>    </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
                rsMed.close();
                stmt.close();
                conn.close();
            } catch (Exception e) { e.printStackTrace(); }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("    </footer>\n");
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
