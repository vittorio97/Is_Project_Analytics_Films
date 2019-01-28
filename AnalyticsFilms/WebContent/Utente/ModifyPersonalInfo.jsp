<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifica info personali</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" />
		<link href="../css/HomePageStyle.css" type="text/css" rel="stylesheet" />
		<link href="../css/ModifyPersonalInfo.css" type="text/css" rel="stylesheet" />
		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script> 
</head>
<body>
<%@ include file= "HeaderLoggato.jsp"%>
	<div id="container">
		<div id="main">
	 <img class= "UserLogo" src="../img/user.png" width="125px" height="125px">
 <form class = "formReg" style= "width: 30%  ; margin-top: 6.5% ; margin-bottom: 6.5%" >
  <div class="form-group"> </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="EnterUsername">
    
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Current Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Current Password">
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">New Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="NewPassword">
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Repeat New Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="RepeatNewPassword">
  </div>
  
  <button type="submit"  class="btn btn-warning">Confirm Changes</button>
	</form>
	
	</div>
	</div>

<%@ include file="Footer.jsp"%>
</body>

</html>