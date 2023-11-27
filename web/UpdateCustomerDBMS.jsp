<%@include file="DBCON.jsp"%>
<%@include file="UpdateCustomer.jsp" %>
<html>
    <body>
        <%            String newpassword = request.getParameter("newpass");
            String cusname = request.getParameter("cusname");
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String accopdate = request.getParameter("accopdate");
            String address = request.getParameter("address");
            String contactno = request.getParameter("contactno");
            String sques = request.getParameter("sques");
            String acno = request.getParameter("acno");

            try {
                String choice = request.getParameter("choice");
                String statementUpdatequery = "";
                if (choice.equalsIgnoreCase("cusname")) {
                    String chaccount = request.getParameter("cushchoice");
                    statementUpdatequery = "Select * from " + chaccount + "";
                    String updatecusnamequery = "update account set cusname ='" + cusname + "' where accno='" + acno + "'";

                    PreparedStatement pst = con.prepareStatement(updatecusnamequery);

                    pst.executeUpdate();
                    out.println("Customer name updated...");
                }

            } catch (Exception e) {

            }
        %>

    </body>
</html>
