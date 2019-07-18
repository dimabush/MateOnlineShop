<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<center>
    <form action="register" method="post">
        Email <input name="email" type="email" value=${correntEmail}> <br>
        Password <input name="password" type="password"> <br>
        Repeat password <input name="repeatPassword" type="password"> <br>
        <button type="submit"> Register</button> <br>
        <input type="radio" name="role" value="USER" checked> User<br>
        <input type="radio" name="role" value="ADMIN"> Admin<br>
    </form>
    <h3>${isEmpty}</h3>
    <h3>${notEquals}</h3>
</center>
</body>
</html>
