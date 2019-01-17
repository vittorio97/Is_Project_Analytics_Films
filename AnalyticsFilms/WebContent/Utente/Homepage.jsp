<!doctype html>
<html>
<head>
<meta charset="utf-8">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

	<link href="css/HomePageStyle.css" type="text/css" rel="stylesheet" />
	
</head>
	
<body>

   
	<%@ include file= "Header.jsp"%> 
	
	
	<div class= "contHome">
		
	
  </div>
	<div class = "colore">
	<div style="height:30px"></div>
	
	
</div>
<div class = "colore">
	<div class = "colore">
  <div style="height:30px"></div>
  
  
    <h2 class="noDisplay">Film in evidenza</h2> 
    
    
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
 	
 	</div>
	<div class="card-deck">
  <div class="card">
    <img src="../locandine/Gifted.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">Gifted</h5>
      <p class="card-text">Uno zio single intraprende una battaglia legale per ottenere la custodia della nipote, giovane prodigio della matematica, e garantirle una vita normale nonostante l'opposizione della madre.</p>
      <p class="card-text"><small class="text-muted">Last updated 20 mins ago</small></p>
    </div>
  </div>
  <div class="card">
    <img src="../locandine/TheImitationGame.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">The Imitation Game</h5>
      <p class="card-text">La vita del matematico inglese Alan Turing, genio indiscusso del XX secolo, considerato uno dei padri dell'informatica e dei moderni computer, fino alla sua precoce e tragica scomparsa.</p>
      <p class="card-text"><small class="text-muted">Last updated 2 hours ago</small></p>
    </div>
  </div>
  <div class="card">
    <img src="../locandine/ShutterIsland.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">Shutter Island</h5>
      <p class="card-text">Rachel Salado, paziente del manicomio criminale sull'isola di Shutter, scompare all'improvviso. L'agente federale Teddy Daniels, affiancato dall'ufficiale Chuck Aule, deve indagare per risolvere il mistero.</p>
      <p class="card-text"><small class="text-muted">Last updated 2 days ago</small></p>
    </div>
  </div>
</div>
</div>
<div class = "colore">
<div style="height:30px"></div>

	<%@ include file="Footer.jsp"%>
	</div>
</body>
</html>
