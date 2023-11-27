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
    <body>
        <div align="right">
            <a href="home.jsp">HOME</a>
            <a href="Logout.jsp">Logout</a>
        </div>
        <form action="ForgetPasswordDBMS.jsp" method="post">
            Enter Account No. <input type="text" name='accno'>
            Enter New Password <input type="text" name="newpass"><br>
            Enter Confirm Password <input type="text" name="cnpass"><br>
            <input type='submit' name="b1" value="update">
        </form>

    </body>
</html>
