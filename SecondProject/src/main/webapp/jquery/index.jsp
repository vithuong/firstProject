<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery copy only template</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
			if(confirm("Are You Want type Your Name ?")){
				var fullname = prompt("what your name ?", "Vi Van Thuong");
				alert("Welcome " + fullname);
				console.log("Equal: " + fullname);
			}
		});
	</script>
</head>
<body>
	<h1>Hello Jquery World !</h1>
</body>
</html>