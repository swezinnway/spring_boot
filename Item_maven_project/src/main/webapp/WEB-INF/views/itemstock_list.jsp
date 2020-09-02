<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/AdminHome.jsp"%>
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
<h3>ItemStock List</h3>
<a href="new_Itemstock.htm">New ItemStock</a>
<table class="table table-borderless">
	<thead>
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Image</th>
			<th>Date</th>
			<th>Qty</th>
			<th>Price</th>
			<th>Action</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${itemstockList }" var="its" varStatus="row">
			<tr>
				<td>${row.count}</td>
				<td>${its.name}</td>
				<td><img src="./images/${its.photoPath}" width="80" height="80" style="border:1px solid red;" /></td>
				<td>${its.date}</td>
				<td>${its.qty}</td>
				<td>${its.price }</td>
				<td><a href = '<c:url value="/delete1/${its.id}"/>'>Delete</a>
                 <a href = '<c:url value="/edit/${its.id}"/>'>Edit</a>
				
			</td>
				
				     
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</body>
</html>