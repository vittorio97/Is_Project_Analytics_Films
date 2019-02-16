<% Utente utente = (Utente) request.getSession().getAttribute("utente"); %>
<%
	Film film = (Film) request.getSession().getAttribute("TitoloFilm");
%>
<%
	Collection<Recensione> recensione = (Collection<Recensione>) request.getSession().getAttribute("recensione");
%>

<%@ page import="bean.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*, bean.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/Utente.css" type="text/css" rel="stylesheet" />
<title>Film</title>
</head>
<body>
	<%@ include file="HeaderLoggato.jsp"%>




	<%
		if (film == null) {
	%>
	<h1>Non ci sono film</h1>

	<%
		} else {
	%>


	<div class="btn-btn" style="margin-top: 140px"></div>

		<h1>
			<%=film.getTitoloFilm()%>
		</h1>




		<div id="trama" class="op-schede" style="display: block;height:440px;">




			<div class="trama">
				<img align="left" src="<%=film.getLocandina()%>"  alt="#"
					itemprop="image" style="margin-right: 5px; max-width:300px;">


			
		


				<h1>TRAMA</h1>
				<h3><%=film.getTrama()%> (<%=film.getCategoria()%>)</h3>


			<form class="cinema" action="../SearchCinema" method="post">
						
							
				<input class="btn btn-warning my-1 " type="submit" value="Cerca Cinema">
						<input type = "hidden" name ="Cinema" value="<%= film.getTitoloFilm()%>">		
								</form>
				
  	
  	</div>
  	
 	
			</div>

	
	<h1> Recensioni</h1>
<div style = "width:50%;  background: ivory"> 
		<%
			Iterator<Recensione> it = recensione.iterator();
				while (it.hasNext()) {
					Recensione rec1 = it.next();
		%>

<div style = "margin-top:1%; border-radius: 10px; border: 2px solid orange ; background: ivory">
		<h2><%=rec1.getTitolo()%>
		</h2>
		<h3><%=rec1.getTesto()%>
		</h3>
</div>

		<%
			}
		%>

		<%
			}
		%>

</div>

	<div style="position:relative;">

	<form action= "../InsertReview" method="post" style="position:absolute; right:0; margin-top:-20%;margin-right:8%;">
		<h2>Inserisci recensione</h2>
	<h3>Titolo</h3> <input type="text" name="Titolo"><br>
  
  	<h3>Testo</h3> <textarea rows="4" cols="50" name="Testo">
	
	
</textarea> <br>
  	
  	<div name= "NomeUtente" <%= utente.getEmail() %>>
  	
  	</div>
 	
 	<div name= "TitoloFilm" <%= film.getTitoloFilm() %>>
  	
  	</div>
  	
  	
  	
 	 <input type="submit" class="btn btn-warning my-1 "  value="Submit" style= "float: right">
 	 
</form>
	</div>
	

	


	
</body>
</html>