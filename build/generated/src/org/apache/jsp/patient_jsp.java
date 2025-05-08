package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class patient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>AmritaVaidya - Patient Entry</title>\n");
      out.write("      <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            background-image: url('images/V8.jpg');\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            display: flex;\n");
      out.write("            width: 80%;\n");
      out.write("            height: 90%;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .image-section {\n");
      out.write("            width: 40%;\n");
      out.write("            position: relative;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .image-section img {\n");
      out.write("            position: absolute;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            object-fit: cover;\n");
      out.write("            opacity: 0;\n");
      out.write("            transition: opacity 1s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .image-section img.active {\n");
      out.write("            opacity: 1;\n");
      out.write("        }\n");
      out.write(".form-section {\n");
      out.write("    width: 60%; \n");
      out.write("    background-color: #fff;\n");
      out.write("    padding: 30px;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    justify-content: flex-start; \n");
      out.write("    position: relative;\n");
      out.write("    overflow-y: auto; \n");
      out.write("    max-height: 100vh; \n");
      out.write("    flex-grow: 1; \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        .form-section h1 {\n");
      out.write("           font-size: 34px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: #0077b6;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-spacing: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            font-size: 16px;\n");
      out.write("    color: #333;\n");
      out.write("    padding: 5px 0;\n");
      out.write("    text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       input[type=\"text\"],\n");
      out.write("input[type=\"date\"],\n");
      out.write("select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    font-size: 14px;\n");
      out.write("    outline: none;\n");
      out.write("    transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"]:focus,\n");
      out.write("input[type=\"date\"]:focus,\n");
      out.write("select:focus {\n");
      out.write("    border-color: #0077b6;\n");
      out.write("    box-shadow: 0 0 5px rgba(0, 119, 182, 0.4);\n");
      out.write("}\n");
      out.write("\n");
      out.write("        input[type=\"radio\"] {\n");
      out.write("            margin-right: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       input[type=\"submit\"],\n");
      out.write("input[type=\"reset\"] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    color: #fff;\n");
      out.write("    background: linear-gradient(to right, #0077b6, #00a8e8);\n");
      out.write("    transition: 0.3s;\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]:hover,\n");
      out.write("input[type=\"reset\"]:hover {\n");
      out.write("    background: linear-gradient(to right, #00a8e8, #0077b6);\n");
      out.write("}\n");
      out.write("\n");
      out.write("        .footer {\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 10px;\n");
      out.write("            left: 50%;\n");
      out.write("            transform: translateX(-50%);\n");
      out.write("            font-size: 15px;\n");
      out.write("            color: #777;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("     <div class=\"container\">\n");
      out.write("       \n");
      out.write("        <div class=\"image-section\">\n");
      out.write("            <img src=\"images/D9.jpg\" alt=\"Slide 1\" class=\"active\">\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Right Form Section -->\n");
      out.write("        <div class=\"form-section\">\n");
      out.write("            <h1>Patient Entry Form</h1>\n");
      out.write("            <form name=\"f2\" \n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter the Name of Patient</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtname\" value=\"\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Blood Group</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"bloodgrp\" required>\n");
      out.write("                                <option value=\"A+\">A+</option>\n");
      out.write("                                <option value=\"A-\">A-</option>\n");
      out.write("                                <option value=\"B+\">B+</option>\n");
      out.write("                                <option value=\"B-\">B-</option>\n");
      out.write("                                <option value=\"AB+\">AB+</option>\n");
      out.write("                                <option value=\"AB-\">AB-</option>\n");
      out.write("                                <option value=\"O+\">O+</option>\n");
      out.write("                                <option value=\"O-\">O-</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Contact Number</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtnumber\" value=\"\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" name=\"rdogroup\" value=\"male\" required /> Male\n");
      out.write("                            <input type=\"radio\" name=\"rdogroup\" value=\"female\" /> Female\n");
      out.write("                            <input type=\"radio\" name=\"rdogroup\" value=\"others\" /> Others\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Date of Birth</td>\n");
      out.write("                        <td><input type=\"date\" name=\"dob\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtemail\" value=\"\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter the Username</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtuid\" value=\"\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter the Password</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtpwd\" value=\"\" required /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <input type=\"submit\" value=\"Submit\" name=\"btnin\" />\n");
      out.write("                           \n");
      out.write("                            <input type=\"submit\" value=\"Cancel\" name=\"btnc\" />\n");
      out.write("                             \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <div class=\"footer\">\n");
      out.write("        ");

            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
        
      out.write("\n");
      out.write("        <p>&copy; ");
      out.print( year );
      out.write(" AmritaVaidya. All Rights Reserved.</p>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("   <script>\n");
      out.write("    document.addEventListener(\"DOMContentLoaded\", function() {\n");
      out.write("        let contactInput = document.querySelector(\"input[name='txtnumber']\");\n");
      out.write("        let errorMessage = document.createElement(\"div\");\n");
      out.write("        errorMessage.style.color = \"red\";\n");
      out.write("        errorMessage.style.fontSize = \"12px\";\n");
      out.write("        errorMessage.style.display = \"none\";\n");
      out.write("        errorMessage.style.marginTop = \"5px\";\n");
      out.write("        contactInput.insertAdjacentElement(\"afterend\", errorMessage);\n");
      out.write("\n");
      out.write("        document.querySelector(\"form[name='f2']\").addEventListener(\"submit\", function(event) {\n");
      out.write("            let contactValue = contactInput.value.trim();\n");
      out.write("            \n");
      out.write("            if (!/^[0-9]{10}$/.test(contactValue)) {\n");
      out.write("                errorMessage.textContent = \"Invalid contact number. Must be exactly 10 digits.\";\n");
      out.write("                errorMessage.style.display = \"block\";\n");
      out.write("                event.preventDefault();\n");
      out.write("            } else {\n");
      out.write("                errorMessage.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Prevent future dates in date of birth field\n");
      out.write("        let dobInput = document.querySelector(\"input[name='dob']\");\n");
      out.write("        let today = new Date().toISOString().split(\"T\")[0];\n");
      out.write("        dobInput.setAttribute(\"max\", today);\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("let nameInput = document.querySelector(\"input[name='txtname']\");\n");
      out.write("let nameError = document.createElement(\"div\");\n");
      out.write("nameError.style.color = \"red\";\n");
      out.write("nameError.style.fontSize = \"12px\";\n");
      out.write("nameError.style.display = \"none\";\n");
      out.write("nameError.style.marginTop = \"5px\";\n");
      out.write("nameInput.insertAdjacentElement(\"afterend\", nameError);\n");
      out.write("\n");
      out.write("document.querySelector(\"form[name='f2']\").addEventListener(\"submit\", function(event) {\n");
      out.write("    let nameValue = nameInput.value.trim();\n");
      out.write("\n");
      out.write("    if (/\\d/.test(nameValue)) {\n");
      out.write("        nameError.textContent = \"Patient name cannot contain numbers.\";\n");
      out.write("        nameError.style.display = \"block\";\n");
      out.write("        event.preventDefault();\n");
      out.write("    } else {\n");
      out.write("        nameError.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("         let currentIndex = 0;\n");
      out.write("        const slides = document.querySelectorAll('.image-section img');\n");
      out.write("\n");
      out.write("        function showNextSlide() {\n");
      out.write("            slides[currentIndex].classList.remove('active');\n");
      out.write("            currentIndex = (currentIndex + 1) % slides.length;\n");
      out.write("            slides[currentIndex].classList.add('active');\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        setInterval(showNextSlide, 3000); // Change slide every 3 seconds\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>  \n");
      out.write("   \n");

    if (request.getParameter("btnin") != null) {
        try {
            String ename = request.getParameter("txtname");
            String bgrp = request.getParameter("bloodgrp");
            String contactnum = request.getParameter("txtnumber");
            String email = request.getParameter("txtemail");
            String birthdate = request.getParameter("dob");
            String gender = request.getParameter("rdogroup");
            String usern = request.getParameter("txtuid");
            String pwd = request.getParameter("txtpwd");

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya", "av", "av");
            Statement stmt = conn.createStatement();

            int x = stmt.executeUpdate("INSERT INTO AV.PATIENT VALUES ('" + ename + "','" + bgrp + "','" + gender + "','" + birthdate + "','" + email + "','" + usern + "','" + pwd + "','" + contactnum + "')" );

            if (x > 0) {
                System.out.println("Patient record inserted successfully.");

                // Insert into LOGIN_DETAILS with role as "Patient"
                int y = stmt.executeUpdate("INSERT INTO AV.LOGIN_DETAILS (USERNAME, PASSWORD, ROLE) VALUES ('"+usern+"', '"+pwd+"', 'Patient')");

                if (y > 0) {
                    System.out.println("Login details added successfully.");

                    // Insert into MEDICAL_RECORDS and retrieve generated RECORD_ID
                    // Insert into MEDICAL_RECORDS using PATIENT_USERNAME instead of PATIENT_ID
int z = stmt.executeUpdate("INSERT INTO AV.MEDICAL_RECORDS (NAME , PATIENT_USERNAME) VALUES ('" + ename + "','" + usern + "')", Statement.RETURN_GENERATED_KEYS);

if (z > 0) {
    ResultSet generatedKeys = stmt.getGeneratedKeys();
    int recordId = -1;  // Default value

    if (generatedKeys != null && generatedKeys.next()) {
        recordId = generatedKeys.getInt(1); // Get RECORD_ID
    } else {
        System.out.println("Failed to retrieve generated RECORD_ID.");
        response.sendRedirect("error.jsp");
        return;
    }

    System.out.println("Medical record created successfully. RECORD_ID: " + recordId);

    // Ensure valid RECORD_ID before inserting into MEDICAL_HISTORY
    if (recordId > 0) {
        int historyInserted = stmt.executeUpdate("INSERT INTO AV.MEDICAL_HISTORY (RECORD_ID, RECORD_DATE, DIAGNOSIS, TREATMENT) VALUES (" + recordId + ", CURRENT_DATE, 'Not Available', 'Not Available')");

        if (historyInserted > 0) {
            System.out.println("Initial medical history added.");
            response.sendRedirect("website.jsp");
        } else {
            System.out.println("Failed to insert medical history.");
            response.sendRedirect("error.jsp");
        }
    } else {
        System.out.println("Invalid RECORD_ID received.");
        response.sendRedirect("error.jsp");
    }
} else {
    System.out.println("Failed to insert medical record.");
    response.sendRedirect("error.jsp");
}

                } else {
                    System.out.println("Failed to insert login details.");
                    response.sendRedirect("error.jsp");
                }
            } else {
                response.sendRedirect("error.jsp");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    if (request.getParameter("btnc") != null) {
        response.sendRedirect("home1.jsp");
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
