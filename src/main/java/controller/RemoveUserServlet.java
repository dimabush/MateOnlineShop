package controller;

import Factory.UserServiceFactory;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/removeUser")
public class RemoveUserServlet extends HttpServlet {
  private static UserService userService = UserServiceFactory.getInstance();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    long id = Long.valueOf(req.getParameter("removeUser"));
    userService.remove(id);
    resp.sendRedirect("/users");
  }
}
