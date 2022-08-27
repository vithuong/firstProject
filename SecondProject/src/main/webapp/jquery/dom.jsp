<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery copy only template</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	
	<script type="text/javascript">
		$(function(){
			$("#button1").on("click", function(){
				console.log("1. Parent_Parent_tag_id_js: ", $("#js").parent().parent());
				
				console.log("2. Find_LI0_html: ", $("#js").find("li:eq(0)").html());
				
				console.log("3. Children's_id_js: ", $("#js").children());
				
				
				$("#js").children();
				$("#js").children().each(function(item, index){
					console.log("4. Each_html_children_id_js: ", index, item);
				});
			});
			
			$("#button2").click(function(){
				$("#js").append($("<li>React JS</li>"));//add more
			});
			
			$("#button3").click(function(){
				$("#js").find("li:eq(0)").remove(); //remove
			});
		});
	</script>
</head>
<body>
	<h1 style="color: red">DOCUMENT OBJECT MODEL</h1>
	
	<ul>
		<li>HTML</li>
		<li>CSS</li>
		<li>JavaScript ((li tag, ul_id_js is children of this tag))
			<ul id="js">
				<li>jQuery (li tag, children of ul_id_js)</li>
				<li>Angular JS (li tag, children of ul_id_js)</li>
			</ul>
		</li>
		<li>Bootstrap</li>
	</ul>
	<hr>
	
	<button id="button1" style="color: red">Explorer Button</button>
	<button id="button2" style="color: blue">Add more "ReactJS" word</button>
	<button id="button3" style="color: orange">Remove li:eq(0)</button>
</body>
</html>
<br>
<img width="400" height="auto" src="image/html_code.png">
<br>
<img width="400" height="auto" src="image/html_code_js.png">