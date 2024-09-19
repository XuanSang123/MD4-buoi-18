<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: maixu
  Date: 9/19/2024
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>SETTINGS</h1>
<%--@elvariable id="property" type=""--%>
<form:form action="/doUPDATE" method="post" modelAttribute="property">
    <form:label path="languages">Languages</form:label>
    <form:select path="languages">
        <form:option value="English">English</form:option>
        <form:option value="Vietnamese">Vietnamese</form:option>
        <form:option value="Japanese">Japanese</form:option>
        <form:option value="Chinese">Chinese</form:option>
    </form:select>

    <div>
        <form:label path="pageSize">Page Size</form:label>
        <form:select path="pageSize">
            <form:option value="5">5</form:option>
            <form:option value="10">10</form:option>
            <form:option value="15">15</form:option>
            <form:option value="20">20</form:option>
            <form:option value="25">25</form:option>
        </form:select>
    </div>
    <div>
        <form:label path="spamsFillter">Spams Fillter</form:label>
        <form:checkbox value="unactive" path="spamsFillter"/>
    </div>
    <div>
        <form:label path="signnature">Signature</form:label>
        <form:textarea path="signnature" rows="5" cols="30"></form:textarea>

    </div>
    <button type="submit">update</button>
</form:form>
</body>
</html>
