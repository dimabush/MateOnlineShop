package dao.impl;

import dao.UserDao;
import model.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
  public static final List<User> users = new LinkedList<User>();

  @Override
  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public List<User> getAll() {
    return users;
  }

  @Override
  public boolean remove(Long id) {
    for (User user : getAll()) {
      if (user.getId() == id){
        getAll().remove(user);
        return true;
      }
    }
    return false;
  }

  @Override
  public Optional<User> findUserByEmail(final String email) {
    return users.stream().filter(user -> user.getMail().equals(email)).findFirst();
  }
}
