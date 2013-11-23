

<html>
  <head>
    <title>Location Search</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Sonsie+One' rel='stylesheet' type='text/css'>
	<style>
		body {background-color:#b0c4de;}

		
		.title{
			font-family: 'Sonsie One', cursive;
			font-size:90;
		}
		.fillparent{
			display:table-cell; 
			width:100%;
		}
	</style>

  </head>
  <body>
    
    

    <div class="container" id="banner_top">
    	<div class="row">
    		<div class="col-md-12">
    			<p class="title">Location Search</p>
    		</div>
    	</div>
    	
    	
    	
    	<div class="row">
    	
    		<div class="col-md-8">
    		
    			<form action="/locationSearch" method="get">
			    	<input class="fillparent" type="text" name="locationName" id="locationText"/>
			    		
			    	<input class="btn btn-success pull-right" type="submit" value="Submit">
			  	
			  		
				</form>
    		</div>
    		
    		<div class="col-md-4">
				<select onchange="document.getElementById('locationText').value=this.options[this.selectedIndex].value;">
					$examples$
				</select>
			</div>
    	
    		<div class="col-md-8">
	    		<table class="table table-hover">
					$results$
				</table>
			</div>
			
			
			
		
				
				
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