

<% Utente utente = (Utente) request.getSession().getAttribute("utente"); %>

<%@ page import= "bean.Utente" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >

	<link href="../css/HomePageStyle.css" type="text/css" rel="stylesheet" />
	<link href="../css/MyPersonalUser.css" type="text/css" rel="stylesheet" />
<title>MyPersonalUser</title>
</head>
<body>
<%@ include file= "HeaderLoggato.jsp"%>

		<section id="profile-header">

        <img class= "UserLogo" src="../img/user.png" width="125px" height="125px">
				 <h2 class="user"><%=utente.getUsername() %></h2>

				
				<div class="btn-group" style= "margin-left:50px">
   		 		
   		 		<form class="btn btn-secondary" action="../ShowPersonalInfo" method="post" >
   		 		
   		 			
   		 			<input class="btn btn-warning my-1 " type="submit" name ="Email" <%= utente.getEmail()%> value="<%= utente.getEmail()%>">
   		 		
   		 		
   		 		
   		 		</form>
   				<a  href="ModifyPersonalInfo.jsp" class="btn btn-secondary">EditInfo</a>

 				</div>

	</section>
	
	<h4 class="fav-films" style="position: absolute; padding-top: 340px; left: 160px;">SUGGESTED MOVIES</h4>

	<div class="container" style=" position: absolute; top: 400px; left: 140px;">
		<div class="row">
			<div class="col-4-row ml-3">
				<div class="card" style="width:18rem;">
					<img src="../locandine/aquaman.jpg" alt="Card One" class=card-img-top>
					<div class="card-body">
						<h5 class="card-title">Card One</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
						<a href="#" class="btn btn-warning">Vai al film</a>

					</div>
				</div>
			</div>
			<div class="col-4-row ml-3">
				<div class="card" style="width:18rem;">
					<img src="../locandine/suspiria.jpg" alt="Card Two" class=card-img-top>
					<div class="card-body">
						<h5 class="card-title">Card Two</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
						<a href="#" class="btn btn-warning">Vai al film</a>

					</div>
				</div>
			</div>
			<div class="col-4-row ml-3">
				<div class="card" style="width:18rem;">
					<img src="../locandine/aquaman.jpg" alt="Card Three" class=card-img-top>
					<div class="card-body">
						<h5 class="card-title">Card One</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
						<a href="#" class="btn btn-warning">Vai al film</a>

					</div>
				</div>
			</div>
		</div>

	</div>
	
	
	</body>

</html>