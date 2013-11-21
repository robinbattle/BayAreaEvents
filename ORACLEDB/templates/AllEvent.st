

<html>
  <head>
    <title>Home Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css" rel="stylesheet">


  </head>
  <body>
    <h1>All Events</h1>
    
    
    
    <form action="/" method="get">
  		<p>Date: <input type="text" id="datepicker" name="date"/></p>
  		<input type="submit" value="Submit">
	</form>

	$results$
	
	<br>
	index: $index$
	
	<form action="/" method="get">
		<input type="hidden" name="start" id="startIndex">
		<input type="submit" value="next">
	</form>
	
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