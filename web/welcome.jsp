<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<!-- Created By CodingNepal - www.codingnepalweb.com -->
<html lang="en" dir="ltr">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title> Website Layout | CodingLab</title>
	<link rel="stylesheet" href="style.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
<style>
	.picture-container {
		width: 100%;
		height: 200px;
		overflow: hidden;
		position: absolute;
		top: 30%;
		left: 80%;
		transform: translate(-50%, -50%);
	}

	.picture-container img {
		position: absolute;
		top: 0;
		left: 0;
		opacity: 0;
		transition: opacity 0.5s ease-in-out;
	}

	.picture-container img.active {
		opacity: 1;
	}

	@keyframes slide {
		0% { left: 0; }
		100% { left: -100%; }
	}

	.greeting {
		text-align: center;
		margin-top: 20px;
	}
</style>

	<script>
		window.addEventListener("DOMContentLoaded", function() {
			var images = document.querySelectorAll(".picture-container img");
			var currentIndex = 0;

			function showImage(index) {
				// Remove the "active" class from all images
				for (var i = 0; i < images.length; i++) {
					images[i].classList.remove("active");
				}

				// Add the "active" class to the image at the given index
				images[index].classList.add("active");

				// Increment index for the next image
				currentIndex = (currentIndex + 1) % images.length;

				// Wait for 3 seconds and show the next image
				setTimeout(function() {
					showImage(currentIndex);
				}, 3000);
			}

			// Start the image slideshow
			showImage(currentIndex);
		});

	</script>

</head>
<body>
<%--<nav>--%>
<%--	<div class="menu">--%>
<%--		<div class="logo">--%>
<%--			<a href="#">Medical Center System</a>--%>
<%--		</div>--%>
<%--		<ul>--%>
<%--			<li><a href="#">Home</a></li>--%>
<%--			<li><a href="#">About</a></li>--%>
<%--			<li><a href="#">Services</a></li>--%>
<%--			<li><a href="#">Contact</a></li>--%>
<%--			<li><a href="#">Feedback</a></li>--%>
<%--		</ul>--%>
<%--	</div>--%>
<%--</nav>--%>
<%@ include file="header.jsp" %>
<%--<div class="img"></div>--%>
<%--<div class="center">--%>
<%--	<div class="title">Welcome to you in our website</div>--%>
<%--	<div class="sub_title">For provideing medical services to th patients</div>--%>
<%--</div>--%>

<div class="picture-container">
	<img src="images/asd.jpg" alt="Image 1">
	<img src="images/asd2.jpg" alt="Image 2">
	<img src="images/appointment_girl.JPEG" alt="Image 3">
</div>

<div class="greeting">
	<h2>Welcome to you in our system!</h2>
</div>

</body>
</html>