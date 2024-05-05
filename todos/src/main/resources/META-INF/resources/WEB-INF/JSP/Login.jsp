<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<form method="POST">
			<section class="vh-100" style="background-color: #508bfc;">
				<div class="container py-5 h-100">
					<div
						class="row d-flex justify-content-center align-items-center h-100">
						<div class="col-12 col-md-8 col-lg-6 col-xl-5">
							<div class="card shadow-2-strong" style="border-radius: 1rem;">
								<div class="card-body p-5 text-center">

									<h3 class="mb-1">Sign in</h3>
									<spam style="color: red;" class="mb-2">${message}</spam>
									<div data-mdb-input-init class="form-outline mb-4">
										<input type="text" name="name" id="typeEmailX-2"
											class="form-control form-control-lg" placeholder="Username" />
									</div>

									<div data-mdb-input-init class="form-outline mb-4">
										<input type="password" name="password" id="typePasswordX-2"
											class="form-control form-control-lg" placeholder="Password" />
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
	</div>

	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>