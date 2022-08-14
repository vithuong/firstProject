<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Layout Design - Register form with bootstrap</title>
	<!-- CDN Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" href="layout.css">
</head>
<body class="container">
	<!-- HEADER -->
	<header class="row alert alert-success">
		<div class="company-info">
			<h1>This is header h1 </h1>
			<strong>This is website's Slogan</strong>
		</div>
	</header>
	<!-- MENU NAVIGATION BAR-->
	<nav class="row">
		<jsp:include page="menu.jsp"/>
	</nav>
	<!-- BODY -->
	<div class="row alert alert-danger">
		<!-- MAIN CONTENT ARTICLE -->
		<article class="col-sm-9 alert alert-info">
			<h4 class="alert alert-success">Register Form</h4>
			<form action="" method="get" class="alert alert-success">
				<div class="row">
					<div class="form-group col-sm-6">
						<label>Username</label>
						<input class="form-control" placeholder="Username?">
					</div>
					<div class="form-group col-sm-6">
						<label>Password</label>
						<input class="form-control" placeholder="Password?">
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-6">
						<label>Gender</label>
						<div class="form-control">
							<input name="gender" type="radio" id="male">
							<label for="male">Male</label>
							<input name="gender" type="radio" id="female">
							<label for="female">Female</label>
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label>Nationality</label>
						<select class="form-control">
							<option>Vietnam</option>
							<option>United States</option>
						</select>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-12">
						<input type="checkbox" id="rm">
						<label class="checkbox-inline" for="rm">Remember me?</label>
					</div>
					<div class="form-group col-sm-12">
						<label>Notes</label>
						<textarea class="form-control" rows="3" placeholder="Notes?"></textarea>
					</div>
					<div class="form-group col-sm-12">
						<button class="btn btn-success">Sign Up</button>
					</div>
				</div>				
			</form>
		</article>
		<!-- ASIDE SIDEBAR -->
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
	<!-- FOOTER -->
	<footer class="row alert alert-success">FOOTER</footer>
</body>
</html>