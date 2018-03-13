<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style>
.black {
 	color: black;
 }
 
img#bg {
  position: fixed;
  top: 40px;
  left: 0;
  width: 100%;
  height: 100%;
  }
  
  div#opacity {
    background: rgba(240,248,255,0.4);
 }

</style>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	
	<img id="bg" alt="beach" src="images/bg.jpg"/>
	<jsp:include page="_menu.jsp"></jsp:include>
	
	<div class="wrapper" id="opacity">
	<div class="container">
		<h1 class="black">Home Page</h1>
		This is demo Simple web application using jsp,servlet &amp; Jdbc.
	</div>
	

	<jsp:include page="_footer.jsp"></jsp:include>

	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
	
	</div>
</body>
</html>