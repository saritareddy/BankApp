<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

 <div>
 <form action="<c:url value='j_spring_security_check' />" method="post" >
  <div class="container" style="color: red">
 ${message}
 </div>
 	<div>
 		<label>UserName:</label>
 		<input type="text" id="userName" name="userName" />
 		<br/>
 		<label>Password:</label>
 		<input type="password" id="pwd" name="pwd"/>
 	<br/>
 	<input type="submit" value="submit"/>
 	</div>
 
 </form> 
 
 </div>
</body>
</html>