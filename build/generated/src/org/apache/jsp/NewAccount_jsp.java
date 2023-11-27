package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class NewAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Random rndm;
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background: linear-gradient(130deg, rgb(72, 174, 242), white);\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                \n");
      out.write("/*color: #333;*/\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: rgb(60, 140, 242);\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                max-width: 500px;\n");
      out.write("                margin: 33px auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                box-shadow: 2px 2px 10px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            table td{\n");
      out.write("                padding: 6px;\n");
      out.write("            }\n");
      out.write("            input[type=\"text\"], input[type=\"data\"],select{\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 8px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"],input[type=\"reset\"]{\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                border: none;\n");
      out.write("                background-color: rgb(72, 174, 242);\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 14px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#a67fb5\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            rndm = new Random();

        
      out.write("\n");
      out.write("\n");
      out.write("        <h1 >New Account Registraiton</h1>\n");
      out.write("        <form action=\"NewAccountDBMS.jsp\" method=\"post\" >\n");
      out.write("            <table align=\"center\" >\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"acno\" value=\"'");
      out.print(1 + rndm.nextInt());
      out.write("'\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Customer Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cname\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Father Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cfname\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>DOB</td>\n");
      out.write("                    <td><input type=\"date\" name=\"cdob\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"cgender\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account Opening Date</td>\n");
      out.write("                    <td><input type=\"date\" name=\"opdate\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cadd\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact NO.</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ccontact\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Role</td>\n");
      out.write("                    <td><input type=\"text\" name=\"rrole\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"text\" name=\"password\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Security Question</td>\n");
      out.write("                    <td><select name=\"seques\">\n");
      out.write("                            <option value=\"birthplace\">Birthplace</option>\n");
      out.write("                            <option value=\"FirstSchool\">First School</option>\n");
      out.write("                            <option value=\"best friend\">Best Friend</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Security Answer</td>\n");
      out.write("                    <td><input type=\"text\" name=\"secans\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"b1\" value=\"save\"></td>\n");
      out.write("                    <td><input type=\"reset\" name=\"b2\" value=\"Reset\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
