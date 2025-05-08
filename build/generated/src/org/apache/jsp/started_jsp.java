package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class started_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>AmritaVaidya - Online Consultancy</title>\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap');\n");
      out.write("        body {\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("            background: linear-gradient(45deg, #a8e6cf, #dcedc1, #90caf9); /* Updated background colors */\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            animation: backgroundAnimation 10s infinite alternate;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 850px;\n");
      out.write("            padding: 40px;\n");
      out.write("            background: #fff9f3;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("            text-align: center;\n");
      out.write("            animation: fadeIn 1.5s ease-in-out;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            color: #6a5d7b;\n");
      out.write("            font-size: 36px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        p {\n");
      out.write("            font-size: 20px;\n");
      out.write("            color: #7b6d8d;\n");
      out.write("            line-height: 1.8;\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 25px;\n");
      out.write("            padding: 14px 28px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            color: black;\n");
      out.write("            background: linear-gradient(45deg, #a8e6cf, #dcedc1, #90caf9); /* Updated background colors */\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            transition: all 0.4s ease;\n");
      out.write("            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        .btn:hover {\n");
      out.write("            background: linear-gradient(45deg, #a8e6cf, #dcedc1, #90caf9); /* Updated background colors */\n");
      out.write("            transform: scale(1.1);\n");
      out.write("        }\n");
      out.write("        @keyframes fadeIn {\n");
      out.write("            from { opacity: 0; transform: translateY(-20px); }\n");
      out.write("            to { opacity: 1; transform: translateY(0); }\n");
      out.write("        }\n");
      out.write("        @keyframes backgroundAnimation {\n");
      out.write("            from { background: linear-gradient(to right, #a8e6cf, #90caf9); } /* Updated animation colors */\n");
      out.write("            to { background: linear-gradient(to right, #dcedc1, #64b5f6); } /* Updated animation colors */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Welcome to AmritaVaidya</h1>\n");
      out.write("        <p>Your trusted online platform for doctor and patient consultations.</p>\n");
      out.write("        <p>Connect with healthcare professionals and receive expert medical advice from the comfort of your home.</p>\n");
      out.write("        <a href=\"website.jsp\" class=\"btn\">Get Started</a>\n");
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
