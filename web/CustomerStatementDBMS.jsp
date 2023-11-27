<%@include file="DBCON.jsp"%>
<html>
    <body>
        Customer DBMS
        Welcome <%=session.getAttribute("loginid")%>;

        <%
            try {
                String customeraccount=(String)session.getAttribute("loginid");
                
                
                String customerstatementview = "select * from "+customeraccount;

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(customerstatementview);

                while (rs.next()) {
                    out.println(" " + rs.getString(1));
                    out.println(" " + rs.getString(2));
                    out.println(" " + rs.getString(3));
                    out.println(" " + rs.getString(4));
                    out.println(" " + rs.getInt(5));
                    out.println(" " + rs.getInt(6));
                    out.println(" " + rs.getInt(7));
                    out.println(" <br>");

                }
            } 
            catch (Exception e) {

            }

        %>

    </body>
</html>
