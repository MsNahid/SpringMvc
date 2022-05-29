<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>

<head>
    <title>Save Customer</title>

    <link href="<c:url value="/resources/css/style.css" />"
          rel="stylesheet">

    <link href="<c:url value="/resources/css/add-customer-style.css" />"
          rel="stylesheet">
</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">
    <h3>Save Customer</h3>

    <form:form action="saveCustomer" modelAttribute="customer" method="POST">

        <table>
            <tbody>
            <tr>
                <td><label>First name:</label></td>
                <td><form:input path="firstName"/></td>
            </tr>

            <tr>
                <td><label>Last name:</label></td>
                <td><form:input path="lastName"/></td>
            </tr>

            <tr>
                <td><label>Email:</label></td>
                <td><form:input path="email"/></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save"/></td>
            </tr>


            </tbody>
        </table>


    </form:form>

    <div style="clear:both">good</div>

    <p>
        <a href="/customers/list">Back to List</a>
    </p>


</div>

</body>

</html>