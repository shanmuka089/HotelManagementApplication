<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Features</title>
<style type="text/css">
.about-us {
	width: 100%;
}
body{
	background-color: silver;
}
.about-us h1 {
	text-align: center;
	font-size: 40px;
	color: navy;
	text-transform: uppercase;
	letter-spacing: 1.5px;
	margin-top: 50px;
}

.about-us h1::after {
	content: "";
	height: 5px;
	width: 200px;
	background-color: black;
	display: block;
	border-radius: 10px;
	margin: auto;
}

.float-img {
	float: right;
	clear: right;
	margin-right: 10px;
	margin-bottom: 5px;
	border: solid black;
	padding: 2px;
}

.content p {
	font-family: sans-serif;
	font-size: 18px;
	color: black;
	margin-top: 20px;
}

.button {
	margin-top: 40px;
}

.button a {
	color: navy;
	background-color: aqua;
	border: 1px solid #222;
	padding: 10px 35px;
	text-decoration: none;
	letter-spacing: 1px;
	font-size: 22px;
	text-transform: uppercase;
}
</style>
</head>
<body>
	<section>
		<div class="about-us">
			<h1>Aboutus</h1>
			<img src="https://images.unsplash.com/photo-1566073771259-6a8506099945?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8aG90ZWxzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
				width="350" height="240" alt="picture of hotel" class="float-img" />
			<div class="content">
				<p>Virtusa hotel, India’s Strongest Brand across industries and
					sectors*, is an iconic hospitality brand from the Indian Hotels
					Company Limited. The brand continues to be one of the most revered
					and loved hospitality brands with a legacy of over 116 years of
					impeccable service and genuine warmth. Embodying the spirit of
					“Tajness”, authentic original palaces, landmark hotels, idyllic
					resorts and natural safari lodges interpret the tradition of
					hospitality in a refreshingly modern way to create unique
					experiences and lifelong memories.</p>
			</div>
			<div class="button">
				<a href="#">Readmore</a>
			</div>
	<div class="social">
      <a href=""><i class="fab-fa-facebook-f"></i></a>
      <a href=""><i class="fab-fa-twitter"></i></a>
      <a href=""><i class="fab-fa-instagram"></i></a>
    </div>
		</div>
	</section>
</body>

</html>


