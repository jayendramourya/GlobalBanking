<html>
    <head>
        <style>
            body{
                background: linear-gradient(130deg, rgb(72, 174, 242), white);
            }
            a{
                text-decoration: none;
            }
            *{
                margin: 0;
                padding:0;
            }
            .act a{
                font-size: 18px;
                margin: 0 10px;
                padding: 4px 8px;
                border-radius: 5px;
            }
            .act a:hover{
                background-color: rgb(144,242,243);
            }
            h2{
                text-align: center;
                margin-top: 30px;
                color: rgb(32,54,76);
            }
            section{
                text-align: center;
                margin-top: 40px;
                 border: 2px solid rgb(32, 54, 76);
                 margin: 20px auto;
                 border-width: 40%;
                 max-width: 800px;
            }
            section a{
                display: block;
                padding: 3px 10px;
                border-radius: 5px;
                background-color: rbg(144,242,243);
                color: rgb(32,54,66);
                width: 200px;
                margin: 0 auto;
            }
            section a:hover{
                background-color: rgb(55,114,204);
                color:white;
            }
        </style>
    </head>
    <body>

        <div align="right" class="act">
            <a href="home.jsp">HOME</a>
            <a href="Logout.jsp">Logout</a>
        </div>
        <h2 > Welcome to Admin Page <%=session.getAttribute("loginid")%>  </h2>
        <%=session.getAttribute("login_time")%>
        <%=session.getAttribute("acname")%>


        <section>
            <a href="NewAccount.jsp" >New Account</a><br>   
            <a href="ViewCustomer.jsp" >View Customer</a><br>
            <a href="DeleteCustomer.jsp" >Delete Customer</a><br>
            <a href="UpdateCustomer.jsp" >Update Customer</a><br>
            <a href="ViewStatement.jsp" >View Statement</a><br>
            <a href="UpdateStatement.jsp" >Update Statement</a><br>
            <a href="CancelStatement.jsp" >Cancel Statement</a><br>
            <a href="FundTransfer.jsp" >Fund Transfer</a><br>
            <a href="CashDeposit.jsp" >Cash Deposit</a><br>
            <a href="CashWithdraw.jsp" >Cash Withdraw</a><br>
            <a href="AdminChangePassword.jsp" >Admin Change password</a><br>
            <a href="ChangePassword.jsp" >Customer Change password</a><br>

        </section>

    </body>
</html>
