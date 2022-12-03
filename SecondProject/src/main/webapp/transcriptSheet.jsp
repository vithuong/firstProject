<%@ page pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bang-diem</title>
		<style type="text/css">
			tbody>tr:nth-child(2n+1) {
				background-color: aqua;
			}
			tbody>tr:nth-child(2n) {
				background-color: pink;
			}
			tbody>tr:first-child, tbody>tr:last-child  {
				background-color: red;
			}
			table{
				border-collapse: collapse;
			}
			input[type="password"]{
				color: red;
				background-color: yellow;
			}
			input[placeholder="username?"]{
				color: blue;
				background-color: pink;
			}
		</style>
	</head>
	
	<body>
		<strong>Beo</strong>
		<em>Nghieng</em>
		<ins>gach chan</ins>
		<mark>danh dau</mark>
		<strike>gach bo</strike>
		<!-- <strike>gach bo</strike> -->
		<table border=1 style="width: 100%">
			<caption>DANH SACH SINH VIEN</caption>
			<thead style="background-color: yellow">
				<tr>
					<th rowspan="2">STT</th>
					<th rowspan="2">HO TEN</th>
					<th colspan="3">DIEM</th>
					
				</tr>
				<tr>
					<th>TOAN</th>
					<th>LY</th>
					<th>TRUNG BINH</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5">Tong so sinh vien la 2</td>
				</tr>
			</tfoot>
		</table>
		<fieldset>
			<legend>DANG NHAP</legend>
			<input placeholder="username?">
			<br>
			<input type="password" placeholder="password?">
			<hr>
			<button>Login</button>
		</fieldset>
		<blockquote>
			DOAN 1
			<blockquote>
				DOAN 2
			</blockquote>
		</blockquote>
	</body>
</html>