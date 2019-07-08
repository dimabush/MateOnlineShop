package dao.impl;

import dao.ProductDao;
import model.Product;

import java.util.LinkedList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
  public static final List<Product> PRODUCTS = new LinkedList<Product>();

  @Override
  public void addProduct(Product product) {
    PRODUCTS.add(product);
  }

  @Override
  public List<Product> getAll() {
    return PRODUCTS;
  }
}
