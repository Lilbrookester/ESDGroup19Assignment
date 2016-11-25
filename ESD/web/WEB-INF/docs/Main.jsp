<%-- 
    Document   : Main
    Created on : 17-Nov-2016, 14:05:09
    Author     : AdamBrooke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to XYZ Associates</title>
    </head>
    <body>
        <table border="0">
            <tr>
                <td width="80" height="100">
                    <%--<img src="<%=request.getContextPath()%>/pics/Petshoplogo.jpg" 
                       width="100" height="100" alt="a Picture!"/>--%>
                </td>
                <td width="500" height="100" bgcolor="#DB8B28" 
                    valign="top" halign="center">
                    <jsp:include page="header.jsp" flush="true"/>
                </td>
            </tr>

            <!--  Left Menu  -->
            <tr>
                <td width="90" height="300"  bgcolor="#DB8B28" valign="top">
                    <a href="<%=request.getContextPath()%>/Front">Home:</a>
                    <%--<br><a href="<%=request.getContextPath()%>/docs/PetForm">Pets:</a>
                    <br><a href="<%=request.getContextPath()%>/docs/Basket">Basket:</a>
                    <br><a href="<%=request.getContextPath()%>/docs/FindOurStore">Find our Store:</a>
                    <br><a href="<%=request.getContextPath()%>/docs/ContactUs">Contact us:</a> --%>

                </td>

                <td width="500"  valign="top" cellpadding="15" cellspacing="15">

                    <br />
                    <%--  Get the page to include --%>
                    <% String included = (String) request.getAttribute("doco");%>
                    
                    <br />
                    <jsp:include page="<%=included%>" flush="true" /> 

                </td>
            </tr>
        </table>
    </body>
</html>

