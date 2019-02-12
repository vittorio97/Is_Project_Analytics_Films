

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

	<link href="css/HomePageStyle.css" type="text/css" rel="stylesheet" />
<title>MyPersonalUser</title>
</head>
<body>
<%@ include file= "HeaderAmministratore.jsp"%> 

		
  <% Collection <Utente> utenti= (Collection<Utente>) request.getSession().getAttribute("utenti"); %>
	<h3> User list</h3>
	<hr>
	
	
	
	<% Iterator<Utente> it=utenti.iterator();
		while(it.hasNext()){
		Utente utenti1=it.next();%>

		
		<div style= "margin-top:20%;height:450px;position:relative;">	
	
		
			<div class="container-immagine" style="height:450px; width:20%">
				<img style="height:50%; width:50%" align="left" src="../img/user.png" alt="#"
					itemprop="image" style="margin-right: 5px;">
		</div>
		<div class="container-informazioni-film" style="width:80%;position:absolute;top:0;right:0;">
		<h1><%=utenti1.getEmail() %></h1>
		<h1><%=utenti1.getUsername() %></h1>
		<h1><%=utenti1.getRuolo()%></h1>	
			
			<form action="../DeleteAccount" method="post">
				<input class= "btn btn-warning my-1 "type="hidden" value=<%=utenti1.getEmail() %> name=email>
				<input class= "btn btn-warning my-1 "type=submit value=Elimina>
			</form>
		</div>

	<%} %>
		</div>
	
	
</body>
</html>