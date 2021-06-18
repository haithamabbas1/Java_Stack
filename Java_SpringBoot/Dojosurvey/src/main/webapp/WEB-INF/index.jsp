<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<form action="/surveydata" method="post">
	 <label for="surveydata">Name:</label>
	<input type="text" id="name" placeholder="Name" name="name">
	<br>
	<label for="location">Dojo Location</label>
	<select id="location" name="location" form="location">
  <option value="San Jose">San Jose</option>
  <option value="Barcelona">Barcelona</option>
  <option value="Amsterdam">Amsterdam</option>
  <option value="Berlin">Berlin</option>
	</select>
	<br>
	<label for="favlang">Favorite Language </label>
	<select id="favlang" name="favlang" form="favlang">
  <option value="Python">Python</option>
  <option value="Java">Java</option>
  <option value="Mern">Mern</option>
  <option value="C++">C++</option>
	</select>
	<br>
	
	<label for="fname">Comment</label>
	<input type="text" id="comment" placeholder="comment" name="comment">

	<br>
	<button type="submit">Submit</button>
</form>




</body>
</html>