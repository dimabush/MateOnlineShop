<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<center>
    Welcome! You can register here

    <a href="/register">Registration</a>
</center>
<center>
    Or you can signing in
<form action="/users" method="post">
    <input name="email" placeholder="Email" type="email"/>
    <input name="password" placeholder="Password" type="password"/>
    <button type="submit">Sign in</button>
</form>
</center>
</body>
</html>
