<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQuery copy only template</title>
<!-- CDN Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	$(function() {
		$("#all").on("change", function() {
			var status = $("#all").prop("checked"); /* status return True or False */
			$(":checkbox").prop("checked", status) /* Select all type Checkbox, if status is T/F, all is T/F*/
		});
	});
</script>
</head>
<body class="container">
	<ol class="alert alert-success">
		<li><input type="checkbox" id="all"> CHECK ALL</li>
		<li><input type="checkbox"> two</li>
		<li><input type="checkbox"> three</li>
		<li><input type="checkbox"> four</li>
	</ol>
</body>
</html>