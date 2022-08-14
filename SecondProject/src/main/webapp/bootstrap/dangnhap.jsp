<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Layout Design - Form Login with Bootstrap</title>
	<!-- CDN Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" href="layout.css">
</head>
<body class="container">
	<header class="row alert alert-success">
		<div class="company-info">
			<h1>This is header h1 </h1>
			<strong>This is website's Slogan</strong>
		</div>
		<!-- <img class="pull-right" style="height: 50px; width: 500px;" src="images/header-object.jpg"> -->
	</header>
	<nav class="row">
		<jsp:include page="menu.jsp"/>
	</nav>
	<div class="row">
		<article class="col-sm-9 alert alert-info">
		<h4 class="alert alert-success"> LOGIN FORM  </h4>
			<form action="" method="get" class="alert alert-success">
				<div class="form-group">
					<div class="input-group">
						<label class="input-group-addon">
							<span class="glyphicon glyphicon-user"></span>
						</label>
						<input class="form-control" placeholder="Username?">
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<label class="input-group-addon">
							<span class="glyphicon glyphicon-lock"></span>
						</label>
						<input class="form-control" placeholder="Password?">
					</div>
				</div>
				<div class="form-group">
					<button class="btn btn-success">Login</button>
				</div>
			</form>
		</article>
		<aside class="col-sm-3 alert alert-success">
			<!-- Shopping Cart -->
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
			<!-- Category -->
			<div class="panel panel-default">
				<div class="panel-heading">CATEGORY</div>
				<div class="list-group">
				  <a href="#" class="list-group-item">First item</a>
				  <a href="#" class="list-group-item">Second item</a>
				  <a href="#" class="list-group-item">Third item</a>
				</div>
			</div>
		</aside>
	</div>
	<footer class="row alert alert-success">FOOTER</footer>
</body>
</html>