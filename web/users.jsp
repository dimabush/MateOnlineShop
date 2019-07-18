<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All users</title>
</head>
<body>

<center>
    <a href="/register">Register new user</a> </br>
    ${isPresent}
    <table border="1">
        <tr>
            <th>Email</th>
            <th>Password</th>
        </tr>
        <tr>
            <c:forEach var="user" items="${allUsers}">
        <tr>
            <td>${user.getMail()}</td>
            <td>${user.getPassword()}</td>
            <td>
                <form action="editUser" method="post">
                    <button name="editUser" type="submit" value="${user.getId()}">Edit</button>
                </form>
                <form action="removeUser" method="post">
                    <button name="removeUser" type="submit" value="${user.getId()}">Remove</button>
                </form>
            </td>
        </tr>
        </c:forEach>
    </table>
    <br/>
    <form action="products" method="get">
        <button>All products</button>
    </form>
</center>

</body>
</html>
