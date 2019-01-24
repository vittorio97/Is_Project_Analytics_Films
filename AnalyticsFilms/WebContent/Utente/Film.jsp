<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='https://fonts.googleapis.com/css?family=PT+Sans:400,700&subset=latin,cyrillic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/Film.css">
    <link rel="stylesheet" href="../css/HomePageStyle.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
<title>AnalyticsFilms</title>
</head>
<body>
  <!-- locandina film -->
    <div class="container">
      <div class="row">
        <div class="col-md-4">
  				<div class="card" style="width:18rem;">
  					<img src="../locandine/aquaman locandina.jpg" alt="Card One" class=card-img-top"">
  				</div>
  			</div>
        <div class="col-md-4">

              <h5 class="Trama-title">FILM NAME </h5>
              <h6>trama</h6>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

            </div>
      </div>
    </div>
    <!-- locandina film -->

    <!-- sezione commenti -->
  <div class="comments">
  <div class="comment-wrap">
      <div class="photo">
          <div class="avatar" style="background-image: url('')"></div>
      </div>
      <div class="comment-block">
          <form action="">
              <textarea name="" id="" cols="30" rows="3" placeholder="Add review..."></textarea>
          </form>
      <a href="#" class="btn btn-warning">Add </a>
      </div>
  </div>

  <div class="comment-wrap">
      <div class="photo">
          <div class="avatar" style="background-image: url('../img/user.png')"></div>
      </div>
      <div class="comment-block">
          <p class="comment-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iusto temporibus iste nostrum dolorem natus recusandae incidunt voluptatum. Eligendi voluptatum ducimus architecto tempore, quaerat explicabo veniam fuga corporis totam reprehenderit quasi
              sapiente modi tempora at perspiciatis mollitia, dolores voluptate. Cumque, corrupti?</p>
          <div class="bottom-comment">
            <div class="comment-date">Aug 23, 2014 @ 10:32 AM</div>

        </div>
      </div>
  </div>

  <div class="comment-wrap">
      <div class="photo">
          <div class="avatar" style="background-image: url('../img/user.png')"></div>
      </div>
      <div class="comment-block">
          <p class="comment-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iusto temporibus iste nostrum dolorem natus recusandae incidunt voluptatum. Eligendi voluptatum ducimus architecto tempore, quaerat explicabo veniam fuga corporis totam.</p>
          <div class="bottom-comment">
              <div class="comment-date">Aug 23, 2014 @ 10:32 AM</div>

          </div>
      </div>
  </div>
</div>
<%@ include file="Footer.jsp"%>
</body>
</html>