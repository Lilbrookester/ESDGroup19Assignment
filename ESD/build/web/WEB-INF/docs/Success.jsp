<%-- 
    Document   : Success
    Created on : 17-Nov-2016, 16:59:15
    Author     : AdamBrooke
--%>
<%
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
You are not logged in<br/>
<a href="/docs/User.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("userid")%>
<a href='/docs/Logout.jsp'>Log out</a>
<jsp:include page="footer.jsp"/>
<%
    }
%>