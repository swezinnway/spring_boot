<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp"  %>
<h3>Section Create</h3>

<form action="StudentServlet" method="get">

Grade:<select name="grade_id">
	<c:forEach items="${grades}" var="g">
		<option value="${g.id }">${g.name }</option>
	</c:forEach>
</select><br>
Section:<select name="section_id">
	<c:forEach items="${sections}" var="sec">
		<option value="${sec.id }">${sec.name }</option>
	</c:forEach>
</select><br>

Student:<input type="text" name="stname" /><br>
<input type="submit" value="Save" name="action" />
</form>
</body>
</html>