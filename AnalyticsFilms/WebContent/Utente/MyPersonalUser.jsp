<%@ page import= "bean.Utente" %>

<% Utente u = (Utente)request.getSession().getAttribute("user"); %>

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
<%@ include file= "HeaderSito.jsp"%>

		<section id="profile-header">

         <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140"><title>Placeholder</title><rect fill="#777" width="100%" height="100%"/><text fill="#777" dy=".3em" x="50%" y="50%">140x140</text></svg>

				 <h2 class="user">Username</h2>

				<div class="btn-group">
   		 		<a  href="ShowPersonalInfo.jsp" class="btn btn-secondary">UserInfo</a>
   				<a  href="ModifyPersonalInfo.jsp" class="btn btn-secondary">EditInfo</a>

 				</div>

	</section>
	
	<h4 class="fav-films" style="position: absolute; padding-top: 340px; left: 160px;">FAVORITE MOVIES</h4>

	<div class="container" style=" position: absolute; top: 400px; left: 140px;">
		<div class="row">
			<div class="col-4-row ml-3">
				<div class="card" style="width:18rem;">
					<img src="../locandine/aquaman locandina.jpg" alt="Card One" class=card-img-top>
					<div class="card-body">
						<h5 class="card-title">Card One</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
						<a href="#" class="btn btn-warning">Vai al film</a>

					</div>
				</div>
			</div>
			<div class="col-4-row ml-3">
				<div class="card" style="width:18rem;">
					<img src="../locandine/suspiria locandina.jpg" alt="Card Two" class=card-img-top>
					<div class="card-body">
						<h5 class="card-title">Card Two</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
						<a href="#" class="btn btn-warning">Vai al film</a>

					</div>
				</div>
			</div>
			<div class="col-4-row ml-3">
				<div class="card" style="width:18rem;">
					<img src="../locandine/aquaman locandina.jpg" alt="Card Three" class=card-img-top>
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