<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form</title>
		<style type="text/css">
				button {
				border-radius: 20px;
				padding: 10px 30px;
				border: none;
				box-shadow: inset 0px 0px 20px red;
			}
			button:hover {
				box-shadow: inset 0px 0px 20px blue;
				color: red;
				font-variant: small-caps;
	        }
			
		</style>
	</head>
	
	<body>
		<h2 style=" ;font-family:monospace; color: blue;">ĐĂNG KÝ THÀNH VIÊN</h2>
		<hr color="red">
		<form action="/web/html/register.php" method="post">
			Họ và tên: <br>
			<input value="VI VĂN THƯỜNG" name="fullname" placeholder="Họ và tên ?"><p>
			
			Mật khẩu: <br>
			<input value="password" name="password" type="password" placeholder="Mật khẩu ?"><p>	
			
			Giới tính: <br>
			<input checked="checked" name="gender" type="radio" value="true" id="nam">
			<label for="nam">Nam</label>
			<input name="gender" type="radio" value="false" id="nu">
			<label for="nu">Nam</label><p>
			
			Quốc tịch: <br>
			<select name="country">
				<option value="VN">Việt Nam </option>
				<option value="US">Hoa Kỳ</option>
				<option value="SG" selected="selected">Singapore</option>
			</select> <p>
			
			Sở thích: <br>
			<input name="hobby" type="checkbox" value="0" id="tr">
			<label for="tr">Du lịch</label>
			<input checked="checked" name="hobby" type="checkbox" value="1" id="ms">
			<label for="ms">Âm nhạc</label>
			<input name="hobby" type="checkbox" value="2" id="rd">
			<label for="rd">Đọc sách</label><p>
			
			Mạng di động sử dụng: <br>
			<input checked="checked" name="mservice" type="radio" value="3" id="vt">
			<label for="vt">VIETTEL</label>
			<input name="mservice" type="radio" value="4" id="mb">
			<label for="mb">MOBIFONE</label>
			<input name="mservice" type="radio" value="5" id="vn">
			<label for="vn">VINAPHONE</label><p>
			
			Ghi chú: <br>
			<textarea name="notes" spellcheck="false" placeholder="Ghi chú ?" rows="3" cols="40"></textarea><p>
			
			<hr color="red">
			<button>Đăng ký</button>
			<button type="reset">Nhập lại</button>
		</form>
	</body>
</html>