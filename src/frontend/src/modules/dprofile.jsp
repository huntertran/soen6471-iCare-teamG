<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>iCare</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	<script>
		function disable() {
			document.getElementById("1").disabled = true;
			document.getElementById("2").disabled = true;
			document.getElementById("3").disabled = true;
			document.getElementById("4").disabled = true;
			document.getElementById("5").disabled = true;
			document.getElementById("6").disabled = true;
			document.getElementById("7").disabled = true;
			alert("Profile Updated");

		}
		function enable() {
			document.getElementById("1").disabled = false;
			document.getElementById("2").disabled = false;
			document.getElementById("3").disabled = false;
			document.getElementById("4").disabled = false;
			document.getElementById("5").disabled = false;
			document.getElementById("6").disabled = false;
			document.getElementById("7").disabled = false;
		}
	</script>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title"
					style="background-image: url(images/bg-01.jpg);">
					<span class="login100-form-title-1">Dr. ${name} Profile </span>
				</div>
				<div>
					<div class="container-login100-form-btn">
						<button class="login100-form-btn" onclick="enable()">
							Edit Profile</button>
					</div>
				</div>
				<form class="login100-form validate-form"  action="ProfileUpdate"
					method="post">
					<div class="wrap-input100 validate-input m-b-18" data-validate = "User Type is required">
						<span class="label-input100">User Type</span>
						<input class="input100" type="text" name="type" value="${data[10]}" readonly="readonly" placeholder="Enter Doctor or Patient Only">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18"
						data-validate="First Name is required">
						<span class="label-input100">First Name</span> <input
							class="input100" type="text" name="firstname" id="2" disabled
							value="${data[2]}" placeholder="Enter First Name"> <span
							class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18"
						data-validate="Last Name is required">
						<span class="label-input100">Last Name</span> <input
							class="input100" type="text" disabled name="lastname" id="3"
							value="${data[3]}" placeholder="Last First Name"> <span
							class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18"
						data-validate="Date of Birth is required">
						<span class="label-input100">Date of Birth</span> <input
							class="input100" type="date" name="dob" disabled id="4"
							value="${data[4]}" placeholder="Enter Date of Birth"> <span
							class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18"
						data-validate="Age is required">
						<span class="label-input100">Age</span> <input class="input100"
							type="number" name="age" disabled id="5" value="${data[5]}"
							placeholder="Enter Age" min="0" max="100"> <span
							class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18"
						data-validate="Address is required">
						<span class="label-input100">Address</span> <input
							class="input100" type="text" name="address" disabled id="6"
							value="${data[6]}" placeholder="Enter Address"> <span
							class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18"
						data-validate="Phone Number is required">
						<span class="label-input100">Phone Number</span> <input
							class="input100" type="text" name="phonenumber" disabled id="7"
							value="${data[7]}" placeholder="Enter Phone Number"> <span
							class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18"
						data-validate="Email Address is required">
						<span class="label-input100">Email Address</span> <input
							class="input100" type="email" name="email" disabled
							value="${data[8]}" placeholder="Enter Email Address"> <span
							class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-26"
						data-validate="Username is required">
						<span class="label-input100">Username</span> <input
							class="input100" type="text" name="name" value="${data[0]}"
							disabled placeholder="Enter username"> <span
							class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn">
						<input class="login100-form-btn"  id="1" type="submit" 
							value="submit">
					</div>
				</form>
			</div>
		</div>
	</div>

	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>