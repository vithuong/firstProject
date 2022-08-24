<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Effect Fade Out, Fade in, Fade Toggle</title>

<!-- CDN Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function() {
		var imgs = [ "1015.jpg", "1023.jpg", "1026.jpg", "1028.jpg", "1043.jpg", "1044.jpg" ];
		var i = 0;
		$("button").on("click", function(){
			
			setInterval(function(){
				i+=1;
				console.log(imgs.length);
				if (i >= imgs.length) {
					i=0;	
				}
				$("img").fadeOut(500,function(){
					$("img").attr("src","image/" + imgs[i]);
					$("img").fadeIn(500);
				});
				
			}, 1000);
			
		});
	});
</script>
</head>
<body class="container">
	<h1 class="alert alert-info">SLIDE SHOW</h1>
	<hr>
	<button class="btn btn-danger">START SLIDE SHOW</button>
	<hr>
	<img class="img-circle" src="image/1044.jpg"
		style="width: 300px; height: 300px; border: 2px double blue;">

</body>
</html>