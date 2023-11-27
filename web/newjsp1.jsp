<%@page import="java.util.*"%>

<html>
<head>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(130deg, rgb(72, 174, 242), white);
        }

        a {
            text-decoration: none;
        }

        div.nav {
            padding: 10px;
            color: #fff;
            background-color: #cc66de;
            text-align: right;
        }

        h1 {
            text-align: center;
            margin-top: 20px;
            color: #333;
        }

        form {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 30px;
        }

        table {
            border-collapse: collapse;
            width: 70%;
            background-color: #fff;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ccc;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f2f2f2;
        }

        input[type="text"], input[type="submit"], input[type="reset"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-right: 10px;
        }

        input[type="submit"] {
            background-color: #3f51b5;
            color: #fff;
            cursor: pointer;
            border: none;
        }

        input[type="submit"]:hover {
            background-color: #303f9f;
        }

        input[type="reset"] {
            background-color: #f44336;
            color: #fff;
            cursor: pointer;
            border: none;
        }

        input[type="reset"]:hover {
            background-color: #d32f2f;
        }
    </style>
</head>
<body>
    <div class="nav">
        <a href="home.jsp">HOME</a>
        <a href="Logout.jsp">Logout</a>
    </div>

    <%!Random rndm;%>
    <%
        rndm = new Random();
    %>

    <h1>Transaction for Customer Cash Deposit</h1>
    <form action="CashDepositDBMS.jsp" method="post">
        <table>
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
                <td>Deposit Amount</td>
                <td><input type="text" name="depamt"></td>
            </tr>
            <tr>
                <td>New Balance</td>
                <td><input type="text" name="netbal"></td>
            </tr>
            <tr>
                <td><input type="submit" name="b1" value="Deposit"></td>
                <td><input type="reset" name="b2" value="Reset"></td>
            </tr>
        </table>
    </form>
</body>
</html>
