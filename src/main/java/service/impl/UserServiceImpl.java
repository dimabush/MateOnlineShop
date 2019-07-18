package service.impl;

import Factory.UserDaoFactory;
import dao.UserDao;
import model.User;
import service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
  private static UserDao userDao = UserDaoFactory.getInstance();

  @Override
  public void addUser(User user) {
    userDao.addUser(user);
  }

  @Override
  public List<User> getAll() {
    if (userDao.getAll().isEmpty()){
      addUser(new User("test@gmail.com","test", "ADMIN"));
    }
    return userDao.getAll();
  }

  @Override
  public boolean remove(Long id) {
    return userDao.remove(id);
  }

  @Override
  public Optional<User> findUserByEmail(String email) {
    return userDao.findUserByEmail(email);
  }
}
