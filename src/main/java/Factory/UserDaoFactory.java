package Factory;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserDaoFactory {
  private static UserDao instance;

  public static synchronized UserDao getInstance() {
    if (instance == null) {
      instance = new UserDaoImpl();
    }
    return instance;
  }
}
