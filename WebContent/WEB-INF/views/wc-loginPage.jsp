<body id="LoginForm">
	<div class="container" id="login-container">
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
						<input type="email" class="form-control" id="loginEmail"
							placeholder="Email Address">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="LoginPassword"
							placeholder="Password">
					</div>
					<div class="forgot">
						<a href="#" id="forgot-password-link">Forgot password?</a>
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
					<br>
					<hr>
					<button type="button" id="login-register" class="btn btn-success">Register</button>
				</form>
			</div>
			<p class="botto-text">Designed by ....</p>
		</div>
	</div>
	<div class="container" id="Register-container">
		<br> <br>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>Step-1 Registration</h2>
				</div>
				<form id="register-basic"
					action="${pageContext.request.contextPath}/wc-Register.do"
					method="post">
					<div class="form-group">
						<input type="email" class="form-control" id="inputEmail"
							placeholder="Email Address">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="inputPassword"
							placeholder="Password">
					</div>
					<div class="form-group">
						<input type="password" class="form-control"
							id="confirm-inputPassword" placeholder="Confirm Password">
					</div>
					<button type="button" class="btn btn-primary" id="register-Aadhar">Submit</button>
					<br>
					<hr>
					<button type="button" class="btn btn-success login">Already
						an user? Login Here</button>
				</form>
			</div>
			<p class="botto-text">Designed by ....</p>
		</div>
	</div>
	<div class="container" id="Register-aadhar-container">
		<br> <br>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>Step-2 Registration</h2>
				</div>
				<form id="register-aadhar"
					action="${pageContext.request.contextPath}/wc-Register.do"
					method="post">
					<div class="form-group">
						<h5>
							Please Upload your Aadhaar Card.&nbsp;<i
								class="fa fa-exclamation-circle" id="aadhar-faq"
								title="Click here to know why do we need AAdhaar Card"></i>
						</h5>
					</div>
					<hr>
					<div class="form-group">
						<input type="file" class="">
					</div>
					<hr>
					<br>
					<button type="button" class="btn btn-primary" id="register-Otp">Upload</button>
					<br>
					<hr>
					<button type="button" class="btn btn-success login">Already
						an user? Login Here</button>
				</form>
			</div>
			<p class="botto-text">Designed by ....</p>
		</div>
	</div>
	<div class="container" id="Register-Otp-container">
		<br> <br>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>OTP Verification</h2>
				</div>
				<form id="register-otp"
					action="${pageContext.request.contextPath}/wc-Register.do"
					method="post">
					<div class="form-group">
						<h6>
							<font color="green">Please Check Your Email for OTP.</font>
						</h6>
					</div>
					<hr>
					<div class="form-group">
						<div class="row">
							<div class="col-sm-3">
								<input type="text" class="form-control">
							</div>
							<div class="col-sm-3">
								<input type="text" class="form-control">
							</div>
							<div class="col-sm-3">
								<input type="text" class="form-control">
							</div>
							<div class="col-sm-3">
								<input type="text" class="form-control">
							</div>
						</div>
					</div>
					<hr>
					<br>
					<button type="button" class="btn btn-primary" id="">Submit
						OTP</button>
					<br>
					<hr>
					<button type="button" class="btn btn-success login">Already
						an user? Login Here</button>
				</form>
			</div>
			<p class="botto-text">Designed by ....</p>
		</div>
	</div>
	<div class="container" id="forgot-password">
		<br> <br>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>Reset Your Password</h2>
				</div>
				<form id="forgot-password"
					action="${pageContext.request.contextPath}/wc-Register.do"
					method="post">
					<hr>
					<div class="form-group">
						<input type="email" class="form-control" id="inputEmail"
							placeholder="Enter Your WC-ID">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="input-Password"
							placeholder="Enter Password">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="confirm-password"
							placeholder="Re-Enter Password">
					</div>
					<button type="submit" class="btn btn-primary">Reset</button>
					<br>
					<hr>
					<button type="button" class="btn btn-success" id="reset-cancel">Cancel</button>
					<hr>
				</form>
			</div>
			<p class="botto-text">Designed by ....</p>
		</div>
	</div>
	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							responsiveVoice
									.speak(
											"Welcome to we connect, We help you in connecting you with your friends!",
											"UK English Male");
							loadLoginPage();
							$("#login-register").click(function() {
								loadRegisterPage();
							});
							$(".login").click(function() {
								loadLoginPage();
							});
							$("#register-Aadhar")
									.click(
											function() {
												responsiveVoice
														.speak("Please Upload your aadhar Card to complete your Registration. It is just to avoid Duplicate or Fake accounts. All your data are encrypted and safe.");
												loadAadhaarUploadPage();
											});
							$("#register-Otp").click(function() {
								loadOtpVerificationPage();
							});
							$("#aadhar-faq")
									.on(
											{
												click : function() {
													responsiveVoice
															.speak("Please Upload your aadhar Card to complete your Registration. It is just to avoid Duplicate or Fake accounts. All your data are encrypted and safe.");
												}
											});

						});

		$("#forgot-password-link").click(function() {
			loadResetPasswordPage();
		});
		$("#reset-cancel").click(function() {
			loadLoginPage();
		});
	</script>
	<script type="text/javascript">
		function loadLoginPage() {
			$("#login-container").show();
			$("#Register-container").hide();
			$("#Register-aadhar-container").hide();
			$("#Register-Otp-container").hide();
			$("#forgot-password").hide();
		}
		function loadRegisterPage() {
			$("#Register-container").show();
			$("#login-container").hide();
			$("#Register-aadhar-container").hide();
			$("#Register-Otp-container").hide();
			$("#forgot-password").hide();
		}
		function loadAadhaarUploadPage() {
			$("#Register-aadhar-container").show();
			$("#login-container").hide();
			$("#Register-container").hide();
			$("#Register-Otp-container").hide();
			$("#forgot-password").hide();
		}
		function loadOtpVerificationPage() {
			$("#Register-Otp-container").show();
			$("#Register-aadhar-container").hide();
			$("#login-container").hide();
			$("#Register-container").hide();
			$("#forgot-password").hide();
		}
		function loadResetPasswordPage() {
			$("#forgot-password").show();
			$("#Register-Otp-container").hide();
			$("#Register-aadhar-container").hide();
			$("#login-container").hide();
			$("#Register-container").hide();
		}
	</script>
</body>
