package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ForgetPasswordDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('+');
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
      out.write("        Welcome ");
      out.print(session.getAttribute("loginid"));
      out.write(" login page\n");
      out.write("        Change password Dbms page\n");
      out.write("        ");

        
        String newpassword = request.getParameter("newpass");
        String confirmpassword = request.getParameter("cnpass");
        String accno = request.getParameter("accno");
//        out.println(oldpassword);
        out.println(newpassword);
        out.println(confirmpassword);
        
        try
        {
            String passchangequery="select * from account where accno='"+accno +"'";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(passchangequery);
            
            int count=0;
            
           
            
            
            
                if(newpassword.equals(confirmpassword))
                {
                    out.println("both are same ");
                    String updatepasswordquery = "update account set passward ='"+newpassword+"' where accno='"+accno+"'";
                    
                    PreparedStatement pst = con.prepareStatement(updatepasswordquery);
                    
                    pst.executeUpdate();
                    out.println("Password updated...");
                    out.println("<a href=Login.jsp>Now Login again</a>");
                }
            
            
            out.println("");
            
        }
        catch(Exception e)
        {
            out.println(e);
        }
         
        
        
      out.write("\n");
      out.write("                \n");
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
