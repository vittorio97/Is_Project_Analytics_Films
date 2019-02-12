<% Film film = (Film) request.getSession().getAttribute("TitoloFilm"); %>

<%@ page import= "bean.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >

	<link href="css/HomePageStyle.css" type="text/css" rel="stylesheet" />
<title>AnalyticsFilms</title>
</head>
<body>
 
	<%@ include file= "HeaderLoggato.jsp"%> 
	
	<% if(film==null){ %>
	 <div class="btn-group" style= "margin-top:200px">
	<h1> Nessun risultato per il film ricercato!</h1>
	</div>
	<% }else { %>
		<img src = "<%=film.getLocandina() %>">
<div class="btn-group" style= "margin-top:200px" action="../ShowReviews" >
	
		<form class="review" action="../ShowReviews" method="post">
						
							
				<input class="btn btn-warning my-1 " type="submit" name ="Titolo" <%= film.getTitoloFilm()%> value="<%= film.getTitoloFilm()%>">
								
								</form>
	

</div>

<%} %>
 

<%@ include file= "Footer.jsp"%> 
</body>
</html>