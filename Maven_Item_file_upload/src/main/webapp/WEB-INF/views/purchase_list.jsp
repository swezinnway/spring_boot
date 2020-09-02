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
<h3>Purchase List</h3>
<a href="new_Purchase.htm">New Purchase</a>
<table class="table table-borderless">
	<thead>
		<tr>
			<th>No</th>
			<th>Amount</th>
			<th>Qty</th>
			<th>Date</th>
			<th>TotalAmount</th>
		
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${purchaselist }" var="its" varStatus="row">
			<tr>
				<td>${row.count}</td>
				<td>${its.amount}</td>
				<td>${its.qty}</td>
				<td>${its.date}</td>
				<td>${its.totalamount }</td>
			
				
				     
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</body>
</html>