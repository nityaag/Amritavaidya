package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>AmritaVaidya - Login</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Login Overlay */\n");
      out.write("        .login-overlay {\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            background: url('images/website.jpg') no-repeat center center/cover;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            z-index: 1000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Login Container */\n");
      out.write("        .login-container {\n");
      out.write("           position: relative;\n");
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
      out.write("        .login-container h1 {\n");
      out.write("            color: white\n");
      out.write("            font-size: 2.5rem;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            text-shadow: 1px 2px 4px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       \n");
      out.write("        .login-container input[type=\"submit\"] {\n");
      out.write("            width: 50%;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin-top: 15px;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            background: linear-gradient(45deg, #4CAF50, #008CBA); /* Gradient green */\n");
      out.write("            color: white;\n");
      out.write("            transition: all 0.3s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container input[type=\"submit\"]:hover {\n");
      out.write("            background: linear-gradient(45deg, #8eebec); /* Reverse gradient on hover */\n");
      out.write("            transform: scale(1.1);\n");
      out.write("            opacity: 0.9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       \n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            .login-container {\n");
      out.write("                width: 90%;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .login-container h1 {\n");
      out.write("                font-size: 2rem;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"login-overlay\">\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("            <h1 style=\"opacity: 0.9;\">AMRITAVAIDYA</h1> <!-- Added transparency -->\n");
      out.write("            <form name='f1'>\n");
      out.write("                <input type=\"submit\" value=\"Login\" name=\"btnLogin\" class=\"login-btn\" />\n");
      out.write("            </form>\n");
      out.write("            ");

                if (request.getParameter("btnLogin") != null) {
                    try {
                        response.sendRedirect("login1.jsp");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("     \n");
      out.write("        let slideIndex = 0;\n");
      out.write("        const slides = document.getElementsByClassName(\"slides\");\n");
      out.write("        const dots = document.getElementsByClassName(\"dot\");\n");
      out.write("\n");
      out.write("        function showSlides() {\n");
      out.write("            for (let i = 0; i < slides.length; i++) {\n");
      out.write("                slides[i].style.display = \"none\";\n");
      out.write("            }\n");
      out.write("            slideIndex++;\n");
      out.write("            if (slideIndex > slides.length) { slideIndex = 1; }\n");
      out.write("            for (let i = 0; i < dots.length; i++) {\n");
      out.write("                dots[i].classList.remove(\"active\");\n");
      out.write("            }\n");
      out.write("            slides[slideIndex - 1].style.display = \"block\";\n");
      out.write("            dots[slideIndex - 1].classList.add(\"active\");\n");
      out.write("            setTimeout(showSlides, 3000);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function currentSlide(index) {\n");
      out.write("            slideIndex = index - 1;\n");
      out.write("            showSlides();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        showSlides();\n");
      out.write("    </script>\n");
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
