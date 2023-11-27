    <%@include file="DBCON.jsp"%>
    <html>
        <body>
            Welcome <%=session.getAttribute("loginid")%><br>
            <%
                try {

                                    String accno = request.getParameter("accno");

                    int lastbal = 0;
                    String viewquerylast = "select * from "+accno+";" ;
                    Statement stmt1 = con.createStatement();
                    ResultSet rs2 = stmt1.executeQuery(viewquerylast);
                    while (rs2.next()) {
                        lastbal = rs2.getInt(7);
                    }


                    String refname = request.getParameter("refname");
                    String dot = request.getParameter("dot");
                    String trid = request.getParameter("trid");
                    int depamount = Integer.parseInt(request.getParameter("ftamt"));

                    String depistequery = "insert into " + accno +" values(?,?,?,?,?,?,?);";

                    PreparedStatement pst1 = con.prepareStatement(depistequery);

                    pst1.setString(1, refname);
                    pst1.setString(2, accno);
                    pst1.setString(3, dot);
                    pst1.setString(4, trid);
                    pst1.setInt(5, 0);
                    pst1.setInt(6, depamount);
                    pst1.setInt(7, (lastbal - depamount));

                    pst1.executeUpdate();
                    out.println("fund transfer from "+accno+"successfully.....");

                    //----------for customer------------------
                    int lastbalcustomer = 0;
                    String viewquerylastcustomer = "select * from " + refname;
                    Statement stmt2 = con.createStatement();
                    ResultSet rs3 = stmt2.executeQuery(viewquerylastcustomer);
                    while (rs3.next()) {
                        lastbalcustomer = rs3.getInt(7);
                    }
                    String depositquerycustomer = "insert into " + refname + " values(?,?,?,?,?,?,?);";

                    PreparedStatement pst2 = con.prepareStatement(depositquerycustomer);

                    pst2.setString(1, accno);
                    pst2.setString(2, refname);
                    pst2.setString(3, dot);
                    pst2.setString(4, trid);
                    pst2.setInt(5, depamount);
                    pst2.setInt(6, 0);
                    pst2.setInt(7, (lastbalcustomer + depamount));

                    pst2.executeUpdate();
                    out.println("cash deposit in Customer " + accno + " successfullyy.....");

                }
                catch (Exception e) {
                    out.println("transaction failed" + e);
                }

            %>
        </body>
    </html>
