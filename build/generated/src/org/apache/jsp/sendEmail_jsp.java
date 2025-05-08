package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public final class sendEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    String name = request.getParameter("name");
    String userEmail = request.getParameter("email"); // User's email
    String message = request.getParameter("message");

    String adminEmail = "amritavaidya1@gmail.com"; // Replace with admin's email
    String subject = "New Contact Form Message from " + name;
    String body = "You have received a new message:\n\n" +
                  "Name: " + name + "\n" +
                  "Email: " + userEmail + "\n" +
                  "Message: " + message + "\n\n" +
                  "Please reply directly to this email.";

    final String senderEmail = "amritavaidya73@gmail.com";  // Your email (for sending)
    final String senderPassword = "njvq lmyy vchu fbnt";  // Your email password (enable SMTP)

    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");  
    props.put("mail.smtp.port", "465");  // ? Try changing to 465 (SSL) if 587 (TLS) doesn?t work
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");  
    props.put("mail.smtp.ssl.enable", "true");  // ? Add this for SSL

    Session mailSession = Session.getInstance(props, new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(senderEmail, senderPassword);
        }
    });

    try {
        Message emailMessage = new MimeMessage(mailSession);
        emailMessage.setFrom(new InternetAddress(senderEmail)); // Your email sends the mail
        emailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail));
        emailMessage.setSubject(subject);
        emailMessage.setText(body);

        // ? Set "Reply-To" as the user's email
        emailMessage.setReplyTo(new Address[]{new InternetAddress(userEmail)});

        Transport.send(emailMessage);
        out.println("<script>alert('Message sent successfully!'); window.location.href='contact.html';</script>");
    }catch (Exception e) {
        e.printStackTrace(); // This prints the error in server logs
        out.println("<script>alert('Error: " + e.getMessage() + "'); window.location.href='contact.html';</script>");
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
