<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<html>
    <head>
        <style>
            a{
                text-decoration: none;
            }
            body{
                background: linear-gradient(130deg, rgb(72, 174, 242), white);
            }
        </style>
    </head>
    <body>
        <div align="right">
            <a href="home.jsp">HOME</a>
            <a href="Logout.jsp">Logout</a>
        </div>
        Welcome <%=session.getAttribute("loginid")%> login page

        <%
            if (session.getAttribute("login_time").equals(session.getAttribute("cdob"))) {
                out.println("Happy Birthday");
            };

        %>
        <h3 align="center">
            <a href="ViewStatement.jsp" >View Statement</a><br>            
            <a href="CustomerProfile.jsp" >Customer Profile</a><br>
            <a href="CustomerFundTransfer.jsp" >Customer Fund Transfer</a><br>
            <a href="ChangePassword.jsp" >Customer Change Password</a><br>
            <a href="INFO.jsp" >INFO</a><br>

        </h3>
    </body>
</html>
