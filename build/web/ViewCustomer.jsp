 <html>
    <head>
        <style>
            body{
                margin: 0;
                padding: 0;
                background: linear-gradient(130deg, rgb(72, 174, 242), white);

            }
            nav{
                padding: 10px;
                color: #fff;
                display: flex;
                justify-content: flex-end;
                align-items:center;
            }
            a{
                text-decoration: none;
                padding: 5px 10px;
            }
            h3{
                margin: 20px 0;
                color: #333;
                text-align: center;

            }
            form{
                display: flex;
                justify-content: center;
                align-items:center;
                margin-bottom: 20px;
            }
          
            select, input[type="text"], input[type="submit"] {
                padding: 10px;
                border: 1px solid #ccc;
                border-radius: 5px;
                margin-right: 10px;
                color: #333;
            }

            input[type="submit"] {
                background-color: #3f51b5;
                color: #fff;
                border: none;
                cursor: pointer;
                transition: background-color 0.3s ease;
            }

            input[type="submit"]:hover {
                background-color: #303f9f;
            }

        </style>
    </head>
    <body>
        <div  class="nav" align="right">
            <a href="home.jsp">HOME</a>
            <a href="Logout.jsp">Logout</a>
        </div>
        <h3 align="center">

            <form action="ViewCustomerDBMS.jsp" method="post">
                <select name="choice">
                    <option value="all">All</option>
                    <option value="customername">Customer Name</option>
                    <option value="address">Address</option>
                    <option value="accno">Account No.</option>
                </select>
                <input type="text" name="cushchoice">
                <input type="submit" name="b1" value="View" >
            </form>
        </h3>

    </body>
</html>
