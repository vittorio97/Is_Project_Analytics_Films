<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aggiungi un film</title>
</head>
<body>
 <%@ include file= "HeaderAmministratore.jsp"%> 
<h1> Aggiungi Film</h1>
<br>
<hr>
<br>
<center>
<form class = "addFilm" action= "../AddFilm" method="post"
	
	
	style= "width: 30%  ; margin-top: 10% ; margin-bottom: 6.5%">
  <div class="form-group">
  <h2>Aggiungi un film</h2>
    <label for="exampleInputEmail1">TitoloFilm</label>
    <input type="text" class="form-control" name="TitoloFilm" placeholder="Inserisci titolo del film" required>
    
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Trama</label>
    <textarea rows="5" cols="10" class="form-control" name= "Trama" placeholder="Inserisci trama" required> </textarea>
    
  </div>
  
  
  <div class="form-group">
    <label for="exampleInputPassword1">Categoria</label>
    <input type="text" class="form-control" name="Categoria" placeholder="Inserisci categoria"required>
  </div>
  
 
  
  <button type="submit"  class="btn btn-warning"> Aggiungi Film</button>

</form>


</center>



</body>
</html>