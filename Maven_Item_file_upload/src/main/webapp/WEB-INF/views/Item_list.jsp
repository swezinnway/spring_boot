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
<h3>ItemStock List</h3>
<a href="new_Itemstock.htm">New ItemStock</a>
<table class="table table-borderless">
	<thead>
		<tr>
			<th>No</th>
			<th>Item_Name</th>
			<th>Date</th>
			<th>Qulity</th>
			<th>Price</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${itemstockList }" var="it" varStatus="row">
			<tr>
				<td>${row.count }</td>
				<td>${it.name }</td>
				<td>${it.date}</td>
				<td>${it.qty }</td>
				<td>${it.price }</td>
				
				     
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</body>
</html>