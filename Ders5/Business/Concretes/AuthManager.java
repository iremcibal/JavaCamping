package Ders5.Business.Concretes;

import Ders5.Business.Abstracts.AuthService;
import Ders5.Core.Abstracts.EmailService;
import Ders5.DataAccess.Abstracts.UserDao;
import Ders5.Entities.Concretes.User;

public class AuthManager  implements AuthService {
    private EmailService emailService;
    private UserDao userDao;

    public AuthManager(EmailService emailService, UserDao userDao) {
        this.emailService = emailService;
        this.userDao = userDao;
    }

    @Override
    public void login(User user) {
        if(user.geteMail().isEmpty() || user.getPassword().isEmpty()){
            System.out.println("Email ve password alanları boş bırakılamaz");
            return;
        }
        if(!this.emailService.isValidEmail(user.geteMail())){
            System.out.println("Lütfen geçerli bir email adresi giriniz");
            return;
        }
        if(!this.userDao.getUser(user.geteMail())){
            System.out.println(user.geteMail() + " bu kullanıcı ile bir kayıt mevcut değil");
            return;
        }
        String message = this.userDao.login(user);
        System.out.println(message);
    }

    @Override
    public void logout(User user) {
        String message = this.userDao.logOut(user);
        System.out.println(message);
    }
}