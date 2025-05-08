package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class confirmappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Confirm Appointment</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("            background: linear-gradient(to right, #1e3c72, #2a5298);\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);\n");
      out.write("            text-align: center;\n");
      out.write("            max-width: 500px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            color: #1e3c72;\n");
      out.write("            font-size: 24px;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        p {\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #555;\n");
      out.write("            line-height: 1.6;\n");
      out.write("        }\n");
      out.write("        .success {\n");
      out.write("            color: #27ae60;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 20px;\n");
      out.write("            padding: 15px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            background: rgba(39, 174, 96, 0.1);\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .error {\n");
      out.write("            color: #e74c3c;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        .button {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 15px;\n");
      out.write("            padding: 12px 20px;\n");
      out.write("            background: #1e3c72;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: 0.3s;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        .button:hover {\n");
      out.write("            background: #2a5298;\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");

    String doctorUsername = request.getParameter("doctor_username");
    String patientUsername = (String) session.getAttribute("username"); // Retrieve session user name
    String appointmentDate = request.getParameter("appointmentDate");
    String timeslot = request.getParameter("timeslot");
    String doctorName = "";
    String patientName = "";

    if (doctorUsername == null || appointmentDate == null || timeslot == null) {
        out.println("<p class='error'>Invalid data submitted.</p>");
        return;
    }

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya","av","av");

        // Retrieve doctor's name
        String doctorQuery = "SELECT name FROM AV.DOCTOR WHERE username = ?";
        preparedStatement = connection.prepareStatement(doctorQuery);
        preparedStatement.setString(1, doctorUsername);
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            doctorName = resultSet.getString("name");
        }
        resultSet.close();
        preparedStatement.close();

        // Retrieve patient's name
        String patientQuery = "SELECT name FROM AV.PATIENT WHERE username = ?";
        preparedStatement = connection.prepareStatement(patientQuery);
        preparedStatement.setString(1, patientUsername);
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            patientName = resultSet.getString("name");
        }
        resultSet.close();
        preparedStatement.close();

        // Insert appointment details
        String sql = "INSERT INTO AV.APPOINTMENT (doctor_username, patient_name, appointment_date, timeslot, patient_username) VALUES (?, ?, ?, ?,?)";
preparedStatement = connection.prepareStatement(sql);
preparedStatement.setString(1, doctorUsername); // Doctor's username
preparedStatement.setString(2,patientName );
 preparedStatement.setDate(3, Date.valueOf(appointmentDate)); // Appointment date
preparedStatement.setString(4, timeslot); // Selected timeslot
preparedStatement.setString(5, patientUsername);// Patient's username (instead of patient name)

int result = preparedStatement.executeUpdate();
if (result > 0) {
    out.println("<h2>Appointment Confirmed!</h2>");
    out.println("<p class='success'>Your appointment with Dr. " + doctorName + " is confirmed on " + appointmentDate + " at " + timeslot + ".</p>");
    out.println("<a href='oc.jsp' class='button'>Continue!</a>");


        } else {
            out.println("<p class='error'>Failed to book appointment.</p>");
        }
    } catch (Exception e) {
        out.println("<p class='error'>Error: " + e.getMessage() + "</p>");
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            out.println("<p class='error'>Error closing resources: " + e.getMessage() + "</p>");
        }
    }

      out.write("\n");
      out.write("    </div>\n");
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
