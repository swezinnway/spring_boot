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

<h3>Category Add</h3>
<form:form action="new_Category.htm" method="post" modelAttribute="categorys">

<div class="form-group col-sm-6" >
      <label for="name">Category_Name:</label>
      <form:input path="name" class="form-control" placeholder="Enter category"/>
    </div><br>
    
 <div class="form-group col-sm-6" >
      <label for="codeno">Code_No:</label>
      <form:input path="codeno" class="form-control" placeholder="Enter codeno"/>
       </div><br>
<button type="submit" class="btn btn-primary">Save</button>
</form:form>
</div>
</body>
</html>