<%@page import="java.sql.*"%>
<html>
 
    <body>
        
        <%!Connection con;%>
        <%    
        
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
        %>
    
    </body>
</html>
