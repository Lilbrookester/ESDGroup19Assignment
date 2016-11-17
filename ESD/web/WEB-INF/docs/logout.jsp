<%-- 
    Document   : logout
    Created on : 17-Nov-2016, 17:00:19
    Author     : AdamBrooke
--%>

<%
session.setAttribute("userid", null);
session.invalidate();
response.sendRedirect("/docs/User.jsp");
%>
