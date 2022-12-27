<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Quan ly loai</title>
	<!-- CDN Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body class="container">
	<h2>QUAN LY LOAI</h2>
	<!--  ${vvthuong} -->
	<table class = "table table-bordered table-striped table-hover table-condensed">
		<thead>
			<tr>
				<th>Id</th>
				<th>Fullname</th>
				<th>Activated</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="khachhang" items="${vvthuong}">
				<tr>
					<th>${khachhang.id}</th>
					<th>${khachhang.fullname}</th>
					<th>${khachhang.activated}</th>
				</tr>
			</c:forEach>
		</tbody>
			
	</table>
</body>
</html>