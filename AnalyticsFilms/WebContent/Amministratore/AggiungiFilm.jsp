<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >
<link href="../css/HomePageStyle.css" type="text/css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
<h1> Aggiungi Film</h1>

<form class="needs-validation" novalidate>
 <!-- Nome film -->
  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltip01">Name</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="Name" value="" required>
      <div class="valid-tooltip">
      </div>
    </div>
  </div>
 <!-- Trama Film -->
  <div class="form-row">
    <div class="col-md-6 mb-3">
     <div class="form-group">
    <label for="">Trama </label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
  	</div>
    </div>
  
   </div>
 <div class="form-row">
   	<div class="col-md-4 mb-3">
      <label for="validationTooltip01">Add a Poster</label>
      <button type="button" class="btn btn-secondary btn-block" >Add Image</button>
    </div>
  </div>
 <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltip01">Genere</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="Genere" value="" required>
      <div class="valid-tooltip">
      </div>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltip01">Date</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="Date" value="" required>
      <div class="valid-tooltip">
      </div>
    </div>
  </div>

  <button class="btn btn-warning" type="submit">Add Movie</button>
</form>
</body>
</html>