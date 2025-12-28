<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the Login page</h1>
	<pre class='error' style="color: red;"> ${ErrorMessage} </pre>
	<form method="post">
		Name : <input type="text" name="name">
		Password : <input type="password" name ="password" />
		<input type="submit" />
	</form>
	
<script>
   setTimeout(function(){
	   document.getElementsByClassName('error')[0].style.display = "none";
   }, 3000);
</script>	
</body>
</html>