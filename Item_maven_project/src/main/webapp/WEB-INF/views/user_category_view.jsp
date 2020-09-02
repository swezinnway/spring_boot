<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ include file="/WEB-INF/views/AdminHome.jsp"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">

		
	
	
	<div class="row">
		<c:forEach items="${itemstockList }" var="its" varStatus="row">
		
		<div class="col-sm-3">
	<div class="card" style="width:200">
   <img class="card-img-top" src="./images/${its.photoPath}"
						alt="Card image" style="width: 200" height="260">
    <div class="card-body">
     <p class="card-text">Name:${its.name}</p>
						<p class="card-text">Price:${its.price }</p>
      <a href="#" class="btn btn-primary stretched-link">Buy</a>
    </div>
	</div>
	</div>
	</c:forEach>
	</div>	     
		
		
	
	</div>
	
	
	
	
	
</body>
</html>