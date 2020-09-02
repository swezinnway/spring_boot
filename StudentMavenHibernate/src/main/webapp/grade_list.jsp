<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grade List</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<br>
<a href="GradeServlet?action=new">New Grade</a>
<table>
	<thead>
	 <tr>
	 	<th>No</th>
	 	<th>Name</th>
	 </tr>
	</thead>
	<tbody>
		<c:forEach items="${grades}" var="grade" varStatus="row">
			<tr>
			<td>${row.count }</td>
			<td>${grade.name }</td>
			
			</tr>
			
		</c:forEach>
	</tbody>
</table>
</body>
</html>