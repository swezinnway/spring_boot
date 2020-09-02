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
	<!--<div class="container">
				<ul id="mySearch" class="stype-none">
          		<c:forEach items="${itemstockList}" var="item" varStatus="row">
          		<li>
          		<div class="row" id="list">
          		<div class="cols-lg-4 p-3">
				<img src="./images/${item.photoPath }" name="${item.name }" width="150"/>
				</div>
				<div class="cols-lg-4 p-3 ml-5">
				<p>Product Name: ${item.name }<br>
				Price : ${item.price }
				<br>Category Type : ${item.itemCategory.name }<br>
				<p>Product Amount : ${item.qty }</p>
				</div>
				</div>
				</li>
			</c:forEach>
			</ul>
</div>


  -->


	<div class="container">
<div class="row">
		<c:forEach items="${itemstockList }" var="its" varStatus="row">

			
			<br>
			<div class="col-sm-3">
				<div class="card" style="width: 200">
					<img class="card-img-top" src="./images/${its.photoPath}"
						alt="Card image" style="width: 200" height="260">
					<div class="card-body">
						<p class="card-text">Name:${its.name}</p>
						<p class="card-text">Price :${its.price }</p>
						<a href="#" class="btn btn-primary stretched-link">Buy</a>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>


</div>
	

</body>
</html>