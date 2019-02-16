<% Utente utente = (Utente) request.getSession().getAttribute("utente"); %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, bean.*"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8 ">
 

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
	<link rel="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js">
	<link href="css/HomePageStyle.css" type="text/css" rel="stylesheet" />
	<title>AnalyticsFilms</title>
</head>
	
<body>
   
	
<%@ include file= "HeaderLoggato.jsp"%> 
	
	<section id="cover">
			
			
    		<a href="MyPersonalUser.jsp" class="btn btn-secondary">Personal Page</a>
		
		 <h1 class="titolo-cover">The social network for film lovers.</h1>
	 </section>

	
	 <!-- card grid -->
	 <div class="py-5">
    <div class="container">
      <div class="row hidden-md-up">
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/glass.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Glass</h4>
              <h6 class="card-subtitle text-muted">L'UOMO DI VETRO</h6>
              <p class="card-text p-y-1">L'orda, ossia Kevin Wendell Crumb e le sue altre numerose personalità,
               ha catturato un nuovo gruppo di ragazze e si prepara a "sacrificarle" alla Bestia. È però sulle sue tracce 
               il vigilante David Dunn, che grazie all'aiuto del figlio e alle sue visioni psichiche arriva presto a un confronto
                con il feroce avversario. Entrambi però finiscono catturati rinchiusi in un istituto psichiatrico, lo stesso dove da 19 anni è prigioniero "l'uomo di vetro", il geniale Elijah Price.
                 </p>
              
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/suspiria.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Suspiria</h4>
              <h6 class="card-subtitle text-muted">DONA LA TUA ANIMA ALLA DANZA</h6>
              <p class="card-text p-y-1">Un'oscurità turbina al centro di una compagnia di danza di fama mondiale, che inghiottirà il direttore artistico della troupe,
								un'ambiziosa giovane ballerina e una dolorosa psicoterapeuta. Alcuni soccomberanno all'incubo, altri finalmente si sveglieranno.</p>
              
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/bohemianrhapsody.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Bohemian Rapsody</h4>
              <h6 class="card-subtitle text-muted">THE QUEEN</h6>
              <p class="card-text p-y-1">Dopo anni di annunci e successive proroghe, protagonisti mancati e sceneggiature bocciate, prende corpo finalmente il biopic su Freddie Mercury e i Queen. Il film di Bryan Singer concentra la propria attenzione su un arco temporale lungo quindici anni, partendo dagli inizi della band nei primi anni Settanta fino alla memorabile esibizione del 13 Luglio 1985 a Wembley per il Live Aid..</p>
              
            </div>
          </div>
        </div>
      </div><br>
      <div class="row">
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/roma.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Roma</h4>
              <h6 class="card-subtitle text-muted">MESSICO, 1970</h6>
              <p class="card-text p-y-1">Roma, il film diretto da Alfonso Cuaron, racconta un anno turbolento della vita di una famiglia borghese nella Città del Messico degli anni 70,Roma è un ritratto di vita vera, intimo e toccante, raccontato attraverso le vicende di una famiglia che cerca di preservare il proprio equilibrio in un momento di lotta personale, sociale e politica.</p>
             
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/star.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">A Star is Born</h4>
              <h6 class="card-subtitle text-muted">LADY GAGA</h6>
              <p class="card-text p-y-1">In questa nuova rivisitazione della tormentata storia d'amore, Cooper interpreta Jackson Maine, musicista di successo che si sta però avviando sul viale del tramonto che scopre, e si innamora della squattrinata artista Ally. Lei ha da poco chiuso in un cassetto il suo sogno di diventare una grande cantante, fino a quando Jack la convince a tornare sul palcoscenico. Ma mentre la carriera di Ally inizia a spiccare il volo, il lato privato della loro relazione sta perdendo colpi a causa della battaglia che Jack conduce contro i suoi demoni interiori.</p>
              
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
						<img class="card-img-top" src="../locandine/aquaman.jpg" alt="Card image cap">
            <div class="card-block">
              <h4 class="card-title">Aquaman</h4>
              <h6 class="card-subtitle text-muted">PROTETTORE DEL PROFONDO</h6>
              <p class="card-text p-y-1">Arthur Curry viene a sapere che è l'erede del regno sottomarino di Atlantide
								e deve farsi avanti per guidare il suo popolo ed essere un eroe per il mondo.</p>
              
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
