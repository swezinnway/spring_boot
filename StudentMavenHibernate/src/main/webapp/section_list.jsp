<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<br>
<a href="SectionServlet?action=new">New Section</a>
<table>
	<thead>
		<tr>
			<th>No</th>
			<th>Section</th>
			
			<th>Grade</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${sections }" var="sec" varStatus="row">
		<tr>
			<td>${row.count }</td>
			<td>${sec.name }</td>
			<td>${sec.grade.name }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>