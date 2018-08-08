<body id="LoginForm">
	<div class="container">
		<br> <br>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>Login to We-Connect</h2>
					<p>Please enter your email and password</p>
				</div>
				<form id="Login"
					action="${pageContext.request.contextPath}/wc-login.do"
					method="post">
					<div class="form-group">
						<input type="email" class="form-control" id="inputEmail"
							placeholder="Email Address">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="inputPassword"
							placeholder="Password">
					</div>
					<div class="forgot">
						<a href="${pageContext.request.contextPath}/resetPassword.do">Forgot
							password?</a>
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
					<br>
					<hr>
					<button type="button" id="login-register" class="btn btn-success">Register</button>
				</form>
			</div>
			<p class="botto-text">Designed by Punith & Ravi</p>
		</div>
	</div>
	<div class="container">
		<br> <br>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>Register to We-Connect</h2>
				</div>
				<form id="register"
					action="${pageContext.request.contextPath}/wc-Register.do"
					method="post">
					<div class="form-group">
						<input type="text" class="form-control" id="Full-Name"
							placeholder="Full Name">
					</div>
					<div class="form-group">
						<input type="email" class="form-control" id="inputEmail"
							placeholder="Email Address">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="inputPassword"
							placeholder="Password">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="inputPassword"
							placeholder="Confirm Password">
					</div>
					<div class="form-group">
						<input type="file" class="form-control">
					</div><br>
					<button type="submit" class="btn btn-primary">Register</button>
					<br>
					<hr>
					<button type="button" id='register-login' class="btn btn-success">Already
						an user? Login Here</button>
				</form>
			</div>
			<p class="botto-text">Designed by Punith & Ravi</p>
		</div>
	</div>
</body>
