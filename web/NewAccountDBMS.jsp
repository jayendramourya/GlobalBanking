<%@include file="DBCON.jsp"%>
<html>
    <body>
        <%
            try
            {
                String acno= request.getParameter("acno");
                String cname = request.getParameter("cname");                
                String cfname= request.getParameter("cfname");
                String cdob= request.getParameter("cdob");
                String cgender= request.getParameter("cgender");
                String opdate= request.getParameter("opdate");
                String cadd= request.getParameter("cadd");
                int ccontact=Integer.parseInt(request.getParameter("ccontact"));
                String role = request.getParameter("rrole");
                String password = request.getParameter("password");
                String secquestion = request.getParameter("seques");
                String secanswer = request.getParameter("secans");

                String accountinsertquery="insert into account values(?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst1 = con.prepareStatement(accountinsertquery);
                
                pst1.setString(1, acno);
                pst1.setString(2, cname);
                pst1.setString(3, cfname);
                pst1.setString(4, cdob);
                pst1.setString(5, cgender);
                pst1.setString(6, opdate);
                pst1.setString(7, cadd);
                pst1.setInt(8, ccontact);
                pst1.setString(9,role);
                pst1.setString(10,password);
                pst1.setString(11, secquestion);
                pst1.setString(12, secanswer);
                
                pst1.executeUpdate();
                out.println("<br> account created");
                
                String customertable ="create table "+acno+"(accountno varchar(20),ref varchar(20),dotrans varchar(20),transid varchar(20),depamount int,wdrwamout int,netbal int)";
                PreparedStatement pst2=con.prepareCall(customertable);
                pst2.executeUpdate();
                out.println("Customer transaction table created also ");
            }
            catch(Exception e)
            {
                out.println("<br> account not create"+e);
                
            }
        
        %>

    </body>
</html>
