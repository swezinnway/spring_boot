<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="create_course" method="POST" modelAttribute="course" enctype="multipart/form-data">

Course_name: <form:input path="course_name" /><form:errors path="course_name" cssClass="error"></form:errors> <br>
Course_Description: <form:input path="course_description" /></br>
Profile <form:input type="file" path="file" /><br>
<input type="submit" value="submit" />

</form:form>

</body>
</html>