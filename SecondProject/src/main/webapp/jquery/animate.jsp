<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQuery copy only template</title>
<!-- CDN Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	$(function() {
		$(".img").hover(function() {
			/* $("img").css({"width":"650px", "height":"650px", "opacity":"1"}); */
			/* $("img").animate({"width":"350px", "height":"350px", "opacity":"1"}); */
			$(this).stop().animate({
				"width" : "550px",
				"height" : "550px",
				"opacity" : "1",
				"border-radius" : "50%"
			});
		}, function() {

			$(this).stop().animate({
				"width" : "100px",
				"height" : "100px",
				"opacity" : "0.3",
				"border-radius" : "25%"
			});

		});
	});
</script>

<script>
	$(function() {
		var imgs = [ "1015.jpg", "1023.jpg", "1026.jpg", "1028.jpg",
				"1043.jpg", "1044.jpg" ];
		var i = 0;

		$("#vvthuong").hover(function() {
			setInterval(function() {
				i += 1;
				console.log(imgs.length);
				if (i >= imgs.length) {
					i = 0;
				}
				$("#vvthuong").fadeOut(500, function() {
					$("#vvthuong").attr("src", "image/" + imgs[i]);
					$("#vvthuong").fadeIn(500);
				});

			}, 50);
		});

	});
</script>


<style>
.img {
	width: 100px;
	height: 100px;
	border-radius: 25%;
	border: 5px groove black;
	opacity: 30%;
}

#vvthuong {
	position: fixed;
	bottom: 0px;
	right: 0px;
}
.menu {
	position: fixed;
	bottom: 140px;
	right: 140px;
}
</style>
</head>
<body class="container">
	<h1 class="alert alert-info">ANIMATION</h1>
	<img class="img" src="image/1015.jpg">
	<!-- <img class="alert alert-info" src="image/1015.jpg">
	<img class="alert alert-info" src="image/1015.jpg"> -->
	<img class="img" src="image/1015.jpg">
	<img class="img" src="image/1015.jpg">
	<img class="img" src="image/1015.jpg">
	<hr>
	<h1 class="alert alert-info menu">MENU</h1>
	<hr>
	<img id="vvthuong" src="image/menu.png"
		style="width: 300px; height: 300px">
</body>
</html>