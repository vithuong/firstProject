<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Image Effect</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	
	<!-- CDN Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
	<script>
		$(function(){
			$("button:eq(0)").on("click",function(){
				/* var x = $("img").attr("width");
				$("img").attr("width", 1*x + 500); // avoid x is string we use 1 multiplied with x equal integer nr */
				var x = $("img").width();
				$("img").width(x+10);
				
				var y = $("img").height();
				$("img").height(y+10);
			});
			
			$("button:eq(1)").on("click",function(){
				var x = $("img").width();
				$("img").width(x-10);
				
				var y = $("img").height();
				$("img").height(y-10);
			});
		});
	</script>
</head>
<body class="container">
	<h1 class="alert alert-info">Image Effect</h1>
	<button class="btn btn-success">+</button>
	<button class="btn btn-danger">-</button>
	<br>
	<img class="alert alert-info" src="image/shopping-cart.png" width="300" height="300">
</body>
</html>