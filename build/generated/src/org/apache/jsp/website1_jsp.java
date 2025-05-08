package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class website1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>AmritaVaidya - Talk to Doctor</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            padding: 20px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .header img {\n");
      out.write("            height: 100px; width:80px;\n");
      out.write("        }\n");
      out.write("        .menu {\n");
      out.write("            display: flex;\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("        .menu a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #333;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .main-section {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("        .main-section h1 {\n");
      out.write("            font-size: 2.5rem;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .icons-section {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            gap: 40px;\n");
      out.write("            margin-top: 40px;\n");
      out.write("        }\n");
      out.write("        .icon-box {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            width: 150px;\n");
      out.write("            transition: transform 0.3s;\n");
      out.write("        }\n");
      out.write("        .icon-box:hover {\n");
      out.write("            transform: scale(1.1);\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <a href=\"home1.jsp\"  >Login</a>\n");
      out.write("            <a href=\"about.jsp\">About Us</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Main Section -->\n");
      out.write("    <div class=\"main-section\">\n");
      out.write("        <h1>Consult with Top Doctors Online, 24x7</h1>\n");
      out.write("        <button onclick=\"window.location.href='consultation.jsp';\">Start Consultation</button>\n");
      out.write("\n");
      out.write("        <!-- Icons Section -->\n");
      out.write("        <div class=\"icons-section\">\n");
      out.write("            <div class=\"icon-box\">\n");
      out.write("                <img src=\"images/doctor.jpg\" alt=\"Talk to the Doctor\" width=\"140\">\n");
      out.write("                <p>Talk to Doctor</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon-box\">\n");
      out.write("                <img src=\"images/medicine.jpg\" alt=\"Medicine\" width=\"150\">\n");
      out.write("                <p>Medicine</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon-box\">\n");
      out.write("                <img src=\"images/appoint.jpg\" alt=\"Book Appointment\" width=\"130\">\n");
      out.write("                <p>Book Appointment</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon-box\">\n");
      out.write("                <img src=\"images/chat.jpeg\" alt=\"Chat With Us\" width=\"170\">\n");
      out.write("                <p>Chat With Us</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        ");
 
            // Use Java logic to display the current year dynamically
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
        
      out.write("\n");
      out.write("        <p>&copy; ");
      out.print( year );
      out.write(" AmritaVaidya. All Rights Reserved.</p>\n");
      out.write("    </div>\n");
      out.write("\n");
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
