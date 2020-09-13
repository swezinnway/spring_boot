<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="save_level" method="POST" modelAttribute="level">

Course_name: <form:select path="course.course_id" class="form-control">
	<c:forEach items="${courseList}" var="course">
	<form:option value="${course.course_id }">${course.course_name }</form:option>
	</c:forEach></form:select><br>
	
	
Level_name: <form:input path="level_name" />

<input type="submit" value="submit" />

</form:form>


      
</body>
</html>