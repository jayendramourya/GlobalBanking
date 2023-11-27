<%@include file="DBCON.jsp"%>
<%@include file="ViewCustomer.jsp" %>
<html>
    <body>
        <%            try {
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


    %>
    
            </body>
            </html>
