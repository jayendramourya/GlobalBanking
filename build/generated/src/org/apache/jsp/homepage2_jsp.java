package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
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
      out.write("        /* Navbar */\n");
      out.write("        #navbar {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            background-color: #1e90ff;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #navbar ul {\n");
      out.write("            display: flex;\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #navbar li {\n");
      out.write("            margin-right: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #navbar li a {\n");
      out.write("            color: #ffffff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 5px 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #navbar li a:hover {\n");
      out.write("            background-color: #0077cc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #logo img {\n");
      out.write("            height: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Hero Section */\n");
      out.write("        #home {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            height: 500px;\n");
      out.write("            background: linear-gradient(130deg, #1e90ff, white);\n");
      out.write("            color: #ffffff;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #home h1 {\n");
      out.write("            font-size: 36px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Services Section */\n");
      out.write("        .container {\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .services {\n");
      out.write("            padding: 40px 0;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .services h2 {\n");
      out.write("            color: #0066cc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .services-list {\n");
      out.write("            list-style: none;\n");
      out.write("            padding: 0;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .services-list li {\n");
      out.write("            display: inline-block;\n");
      out.write("            width: 150px;\n");
      out.write("            margin: 10px;\n");
      out.write("            text-align: center;\n");
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
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <nav id=\"navbar\">\n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <img src=\"logo3.png\" alt=\"GlobalBanking Logo\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"item\"><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"About.jsp\">About us</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"\">Contact us</a></li>\n");
      out.write("            <li class=\"item\">\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"dropbtn\">ADDRESS</button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a width=\"800px\">Global Square, Patan Bypass, Raigwan, Jabalpur, Madhya Pradesh 482002</a>\n");
      out.write("                        <a href=\"https://goo.gl/maps/FXVxSXDbzxotE1466\"><i class=\"fas fa-band-aid\"></i> Direction</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <section id=\"home\">\n");
      out.write("        <h1 class=\"h-primary\">Welcome to GlobalBanking</h1>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"services\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Our Services</h2>\n");
      out.write("            <ul class=\"services-list\">\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"https://cdn0.iconfinder.com/data/icons/human-resources-29/66/13-512.png\"\n");
      out.write("                        alt=\"Account Management\">\n");
      out.write("                    <span>Account Management</span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"https://th.bing.com/th/id/OIP.sFqZ4mVNc0nZ4MDev9m2iQHaHa?pid=ImgDet&rs=1\"\n");
      out.write("                        alt=\"Online Banking\">\n");
      out.write("                    <span>Online Banking</span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"https://th.bing.com/th/id/R.1c9c6e724d0c4da6a2abafc118a814be?rik=z%2fc%2fEE4DEJR2IA&riu=http%3a%2f%2fcdn.onlinewebfonts.com%2fsvg%2fimg_462273.png&ehk=8BJAQPXpsaaz0VuSGQNbK88YdFvzxJyuliUBO139yY4%3d&risl=&pid=ImgRaw&r=0\"\n");
      out.write("                        alt=\"Loans and Mortgages\">\n");
      out.write("                    <span>Loans and Mortgages</span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"https://th.bing.com/th/id/OIP.N9lNK6w07czR8wRLuwTOCgHaHk?pid=ImgDet&rs=1\"\n");
      out.write("                        alt=\"Credit Cards\">\n");
      out.write("                    <span>Credit Cards</span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"https://cdn0.iconfinder.com/data/icons/fintech-element-6/64/personal-wealth-management-investment-accountant-1024.png\"\n");
      out.write("                        alt=\"Investment Services\">\n");
      out.write("                    <span>Investment Services</span>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
