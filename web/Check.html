<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date" %>

<%@include file="DBCON.jsp" %>
<html>
    
    <body>
        Check Page
        <%            String role = request.getParameter("role");
            String loginid = request.getParameter("loginid");
            String password = request.getParameter("loginpassword");

            String getNamequery = "select * from account where accno = '" + loginid + "'";
            Statement stmt1 = con.createStatement();
            ResultSet rs2 = stmt1.executeQuery(getNamequery);

            String dob = null;
            String acname = null;

            while (rs2.next()) {
                acname = rs2.getString(2);
            }
            session.setAttribute("acname", acname);

            try {
                String viewaccountquery = "select * from account";
                Statement stmt = con.createStatement();
                ResultSet rs1 = stmt.executeQuery(viewaccountquery);

                session.setAttribute("loginid", loginid);
                session.setAttribute("login_time", new Date());
                LocalDate myObj = LocalDate.now();
                
                String getdobquery = "select * from account where accno='" + loginid + "'";
                Statement stmt2 = con.createStatement();
                ResultSet rs3 = stmt2.executeQuery(getdobquery);
                while(rs3.next())
                {
                    dob=rs3.getString(4);
                }
                session.setAttribute("cdob", dob);
                
                int count = 0;
                while (rs1.next()) {

                    if (role.equalsIgnoreCase(rs1.getString(9)) && loginid.equalsIgnoreCase(rs1.getString(1)) && password.equalsIgnoreCase(rs1.getString(10))) {
                        count++;
                        break;
                    }

                }
                if (count > 0) {

                    if (loginid.equals("A001")) {
                        response.sendRedirect("AdminLogin.jsp");

                    } else {
                        response.sendRedirect("CustomerLogin.jsp");
                    }
                } else {
//                    out.println("login failed...");
                    response.sendRedirect("Login.jsp");
                }
            } catch (Exception e) {

            }

        %>

    </body>
</html>
