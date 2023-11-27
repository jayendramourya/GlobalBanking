<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<html>
    <head>
        <style>
            body{
                                background: linear-gradient(130deg, rgb(72, 174, 242), white);

            }
        </style>
    </head>
    <body bgcolor="cyan">
        <%!Random rndm;%>
        <%
            rndm = new Random();

        %>
        <%=session.getAttribute("loginid")%><br>
   
    <h1 align="center">Customer Fund transfer to the other account</h1>
    <h3>
        <form action="FundTransferDBMS.jsp" method="post">
            <table align="center">
                <tr>
                    <td>Transfer from</td>
                    <td><input type="text" name="accno"></td>
                </tr>
                <tr>
                    <td>Transfer to</td>
                    <td><input type="text" name="refname"></td>
                </tr>
                <tr>
                    <td>Date of Transaction</td>
                    <td><input type="text" name="dot" value="<%=java.time.LocalDate.now()%>"><td/>
                </tr>
                <tr>
                    <td>Transaction Id</td>
                    <td><input type="text" name="trid" value="<%=rndm.nextInt()%>"></td>
                </tr>
                <tr>
                    <td>Transfer Amount</td>
                    <td><input type="text" name="ftamt"></td>
                </tr>

                <tr>
                    <td><input type="submit" name="b1" value="Transfer"></td>
                    <td><input type="reset" name="b2" value="reset"></td>
                </tr>

            </table>

        </form>
    </h3>

</body>
</html>