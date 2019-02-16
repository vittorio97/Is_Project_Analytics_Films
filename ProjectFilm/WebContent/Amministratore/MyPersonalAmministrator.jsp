
<% Utente utente = (Utente) request.getSession().getAttribute("utente"); %>


<%@ page import= "bean.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina personale Amministratore</title>
</head>
<body style = "background-color: ivory;">
	 <%@ include file= "HeaderAmministratore.jsp"%> 
	 
	 <div style = "margin-top: 10%"> 
 	<h1>Amministrator Page </h1>
 	</div>
 	<div style= "margin-top:3%">
 		<ul style =  "background-color: orange;  list-style: none; padding: 0 2px; padding: right">
 		<form class= "ShowFilmList" action="../ShowFilmList" method="post">
 	
 	
 <li>	<button class= "btn btn-warning my-1" type="submit">  Lista dei film  </button> </li>
 	
 	 </form>
 	
 	<li> <button class= "btn btn-warning my-1" type="submit" onclick="window.location='AggiungiFilm.jsp'" > Aggiungi un film  </button> </li>
 	
 		
 	<form class= "ShowStatistics" action="../ShowStatistics" method="post">
 	
 	
 	<li> <button class= "btn btn-warning my-1" type="submit">  Visualizza Statistiche Sito  </button> </li>
 	</form>
 	
  <form class= "ShowAccountList" action="../ShowAccountList" method="post"> 
 	
 	
 	<li> <button class= "btn btn-warning my-1" type="submit">  Lista Utenti  </button> </li>
 	</form>
 	</ul>
 	</div>
 	
 	
 		<hr>
 		<br>
 		<br>
 		<h1> Salve, <%= utente.getUsername() %> </h1>
 		
 		
 		
 		<img src="../img/user.png" >
 		
 		
 		
 		<h3> Email: <%=utente.getEmail() %> </h3>
 		
 		
 		<h3> Role: <%=utente.getRuolo() %> </h3>
 		
 		
 		
</body>
</html>