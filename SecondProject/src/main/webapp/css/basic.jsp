<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>basic</title>
		<style type="text/css">
			li {
				color: rose;
				font-variant: inherit;
	
			}
			.sel1{
				font-weight: bold;
				color: pink;
			}
			#js{
				border-bottom: 5px double blue;
			}
		</style>
	</head>
	
	<body>
		<h2>Cascading style sheet</h2>
		<ul>
			<li>HTML</li>
			<li>CSS</li>
			<li>Bootstrap</li>
			<li class="sel1">jQuery</li>
			<li>Web Language
				<ul>
					<li>HTML</li>
					<li>CSS</li>
					<li class="sel1">Bootstrap</li>
					<li id="js">jQuery</li>
				</ul>
			</li>
		</ul>
	</body>
</html>