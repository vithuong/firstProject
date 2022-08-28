<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test attr css prompt</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function(){
			if (confirm("Are you want continue this site ?")) {
				var x = prompt("What your name ? ", "Vi Van Thuong");
				alert("This is your name: " + x);
			} else {
				alert("Thanks You for visit here");
			}
			if (x != null) {
				console.log("This is 3rd Statement x = : " + x);
			} else {
				x = 1;
				console.log("This is 3rd Statement x = : " + x);
			}
			
			
			$("#attribute").on("click", function(){
				var x = $("h1").attr("title");/* read */
				alert(x); /* show */
				$("h1").attr("title","222222 attribute");/* Write */
			});
			
			$("#cssType").on("click", function(){
				var x = $("h1").css("border-bottom");/* read */
				alert(x); /* show */
				$("h1").css("border-bottom","20px double blue");/* Write */
			});
			
			
			
		});
	</script>
</head>
<body>
	<h1 title="11111111111111" style="border-bottom: 10px solid red">Test jQuery</h1>
	<div>
		<img alt="" src="">
	</div>
	<button id="attribute">attribute</button>
	<button id="cssType">CSS Type</button>
	<button id="html">html</button>
</body>
</html>
<script>
	$(function(){
		$("#html").on("click", function(){
			var x = $("h1").html();/* read */
			alert(x); /* show */
			$("h1").html("<b>Welcome to my web application html!<b>");/* Write */
			$("img").attr("src","/SecondProject/files/1657787594.jpg");
		});
	});
</script>