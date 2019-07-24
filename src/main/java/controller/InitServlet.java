package controller;

import Factory.UserServiceFactory;
import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(value = "/", loadOnStartup = 1)
public class InitServlet extends HttpServlet {

  private static final UserService userService = UserServiceFactory.getInstance();

  @Override
  public void init() throws ServletException {
    userService.addUser(new User("admin@gmail.com","admin", "ADMIN"));
    userService.addUser(new User("user@gmail.com","user", "USER"));
  }
}
