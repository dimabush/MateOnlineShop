<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Products</title>
</head>
<body>
<%
    PrintWriter printWriter = response.getWriter();
    printWriter.write("<center>");
    printWriter.write("<table border=\"1\">\n" +
            "    <h2>All products list</h2>\n" +
            "    <tr>\n" +
            "        <th>Title</th>\n" +
            "        <th>Description</th>\n" +
            "        <th>Price</th>\n" +
            "    </tr>");
    List<Product> allProduct = (List<Product>) request.getAttribute("allProducts");
    for (Product product : allProduct) {
        printWriter.write("<tr>");
        printWriter.write("<td>" + product.getName() + "</td>");
        printWriter.write("<td>" + product.getDescription() + "</td>");
        printWriter.write("<td>" + product.getPrice() + "</td>");
        printWriter.write("</tr>");
    }
    printWriter.write("</center>");
    printWriter.write("</table>");
%> <br/>
<a href="/addproduct">Add new product</a> <br/>
<form action="users" method="get">
    <button>Users list</button>
</form>

</body>
</html>
