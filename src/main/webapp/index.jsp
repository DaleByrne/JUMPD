<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap Agency Template</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="resources/css/bootstrap.css">
<link rel="stylesheet" href="resources/fonts/font-awesome.min.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="resources/css/custom.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<header>
  <nav class="navbar navbar-default transparent-bg">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <a class="navbar-brand" href="#"><img src="resources/images/logo/logo.png" alt="jumpd"></a> </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
          <li class="active"><a href="#" class="link_style">Home</a></li>
          <li><a href="#" class="link_style">About Us</a></li>
          <li><a href="#" class="link_style">Contact Us</a></li>
			<li><a href="hello.html" class="link_style">Sign Up</a></li>
        </ul>
		  <!-- Sidebar -->
        <ul class="nav navbar-nav navbar-right">
			<div id="top" class="wrap push fa_style"><a href="#menu" class="menu-link link_style"><i class="fa fa-user-circle-o fa-2x"></i></a></div>            

        </ul>
      </div>
    </div>
  </nav>
  
  <nav id="menu" class="panel" role="navigation">
    <div id="menu_actual"><br>
      <br>
      <a href="#" class="link_style"><i class="fa fa-sign-in"></i> Sign In</a> <br>
      <br>
      <a href="#" class="link_style"><i class="fa fa-user-plus"></i>Sign Up</a> <br>
      <br>
      <br>
    </div>
  </nav>
</header>
<body>
	<!-- Content to go here -->
	
	
</body>
<footer class="text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12">
        <p>Copyright © JUMPD. All rights reserved.</p>
      </div>
    </div>
  </div>
</footer>

<!-- / FOOTER -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="resources/js/jquery-2.2.4.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="resources/js/bootstrap.min.js"></script>
<!-- jQuery plugins -->
<script src="resources/js/plugins.js"></script>
<!-- Menu Toggle Script -->
<script>
$(document).ready(function() {

  $('.menu-link').bigSlide({
    'side': 'right',
    'speed': '550',
    'menuWidth': '15.625em'
  });


});
</script>
</body>
</html>
