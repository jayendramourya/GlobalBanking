<!DOCTYPE html>
<html>
<head>
    <title>Update Customer Information</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(130deg, cyan, white);
        }

        a {
            text-decoration: none;
            color: cyan;
        }

        div.nav {
            padding: 10px;
            color: cyan;
            background-color: white;
            text-align: right;
        }

        h3 {
            text-align: center;
            margin-top: 20px;
            color: cyan;
        }

        form {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 30px;
        }

        input[type="text"], select, input[type="submit"] {
            padding: 10px;
            border: 1px solid cyan;
            border-radius: 5px;
            margin-right: 10px;
            color: cyan;
            background-color: white;
        }

        input[type="submit"] {
            background-color: cyan;
            color: white;
            cursor: pointer;
            border: none;
        }

        input[type="submit"]:hover {
            background-color: #4dc3ff;
        }
    </style>
</head>
<body>
    <div class="nav">
        <a href="home.jsp">HOME</a>
        <a href="Logout.jsp">Logout</a>
    </div>

    <h3>Update Customer Information</h3>
    <form action="UpdateCustomerDBMS.jsp">
        <label for="acno">Account Number</label>
        <input type="text" name="acno" id="acno">

        <label for="choice">Select</label>
        <select name="choice" id="choice">
            <option value="cusname">Customer Name</option>
            <option value="cusfname">Customer Father's Name</option>
            <option value="dob">Date of Birth</option>
            <option value="gender">Gender</option>
            <option value="accopdate">Account Opening Date</option>
            <option value="address">Address</option>
            <option value="contactno">Contact No.</option>
            <option value="sques">Security Question</option>
        </select>

        <label for="cushchoice">Enter Value</label>
        <input type="text" name="cushchoice" id="cushchoice">

        <input type="submit" name="b1" value="Update">
    </form>
</body>
</html>
