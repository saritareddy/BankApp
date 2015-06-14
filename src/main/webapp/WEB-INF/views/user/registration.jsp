<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<form action="register" method="post">
FirstName: <input type="text" name="firstname"/> <br/>
LastName:  <input type="text" name="lastname"/><br/>
email:   &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; <input type="text" name="email"/><br/>
password: &nbsp; <input type="password" name="custPwd"/><br/>
phone:   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;<input type="text" name="phone"/><br/>
<input type="submit" name="submit" value="register"/><br/>
</form>

</body>
</html>