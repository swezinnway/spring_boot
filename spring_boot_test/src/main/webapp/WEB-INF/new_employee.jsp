<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
   <%@ include file="/WEB-INF/common/include.jsp"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Create Employee</h3>

<form:form action="save_Employee" method="POST" modelAttribute="employee">

Name: <form:input path="name" /><form:errors path="name" cssClass="error"></form:errors> <br>

Email:<form:input path="email" /><br>

Age:<form:input path="age" /><br>

PhoneNo:<form:input path="phoneno" /><br>

Address:<form:input path="address" /><br>
`

Gender:<form:radiobutton path="gender" value="Male"/>Male<form:radiobutton path="gender" value="Femal"/>Female<br>
 
<input type="submit" value="Register" />

</form:form>

</body>
</html>