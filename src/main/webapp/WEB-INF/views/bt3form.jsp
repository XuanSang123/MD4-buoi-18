<%--
  Created by IntelliJ IDEA.
  User: maixu
  Date: 9/20/2024
  Time: 2:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="10" cellspacing="10" cellpadding="10"
>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Address</th>
        <th>Phone</th>
    </tr>
    <c:forEach var="dentist" items="${dentist}">
        <tr>
            <td>${dentist.id}</td>
            <td>${dentist.name}</td>
            <td>${dentist.gender}</td>
            <td>${dentist.address}</td>
            <td>${dentist.phone}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
