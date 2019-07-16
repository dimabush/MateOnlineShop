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
    printWriter2.write("</br>");
    printWriter2.write((String) request.getAttribute("isPresent"));
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

        printWriter.write("<td>" + user.getId() + "</td>");

        printWriter.write("<td>" + user.getMail() + "</td>");
        printWriter.write("<td>" + user.getPassword() + "</td>");
        printWriter.write("<td><form action=\"edit\" method=\"post\">\n" +
                "<button name=\"edit\" type=\"submit\" value=\"" + user.getId() + "\">Edit</button>\n" +
                "</form>");
        printWriter.write("<form action=\"remove\" method=\"post\">\n" +
                "<button name=\"remove\" type=\"submit\" value=\"" + user.getId() + "\">Remove</button>\n" +
                "</form></td>");
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
