package dao;

import model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
  void addUser(User user);
  List<User> getAll();
  boolean remove(Long id);

  Optional<User> findUserByEmail(String email);
}
