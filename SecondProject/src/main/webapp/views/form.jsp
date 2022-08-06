<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Insert title here</title>
	<style>
	button{
		border-radius: 20px;
		padding: 10px 30px;
		border: none;
		box-shadow: inset 0px 0px 20px rose;
	}
	button:hover{
		box-shadow: inset 0px 0px 30px black;
		color:red;
		font-variant: small-caps;
	}
	</style>
</head>
<body>
	<h2>ĐĂNG KÝ THÀNH VIÊN</h2>
	<form action="/web/html/register.php" method="post">
		Họ và tên:<br>
		<input value="Vi Van Thuong" name="fullname" placeholder="Họ và tên?"><p>
		
		Mật khẩu:<br>
		<input name="password" type="password" placeholder="Mật khẩu?"><p>
		
		Giới tính:<br>
		<input checked name="gender" type="radio" value="true" id="nam">
		<label for="nam">Nam</label>
		<input name="gender" type="radio" value="false" id="nu">
		<label for="nu">Nữ</label><p>
		
		Quốc tịch:<br>
		<select name="country">
			<option value="VN">Việt Nam</option>
			<option selected value="US">United States</option>
			<option value="SG">Singapore</option>
		</select><p>
		
		Sở thích:<br>
		<input checked name="hobby" type="checkbox" value="Travelling" id="tr">
		<label for="tr">Travelling</label>
		<input name="hobby" type="checkbox" value="Music" id="ms">
		<label for="ms">Music</label>
		<input name="hobby" type="checkbox" value="Reading" id="rd">
		<label for="rd">Reading</label><p>
		
		Ghi chú:<br>
		<textarea name="notes" placeholder="Ghi chú?" rows="3" cols="40"></textarea>
		<hr>
		<button>Đăng ký</button>
		<button type="reset">Nhập lại</button>
	</form>
</body>
</html>