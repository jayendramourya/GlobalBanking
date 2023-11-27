package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Update Customer Information</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: linear-gradient(130deg, rgb(72, 174, 242), white);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        div.nav {\n");
      out.write("            padding: 10px;\n");
      out.write("            color: #fff;\n");
      out.write("            background-color: #cc66de;\n");
      out.write("            text-align: right;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h3 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"], select, input[type=\"submit\"] {\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            margin-right: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            background-color: #3f51b5;\n");
      out.write("            color: #fff;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #303f9f;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"nav\">\n");
      out.write("        <a href=\"home.jsp\">HOME</a>\n");
      out.write("        <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <h3>Update Customer Information</h3>\n");
      out.write("    <form action=\"UpdateCustomerDBMS.jsp\">\n");
      out.write("        <label for=\"acno\">Account Number</label>\n");
      out.write("        <input type=\"text\" name=\"acno\" id=\"acno\">\n");
      out.write("\n");
      out.write("        <label for=\"choice\">Select</label>\n");
      out.write("        <select name=\"choice\" id=\"choice\">\n");
      out.write("            <option value=\"cusname\">Customer Name</option>\n");
      out.write("            <option value=\"cusfname\">Customer Father's Name</option>\n");
      out.write("            <option value=\"dob\">Date of Birth</option>\n");
      out.write("            <option value=\"gender\">Gender</option>\n");
      out.write("            <option value=\"accopdate\">Account Opening Date</option>\n");
      out.write("            <option value=\"address\">Address</option>\n");
      out.write("            <option value=\"contactno\">Contact No.</option>\n");
      out.write("            <option value=\"sques\">Security Question</option>\n");
      out.write("        </select>\n");
      out.write("\n");
      out.write("        <label for=\"cushchoice\">Enter Value</label>\n");
      out.write("        <input type=\"text\" name=\"cushchoice\" id=\"cushchoice\">\n");
      out.write("\n");
      out.write("        <input type=\"submit\" name=\"b1\" value=\"Update\">\n");
      out.write("    </form>\n");
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
