package Ders5.DataAccess.Abstracts;

import Ders5.Entities.Concretes.User;

public interface UserDao {
    void addNewUser(User user);
    String login(User user);
    String logOut(User user);
    boolean getUser(String email);

}
