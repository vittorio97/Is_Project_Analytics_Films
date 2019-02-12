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
<title>Insert title here</title>
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


	<div class="btn-btn" style="margin-top: 140px">

		<h1>
			<%=film.getTitoloFilm()%>
		</h1>




		<div id="trama" class="op-schede" style="display: block;">




			<div class="trama">
				<img align="left" src="<%=film.getLocandina()%>" alt="#"
					itemprop="image" style="margin-right: 5px;">


				<h2 itemprop="description">
					Genere:
					<%=film.getCategoria()%></h2>


				<h1>TRAMA</h1>
				<h2><%=film.getTrama()%></h2>


			<form class="cinema" action="../SearchCinema" method="post">
						
							
				<input class="btn btn-warning my-1 " type="submit" name ="Cinema" <%= film.getTitoloFilm()%> value="<%= film.getTitoloFilm()%>">
								
								</form>
				
  	
  	
  	
 	
			</div>

		</div>



		<%
			Iterator<Recensione> it = recensione.iterator();
				while (it.hasNext()) {
					Recensione rec1 = it.next();
		%>


		<h1><%=rec1.getTitolo()%>
		</h1>
		<h1><%=rec1.getTesto()%>
		</h1>


		<%
			}
		%>

		<%
			}
		%>




	<form action= "../InsertReview" method="post">
	
	Titolo: <input type="text" name="Titolo"><br>
  
  	Testo: <textarea rows="4" cols="50" name="Testo">
	
	
</textarea> <br>
  	
  	<div name= "NomeUtente" <%= utente.getEmail() %>>
  	
  	</div>
 	
 	<div name= "TitoloFilm" <%= film.getTitoloFilm() %>>
  	
  	</div>
  	
  	
  	
 	 <input type="submit"  value="Submit">
 	 
</form>
	
	

	</div>


	
</body>
</html>