package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class roleSelection1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Role-Selection Page</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            height: 100vh;\n");
      out.write("            background: url('images/website.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .overlay {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.6);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container {\n");
      out.write("            position: relative;\n");
      out.write("            background: rgba(255, 255, 255, 0.1);\n");
      out.write("            backdrop-filter: blur(10px);\n");
      out.write("            border-radius: 15px;\n");
      out.write("            padding: 30px;\n");
      out.write("            width: 400px;\n");
      out.write("            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);\n");
      out.write("            z-index: 1;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container table {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container td {\n");
      out.write("            padding: 10px 0;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container input[type=\"submit\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 15px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background: linear-gradient(90deg, #4CAF50, #008CBA);\n");
      out.write("            transition: all 0.3s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container input[type=\"submit\"]:hover {\n");
      out.write("            background: linear-gradient(90deg, #008CBA, #4CAF50);\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Optional: Center the form properly */\n");
      out.write("        .wrapper {\n");
      out.write("            position: relative;\n");
      out.write("            z-index: 2;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Background Overlay -->\n");
      out.write("    <div class=\"overlay\"></div>\n");
      out.write("\n");
      out.write("    <!-- Form Container -->\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <h2>ROLE-SELECTION PAGE</h2>\n");
      out.write("            <form name='f1'>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>For Patient</td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Sign-Up\" name=\"btnLogin1\" class=\"patient-btn\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>For Doctor</td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Sign-Up\" name=\"btnLogin2\" class=\"doctor-btn\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

        if (request.getParameter("btnLogin1") != null) {
            try {
                response.sendRedirect("patient.jsp");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (request.getParameter("btnLogin2") != null) {
            try {
                response.sendRedirect("doctor.jsp");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    
      out.write("\n");
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
