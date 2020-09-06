<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
$(document).ready(function(){
	alert("OK Query");
	
	$("#btnSave").click(function(){
		var name=$("#name").val;
		var email=$("#email").val;
		
		
		var employee={name:name,email:email};
		$.ajax({
			 type: 'POST',
		      contentType : "application/json",
		      url: "/ajax_save",
		      data:JSON.stringify(employee),
		      dataType: "json",
		      success: function(resultData) { 
		    	  
		    	  alert("save successful");
		    	  console.log(resultData);
		    	  $("#emp_table").append(
		    				'<tr>'
		    					+'<td>'+resultData.name+'</td>'
		    					+'<td>'+resultData.email+'</td>'
		    					
		    					+'</tr>'
		    		  );
		      }
		});
	});
	call_employee();
});

function call_employee(){
	$.ajax({
	      type: 'GET',
	      contentType : "application/json",
	      url: "/employees",
	     
	    
	      success: function(resultData) { 
	    	  
	    	  resultData.forEach(function(employee,i){
	    		  $("#emp_table").append(
	    				  '<tr>'
	    				  +'<td>'+employee.name+'</td>'
	    					+'<td>'+employee.email+'</td>'
	    					
	    					+'</tr>'
	    		  );
	    		  
	    	  });
	      }
	});
}
</script>
</head>
<body>
<div>
	<label>Name:</label> <input type="text" id="name" />
	<br>
	<label>Email:</label> <input type="text" id="email" />
		<button id="btnSave">Save</button>
</div>
<div>
<table id="emp_table">
	<thead>
	<tr>
		<th>Name</th>
		<th>Email</th>
		
		
	</tr>
	</thead>
	<tbody>
		<tr>
		
		</tr>
	</tbody>
</table>
</div>
</body>
</html>