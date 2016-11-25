<%-- 
    Document   : Registration
    Created on : 17-Nov-2016, 16:29:28
    Author     : AdamBrooke
--%><%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

%@ page import ="java.sql.*" %>
<%
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String DOB = request.getParameter("DOB");   
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname",
            "root", "dbpass");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into Members(name, address, DOB, regdate) values ('" + name + "','" + address + "','" + DOB + "', CURDATE())");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("docs/welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("docs/user.jsp");
    }
%>
