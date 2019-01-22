

<!doctype html>
<html>
<head>
<meta charset="utf-8">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
	<link rel="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js">
	<link href="css/HomePageStyle.css" type="text/css" rel="stylesheet" />
	<title>AnalyticsFilms</title>
</head>
	
<body>
   
	
<%@ include file= "HeaderSito.jsp"%> 
	
	<section id="cover">
		
    		<a href="Registration.jsp" class="btn btn-secondary">Registrati</a>
		
		 <h1 class="titolo-cover">The social network for film lovers.</h1>
	 </section>

	 <!-- card grid -->
	 <div class="py-5">
    <div class="container">
      <div class="row hidden-md-up">
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/glass locandina.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Glass</h4>
              <h6 class="card-subtitle text-muted">Support card subtitle</h6>
              <p class="card-text p-y-1">Some quick example text to build on the card title .</p>
              <a href="#" class="card-link">link</a>
              <a href="#" class="card-link">Second link</a>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/suspiria locandina.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Suspiria</h4>
              <h6 class="card-subtitle text-muted">DONA LA TUA ANIMA ALLA DANZA</h6>
              <p class="card-text p-y-1">Un'oscurità turbina al centro di una compagnia di danza di fama mondiale, che inghiottirà il direttore artistico della troupe,
								un'ambiziosa giovane ballerina e una dolorosa psicoterapeuta. Alcuni soccomberanno all'incubo, altri finalmente si sveglieranno.</p>
              <a href="#" class="card-link">link</a>
              <a href="#" class="card-link">Second link</a>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/bohemianrhapsody locandina.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Bohemian Rapsody</h4>
              <h6 class="card-subtitle text-muted">Support card subtitle</h6>
              <p class="card-text p-y-1">Some quick example text to build on the card title .</p>
              <a href="#" class="card-link">link</a>
              <a href="#" class="card-link">Second link</a>
            </div>
          </div>
        </div>
      </div><br>
      <div class="row">
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/roma locandina.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Roma</h4>
              <h6 class="card-subtitle text-muted">Support card subtitle</h6>
              <p class="card-text p-y-1">Some quick example text to build on the card title .</p>
              <a href="#" class="card-link">link</a>
              <a href="#" class="card-link">Second link</a>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/a-star-is-born locandina.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">A Star is Born</h4>
              <h6 class="card-subtitle text-muted"></h6>
              <p class="card-text p-y-1">Il musicista esperto Jackson Maine scopre e si innamora di Ally,
								l'artista in difficoltà. Ha appena rinunciato al suo sogno di diventare grande come cantante, fino a quando Jack non la persuaderà sotto i riflettori.
								Ma anche quando la carriera di Ally decolla,il lato personale della loro relazione sta crollando,
								mentre Jack combatte una battaglia in corso con i suoi demoni interni.</p>
              <a href="#" class="card-link">link</a>
              <a href="#" class="card-link">Second link</a>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/aquaman locandina.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Aquaman</h4>
              <h6 class="card-subtitle text-muted">PROTETTORE DEL PROFONDO</h6>
              <p class="card-text p-y-1">Arthur Curry viene a sapere che è l'erede del regno sottomarino di Atlantide
								e deve farsi avanti per guidare il suo popolo ed essere un eroe per il mondo.</p>
              <a href="#" class="card-link">link</a>
              <a href="#" class="card-link">Second link</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

	<!-- card grid -->
	<%@ include file="Footer.jsp"%>
</body>
</html>