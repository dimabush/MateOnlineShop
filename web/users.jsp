<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page import="model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All users</title>
</head>
<body>

<%
    PrintWriter printWriter2 = response.getWriter();
    printWriter2.write("<center>");
    printWriter2.write("<a href=\"/register\">Register new user</a>");
    printWriter2.write("</center>");
%>

<%
    PrintWriter printWriter = response.getWriter();
    printWriter.write("<center>");

    printWriter.write("<table>\n" +
            "    <tr>\n" +
            "        <th>Email</th>\n" +
            "        <th>Password</th>\n" +
            "    </tr>");
    List<User> allUser = (List<User>) request.getAttribute("allUsers");
    for (User user : allUser) {
        printWriter.write("<tr>");
        printWriter.write("<td>" + user.getMail() + "</td>");
        printWriter.write("<td>" + user.getPassword() + "</td>");
        printWriter.write("</tr>");
    }
    printWriter.write("</center>");
    printWriter.write("</table>");
%> <br/>

<form action="products" method="get">
    <button>All products</button>
</form>

</body>
</html>
