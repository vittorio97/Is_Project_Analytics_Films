
<%
	Collection <Cinema> cinema = (Collection<Cinema>)  request.getSession().getAttribute("cinema");

%>

<%@ page import ="java.util.*, bean.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/HomePageStyle.css" type="text/css" rel="stylesheet" />
<link href="../css/CinemaList.css" type="text/css" rel="stylesheet" />
<title>Lista Cinema</title>
</head>
<body>

<%@ include file= "HeaderLoggato.jsp"%>


<div id="container">
 <div id="main">
 
 	</form>
 <h1>Lista Cinema </h1>
  <br>
		
		<%
			Iterator <Cinema> it = cinema.iterator();
				while (it.hasNext()) {
				
					Cinema c1 = it.next();
				
		%>

		
  <p><%=c1.getNome() %></p>
  <p><%=c1.getLuogo() %> </p>
  <p><%=c1.getOrario() %></p>
  <br>
  <hr noshade class="line">
  <br>
  
 </div>
</div>

<% } %>


</body>
</html>