package Ders5.Core.Concretes;

import Ders5.Core.Abstracts.AddUserService;
import Ders5.Core.Abstracts.EmailService;
import Ders5.DataAccess.Abstracts.UserDao;
import Ders5.Entities.Concretes.User;
import Ders5.Google.GoogleManager;

public class AddUserForGoogle implements AddUserService {
    private EmailService emailService;
    private UserDao userDao;

    public AddUserForGoogle(EmailService emailService, UserDao userDao) {
        this.emailService = emailService;
        this.userDao = userDao;
    }

    @Override
    public void addNewUser(User user) {
        GoogleManager googleManager = new GoogleManager();
        if(this.userDao.getUser(user.geteMail())) {
            System.out.println(user.geteMail() + " google maili ile daha önce kayıt olunmuştur");
            return;
        }
        System.out.println("Google ile kayıt için bilgiler doğrulandı");
        this.emailService.sendLinkForMail(user.geteMail());
        System.out.println("--------------------------------");
        this.emailService.activateLinkForMail(user.geteMail());
        this.userDao.addNewUser(user);
        googleManager.addGoogleUser(user);
    }
}