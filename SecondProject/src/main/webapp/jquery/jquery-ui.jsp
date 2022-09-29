<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery UI effect Example</title>  
    <link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">  
    <script src="https://code.jquery.com/jquery-1.10.2.js"></script>  
    <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>  
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script>
		$(function(){
			$(".datepicker").datepicker({
				dateFormat: 'dd/mm/yy',
				minDate: '-50000Y',
				maxDate: '+50000Y'
			});
		});
	</script>
</head>
<body class="container">
	<div class="alert alert-info form-group">
		<label for="date">DATE 1</label>
		<input class="datepicker"> 
	</div>
	<div class="alert alert-info form-group">
		<label for="date">DATE 2</label>
		<input class="datepicker">
	</div>
	<div class="alert alert-info form-group">
		<label for="date">DATE 3</label>
		<input class="datepicker">
	</div>
</body>
</html>