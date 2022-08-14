<%@ page pageEncoding="UTF-8"%>
<ul class="nav nav-pills">
	<li class="active"><a data-toggle="pill" href="#form">Balance sheet Form</a></li>
	<li><a data-toggle="pill" href="#table">Table</a></li>
	<li><a data-toggle="pill" href="#menu2">Menu 2</a></li>
</ul>

<div class="tab-content">
	<div id="form" class="tab-pane fade in active">
		<!-- FORM -->
		<form action="" method="get" class="alert alert-success">
				<div class="row">
					<div class="form-group col-sm-6">
						<label>Username</label>
						<input class="form-control" placeholder="Username?">
					</div>
					<div class="form-group col-sm-6">
						<label>Password</label>
						<input type="password" class="form-control" placeholder="Password?">
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-6">
						<label>Gender</label>
						<div class="form-control">
							<input name="gender" type="radio" id="male">
							<label for="male">Male</label>
							<input name="gender" type="radio" id="female">
							<label for="female">Female</label>
						</div>
					</div>
					<div class="form-group col-sm-6">
						<label>Nationality</label>
						<select class="form-control">
							<option>Vietnam</option>
							<option>United States</option>
						</select>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-12">
						<input type="checkbox" id="rm">
						<label class="checkbox-inline" for="rm">Remember me?</label>
					</div>
					<div class="form-group col-sm-12">
						<label>Notes</label>
						<textarea class="form-control" rows="3" placeholder="Notes?"></textarea>
					</div>
					<div class="form-group col-sm-12">
						<button class="btn btn-success">Sign Up</button>
					</div>
				</div>				
			</form>
	</div>
	<div id="table" class="tab-pane fade">
		<!-- TABLE -->
		<div class="panel panel-default">
			  <div class="panel-heading">Panel Heading</div>
			  <table class="table table-bordered table-striped table-hover table-condensed">
				<thead>
					<tr>
						<th>1</th>
						<th>2</th>
						<th>3</th>
						<th>4</th>
						<th>5</th>
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
				</tbody>
				<tfoot>
					<tr>
						<th>1</th>
						<th>2</th>
						<th>3</th>
						<th>4</th>
						<th>5</th>
					</tr>
				</tfoot>
			</table>
			  <div class="panel-footer">Panel Footer</div>
			</div>
			<table class="table table-bordered table-striped table-hover table-condensed">
				<thead>
					<tr>
						<th>1</th>
						<th>2</th>
						<th>3</th>
						<th>4</th>
						<th>5</th>
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
				</tbody>
				<tfoot>
					<tr>
						<th>1</th>
						<th>2</th>
						<th>3</th>
						<th>4</th>
						<th>5</th>
					</tr>
				</tfoot>
			</table>
	</div>
	<div id="menu2" class="tab-pane fade">
		<h3>Menu 2</h3>
		<p>Some content in menu 2.</p>
	</div>
</div>