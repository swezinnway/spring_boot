<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/common/home.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h3>Category List</h3>

<a href="new_Category.htm">New ItemCategory</a>
<table class="table table-borderless">
	<thead>
		<tr>
			<th>No</th>
			<th>Category_Item_Name</th>
			<th>Code_No</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${categoryList }" var="cat" varStatus="row">
			<tr>
				<td>${row.count }</td>
				<td>${cat.name }</td>
				<td>${cat.codeno }</td>
				  
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</body>
</html>