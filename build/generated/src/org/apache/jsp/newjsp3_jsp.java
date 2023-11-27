package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class newjsp3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/DBCON.jsp");
    _jspx_dependants.add("/ViewStatement.jsp");
  }

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
      out.write("<html>\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
    
        
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                String connectionURL="jdbc:mysql://localhost:3306/GlobalBankingDB";
                String dbuser="root";
                String dbpass="root"; 
                
                con=DriverManager.getConnection(connectionURL,dbuser,dbpass);
                out.println("Connection Success...  ");
                    }
            catch(Exception e)
            {
                out.println("Connection Failedl.."+e);
            }
        
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background: linear-gradient(130deg, rgb(72, 174, 242), white);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"right\">\n");
      out.write("            <a href=\"home.jsp\">HOME</a>\n");
      out.write("            <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("        <h3 align=\"center\">\n");
      out.write("\n");
      out.write("            <form action=\"ViewStatementDBMS.jsp\" method=\"post\">\n");
      out.write("                Select<select name=\"choice\">\n");
      out.write("                    <option value=\"Bank\">Statement</option>\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <!--<input type=\"text\" name=\"cushchoice\">-->\n");
      out.write("                <input type=\"submit\" name=\"b1\" value=\"View\" >\n");
      out.write("            </form>\n");
      out.write("        </h3>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Transaction Details</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #0077cc;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:hover {\n");
      out.write("            background-color: #d9f1ff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .message {\n");
      out.write("            color: #ff0000;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
 try { 
      out.write("\n");
      out.write("        ");

        String choice = request.getParameter("choice");
        String statementViewquery = "";

        if (choice.equalsIgnoreCase("AccountNo")) {
            String chaccount = request.getParameter("cushchoice");
            statementViewquery = "Select * from " + chaccount + "";

        } else {
            statementViewquery = "select * from transactionbank";

        }

        Statement stmt1 = con.createStatement();
        ResultSet rs1 = stmt1.executeQuery(statementViewquery);
        
      out.write("\n");
      out.write("\n");
      out.write("        <h2>Transaction Details</h2>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Column 1</th>\n");
      out.write("                <th>Column 2</th>\n");
      out.write("                <th>Column 3</th>\n");
      out.write("                <th>Column 4</th>\n");
      out.write("                <th>Column 5</th>\n");
      out.write("                <th>Column 6</th>\n");
      out.write("                <th>Column 7</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 while (rs1.next()) { 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rs1.getString(1) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getString(2) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getString(3) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getString(4) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getInt(5) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getInt(6) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getInt(7) );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        ");
 if (!rs1.next()) { 
      out.write("\n");
      out.write("            <p class=\"message\">No transaction data available.</p>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    ");
 } catch (Exception e) { 
      out.write("\n");
      out.write("        <p class=\"message\">Transaction failed...</p>\n");
      out.write("    ");
 } 
      out.write("\n");
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
