package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class NewAccountDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DBCON.jsp");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        ");

            try
            {
                String acno= request.getParameter("acno");
                String cname = request.getParameter("cname");                
                String cfname= request.getParameter("cfname");
                String cdob= request.getParameter("cdob");
                String cgender= request.getParameter("cgender");
                String opdate= request.getParameter("opdate");
                String cadd= request.getParameter("cadd");
                int ccontact=Integer.parseInt(request.getParameter("ccontact"));
                String role = request.getParameter("rrole");
                String password = request.getParameter("password");
                String secquestion = request.getParameter("seques");
                String secanswer = request.getParameter("secans");

                String accountinsertquery="insert into account values(?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst1 = con.prepareStatement(accountinsertquery);
                
                pst1.setString(1, acno);
                pst1.setString(2, cname);
                pst1.setString(3, cfname);
                pst1.setString(4, cdob);
                pst1.setString(5, cgender);
                pst1.setString(6, opdate);
                pst1.setString(7, cadd);
                pst1.setInt(8, ccontact);
                pst1.setString(9,role);
                pst1.setString(10,password);
                pst1.setString(11, secquestion);
                pst1.setString(12, secanswer);
                
                pst1.executeUpdate();
                out.println("<br> account created");
                
                String customertable ="create table "+acno+"(accountno varchar(20),ref varchar(20),dotrans varchar(20),transid varchar(20),depamount int,wdrwamout int,netbal int)";
                PreparedStatement pst2=con.prepareCall(customertable);
                pst2.executeUpdate();
                out.println("Customer transaction table created also ");
            }
            catch(Exception e)
            {
                out.println("<br> account not create"+e);
                
            }
        
        
      out.write("\n");
      out.write("\n");
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
