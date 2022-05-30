<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Features</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'poppins', sans-serif;
}

.contact {
	position: relative;
	min-height: 100vh;
	padding: 50px 100px;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}
body{
background-image:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRIftqiOmu8lSB245qmhb0-99qrcXYmVmtHOg&usqp=CAU");
background-repeat: no-repeat;
background-size: cover;
}

.contact .content {
	max-width: 800px;
	text-align: center;
}

.contact .content h2 {
	font-size: 36px;
	font-weight: 500;
	color: navy;
	font-family: serif;
}

.container {
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	margin-top: 30px;
}

.container .contactinfo {
	width: 50%;
	display: flex;
	flex-direction: column;
}

.container .contactinfo .box {
	position: relative;
	padding: 20px 0;
	display: flex;
}

.container .contactinfo .box .text h3 {
	font-weight: 500;
	color: navy;
	font-family: serif;
}

.supportform {
	width: 40%;
	padding: 40px;
	background: white;
}

.supportform h2 {
	font-size: 30px;
	color: gray;
	font-weight: 500;
}

.supportform .inputBox {
	position: relative;
	width: 100%;
	margin-top: 10px;
}

.supportform .inputBox input {
	width: 100%;
	padding: 5px 0;
	font-size: 16px;
	margin: 10px 0;
	border: none;
	border-bottom: 2px solid grey;
	outline: none;
}
p{
color: black;
}
</style>
</head>
<body>
	<section class="contact">
		<div class="content">
			<h2>Support</h2>
		</div>
		<div class="container">
			<div class="contactinfo">
				<div class="box">

					<div class="text">
						<h3>Address</h3>
						<p>
							4671 IT park Road,<br>Owatonna,Minnesota,HYD<br>55600
						</p>
					</div>
				</div>
				<div class="box">

					<div class="text">
						<h3>Email</h3>
						<p>virtusahotel8017@temporary-mail.net</p>
					</div>
				</div>
				<div class="box">

					<div class="text">
						<h3>Phone</h3>
						<p>507-064-7094</p>
					</div>
				</div>
			</div>
			<div class="supportform">
				<form>
					<h2>Please supported</h2>
					<div class="inputBox">
						<input type="text" name="" required="required"> <span>Full
							Name</span>
					</div>
					<div class="inputBox">
						<input type="text" name="" required="required"> <span>Email</span>
					</div>
					<div class="inputBox">
						<textarea required="required"></textarea>
						<span>Type your Message...</span>
					</div>
					<div class="inputBox">
						<input type="submit" name="" value="Send">

					</div>
				</form>
			</div>
		</div>
	</section>
</body>

</html>