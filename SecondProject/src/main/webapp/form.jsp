<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form</title>
	</head>
	
	<body>
		<h1>Form</h1>
		<form action="" method="post">
			<input type="text" name="hoten" placeholder="ho va ten ghi o day">
			<hr>
			<select name="chucdanh">
				<option value="TGD">Tong giam doc</option>
				<option value="GD">Giam doc</option>
				<option value="TP">Truong phong</option>
			</select>
			<br>
			<input type="radio" name="gioitinh" value="true" id="nam"><label for="nam">Nam</label>
			<input type="radio" name="gioitinh" value="false" id="nu"><label for="nu">Nu</label>
			<!-- co 2 cach gan the label: cach 1 nhu ben tren, cach 2 la lay the label boc luon, khoi can ghi id.
			 <label><input type="radio" name="gioitinh" value="false">Nu</label> -->
			<br>
			<textarea name="ghichu" rows="3" cols="40"></textarea>
			<br>
			<button type="submit">submit</button>
			<button type="reset">Reset</button>
			<button type="button">button</button>
		</form>
	</body>
</html>