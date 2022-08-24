<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Effect Fade Out, Fade in, Fade Toggle</title>
	
	<!-- CDN Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script>
		$(function(){
			$("#hide").on("click", function(){
				//$("img").hide()
				$("img").fadeOut(5000, function(){
					$("h1").html("HIDDEN SLOWLY");
				});
			});
			$("#show").on("click", function(){
				//$("img").show()
				$("img").fadeIn(5000, function(){
					$("h1").html("SHOW SLOWLY");
				});
			});
			$("#toggle").on("click", function(){
				//$("img").toggle(1000);
				$("img").fadeToggle(5000);
			})
		});
	</script>
</head>
<body class="container">
	<div class="alert alert-info">
		<h1 class="alert alert-success">Effect Fade Out, Fade in, Fade Toggle</h1>
		<button class="btn btn-success" id="hide">Hide</button>
		<button class="btn btn-info" id="show">Show</button>
		<button class="btn btn-danger" id="toggle">Toggle</button>
		<hr>
		<img width="400" height="400" class="img-circle" src="image/1044.jpg">
	</div>
	
</body>
</html>