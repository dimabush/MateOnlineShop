<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Products</title>
</head>
<body>

<center>
    <table border="1">
        <h2>All products list</h2>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Price</th>
        </tr>
        <tr>
            <c:forEach var="product" items="${allProducts}">
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getPrice()}</td>
            <td>
                <form action="editProduct" method="post">
                    <button name="editProduct" type="submit" value="${product.getId()}">Edit</button>
                </form>
                <form action="removeProduct" method="post">
                    <button name="removeProduct" type="submit" value="${product.getId()}">Remove</button>
                </form>
            </td>
        </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="/addproduct">Add new product</a> <br/>
    <form action="users" method="get">
        <button>Users list</button>
    </form>
</center>

</body>
</html>
