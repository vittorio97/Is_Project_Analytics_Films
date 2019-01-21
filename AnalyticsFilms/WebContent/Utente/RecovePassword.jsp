<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >

	<link href="../css/HomePageStyle.css" type="text/css" rel="stylesheet" />
	<link href="../css/RecovePassword.css" type="text/css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
<%@ include file= "HeaderSito.jsp"%>


<center>
<form class = "formReg" style= "width: 30%  ; margin-top: 10% ; margin-bottom: 6.5%">
  <div class="form-group">
  <h3> LOST PASSWORD? </h3> 
  <p>Ok, don't panic. You can recover it here</p>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    	<label>The password will be sent to the indicated email</label>
    	<center></center><button class="btn btn-warning my-2 my-sm-0" type="submit">Submit</button></center>
  </div>

<%@ include file="Footer.jsp"%>
</body>
</html>