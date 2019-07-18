package controller;

import Factory.ProductServiceFactory;
import service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/removeProduct")
public class RemoveProductServlet extends HttpServlet {
  private static ProductService productService = ProductServiceFactory.getInstance();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    long id = Long.valueOf(req.getParameter("removeProduct"));
    productService.remove(id);
    resp.sendRedirect("/products");
  }
}
