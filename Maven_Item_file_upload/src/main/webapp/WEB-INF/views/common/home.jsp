<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/common/include.jsp"%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
  
    
    <nav  class="navbar navbar-expand-lg  bg-light" >
  
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="new_Category.htm">Add Category <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="new_Itemstock.htm">Add Item Stock</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="new_ItemSale.htm">Add Item Sale</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="new_Purchase.htm">Add Item Purchase</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         Show Item List
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="Category_list.htm">Category List</a>
          <a class="dropdown-item" href="itemstock_list.htm">Item Stock List</a>
          <a class="dropdown-item" href="Itemsale_list.htm">Item Sale List</a>
           <a class="dropdown-item" href="purchase_list.htm">Item Purchase List</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


