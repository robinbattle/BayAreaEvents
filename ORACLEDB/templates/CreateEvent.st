






<html>
  <head>
    <title>Create Event</title>
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
    			<p class="title">Create Event</p>
    		</div>
    	</div>
    	
    	
    	
    	<div class="row">
    		<div class="col-md-8">
	    		
					
					
					    
			    <form action="/createEvent" method="post">
			    	<table class="table table-hover">
			    		<tr><td><b>Name:</b></td> <td><input class="fillparent" type="text" name="name"/></td></tr>
			    		<tr><td><b>Date:</b></td> <td><input class="fillparent" type="text" name="date" id="datepicker" /></td></tr>
			    		<tr><td><b>Price:</b></td> <td><input class="fillparent" type="text" name="price"/></td></tr>
			    		<tr><td><b>Location:</b></td> <td><select class="fillparent" name="l_id" >$results$</select></td></tr>
			    		<tr><td><b>Description:</b></td> <td><textarea class="fillparent" name="description" placeholder="some description here" ></textarea></td></tr>
			    		
			    		<tr><td></td> <td><input class="btn btn-success pull-right" type="submit" value="Submit"></td></tr>
			    		
			    	</table>
			  	
			  		
				</form>
	
					
					
					
				
			</div>
    	</div>
    </div>
	
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
  	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
    <script src="https://www.cs.usfca.edu/~blu2/js/script.js"></script>
    
    

	
  </body>
</html>
