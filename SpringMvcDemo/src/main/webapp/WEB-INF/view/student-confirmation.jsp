<%--
  Created by IntelliJ IDEA.
  User: nahid
  Date: 5/24/22
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Student Confirmations Page</title>
</head>
<body>

The student name : ${student.firstName} ${student.lastName}

<br/>
Country : ${ student.country }

<br/>

Favourite Programming Language: ${ student.programmingLanguage }

<br/>

Operating System:
<br >

<ul>
	<c:forEach var="temp" items="${ student.operatingSystems }">
		<li>${temp}</li><br />
	</c:forEach>
</ul>


</body>
</html>
