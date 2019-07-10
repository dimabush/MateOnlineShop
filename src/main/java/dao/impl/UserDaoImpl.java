package dao.impl;

import dao.UserDao;
import model.User;

import java.util.LinkedList;
import java.util.List;

public class UserDaoImpl implements UserDao {
  public static final List<User> USERS = new LinkedList<User>();

  @Override
  public void addUser(User user) {
    USERS.add(user);
  }

  @Override
  public List<User> getAll() {
    return USERS;
  }
}
