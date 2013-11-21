

<html>
  <head>
    <title>Home Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Sonsie+One' rel='stylesheet' type='text/css'>
	<style>
		body {background-color:#b0c4de;}
		.container{
			background-image:url('http://upload.wikimedia.org/wikipedia/en/7/75/DowntownSF.jpg');
			opacity:0;
		}
		
		.title{
			font-family: 'Sonsie One', cursive;
			font-size:90;
		}
	</style>

  </head>
  <body >
    
    <div class="container" id="banner_top">
    	<div class="row">
    		<div class="col-md-12">
    			<p class="title">Bay Area Events</p>
    		</div>
    	</div>
    	
    
    	<div class="row">
    		<div class="col-md-4">
    			
    			<img src="http://www.cs.usfca.edu/~blu2/images/all.png"></img>
    			<a type="button" class="btn btn-success btn-lg btn-block" href="/all" target="_blank">All</a>
    		</div>
    		<div class="col-md-4">
    			<img src="http://www.cs.usfca.edu/~blu2/images/free.png"></img>
    			<a type="button" class="btn btn-primary btn-lg btn-block" href="/free" target="_blank">Free</a>
    			
    		</div>
    		<div class="col-md-4">
    			<img src="http://www.cs.usfca.edu/~blu2/images/priced.png"></img>
    			<a type="button" class="btn btn-warning btn-lg btn-block" href="/priced" target="_blank">Priced</a>
    			
    		</div>
    	</div>
    	<div>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    		<br>
    	</div>
    	
    	
    </div>

	
	
	
	

	
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
  	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
    <script src="https://www.cs.usfca.edu/~blu2/js/script.js"></script>
    
    
    <script>
	var index = document.getElementById("startIndex").value;

	if(index== ''){
		document.getElementById("startIndex").value = 0;
	}else{
		alert(index);
		document.getElementById("startIndex").value = parseInt('0') + 10;
		
		
	}
     </script>
	
  </body>
</html>