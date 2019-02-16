

<% int reviewN = (int) request.getSession().getAttribute("reviewNumber"); %>
<% int filmN = (int) request.getSession().getAttribute("filmNumber"); %>
<% int userN = (int) request.getSession().getAttribute("userNumber"); %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/Statistics.css" type="text/css" rel="stylesheet" />
<title>Statistics</title>
</head>
<body>
	<%@ include file= "HeaderAmministratore.jsp"%> 
	
	
	<div style = "margin-top: 12%">
	</div>
	<div>
 <h2> Numero di Utenti Registrati: <%= userN %></h2>
 
 
 <img src="../img/images.png" >
 
 

<h2> Numero di Film: <%= filmN %></h2>
 <img  src="../img/download.png">
 


 <h2> Numero di Recensioni: <%= reviewN %> </h2>
 
 
 <img src="../img/images.png" >
 
 


</div>
</body>
</html>