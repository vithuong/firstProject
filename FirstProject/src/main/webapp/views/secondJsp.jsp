<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>secondJsp</title>
</head>
<body>
	<h1>Bonus Calculator</h1>
	<form action="/FirstProject/bonus/form" method="post">
		<input name="hoten" placeholder="hovaten?">
		<br>
		<input name="tuoi" placeholder="tuoi?">
		<hr>
		<button>nhan vao day</button>
	</form>
	${message}
</body>
</html>