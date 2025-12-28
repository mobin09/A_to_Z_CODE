<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


  <%@include file="COMMON/Header.jspf" %>
   <%@include  file="COMMON/Navbar.jspf"%>
	<div class="container">
		<h1>Add Todo Details</h1>
		<form:form method="POST" modelAttribute="todo">
			<fieldset>
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-danger" />
			</fieldset>

			<fieldset>
				<form:label path="targetDate">Target Date</form:label>
				<form:input type="text" path="targetDate" required="required" />
				<form:errors path="targetDate" cssClass="text-danger" />
			</fieldset>

			<form:input type="hidden" path="id" />

			<form:input type="hidden" path="isDone" />
			<br />
			<input type="submit" value="SUBMIT" class="btn btn-success" />
		</form:form>
	</div>

	<%@include  file="COMMON/Footer.jspf"%>	
	<script type="text/javascript">
		$('#targetDate').datepicker({
			format : 'yyyy-mm-dd',
			startDate : '+1d'
		});
	</script>

