<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/common/include.jsp"%>

    <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
  
  
    <nav class="navbar navbar-expand-lg navbar-light bg-info">
  <a class="navbar-brand" href="ItemShow.htm">Shoop</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="glyphicon glyphicon-user"></span>
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Add Item
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="new_Category.htm">Add Category </a>
          <a class="dropdown-item" href="new_Itemstock.htm">Add Item Stock</a>
          <a class="dropdown-item" href="new_ItemSale.htm">Add Item Sale</a>
          <a class="dropdown-item" href="new_Purchase.htm">Add Item Purchase</a>
          
        </div>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         Show Item List
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="Category_list.htm">Category List</a>
          <a class="dropdown-item" href="itemstock_list.htm">Item Stock List</a>
          <a class="dropdown-item" href="Itemsale_list.htm">Item Sale List</a>
           <a class="dropdown-item" href="purchase_list.htm">Item Purchase</a>
        </div>
      </li>
      <li class="nav-item dropdown ml-4 text-light">
      <form:form class="form-inline" action="selectCategory" method="get">
			<select name="category">
				<c:forEach items="${categoryList }" var="item" varStatus="row">
          		<option value="${item.id }">${item.name}</option>
          		</c:forEach>
        </select>&nbsp;&nbsp;
        <input type="submit" value="Submit" "/>
        </form:form>
      </li>
      
    </ul>
   <form:form class="form-inline" action="user_show" method="GET">
      <input class="form-control" type="search" placeholder="Search" name="search"/>
      <input type="submit" class="btn btn-light ml-3" value="Search">
      </form:form>
  </div>
</nav>
    
  
    
    
    
    
    


