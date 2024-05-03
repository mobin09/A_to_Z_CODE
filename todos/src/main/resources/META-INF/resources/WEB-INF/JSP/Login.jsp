<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<form method="POST">
		<section class="vh-100" style="background-color: #508bfc;">
			<div class="container py-5 h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-8 col-lg-6 col-xl-5">
						<div class="card shadow-2-strong" style="border-radius: 1rem;">
							<div class="card-body p-5 text-center">

								<h3 class="mb-5">Sign in</h3>

								<div data-mdb-input-init class="form-outline mb-4">
									<input type="email" name="email" id="typeEmailX-2"
										class="form-control form-control-lg" placeholder="Email" />
								</div>

								<div data-mdb-input-init class="form-outline mb-4">
									<input type="password" name="password" id="typePasswordX-2"
										class="form-control form-control-lg" placeholder = "Password" /> 
								</div>

								<button data-mdb-button-init data-mdb-ripple-init
									class="btn btn-primary btn-lg btn-block" type="submit">Login</button>



		      			</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</form>


</body>
</html>