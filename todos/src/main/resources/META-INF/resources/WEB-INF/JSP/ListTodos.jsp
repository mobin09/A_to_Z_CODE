<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List todos</title>
<link rel="stylesheet"
	href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" />

</head>
<body>
	<div class="container">
		<h1>Your TODOS</h1>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>IS Done</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.isDone}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success" id="add">ADD TODO</a>
		<a href="list-todos" class="btn btn-info" id="back" style="display:none">Go Back</a>
		
		<span style="color:red" flag = "${flag}" id="erorr">${addmsg} </span>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<script>
	   var flag = document.getElementById("erorr").getAttribute("flag");
	   if(flag == "0"){
		   document.getElementById("back").style.display = "inline-block";
		   document.getElementById("add").style.display = "none"
	   }
	</script>
</body>
</html>