<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON</title>
<!-- AJAX (cho Javascript không đồng bộ và Xml) là một
	khái niệm kiến ​​trúc trong khi JSON (Ký hiệu đối tượng Javascript) là
	định dạng dữ liệu. var sinhvien = {}, NOT var sinhvien{}, it is wrong.
	cai chieu hien no ra la dung AJAX = Asynchronous Javascript and XML
	 -->
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
		$(function(){
			/* var sinhvien = { */
			sinhvien = {
				fullname: "Vi Văn Thường",
				email: "dev.java.thuong@gmail.com",
				mark: 1234567890,
				save(){
					sinhvien.fullname = $("#fullname").val();
					sinhvien.email = $("#email").val();
					sinhvien.mark = $("#mark").val();
					console.log(this);//this is sinhvien object
				},
				show(){
					$("#fullname").val(sinhvien.fullname);
					$("#email").val(sinhvien.email);
					$("#mark").val(sinhvien.mark);
				}
			}
			console.log("JSON is object - where data in container: "+sinhvien);
			console.log(sinhvien);
			});
	</script>
</head>
<body class="container">
	<h1 class="alert alert-success">JSON - JAVASCRIPT OBJECT NOTATION</h1>
	<form class="form-group alert alert-info">
		Fullname <input class="form-control" id="fullname"> Email <input
			class="form-control" id="email"> Mark <input
			class="form-control" id="mark"> <br>
		<button onclick="sinhvien.save()" class="btn btn-success" type="button">save</button>
		<button onclick="sinhvien.show()" class="btn btn-danger" type="button">Show</button>
	</form>
	<hr>
	<p class="alert alert-success">Thông thường khi làm các ứng dụng
		website thì bạn sẽ lưu dữ liệu vào một hệ quản trị cơ sở dữ liệu nào
		đó như là MYSQL, SQL SERVER, tuy nhiên nếu sử dụng những ứng dụng này
		thì bắt buộc hệ thống phải cài đặt nó. Bây giờ giả sử bạn đang muốn
		xây dựng một ứng dụng nhỏ, gọn và đơn giản thì sao? Nếu sử dụng các hệ
		quản trị CSLD trên thì không hay lắm vì phải cài đặt nhiều thứ nên gây
		phiền hà cho người dùng. Nếu như lúc trước thì người ta sẽ chọn sql
		lite hay XML để lưu trữ, nhưng hiện nay thì có một chuẩn CSDL khác nữa
		đó là JSON. áp dụng JSON kết hợp với các ngôn ngữ như Javascript và
		PHP.<p class="alert alert-success"></p></p>
</body>
</html>