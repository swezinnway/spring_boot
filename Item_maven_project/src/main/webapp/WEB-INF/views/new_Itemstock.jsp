<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/AdminHome.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<h3>Item Stock Add</h3>
<form:form action="new_Itemstock.htm" method="post" modelAttribute="items" enctype="multipart/form-data">

<div class="form-group col-sm-6">
      <label for="name">Item_Name:</label>
      <form:input path="name" class="form-control" placeholder="Enter Item_Name"/>
      
    </div><br>
<div class="form-group col-sm-6">
      <label for="date">Date:</label>
      <form:input path="date" type="date" class="form-control" placeholder="Enter Date"/>
      
    </div><br>
<div class="form-group col-sm-6">
      <label for="qty">Qty:</label>
      <form:input path="qty" class="form-control" placeholder="Enter Qty"/>
      
    </div><br>
    
    <div class="form-group col-sm-6">
      <label for="price">Price:</label>
      <form:input path="price" class="form-control" placeholder="Enter Price"/>
      
    </div><br>
    <div class="form-group col-sm-6">
      <label for="file">Item Photo</label>
      <form:input  type="file" path="file"/>
      
    </div><br>
    
   
    <div class="form-group col-sm-6">
      <label for="price">Category:</label>
      <form:select path="itemcategory.id" class="form-control">
	<c:forEach items="${itemstockList }" var="cat">
	<form:option value="${cat.id }">${cat.name }</form:option>
	</c:forEach>
	
</form:select>
    </div><br>

<button type="submit" class="btn btn-primary">Save</button>
</form:form>
</div>
</body>
</html>