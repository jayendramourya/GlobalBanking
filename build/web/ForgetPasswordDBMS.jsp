+<%@include file="DBCON.jsp" %>
<html>
    <body>
        Welcome <%=session.getAttribute("loginid")%> login page
        Change password Dbms page
        <%
        
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
         
        
        %>
                
    </body>
</html>
