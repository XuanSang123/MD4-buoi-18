<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mail Configuration</title>
</head>
<body>
<table border="10" cellpadding="10" cellspacing="10">
    <tr>
        <th>Configuration</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>Language</td>
        <td>
            <c:choose>
                <c:when test="${property.languages =='Vietnamese'}">Vietnamese</c:when>
                <c:when test="${property.languages =='English'}">English</c:when>
                <c:when test="${property.languages =='Japanese'}">Japanese</c:when>
                <c:when test="${property.languages =='Chinese'}">Chinese</c:when>
            </c:choose>
        </td>
    </tr>
    <tr>
        <td>Pages per mail</td>
        <td> <c:choose>
            <c:when test="${property.pageSize =='5'}">5</c:when>
            <c:when test="${property.pageSize =='10'}">10</c:when>
            <c:when test="${property.pageSize =='15'}">15</c:when>
            <c:when test="${property.pageSize =='20'}">20</c:when>
            <c:when test="${property.pageSize =='25'}">25</c:when>
        </c:choose></td>
    </tr>
    <tr>
        <td>Spams filter enabled</td>
        <td>${property.spamsFillter }</td>
    </tr>
    <tr>
        <td>Signature</td>
        <td>${property.signnature}</td>
    </tr>
</table>
<a href="/bt1update">cap nhat</a>
</body>
</html>