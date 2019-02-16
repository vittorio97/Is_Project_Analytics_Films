<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*, bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Film List</title>
</head>
<body>
	
	
	<%@ include file= "HeaderAmministratore.jsp"%> 
	
	
	<% Collection<Film> film=(Collection<Film>) request.getSession().getAttribute("film"); %>
	


	<h3>Film list</h3>
	
	<%if(film==null){ %>
	<h1>Non ci sono film</h1>
	<%}else{%>
	
	
	<% Iterator<Film> it=film.iterator();
		while(it.hasNext()){
		Film film1=it.next();%>

		
		<div style= "margin-top:20%;height:450px;position:relative;">	
	
		
			<div class="container-immagine" style="height:450px; width:20%">
				<img style="height:100%; width:100%" align="left" src="<%=film1.getLocandina()%>" alt="Locandina in arrivo"
					itemprop="image" style="margin-right: 5px;">
		</div>
		<div class="container-informazioni-film" style="width:80%;position:absolute;top:0;right:0;">
		<h1><%=film1.getTitoloFilm() %></h1>
		
			<h1> <%= film1.getTrama() %> (<%=film1.getCategoria() %>)</h1>
				
				<button class= "btn btn-warning my-1" type="submit"  onclick="window.location='ModifyFilm.jsp?TitoloFilm=<%=film1.getTitoloFilm() %>&?Locandina=<%=film1.getLocandina() %>'" style=margin-left:1000px> Modifica </button>
				
			
			<form action="../DeleteFilm" method="post">
				<input class= "btn btn-warning my-1 "type="hidden" value=<%=film1.getTitoloFilm() %> name=titolo>
				<input class= "btn btn-warning my-1 "type=submit value=Elimina>
			</form>
			
		</div>

	<%} %>
		</div>
	<%} %>
	
</body>
</html>
