package controller;

import Factory.UserServiceFactory;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/remove")
public class RemoveUserServlet extends HttpServlet {
  private static UserService userService = UserServiceFactory.getInstance();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    Long id = Long.valueOf(req.getParameter("remove"));
    String id2 = req.getParameter("remove");

    userService.remove(id);

    System.out.println("THIS IS id : " + id);
    System.out.println(id2);
    resp.sendRedirect("/users");
  }
}
