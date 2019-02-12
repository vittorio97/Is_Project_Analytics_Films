

<!DOCTYPE html>
<html lang="en" dir="ltr">
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >
		<link rel="stylesheet" href="../css/HomePageStyle.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
		<title></title>
	</head>
	<body>

		<nav class="navbar navbar-expand-md fixed-top navbar-light">
			 <!-- logo -->
		 <a class="navbar-brand" href="Homepage.jsp">
			 <img src="../img/LOGO.jpg" width="273" height="95" alt="">
		 </a>
		 <!-- bottone visualizzazione mobile -->
	   <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
	     <span class="navbar-toggler-icon"></span>
	   </button>
		 <!-- bottone visualizzazione mobile -->

	
	   <div class="collapse navbar-collapse" id="navbarsExampleDefault">
			 <!-- ml-auto sposta la navbar a destra-->
			 <ul class="navbar-nav ml-auto">
				 <!-- SIGN IN -->
				<div class = "flex-form-container">
				
				<form class="login" action="../Login" method="post">
						Email: <input type="text" name="email">
						Password: <input type="password" name="password"><br>
							<div class="ForgotPassword">
							<a href= "RecovePassword.jsp"  > Forgot password? </a>
							<input class="btn btn-warning my-1 " type="submit" value="Submit">
								</div>
								</form>
									
								</div>
					<!-- SIGN IN -->
	     </ul>
	   </div>
	 </nav>
	 
	</body>
</html>