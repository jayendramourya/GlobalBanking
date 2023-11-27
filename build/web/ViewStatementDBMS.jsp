<%@include file="DBCON.jsp"%>
<%@include file="ViewStatement.jsp" %>
<html>
    <body>
        <%
        try
        {
            String choice = request.getParameter("choice");
            String statementViewquery="";
            
            if(choice.equalsIgnoreCase("AccountNo"))
            {
                String chaccount = request.getParameter("cushchoice");
                statementViewquery="Select * from "+chaccount+"";
                
            }
            else
            {
                            statementViewquery="select * from transactionbank";

            }
            
            
            
//            String CustomerViewquery="select * from account";
            Statement stmt1=con.createStatement();
            
            ResultSet rs1 = stmt1.executeQuery(statementViewquery);
            
            while(rs1.next())
            {
                out.println(" "+rs1.getString(1));                  
                out.println(" "+rs1.getString(2));                
                out.println(" "+rs1.getString(3));                
                out.println(" "+rs1.getString(4));                
                out.println(" "+rs1.getInt(5));                
                out.println(" "+rs1.getInt(6));                
                out.println(" "+rs1.getInt(7));                
                out.println("<br>");                
             }
            out.println("<br>");
            
        }
        catch(Exception e)
        {
            out.println("Trnasaction failed...");
            
        }
            
        %>

    </body>
</html>
