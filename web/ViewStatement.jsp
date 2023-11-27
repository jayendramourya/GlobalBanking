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
        <h3 align="center">

            <form action="ViewStatementDBMS.jsp" method="post">
                Select<select name="choice">
                    <option value="Bank">Statement</option>

                </select>
                <!--<input type="text" name="cushchoice">-->
                <input type="submit" name="b1" value="View" >
            </form>
        </h3>

    </body>
</html>
