<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Login</title>
<style>

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
 
 .black {
 	color: black;
 }
 
 input[type=text] {
    background-color: rgba(176,196,222,0.4);
    color: white;
 }

 input[type=password] {
    background-color: rgba(176,196,222,0.4);
    color: white;
 }

 button#blk {
 	color: rgb(135,206,235);
 }
  
</style>
<link rel="stylesheet" href="css/style.css">
</head>
<body >
	<img id="bg" alt="beach" src="images/bg.jpg"/>
	<jsp:include page="_menu.jsp"></jsp:include>
	
	<div class="wrapper" id="opacity">
	<div class="container">
		<h1 class="black">Welcome</h1>
		<p style="color: red;">${errorString}</p>
		<form class="form" method="POST" action="${pageContext.request.contextPath}/login">
			<input type="text" name="userName" value="${user.userName}" placeholder="Username">
			<input type="password" name="password" value="${user.password}" placeholder="Password">
			<button id="blk" type="submit" value="Submit" id="login-button">Login</button>
		</form>
	</div>
	
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
	<jsp:include page="_footer.jsp"></jsp:include>
	
</div>


</body>
</html>