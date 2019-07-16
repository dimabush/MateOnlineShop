package dao.impl;

import dao.ProductDao;
import model.Product;

import java.util.LinkedList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
  public static final List<Product> products = new LinkedList<Product>();

  @Override
  public void addProduct(Product product) {
    products.add(product);
  }

  @Override
  public List<Product> getAll() {
    return products;
  }

  @Override
  public boolean remove(Long id) {
    for (Product product: getAll()) {
      if (product.getId() == id){
        getAll().remove(product);
        return true;
      }
    }
    return false;
  }
}
