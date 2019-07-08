package controller;

import dao.DataBase;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;


@WebServlet(value = "/register", loadOnStartup = 12)
public class UserRegistrationServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("register.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (req.getParameter("email").isEmpty()
        || req.getParameter("password").isEmpty()
        || req.getParameter("repeatPassword").isEmpty()) {
      req.setAttribute("isEmpty", "All fields should be filled");
      req.getRequestDispatcher("register.jsp").forward(req, resp);
      resp.sendRedirect("/register");
    }
    String email = req.getParameter("email");
    String password = req.getParameter("password");
    String repeatPassword = req.getParameter("repeatPassword");
    if (!password.equals(repeatPassword)) {
      req.setAttribute("notEquals", "Passwords do not match");
      req.getRequestDispatcher("register.jsp").forward(req, resp);
    } else {
      User user = new User(1L, email, password);
      DataBase.USERS.add(user);
      System.out.println(DataBase.USERS.toString());
      resp.sendRedirect("/addproduct");
    }
  }
}
