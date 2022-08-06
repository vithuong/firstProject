<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Layout Design</title>
	<!-- CDN Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" href="layout.css">
</head>
<body class="container">
	<header class="row">
		<div class="company-info">
			<h1>Hello everybody </h1>
			<strong>Come On Everybody Just Clap Your Hands</strong>
		</div>
		<img class="pull-right" style="height: 150px; width: 1170px;" src="images/header-object.jpg">
	</header>
	<nav class="row">
		<jsp:include page="menu.jsp"/>
	</nav>
	<div class="row">
		<!-- Shopping Cart -->
		<article class="col-sm-9">MAIN</article>
		<aside class="col-sm-3">
			<div class="panel panel-default">
	  			<div class="panel-body">
	  				<img class="col-xs-5" src="images/shopping-cart.png">
	  				<ul class="col-xs-7">
	  					<li>100 items</li>
	  					<li>100 VND</li>
	  					<li>View Shopping Cart</li>
	  				</ul>
	  			</div>
			</div>
			<!-- Search -->
			<div class="panel panel-default">
	  			<div class="panel-body">
	  				<input class="form-control" placeholder="Keywords">
	  			</div>
			</div>
		</aside>
	</div>
	<footer class="row">FOOTER</footer>
</body>
</html>