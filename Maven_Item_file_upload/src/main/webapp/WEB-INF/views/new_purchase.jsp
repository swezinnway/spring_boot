<%@ include file="/WEB-INF/views/common/include.jsp"%>

<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/common/home.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<h3>Item Purchase Add</h3>
<form:form action="new_Purchase.htm" method="post" modelAttribute="purchase">

<div class="form-group col-sm-6" >
      <label for="itemstock">Item_Stock:</label>
      <form:select path="itemstock.id" class="form-control" placeholder="Enter Item_Stock">
	<c:forEach items="${purchaselist }" var="pur">
	<form:option value="${pur.id }">${pur.name }</form:option>
	</c:forEach>
	
</form:select>
    </div><br>

<div class="form-group col-sm-6">
      <label for="date">Date:</label>
      <form:input path="date" type="date" class="form-control" placeholder="Enter Date"/>
      
    </div><br>

<div class="form-group col-sm-6">
      <label for="amount">Amount:</label>
      <form:input path="amount" class="form-control" placeholder="Enter amount"/>
      
    </div><br>
<div class="form-group col-sm-6">
      <label for="qty">Qty:</label>
      <form:input path="qty" class="form-control" placeholder="Enter qty"/>
      
    </div><br>
<div class="form-group col-sm-6">
      <label for="totalamount">TotalAmount:</label>
      <form:input path="totalamount" class="form-control" placeholder="Enter totalamount"/>
      
    </div><br>


<button type="submit" class="btn btn-primary" >Save</button>
</form:form>
</div>
</body>
</html>