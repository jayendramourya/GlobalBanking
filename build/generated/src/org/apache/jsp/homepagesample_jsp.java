package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepagesample_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>GlobalBanking</title>\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: 'Times New Roman', Times, serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        :root {\n");
      out.write("            --navbar-height: 59px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Rest of the CSS remains unchanged from your original code */\n");
      out.write("\n");
      out.write("        /* New Hero Section Styles */\n");
      out.write("        #hero-section {\n");
      out.write("            height: 500px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            background: linear-gradient(130deg, rgb(72, 174, 242), white);\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #hero-section h1 {\n");
      out.write("            font-size: 48px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Additional Services Styles */\n");
      out.write("        .services-list li {\n");
      out.write("            display: inline-block;\n");
      out.write("            width: 150px;\n");
      out.write("            margin: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            transition: transform 0.2s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .services-list li:hover {\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .services-list img {\n");
      out.write("            width: 60px;\n");
      out.write("            height: 60px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .services-list span {\n");
      out.write("            display: block;\n");
      out.write("            color: #333333;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav id=\"navbar\">\n");
      out.write("    <!-- ... Rest of the navbar code remains unchanged ... -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<section id=\"hero-section\">\n");
      out.write("    <div>\n");
      out.write("        <img src=\"logo3.png\" alt=\"GlobalBanking Logo\">\n");
      out.write("        <h1 class=\"h-primary\">Welcome to GlobalBanking</h1>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"services\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Our Services</h2>\n");
      out.write("        <ul class=\"services-list\">\n");
      out.write("            <li>\n");
      out.write("                <img src=\"https://cdn0.iconfinder.com/data/icons/human-resources-29/66/13-512.png\" alt=\"Account Management\">\n");
      out.write("                <span>Account Management</span>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <img src=\"https://th.bing.com/th/id/OIP.sFqZ4mVNc0nZ4MDev9m2iQHaHa?pid=ImgDet&rs=1\" alt=\"Online Banking\">\n");
      out.write("                <span>Online Banking</span>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <img src=\"https://th.bing.com/th/id/R.1c9c6e724d0c4da6a2abafc118a814be?rik=z%2fc%2fEE4DEJR2IA&riu=http%3a%2f%2fcdn.onlinewebfonts.com%2fsvg%2fimg_462273.png&ehk=8BJAQPXpsaaz0VuSGQNbK88YdFvzxJyuliUBO139yY4%3d&risl=&pid=ImgRaw&r=0\" alt=\"Loans and Mortgages\">\n");
      out.write("                <span>Loans and Mortgages</span>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <img src=\"https://th.bing.com/th/id/OIP.N9lNK6w07czR8wRLuwTOCgHaHk?pid=ImgDet&rs=1\" alt=\"Credit Cards\">\n");
      out.write("                <span>Credit Cards</span>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <img src=\"https://cdn0.iconfinder.com/data/icons/fintech-element-6/64/personal-wealth-management-investment-accountant-1024.png\" alt=\"Investment Services\">\n");
      out.write("                <span>Investment Services</span>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
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
