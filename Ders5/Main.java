package Ders5;

import Ders5.Business.Abstracts.AuthService;
import Ders5.Business.Concretes.AuthManager;
import Ders5.Business.Concretes.UserManager;
import Ders5.Core.Abstracts.AddUserService;
import Ders5.Core.Abstracts.EmailService;
import Ders5.Core.Concretes.AddUserForGoogle;
import Ders5.Core.Concretes.BaseEmailManager;
import Ders5.DataAccess.Abstracts.UserDao;
import Ders5.DataAccess.Concretes.HibernateUserDao;
import Ders5.Entities.Concretes.User;

public class Main {

    public static void main(String[] args) {
        User user = new User(1,"İrem","Balci","iremcibal@gmail.com","1234567");

        UserDao userDao = new HibernateUserDao();
        EmailService emailService = new BaseEmailManager();
        UserManager userManager = new UserManager(userDao,emailService);
        userManager.addNewUser(user);
        System.out.println("**********************************************************************");
        User userforgoogle = new User(2,"İrem","Balcı","info@irembalci.com","1245780");
        AddUserService userService = new AddUserForGoogle(emailService,userDao);
        userService.addNewUser(userforgoogle);
        userService.addNewUser(userforgoogle);

        AuthService authService = new AuthManager(emailService,userDao);
        authService.login(user);

    }
}
