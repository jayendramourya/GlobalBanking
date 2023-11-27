<html>
    <head>
        <style>
            body{
                                background: linear-gradient(130deg, rgb(72, 174, 242), white);

            }
        </style>
    </head>
    <head>
        <style>
            a{
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <div align="right">
            <a href="home.jsp">HOME</a>
            <a href="Logout.jsp">Logout</a>
        </div>
        <h3 align="center">
            Account Number<input type="text" name='acno'>
            <form action="UpdateCustomerDBMS.jsp">
                Select <select name="choice">
                    <option value="cusname">Customer Name</option>
                    <option value="cusfname">Customer Father's Name</option>
                    <option value="dob">Date of Birth</option>
                    <option value="gender">Gender</option>
                    <option value="accopdate">Account opening Date</option>
                    <option value="address">Address</option>
                    <option value="contactno">Contact No.</option>
                    <option value="sques">Security Question</option>


                </select>
                <input type="text" name="cushchoice">
                <input type="submit" name="b1" value="Update" >
            </form>
        </h3>

    </body>
</html>
