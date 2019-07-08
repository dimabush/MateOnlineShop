package controller;

import dao.DataBase;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;


@WebServlet(value = "/addproduct")
public class AddProductServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("addproduct.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (req.getParameter("name").isEmpty()
        || req.getParameter("description").isEmpty()
        || req.getParameter("price").isEmpty()) {
      req.setAttribute("isEmpty", "All fields should be filled");
      req.getRequestDispatcher("addproduct.jsp").forward(req, resp);
      resp.sendRedirect("/addproduct");
    }
    String name = req.getParameter("name");
    String description = req.getParameter("description");
    Double price = Double.valueOf(req.getParameter("price"));
    Product product = new Product(1L, name, description, price);
    DataBase.PRODUCTS.add(product);
    System.out.println(DataBase.PRODUCTS.toString());
  }
}
