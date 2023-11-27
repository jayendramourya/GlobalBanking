<html>
    <head>
        <style>
            body{
                background: linear-gradient(130deg, rgb(72, 174, 242), white);
            }

            a{
                text-decoration: none;
            }
            h3{
                align:center;
            }
        </style>
    </head>
    <body>
        <div align="right">
            <a href="home.jsp">HOME</a>
            <a href="Logout.jsp">Logout</a>
        </div>
        Welcome <%=session.getAttribute("loginid")%>
    <br>
    <br> <h3 align="center">You can change password please enter following details's</h3>
    <br>

    <form action="ChangePasswordDBMS.jsp" method="post" align="center">
        Enter Old Password <input type="text" name="oldpass"><br>
        Enter New Password <input type="text" name="newpass"><br>
        Enter Confirm Password <input type="text" name="cnpass"><br>
        <input type='submit' name="b1" value="update">
    </form>


</body>
</html>
