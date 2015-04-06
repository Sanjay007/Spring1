<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${msg } </h1>

<table width="200" border="0">

<form action="saveUser" method="post">
  <tr>
    <td>Email</td>
    <td><label for="textfield"></label>
    <input type="text" name="email" id="textfield" /></td>
  </tr>
  
  <tr>
    <td>Fname</td>
    <td><label for="textfield"></label>
    <input type="text" name="fname" id="textfield" /></td>
  </tr>
  <tr>
    <td>LName</td>
    <td><label for="textfield"></label>
    <input type="text" name="lname" id="textfield" /></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><input type="submit" name="button" id="button" value="Submit" /></td>
  </tr>
</table>
</form>
</body>
</html>