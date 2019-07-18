package dao;

import model.Product;

import java.util.List;

public interface ProductDao {
  void addProduct(Product product);
  List<Product> getAll();
  boolean remove(Long id);
}
