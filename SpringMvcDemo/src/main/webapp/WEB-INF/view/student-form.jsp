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
	
	Country:
	<form:select path="country">
		<form:option value="BN" label="BANGLADESH"></form:option>
		<form:option value="US" label="UNITED KINGDOM"></form:option>
		<form:option value="USA" label="UNITED STATES"></form:option>
		<form:option value="PAK" label="PAKISTAN"></form:option>
	</form:select>
	
	<br/>
	Favourite Programming Language:
	<br/>
	JAVA<form:radiobutton path="programmingLanguage" value="JAVA"></form:radiobutton>
	Go<form:radiobutton path="programmingLanguage" value="GO"></form:radiobutton>
	C#<form:radiobutton path="programmingLanguage" value="C#"></form:radiobutton>
	RUBY<form:radiobutton path="programmingLanguage" value="RUBY"></form:radiobutton>
	
	<br/>
	
	Operating Systems Liked:
	<br/>
	Linux<form:checkbox path="operatingSystems" value="Linux"></form:checkbox>
	Mac os<form:checkbox path="operatingSystems" value="IOS"></form:checkbox>
	Windows<form:checkbox path="operatingSystems" value="WINDOWS"></form:checkbox>
	
	<br/>
	
	<input type="submit" value="submit">
	
	
	<br/>

</form:form>

</body>
</html>
