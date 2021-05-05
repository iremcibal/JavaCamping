package Ders5.DataAccess.Concretes;

import Ders5.DataAccess.Abstracts.UserDao;
import Ders5.Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    public List<User> userList = new ArrayList<User>();
    @Override
    public void addNewUser(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı sisteme kaydoldu");
        userList.add(user);
    }

    @Override
    public String login(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı başarılı bir şekilde oturum açtı");
        return "Login işlemi sonucunda token oluşturuldu";
    }

    @Override
    public String logOut(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı başarılı bir çıkış yaptı");
        return "Logout işlemi sonucunda token silindi";
    }

    @Override
    public boolean getUser(String email) {
        return userList.stream().filter(o -> o.geteMail().equals(email)).findFirst().isPresent();
    }
}
