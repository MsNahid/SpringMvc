<%--
  Created by IntelliJ IDEA.
  User: nahid
  Date: 5/24/22
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Student Form</title>
</head>
<body>
<h3>
	Student Form
</h3>

<form:form action="processForm" modelAttribute="student">
	
	First Name : <form:input path="firstName"/>
	
	<br/>
	
	Last Name : <form:input path="lastName"/>
	
	<br/>
	
	<input type="submit" value="submit">
	
	<br/>

</form:form>

</body>
</html>
