<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>filter</title>
		<style type="text/css">
			blockquote[title*="mot"] {
				border: 1px solid red;
			}
			blockquote[title*="hai"]>ul>.js{
				color: blue;
			}
		</style>
	</head>
	
	<body>
		<blockquote title="Khoi thu mot">
			<ul>
				<li>HTML</li>
				<li>CSS</li>
				<li>Bootstrap</li>
				<li class="js">jQuery</li>
			</ul>
		</blockquote>
		
		<blockquote title="Khoi thu hai">
			<ul>
				<li>HTML</li>
				<li>CSS</li>
				<li>Bootstrap</li>
				<li class="js">jQuery</li>
			</ul>
		</blockquote>
	</body>
</html>