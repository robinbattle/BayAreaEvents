

<html>
  <head>
    <title>Create Event</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css" rel="stylesheet">


  </head>
  <body>
    <h1>Create Event</h1>
    
    
    <form action="/createEvent" method="post">
  		<p>Event_ID: <input type="text" name="e_id" value="300005176"/></p>
  		<p>Name: <input type="text" name="name"/></p>
  		<p>Date: <input type="text" name="date" value="23-Nov-2013"/></p>
  		<p>Price: <input type="text" name="price"/></p>
  		<p>Location_ID: <input type="text" name="l_id" value="11033"/></p>
  		<p>Description: <input type="text" name="description" value="some description here"/></p>
  		<input type="submit" value="Submit">
	</form>
	
	<br>

	

	
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
  	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
    <script src="https://www.cs.usfca.edu/~blu2/js/script.js"></script>
    
    
  
	
  </body>
</html>