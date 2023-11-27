<%@page import="java.util.*"%>

<html>
    <head>
        <style>
            body{
                background: linear-gradient(130deg, rgb(72, 174, 242), white);
                margin: 0;
                padding: 0;

                /*color: #333;*/
            }
            h1{
                text-align: center;
                padding: 20px;
                background-color: rgb(60, 140, 242);
            }
            form{
                max-width: 500px;
                margin: 33px auto;
                padding: 20px;
                background-color: #fff;
                border-radius: 20px;
                box-shadow: 2px 2px 10px rgba(0,0,0,0.1);
            }
            table{
                width: 100%;
            }
            table td{
                padding: 6px;
            }
            input[type="text"], input[type="data"],select{
                width: 100%;
                padding: 8px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            input[type="submit"],input[type="reset"]{
                display: inline-block;
                margin-top: 10px;
                padding: 10px 20px;
                border: none;
                background-color: rgb(72, 174, 242);
                color: #fff;
                font-size: 14px;
                border-radius: 5px;
                cursor: pointer;
            }
        </style>
    </head>
    <body bgcolor="#a67fb5">
        <%!Random rndm;%>
        <%
            rndm = new Random();

        %>

        <h1 >New Account Registraiton</h1>
        <form action="NewAccountDBMS.jsp" method="post" >
            <table align="center" >

                <tr>
                <td>Account Number</td>
                <td><input type="text" name="acno" value="C<%=1 + rndm.nextInt()%>"></td>
                </tr>
                <tr>
                <td>Customer Name</td>
                <td><input type="text" name="cname"></td>
                </tr>
                <tr>
                <td>Father Name</td>
                <td><input type="text" name="cfname"></td>
                </tr>
                <tr>
                <td>DOB</td>
                <td><input type="date" name="cdob"></td>
                </tr>
                <tr>
                <td>Gender</td>
                <td>
                    <input type="text" name="cgender">
                </td>
                </tr>
                <tr>
                <td>Account Opening Date</td>
                <td><input type="date" name="opdate"></td>
                </tr>
                <tr>
                <td>Address</td>
                <td><input type="text" name="cadd"></td>
                </tr>
                <tr>
                <td>Contact NO.</td>
                <td><input type="text" name="ccontact"></td>
                </tr>
                <tr>
                <td>Role</td>
                <td><input type="text" name="rrole"></td>
                </tr>
                <tr>
                <td>Password</td>
                <td><input type="text" name="password"></td>
                </tr>
                <tr>
                <td>Security Question</td>
                <td><select name="seques">
                        <option value="birthplace">Birthplace</option>
                        <option value="FirstSchool">First School</option>
                        <option value="best friend">Best Friend</option>
                    </select></td>
                </tr>
                <tr>
                <td>Security Answer</td>
                <td><input type="text" name="secans"></td>
                </tr>
                <tr>
                <td><input type="submit" name="b1" value="save"></td>
                <td><input type="reset" name="b2" value="Reset"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
