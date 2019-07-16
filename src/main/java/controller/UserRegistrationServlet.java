package controller;

import Factory.UserServiceFactory;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;

@WebServlet(value = "/register")
public class UserRegistrationServlet extends HttpServlet {

  private static UserService userService = UserServiceFactory.getInstance();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("register.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String email = req.getParameter("email");
    String password = req.getParameter("password");
    String repeatPassword = req.getParameter("repeatPassword");
    if (email.isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
      req.setAttribute("isEmpty", "All fields should be filled");
      req.setAttribute("correntEmail", email);
      req.getRequestDispatcher("register.jsp").forward(req, resp);
    }
    if (!password.equals(repeatPassword)) {
      req.setAttribute("notEquals", "Passwords do not match");
      req.setAttribute("correntEmail", email);
      req.getRequestDispatcher("register.jsp").forward(req, resp);
    } else {
      User user = new User(email, password);
      userService.addUser(user);
      resp.sendRedirect("/addproduct");
    }
  }
}
