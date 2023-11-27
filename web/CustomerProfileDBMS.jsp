<%@include file="DBCON.jsp" %>
<html>
    <head>
        <style>
            body{
                background: linear-gradient(130deg, rgb(72, 174, 242), white);
            }
        </style>
    </head>
    <body>
        Welcome <%=session.getAttribute("loginid")%>;
        <%
        try
        {
            String customerprofilequery="select * from account where accno='"+session.getAttribute("loginid")+"'";
            Statement smt = con.createStatement();
            
            ResultSet rs = smt.executeQuery(customerprofilequery);
            
            while(rs.next())
            {
                out.println(" "+rs.getString(1));
                out.println(" "+rs.getString(2));
                out.println(" "+rs.getString(3));
                out.println(" "+rs.getString(4));
                out.println(" "+rs.getString(5));
                out.println(" "+rs.getString(6));
                out.println(" "+rs.getString(7));
                out.println(" "+rs.getInt(8));
                out.println(" "+rs.getString(9));
                out.println(" "+rs.getString(10));
                out.println(" "+rs.getString(11));
                out.println(" "+rs.getString(12));
                out.println("<br>");
            }
        }
        catch(Exception e)
        {
            out.println(e);
            
        }
        
        %>
                
    </body>
</html>
