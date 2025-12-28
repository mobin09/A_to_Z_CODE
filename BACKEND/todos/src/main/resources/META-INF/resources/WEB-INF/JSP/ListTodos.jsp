    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
    <%@include file="COMMON/Header.jspf" %>
	<%@include file="COMMON/Navbar.jspf"%>
	<div class="container">
		<h1>Your TODOS</h1>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>IS Done</th>
					<th></th>
					<th></th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.isDone}</td>
						<td><a href="delete-todo?id=${todo.id}"
							class="btn btn-warning">DELETE</a></td>
						<td><a href="update-todo?id=${todo.id}"
							class="btn btn-success">UPDATE</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success" id="add">ADD TODO</a> <a
			href="list-todos" class="btn btn-info" id="back"
			style="display: none">Go Back</a> <span style="color: red"
			flag="${flag}" id="erorr">${addmsg} </span>
	</div>
	
	<script>
		var flag = document.getElementById("erorr").getAttribute("flag");
		if (flag == "0") {
			document.getElementById("back").style.display = "inline-block";
			document.getElementById("add").style.display = "none"
		}
	</script>
	<%@include  file="COMMON/Footer.jspf"%>
