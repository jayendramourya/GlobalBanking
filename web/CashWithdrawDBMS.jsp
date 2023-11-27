<%@include file="DBCON.jsp" %>
<html>
    <body>
        <%
            try
            {
                int lastbal=0;
                String viewquerylast = "select * from transactionbank";
                Statement stmt1 = con.createStatement();
                ResultSet rs2 = stmt1.executeQuery(viewquerylast);
                while(rs2.next())
                {
                    lastbal = rs2.getInt(7);
                }
                
                String accno = request.getParameter("accno");
                String refname = request.getParameter("refname");
                String dot = request.getParameter("dot");
                String trid = request.getParameter("trid");
                int wthamount = Integer.parseInt(request.getParameter("wthamt"));
                
                String wthinsertquery = "insert into transactionbank values(?,?,?,?,?,?,?)";
                
                PreparedStatement pst2 = con.prepareStatement(wthinsertquery);
                pst2.setString(1, accno);
                pst2.setString(2, refname);
                pst2.setString(3, dot);
                pst2.setString(4, trid);
                pst2.setInt(5, 0);
                pst2.setInt(6, wthamount);
                pst2.setInt(7, (lastbal-wthamount));
                
                pst2.executeUpdate();
                
                out.println("Transaction Success cash withdraw");
                
                
                int lastbalcustomer=0;
                String viewquerylastcustomer = "select * from "+accno;
                Statement stmt3 = con.createStatement();
                ResultSet rs3 = stmt3.executeQuery(viewquerylastcustomer);
                while(rs3.next())
                {
                    lastbalcustomer = rs3.getInt(7);
                }
                String wthinsertquerycustomer ="insert into "+accno+" values(?,?,?,?,?,?,?);";
                PreparedStatement pst3 = con.prepareStatement(wthinsertquerycustomer);
                pst3.setString(1, accno);
                pst3.setString(2, refname);
                pst3.setString(3, dot);
                pst3.setString(4, trid);
                pst3.setInt(5, 0);
                pst3.setInt(6, wthamount);
                pst3.setInt(7, (lastbalcustomer-wthamount));
                
                pst3.executeUpdate();
                out.println("cash withdraw sccusess from "+accno+" table");
                
            }
            catch(Exception e)
            {
               out.println("Transaction failed.. cash withdraw"+e);
            }
        
        %>
    </body>
</html>
