<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ATTR CSS HTML</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<!-- you can remove "(document).ready" and create short script-->
	<script>
		$(function(){
			// Work with attribute
			$("#attr").on("click", function(){
				var x = $("h1").attr("title"); //Read
				alert(x); //show alert
				$("h1").attr("title", "this attribute changed !") //Write
			});
			
			// Work with CSS
			$("#css").on("click", function(){
				var x = $("h1").css("border-bottom"); //Read
				alert(x); //show alert
				//$("h1").css("border-bottom", "5px double blue") //Write
				$("h1").css({
					"border-bottom":"5px double blue",
					backgroundColor:"red",
					color: "white"
				}) //Write
			});
			
			// Work with html inner
			$("#html").on("click", function(){
				var x = $("h1").html(); //Read
				alert(x); //show alert
				$("h1").html("this <strike>inner html</strike> changed !") //Write
			});
		});
	</script>
</head>
<body>
	<h1 title="hello jQuery World - title" style="border-bottom: 1px solid red; background-color: ">
		Hello <mark>Jquery</mark> World !
	</h1>
	<button id="attr">attribute</button>
	<button id="css">CSS</button>
	<button id="html">html</button>
</body>
</html>