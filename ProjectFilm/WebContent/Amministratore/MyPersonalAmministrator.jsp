
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
<body>
	 <%@ include file= "HeaderAmministratore.jsp"%> 
	 
	 
 	<h> Pagina personale Amministratore </h>
 	
 	<h1> Amministrator Info</h1>
 		<hr>
 		<br>
 		<br>
 		<h1> Salve, <%= utente.getUsername() %> </h1>
 		<h2>Benvenuto nella pagina amministratore</h2>
 		
 		
 		<img src="../img/user.png" >
 		
 		
 		
 		<h3> Email: <%=utente.getEmail() %> </h3>
 		
 		
 		<h3> Role: <%=utente.getRuolo() %> </h3>
 		
 		
 		
 		<form class= "ShowFilmList" action="../ShowFilmList" method="post" style= margin-left:1000px>
 	
 	
 	<button class= "btn btn-warning my-1" type="submit">  Lista dei film  </button>
 	
 	 </form>
 	
 	 <button class= "btn btn-warning my-1" type="submit" onclick="window.location='AggiungiFilm.jsp'" style=margin-left:1000px> Aggiungi un film  </button>
 	
 		
 	<form class= "ShowStatistics" action="../ShowStatistics" method="post" style= margin-left:1000px>
 	
 	
 	<button class= "btn btn-warning my-1" type="submit">  Visualizza Statistiche Sito  </button>
 	</form>
 	
 	<form class= "ShowAccountList" action="../ShowAccountList" method="post" style= margin-left:1000px>
 	
 	
 	<button class= "btn btn-warning my-1" type="submit">  Lista Utenti  </button>
 	</form>
 	
 	
 		
</body>
</html>