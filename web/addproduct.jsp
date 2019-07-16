<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>

<center>
    <form action="addproduct" method="post">
        <h3> Adding product </h3>
        Product name <input name="name" type="text"> <br>
        Description <input name="description" type="text"> <br>
        Price <input name="price" type="number" step="0.01"> <br>
        <button type="submit"> Add</button>
        <br/>
        <a href="/products">All products</a>
    </form>
    <h3>${isEmpty}</h3>
</center>

</body>
</html>
