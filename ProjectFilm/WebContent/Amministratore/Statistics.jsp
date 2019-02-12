

<% int reviewN = (int) request.getSession().getAttribute("reviewNumber"); %>
<% int filmN = (int) request.getSession().getAttribute("filmNumber"); %>
<% int userN = (int) request.getSession().getAttribute("userNumber"); %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/Statistics.css" type="text/css" rel="stylesheet" />
<title>Statistics</title>
</head>
<body>
 <h1>Movie statistics </h1>
 <hr>
 <br>
 <br>
 <br>
 <img src="../img/images.png" >
 <h1> <%= reviewN %> </h1>
 <br>
 <br>
 <form>
 
 </form>
 <img  src="../img/download.png" style= "
 position: absolute;
    left: 700px;
    top: 100px;"
 >
 <h1 style="
    position: absolute;
    left: 700px;
    top: 300px;
 ">  <%= filmN %> </h1> 
 <br>
 <br>
 <form>
 
 </form>


</body>
</html>