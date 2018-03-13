<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
    
<head>
<style>
ul#menu {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
</style>
</head>

<body> 
<div>
 
 <ul id="menu">
  <li><a href="${pageContext.request.contextPath}/">Home</a></li>
  <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
 </ul>
    
</div> 
</body> 