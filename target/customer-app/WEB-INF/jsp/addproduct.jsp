<!DOCTYPE html>
<html lang="en">
<head>
<title>IMCS Home Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Custom styles for this template -->
<link href="resources/css/global.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand"
					href="http://imcsgroup.net/img/logos/home/imcs-group-grey-logo.png">IMCS</a>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row new">
			<div class="col-sm-2 sidenav">
				<ul class="nav">
					<li class="active"><a href="homepage.html">Home</a></li>
					<li><a href="customerlist.html">Show Customer</a></li>
					<li><a href="addcustomer.html">Add Customer</a></li>
					<li><a href="#">Add Product</a></li>
					<li><a href="placeorder.html">Place order</a></li>
				</ul>
			</div>
			<div class="col-sm-8 text-left">
				<h1>Enter Product Details</h1>
				<hr>

				<div class="form-group text-left ">
					<label class="control-label " for="pname"> Product Name </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-briefcase"></span>
						</div>
						<input class="form-control" id="pname" name="pname" type="text"
							placeHolder="Product Name" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label " for="pdesc"> Product Description </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-blackboard"></span>
						</div>
						<input class="form-control" id="pdesc" name="pdesc" type="text"
							placeHolder="Product Description" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label " for="mname"> Price </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-usd"></span>
						</div>
						<input class="form-control" id="mname" name="mname" type="text"
							placeHolder="Middle Name" />
					</div>
				</div>
				
				<div>
				<button class="btn btn-primary btn-lg btn-warning" type="submit">Save</button>
				</div>
				
			</div>
		</div>
	</div>

</body>
</html>
