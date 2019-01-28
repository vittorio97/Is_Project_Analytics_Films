<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<link href="css/HomePageStyle.css" type="text/css" rel="stylesheet" />


<title>MyPersonalUser</title>
</head>

<body>
<%@ include file= "HeaderLoggato.jsp"%>
	
	<div class="lista-utenti" 
    style="position: absolute;
    top: 20%; left:7%;">
	<h3> User list</h3>
	
		
	<ul>
	<li> Username 1 <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" style="background-color:#ffd700"> elimina</button></li>
	<br>
	<li> Username 2 <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" style="background-color:#ffd700"> elimina</button></li>
	<br>
	<li> Username 3 <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" style="background-color:#ffd700"> elimina</button></li>
	<br>
    <li> Username 4 <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" style="background-color:#ffd700"> elimina</button></li>
    <br>
	<li> Username 5 <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" style="background-color:#ffd700"> elimina</button></li>
	<br>
	<li> Username 6 <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" style="background-color:#ffd700"> elimina</button>

	<br>
	</ul>
	
	

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">elimina utente</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" style="background-color:red" >
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        Vuoi eliminare questo utente?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Annulla</button>
        <button type="button" class="btn btn-primary" style="background-color:red">Conferma eliminazione</button>
      </div>
    </div>
  </div>
</div>
	
	

</body>
</html>