<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

	<link href="css/HomePageStyle.css" type="text/css" rel="stylesheet" />
<title>Registration</title>
</head>

<body>
<%@ include file= "HeaderSito.jsp"%>

<center>
<form class = "formReg" style= "width: 30%  ; margin-top: 6.5% ; margin-bottom: 6.5%">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter username">
    
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Repeat Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="RepeatPassword">
  </div>
  
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Accept the condition</label>
  </div>
  
  
  <button type="submit"  class="btn btn-primary">Submit</button>

</form>

</center>


<%@ include file="Footer.jsp"%>
</body>
</html>