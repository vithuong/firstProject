<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test hide show toggle</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	
	<!-- CDN Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
	<script>
		$(function(){
			/* $("#hide").on("click", function(){
				$("img").hide(1000, function(){
					$("h1").html("hide");
				});
			});
			
			$("#show").on("click", function(){
				$("img").show(1000, function(){
					$("h1").html("show");
				});
			});
			
			$("#toggle").on("click", function(){
				$("img").toggle(1000, function(){
					$("h1").html("toggle");
				});
			}); */
			/* $("#hide").on("click", function(){
				$("img").hide();
			});
			
			$("#show").on("click", function(){
				$("img").show();
			});
			
			$("#toggle").on("click", function(){
				$("img").toggle();
			}); */
			$("#hide").on("click", function(){
				$("img").fadeOut(1000,function(){
					$("h1").html("hide");
				});
			});
			$("#show").on("click", function(){
				$("img").fadeIn(1000,function(){
					$("h1").html("Show");
				});
			});
			$("#toggle").on("click", function(){
				$("img").fadeToggle(1000,function(){
					$("h1").html("Toggle");
				});
			});
		});
	</script>
	
	
</head>
<body class="container">
	<h1 class="alert alert-success">TEST FADE EFFECT: SHOW, HIDE AND TOGGLE</h1>
	<hr>
	<div class="alert alert-success">
		<button id="hide" class="btn btn-sucess">HIDE</button>
		<button id="show" class="btn btn-info">SHOW</button>
		<button id="toggle" class="btn btn-danger">TOGGLE</button>
	</div>
	<hr>
	<div class="alert alert-success">
		<img width="250" height="250" class="img-circle" id="image" src="image/1044.jpg">
		<img width="250" height="250" class="img-circle" id="image" src="image/1044.jpg">
		<img width="250" height="250" class="img-circle" id="image" src="image/1044.jpg">
		<img width="250" height="250" class="img-circle" id="image" src="image/1044.jpg">
	</div>
	
</body>
</html>
