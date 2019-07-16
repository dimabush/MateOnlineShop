package controller;

import Factory.UserServiceFactory;
import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/users")
public class AllUsersServlet extends HttpServlet {

  private static UserService userService = UserServiceFactory.getInstance();

  /*@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    List<User> allUsers = userService.getAll();
    req.setAttribute("allUsers", allUsers);
    req.getRequestDispatcher("users.jsp").forward(req, resp);
  }*/

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String email = req.getParameter("email");
    String password = req.getParameter("password");
    System.out.println(email + "  " + password);
    List<User> allUsers = userService.getAll();
    if (allUsers.contains(new User(email, password))){
      req.setAttribute("isPresent", "You are logged in as: " + email);
    } else {
      req.setAttribute("isPresent", "No such user");
    }
    req.setAttribute("allUsers", allUsers);
    req.getRequestDispatcher("users.jsp").forward(req, resp);
  }
}
