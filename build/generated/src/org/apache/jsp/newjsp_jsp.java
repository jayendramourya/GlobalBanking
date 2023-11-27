package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/DBCON.jsp");
    _jspx_dependants.add("/ViewCustomer.jsp");
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
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background: linear-gradient(130deg, rgb(72, 174, 242), white);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            nav{\n");
      out.write("                padding: 10px;\n");
      out.write("                color: #fff;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: flex-end;\n");
      out.write("                align-items:center;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("            }\n");
      out.write("            h3{\n");
      out.write("                margin: 20px 0;\n");
      out.write("                color: #333;\n");
      out.write("                text-align: center;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items:center;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("            select, input[type=\"text\"], input[type=\"submit\"] {\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"] {\n");
      out.write("                background-color: #3f51b5;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #303f9f;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div  class=\"nav\" align=\"right\">\n");
      out.write("            <a href=\"home.jsp\">HOME</a>\n");
      out.write("            <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("        <h3 align=\"center\">\n");
      out.write("\n");
      out.write("            <form action=\"ViewCustomerDBMS.jsp\" method=\"post\">\n");
      out.write("                <select name=\"choice\">\n");
      out.write("                    <option value=\"all\">All</option>\n");
      out.write("                    <option value=\"customername\">Customer Name</option>\n");
      out.write("                    <option value=\"address\">Address</option>\n");
      out.write("                    <option value=\"accno\">Account No.</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"text\" name=\"cushchoice\">\n");
      out.write("                <input type=\"submit\" name=\"b1\" value=\"View\" >\n");
      out.write("            </form>\n");
      out.write("        </h3>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background: linear-gradient(130deg, rgb(72, 174, 242), white);\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h3 {\n");
      out.write("            margin: 20px 0;\n");
      out.write("            color: #333;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("            border-bottom: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f9f9f9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:hover {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h3>Customer Details</h3>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Account Number</th>\n");
      out.write("            <th>Customer Name</th>\n");
      out.write("            <th>Father Name</th>\n");
      out.write("            <th>DOB</th>\n");
      out.write("            <th>Gender</th>\n");
      out.write("            <th>Account Opening Date</th>\n");
      out.write("            <th>Address</th>\n");
      out.write("            <th>Contact No.</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
 try {
            // Your existing Java code
            // ...
            
                 try {
                String choice = request.getParameter("choice");
                String CustomerViewquery = "";

                if (choice.equalsIgnoreCase("customername")) {
                    String cn = request.getParameter("cushchoice");
                    CustomerViewquery = "Select * from account where cusname = '" + cn + "'";
                }

                else if (choice.equalsIgnoreCase("address")) {
                String cn = request.getParameter("cushchoice");
                CustomerViewquery = "Select * from account where address = '" + cn + "'";

            } else if (choice.equalsIgnoreCase("accno")) {
                String cn = request.getParameter("cushchoice");
                CustomerViewquery = "Select * from account where accno = '" + cn + "'";
            } else {
                CustomerViewquery = "select * from account";
            }

//            String CustomerViewquery="select * from account";
            Statement stmt = con.createStatement();

            ResultSet rs1 = stmt.executeQuery(CustomerViewquery);
            while (rs1.next()) {
                out.println("\n");

                out.println(" " + rs1.getString(1));
                out.println(" " + rs1.getString(2));
                out.println(" " + rs1.getString(3));
                out.println(" " + rs1.getString(4));
                out.println(" " + rs1.getString(5));
                out.println(" " + rs1.getString(6));
                out.println(" " + rs1.getString(7));
                out.println(" " + rs1.getInt(8) + "\n");
                out.println("\n");

            }
            out.println("<br>");
            out.println("\n");

        } catch (Exception e) {
            out.println("Trnasaction failed..." + e);

        }

        } catch (Exception e) {
            out.println("Transaction failed..." + e);
        } 
      out.write("\n");
      out.write("    </table>\n");
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
