<%@page import="java.util.*"%>
<html>
    <head>
        <style>
            a{
                text-decoration: none;
                
            }
            body{
                                background: linear-gradient(130deg, rgb(72, 174, 242), white);

            }
        </style>
    </head>
    <body bgcolor="cyan">
        <div align="right">
            <a href="home.jsp">HOME</a>
            <a href="Logout.jsp">Logout</a>
        </div>
        <%!Random rndm;%>
        <%
            rndm=new Random();
        
        %>
        <h1 align="center">Transaction for Customer Cash Withdraw</h1>
        <h3>
            <form action="CashWithdrawDBMS.jsp" method="post">
                <table align="center">
                    <tr>
                        <td>Account Number</td>
                        <td><input type="text" name="accno"></td>
                    </tr>
                    <tr>
                        <td>Reference</td>
                        <td><input type="text" name="refname"></td>
                    </tr>
                    <tr>
                        <td>Date to Transaction</td>
                        <td><input type="text" name="dot"></td>
                    </tr>
                    <tr>
                        <td>Transaction Id</td>
                        <td><input type="text" name="trid" value="<%=rndm.nextInt()%>"></td>
                    </tr>
                    <tr>
                        <td>Withdraw Amount</td>
                        <td><input type="text" name="wthamt"></td>
                    </tr>
                    <tr>
                        <td>New Balance</td>
                        <td><input type="text" name="netbal"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="b1" value="withdraw"></td>
                        <td><input type="reset" name="b2" value="reset"></td>
                    </tr>
                    
                </table>
                
            </form>
        </h3>
        
    </body>
</html>