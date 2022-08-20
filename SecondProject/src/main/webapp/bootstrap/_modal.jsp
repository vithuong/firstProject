<%@ page pageEncoding="UTF-8"%>
<!-- Trigger the modal with a button -->
<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Goods Information</h4>
      </div>
      <div class="modal-body">
        <!-- FORM -->
        <form action="" method="get" class="alert alert-success">
				<div class="row">
					<div class="form-group col-sm-6">
						<label>Sender</label>
						<input class="form-control" placeholder="Sender">
					</div>
					<div class="form-group col-sm-6">
						<label>Receiver</label>
						<input class="form-control" placeholder="Receiver">
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-12">
						<label>Subject</label>
						<input class="form-control" placeholder="Subject">
					</div>
					<div class="form-group col-sm-12">
						<label>Content</label>
						<textarea class="form-control" rows="3" placeholder="Content"></textarea>
					</div>
				</div>				
			</form>
      </div>
      <div class="modal-footer">
      	<button class="btn btn-primary">Send</button>
        <button class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>