<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>


<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>INICIO</title>

<link rel="icon" type="image/x-icon" href="resources/assets/img/ico.ico" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.12.1/js/all.js"
	crossorigin="anonymous"></script>
<!-- Google fonts-->
<link href="https://fonts.googleapis.com/css?family=Varela+Round"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet" />

<!-- Core theme CSS (includes Bootstrap)-->
<link href="resources/css/styles.css" rel="stylesheet" />
</head>

<body id="page-top">
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-light fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand js-scroll-trigger" href="#page-top">Inicio</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu<i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="listaAmantes">Amantes</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#projects">Dragones</a></li>

					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="conquista">Conquista</a></li>

				</ul>
			</div>
		</div>
	</nav>
	<!-- Masthead-->
	<header class="masthead">
		<div class="container d-flex h-100 align-items-center">
			<div class="mx-auto text-center">
				<h1 class="mx-auto my-0 text-uppercase">Game of Thrones</h1>


				<head>





<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
				</head>
				<body>
					<div class="container">
						<div class="row">
							<div class="col">
								<table
									class="table table-striped table-bordered table-hover table-dark">
									<thead>
										<tr>
											<th>Id</th>
											<th>lugar</th>
											<th>clase Social</th>

										</tr>
									</thead>
									<tbody>
										<c:forEach items="${pers}" var="pers">
											<tr>
												<td>${pers.id}</td>
												<td>${pers.lugar }</td>
												<td>${pers.claseSocial}</td>




												<td><a href="prueba/${pers.id}"
													class="btn btn-primary js-scroll-trigger" role="button"
													title="Prueba"> <span class="glyphicon glyphicon-trash"></span>Prueba
												</a></td>



											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
						<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
						<script
							src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
						<script
							src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
				</body>









				<h2 class="text-white-50 mx-auto mt-2 mb-5">A free, responsive,
					one page Bootstrap theme created by Start Bootstrap.</h2>
				<a class="btn btn-primary js-scroll-trigger" href="#about">Get
					Started</a>
			</div>
		</div>
	</header>
	<!-- About-->
	<section class="about-section text-center" id="about">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<h2 class="text-white mb-4">Texto</h2>
					<p class="text-white-50"></p>
				</div>
			</div>
			<img class="img-fluid" src=".jpg" alt="" />
		</div>
	</section>
	<!-- Projects-->
	<section class="projects-section bg-light" id="projects">
		<div class="container">
			<!-- Featured Project Row-->
			<div class="row align-items-center no-gutters mb-4 mb-lg-5">
				<div class="col-xl-8 col-lg-7">
					<img class="img-fluid mb-3 mb-lg-0"
						src="resources/assets/img/dragon.jpg" alt="" />
				</div>
				<div class="col-xl-4 col-lg-5">
					<div class="featured-text text-center text-lg-left">
						<h4>Tabla 2</h4>
						<p class="text-black-50 mb-0">Contenido tabla 2</p>

						<meta charset="UTF-8">
						<meta name="viewport"
							content="width=device-width, initial-scale=1.0">

						<link rel="stylesheet"
							href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
						</head>
						<body>
							<div class="container">
								<div class="row">
									<div class="col">
										<table
											class="table table-striped table-bordered table-hover table-white">
											<thead>
												<tr>

													<th>Edad</th>
													<th>Nombre</th>
													<th>Fuerza</th>
													<th>Color</th>
													<th>Comida Favorita</th>
													<th>Personas Asesinadas</th>

												</tr>
											</thead>
											<tbody>
												<c:forEach items="${dragons}" var="dragons">
													<tr>
														<td>${dragons.edad}</td>
														<td>${dragons.nombre }</td>
														<td>${dragons.fuerza}</td>
														<td>${dragons.color}</td>
														<td>${dragons.comidaFav }</td>
														<td>${dragons.asesinatos}</td>

													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
								<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
								<script
									src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
								<script
									src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
						</body>




					</div>
				</div>
			</div>
			<!-- Project One Row-->
			<div class="row justify-content-center no-gutters mb-5 mb-lg-0">
				<div class="col-lg-6">
					<img class="img-fluid" src="resources/assets/img/ "
						alt="" />
				</div>
				<div class="col-lg-6">
					<div class="bg-black text-center h-100 project">
						<div class="d-flex h-100">
							<div class="project-text w-100 my-auto text-center text-lg-left">
								<h4 class="text-white">Tabla 3</h4>
								<p class="mb-0 text-white-50">Contenido tabla 3</p>


								<meta charset="UTF-8">
								<meta name="viewport"
									content="width=device-width, initial-scale=1.0">

								<link rel="stylesheet"
									href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
								</head>
								<body>
									<div class="container">
										<div class="row">
											<div class="col">
												<table
													class="table table-striped table-bordered table-hover table-dark">
													<thead>
														<tr>
															<th>Nombre</th>
															<th>numero hijos</th>
															<th>nombre hijos</th>
															<th>problema</th>


														</tr>
													</thead>
													<tbody>
														<c:forEach items="${subs}" var="subs">
															<tr>
																<td>${subs.nombre}</td>
																<td>${subs.numHijos }</td>
																<td>${subs.nomHijos}</td>
																<td>${subs.problema}</td>

															</tr>
														</c:forEach>
													</tbody>
												</table>
											</div>
										</div>


										<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
										<script
											src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
										<script
											src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
								</body>




								<hr class="d-none d-lg-block mb-0 ml-0" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- Project Two Row-->
			<div class="row justify-content-center no-gutters">
				<div class="col-lg-6">
					<img class="img-fluid" src="resources/assets/img/guerreros.jpg"
						alt="" />


				</div>
				<div class="col-lg-6 order-lg-first">
					<div class="bg-black text-center h-100 project">
						<div class="d-flex h-100">
							<div class="project-text w-100 my-auto text-center text-lg-right">
								<h4 class="text-white">tabla 4</h4>
								<p class="mb-0 text-white-50">Contenido tabla 4</p>

								<table
									class="table table-striped table-bordered table-hover table-dark">
									<thead>
										<tr>
											<th>nombre</th>
											<th>especialidad</th>
											<th>cargo</th>
											<th>asesinatos</th>
											<th>interes</th>

										</tr>
									</thead>
									<tbody>
										<c:forEach items="${guerrs}" var="guerrs">
											<tr>
												<td>${guerrs.nombre}</td>
												<td>${guerrs.especialidad }</td>
												<td>${guerrs.cargo}</td>
												<td>${guerrs.asesinatos }</td>
												<td>${guerrs.interes}</td>

											</tr>
										</c:forEach>
									</tbody>
								</table>


								<meta charset="UTF-8">
								<meta name="viewport"
									content="width=device-width, initial-scale=1.0">

								<link rel="stylesheet"
									href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
								</head>
								<body>
									<div class="container">
										<div class="row">
											<div class="col"></div>
										</div>
										<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
										<script
											src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
										<script
											src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
								</body>


								<hr class="d-none d-lg-block mb-0 mr-0" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>






	<!-- Footer-->
	<footer class="footer bg-black small text-center text-white-50">
		<div class="container">UTADEO 2020</div>
	</footer>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
	<!-- Third party plugin JS-->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
	<!-- Core theme JS-->
	<script src="resources/js/scripts.js"></script>
</body>
</html>