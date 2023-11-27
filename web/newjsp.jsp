<%@include file="DBCON.jsp"%>
<%@include file="ViewCustomer.jsp" %>
<html>
<head>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: linear-gradient(130deg, rgb(72, 174, 242), white);
            font-family: Arial, sans-serif;
        }

        h3 {
            margin: 20px 0;
            color: #333;
            text-align: center;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
            background-color: #fff;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ccc;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h3>Customer Details</h3>
    <table>
        <tr>
            <th>Account Number</th>
            <th>Customer Name</th>
            <th>Father Name</th>
            <th>DOB</th>
            <th>Gender</th>
            <th>Account Opening Date</th>
            <th>Address</th>
            <th>Contact No.</th>
        </tr>
        <% try {
            // Your existing Java code
            // ...
            
                 try {
                String choice = request.getParameter("choice");
                String CustomerViewquery = "";

                if (choice.equalsIgnoreCase("customername")) {
                    String cn = request.getParameter("cushchoice");
                    CustomerViewquery = "Select * from account where cusname = '" + cn + "'";
                }

                else if (choice.equalsIgnoreCase("address")) {
                String cn = request.getParameter("cushchoice");
                CustomerViewquery = "Select * from account where address = '" + cn + "'";

            } else if (choice.equalsIgnoreCase("accno")) {
                String cn = request.getParameter("cushchoice");
                CustomerViewquery = "Select * from account where accno = '" + cn + "'";
            } else {
                CustomerViewquery = "select * from account";
            }

//            String CustomerViewquery="select * from account";
            Statement stmt = con.createStatement();

            ResultSet rs1 = stmt.executeQuery(CustomerViewquery);
            while (rs1.next()) {
                out.println("\n");

                out.println(" " + rs1.getString(1));
                out.println(" " + rs1.getString(2));
                out.println(" " + rs1.getString(3));
                out.println(" " + rs1.getString(4));
                out.println(" " + rs1.getString(5));
                out.println(" " + rs1.getString(6));
                out.println(" " + rs1.getString(7));
                out.println(" " + rs1.getInt(8) + "\n");
                out.println("\n");

            }
            out.println("<br>");
            out.println("\n");

        } catch (Exception e) {
            out.println("Trnasaction failed..." + e);

        }

        } catch (Exception e) {
            out.println("Transaction failed..." + e);
        } %>
    </table>
</body>
</html>
