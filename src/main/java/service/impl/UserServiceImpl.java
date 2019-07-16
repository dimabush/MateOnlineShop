package service.impl;

import Factory.UserDaoFactory;
import dao.UserDao;
import model.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
  private static UserDao userDao = UserDaoFactory.getInstance();

  @Override
  public void addUser(User user) {
    userDao.addUser(user);
  }

  @Override
  public List<User> getAll() {
    if (userDao.getAll().isEmpty()){
      addUser(new User("test@gmail.com","test"));
    }
    return userDao.getAll();
  }

  @Override
  public boolean remove(long id) {
    for (User user : getAll()) {
      if(user.getId().equals(id)){
        getAll().remove(user);
        return true;
      }
    }
    return false;
  }

}
