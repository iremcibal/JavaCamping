package Ders5.Business.Concretes;

import Ders5.Business.Abstracts.UserService;
import Ders5.Core.Abstracts.EmailService;
import Ders5.DataAccess.Abstracts.UserDao;
import Ders5.Entities.Concretes.User;

public class UserManager implements UserService {
    private UserDao userDao;
    private EmailService emailService;

    public UserManager(UserDao userDao, EmailService emailService) {
        this.userDao = userDao;
        this.emailService = emailService;
    }

    //Birbirlerinin alternatifi olsaydı bu if'ler böyle yazılması doğru olmazdı
    @Override
    public void addNewUser(User user) {
        if(user.getFirstName().isEmpty() || user.getLastName().isEmpty() || user.getPassword().isEmpty()){
            System.out.println("Lütfen tüm bilgileri eksiksiz girin");
            return;
        }
        if( user.getPassword().length() < 6) {
            System.out.println("Girilen şifre en az 6 karakter olmak zorunda");
            return;
        }
        if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("Ad ve soyad bilgileri en az 2 karakter olmak zorunda");
            return;
        }
        if(!this.emailService.isValidEmail(user.geteMail())){
            System.out.println("Lütfen geçerli bir email girin");
            return;
        }
        if(this.userDao.getUser(user.geteMail())) {
            System.out.println(user.geteMail() + " mail adresi ile zaten kayıt mevcut");
            return;
        }
        System.out.println("Normal giriş için tüm şartlar sağlandı");
        this.emailService.sendLinkForMail(user.geteMail());
        System.out.println("------------------------------------");
        this.emailService.activateLinkForMail(user.geteMail());
        this.userDao.addNewUser(user);
    }
}
