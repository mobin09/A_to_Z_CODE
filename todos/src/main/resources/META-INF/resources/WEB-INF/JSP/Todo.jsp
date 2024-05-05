<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Todo Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" />
</head>
<body>
    <div class="container">
        <h1>Add Todo Details</h1>
        <form:form method="POST" modelAttribute="todo">
            Description: <form:input type="text" path="description" required="required"/>
                         <form:input type="hidden" path="id" />
                         <form:input type="hidden" path="isDone" />
            <input type="submit" value="SUBMIT" class="btn btn-success" />
        </form:form>
    </div>

    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
