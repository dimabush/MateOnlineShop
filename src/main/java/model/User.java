package model;

public class User {

  private Long id;
  private String mail;
  private String password;

  public User(Long id, String mail, String password) {
    this.id = id;
    this.mail = mail;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", mail='" + mail + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
