<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<link href="css/HomePageStyle.css" type="text/css" rel="stylesheet" />
<link href="../css/AccountUserList.css" type="text/css" />
<title>MyPersonalUser</title>
</head>

<body>
<%@ include file= "HeaderLoggato.jsp"%>
	
	<div class="lista-utenti" 
    style="position: absolute;
    top: 20%; left:7%;">
	<h3> User list</h3>
	
	<ul>
	<li> Username 1 <button type="button" class="btn btn-warning">Delete</button></li>
	<br>
	<li> Username 2 <button type="button" class="btn btn-warning">Delete</button></li>
	<br>
	<li> Username 3 <button type="button" class="btn btn-warning">Delete</button></li>
	<br>
    <li> Username 4 <button type="button" class="btn btn-warning">Delete</button></li>
    <br>
	<li> Username 5 <button type="button" class="btn btn-warning">Delete</button></li>
	<br>
	<li> Username 6 <button type="button" class="btn btn-warning">Delete</button></li>
	<br>
	</ul>
	</div>
	
	
</body>
</html>