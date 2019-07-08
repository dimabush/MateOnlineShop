<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<center>
    <form action="register" method="post">
        Email <input name="email" type="email"> <br>
        Password <input name="password" type="password"> <br>
        Repeat password <input name="repeatPassword" type="password"> <br>
        <button type="submit"> Register</button>
    </form>
    <h3>${isEmpty}</h3>
    <h3>${notEquals}</h3>
</center>
</body>
</html>
