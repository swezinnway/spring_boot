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
<form:form action="save_vedio" method="POST" modelAttribute="vedio">

Level_name: <form:select path="level.level_id" class="form-control">
	<c:forEach items="${levelList}" var="level">
	<form:option value="${level.level_id }">${level.level_name }</form:option>
	</c:forEach></form:select><br>
	
	
Vedio: <form:input path="vedio_name" />

<input type="submit" value="submit" />

</form:form>
</body>
</html>