package Ders5.Business.Abstracts;

import Ders5.Entities.Concretes.User;

public interface AuthService {
    void login(User user);
    void logout(User user);

}
