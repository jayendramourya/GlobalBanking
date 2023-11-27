<%@include file="DBCON.jsp" %>
<html>
    <body>
        Welcome <%=session.getAttribute("loginid")%> login page
        Change password Dbms page
        <%
        String oldpassword = request.getParameter("oldpass");
        String newpassword = request.getParameter("newpass");
        String confirmpassword = request.getParameter("cnpass");
        
        out.println(oldpassword);
        out.println(newpassword);
        out.println(confirmpassword);
        
        try
        {
            String passchangequery="select * from account where accno='"+session.getAttribute("loginid") +"'";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(passchangequery);
            
            int count=0;
            
            while(rs.next()){
//                   out.println(rs.getString(10));
                if(oldpassword.equals(rs.getString(10)))
                {
                    count++;
                    break;
                }
            }
            
            if(count>0)
            {
                out.println("old password match<br>");
                if(newpassword.equals(confirmpassword))
                {
                    out.println("both are same ");
                    String updatepasswordquery = "update account set passward ='"+newpassword+"' where accno='"+session.getAttribute("loginid")+"'";
                    
                    PreparedStatement pst = con.prepareStatement(updatepasswordquery);
                    
                    pst.executeUpdate();
                    out.println("Password updated...");
                    out.println("<a href=Login.jsp>Now Login again</a>");
                }
            }
            else
            {
                out.println("<br>old password not matched");
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
