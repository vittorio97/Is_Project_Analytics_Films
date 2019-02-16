<% Utente utente = (Utente) request.getSession().getAttribute("utente"); %>
<%@ page import= "bean.Utente" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" />
		<link href="../css/HomePageStyle.css" type="text/css" rel="stylesheet" />
		<link href="../css/ModifyPersonalInfo.css" type="text/css" rel="stylesheet" />
		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script> 
</head>
<title>Personal Info</title>
<body>
<%@ include file= "HeaderLoggato.jsp"%>
	
	<div style= margin-top:200px;>
	
	</div>
	 <img class= "UserLogo" src="../img/user.png" width="125px" height="125px" style= "margin-left:-350px">
		
		  <div style= "margin-top:300px">
		
		<h1> Email: <%= utente.getEmail() %> </h1>
		
		<h2> Username: <%= utente.getUsername()%> </h2>
	
		<h3> Ruolo: <%= utente.getRuolo()%> </h3>
		
    </div>
		

<%@ include file="Footer.jsp"%>
</body>

</html>