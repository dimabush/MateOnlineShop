package service.impl;

import Factory.ProductDaoFactory;
import dao.ProductDao;
import model.Product;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
  private static ProductDao productDao = ProductDaoFactory.getInstance();

  @Override
  public void addProduct(Product product) {
    productDao.addProduct(product);
  }

  @Override
  public List<Product> getAll() {
    return productDao.getAll();
  }
}
