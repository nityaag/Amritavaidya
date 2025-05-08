package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Doctor Listings</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background-color: #4285f4;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("        .search-bar {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            margin: 20px;\n");
      out.write("        }\n");
      out.write("        .search-bar input[type=\"text\"] {\n");
      out.write("            width: 50%;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        .search-bar button {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #4285f4;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        .search-bar button:hover {\n");
      out.write("            background-color: #3367d6;\n");
      out.write("        }\n");
      out.write("        .card {\n");
      out.write("            background-color: white;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("            width: 60%;\n");
      out.write("        }\n");
      out.write("        .card-header {\n");
      out.write("            font-size: 20px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        .card-details {\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("        .book-button {\n");
      out.write("            display: block;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #34a853;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        .book-button:hover {\n");
      out.write("            background-color: #2c8d45;\n");
      out.write("        }\n");
      out.write("        .hidden {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function searchDoctors() {\n");
      out.write("            const query = document.getElementById('search-input').value.toLowerCase();\n");
      out.write("            const cards = document.getElementsByClassName('card');\n");
      out.write("\n");
      out.write("            for (let i = 0; i < cards.length; i++) {\n");
      out.write("                const card = cards[i];\n");
      out.write("                const specialization = card.getElementsByClassName('card-header')[0].innerText.toLowerCase();\n");
      out.write("                const location = card.getElementsByClassName('card-details')[0].innerText.toLowerCase();\n");
      out.write("\n");
      out.write("                if (specialization.includes(query) || location.includes(query)) {\n");
      out.write("                    card.classList.remove('hidden');\n");
      out.write("                } else {\n");
      out.write("                    card.classList.add('hidden');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        Doctor Listings\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"search-bar\">\n");
      out.write("        <input type=\"text\" id=\"search-input\" placeholder=\"Search Doctors, Hospitals or Specialties\">\n");
      out.write("        <button onclick=\"searchDoctors()\">Search</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <div class=\"card-header\">Specialization: Paediatrician</div>\n");
      out.write("        <div class=\"card-details\">\n");
      out.write("            <p><strong>Qualification:</strong> Diploma in Child Health (DCH), MBBS</p>\n");
      out.write("            <p><strong>Experience:</strong> 46 years</p>\n");
      out.write("            <p><strong>Language:</strong> English</p>\n");
      out.write("            <p><strong>Location:</strong> Lala Amba Prasad Smarak Chikitsalaya, Swaroop Nagar</p>\n");
      out.write("            <p><strong>Distance:</strong> 0.38 km</p>\n");
      out.write("            <p><strong>Fees:</strong> ₹800</p>\n");
      out.write("            <p><strong>Next Available:</strong> 10:00 AM - 12 Jan, Sun</p>\n");
      out.write("        </div>\n");
      out.write("        <a href=\"#\" class=\"book-button\">Book Visit</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <div class=\"card-header\">Specialization: Orthopaedician</div>\n");
      out.write("        <div class=\"card-details\">\n");
      out.write("            <p><strong>Qualification:</strong> MBBS, MS (Orthopedics)</p>\n");
      out.write("            <p><strong>Experience:</strong> 12 years</p>\n");
      out.write("            <p><strong>Language:</strong> English</p>\n");
      out.write("            <p><strong>Location:</strong> Vijaya Hospital, Nagaram</p>\n");
      out.write("            <p><strong>Distance:</strong> 0.38 km</p>\n");
      out.write("            <p><strong>Fees:</strong> ₹1000</p>\n");
      out.write("            <p><strong>Next Available:</strong> 10:00 AM - 12 Jan, Sun</p>\n");
      out.write("        </div>\n");
      out.write("        <a href=\"#\" class=\"book-button\">Book Visit</a>\n");
      out.write("    </div>\n");
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
