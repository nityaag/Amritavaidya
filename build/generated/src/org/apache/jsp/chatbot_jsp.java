package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatbot_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<script src='https://cdn.jotfor.ms/s/umd/latest/for-embedded-agent.js'></script>\n");
      out.write("<script>\n");
      out.write("  window.addEventListener(\"DOMContentLoaded\", function() {\n");
      out.write("    window.AgentInitializer.init({\n");
      out.write("      agentRenderURL: \"https://agent.jotform.com/0194fa6747007228b1361f690e89688c796a\",\n");
      out.write("      rootId: \"JotformAgent-0194fa6747007228b1361f690e89688c796a\",\n");
      out.write("      formID: \"0194fa6747007228b1361f690e89688c796a\",\n");
      out.write("      queryParams: [\"skipWelcome=1\", \"maximizable=1\"],\n");
      out.write("      domain: \"https://www.jotform.com\",\n");
      out.write("      isDraggable: false,\n");
      out.write("      background: \"linear-gradient(180deg, #83D0E4 0%, #83D0E4 100%)\",\n");
      out.write("      buttonBackgroundColor: \"#264B67\",\n");
      out.write("      buttonIconColor: \"#FFF\",\n");
      out.write("      variant: false,\n");
      out.write("      customizations: {\n");
      out.write("        \"greeting\": \"Yes\",\n");
      out.write("        \"greetingMessage\": \"Hii! How can i help you?\",\n");
      out.write("        \"pulse\": \"Yes\",\n");
      out.write("        \"position\": \"right\",\n");
      out.write("        \"autoOpenChatIn\": \"5000\"\n");
      out.write("      },\n");
      out.write("      isVoice: undefined\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("</script>");
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
