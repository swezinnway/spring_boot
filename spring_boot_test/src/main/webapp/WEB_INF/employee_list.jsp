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

<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Age</th>
			<th>PoneNo</th>
			<th>Address</th>
			<th>Gender</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${employees}" var="emp">
			<tr>
				<td>${emp.name }</td>
				<td>${emp.email }</td>
				<td>${emp.age }</td>
				<td>${emp.phoneno }</td>
				<td>${emp.address }</td>
				<td>${emp.gender }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>