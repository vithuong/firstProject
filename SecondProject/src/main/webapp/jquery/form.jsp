<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>VAL PROP CSS LOGIN FORM</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$(function(){
			$("button").on("click", function(){
				/* var x = $("#hoten").attr("value"); */
				var x = $("#hoten").val();
				console.log("your name is: " + x);
				/* $("#hoten").attr("value","THUONGVANVI"); */
				$("#hoten").val("THUONGVANVI");
			});
			
			$("#rememberMe").on("change", function(){
				var x = $("#rememberMe").prop("checked");
				if (x == true) {
					$("#hoten").css("background-color", "yellow");
					$("#comment").css("display","");
				} else {
					$("#hoten").css("background-color", "white");
					$("#comment").css("display","none");
				}
			});
		});
	</script>
</head>
<body>
	<h1>Login Form</h1>
	<input id ="hoten" value="vivanthuong" placeholder="ho va ten ghi o day">
	<span id="comment">Cookies will remember this account</span>
	<hr>
	<input type="checkbox" checked id="rememberMe"> Remember Me ?
	<hr>
	<button>ok</button>
</body>
</html>