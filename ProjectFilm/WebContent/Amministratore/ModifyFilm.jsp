<% String titoloFilm = (String) request.getParameter("TitoloFilm");
 request.getSession().setAttribute("titoloFilm", titoloFilm);%>
 <% String locandina = (String) request.getParameter("Locandina");
 request.getSession().setAttribute("locandina", locandina);%>
 
 
<%@ page import="bean.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifica Film</title>
</head>
<body>
	<%@ include file= "HeaderAmministratore.jsp"%> 
	
	
	
	<form action= "../ModifyFilm" action="post">
<h1> Modifica Film </h1>
<br>
<hr>
<h2> <%= titoloFilm %></h2>
<br>

<h3 style="
    position: absolute;
    down: 50px;
    ">
 Trama in breve 
 </h3>
 
<textarea name ="Trama" rows="10" cols="50"
style="
    position: absolute;
    left: 400px;">
</textarea>

<h3
style=" position:absolute;
		bottom:220px;"> Modifica locandina</h3>

<h3 style="
position:absolute;
		bottom:100px;">
		Genere</h3>
		 
<textarea name ="Categoria" rows="3" cols="40"
style="
    position: absolute;
    left: 400px;
    bottom:100px">
</textarea>

<h3 style="
position:absolute;
		bottom:5px;">
	
</h3>
<input class="btn btn-warning my-1 " style="
position:absolute;
left:800px;
bottom:1px;" type="submit" name ="Aggiorna" value="Aggiorna">

</form>
</body>
</html>