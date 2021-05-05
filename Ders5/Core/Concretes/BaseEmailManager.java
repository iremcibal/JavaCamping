package Ders5.Core.Concretes;

import Ders5.Core.Abstracts.EmailService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseEmailManager implements EmailService {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    @Override
    public boolean isValidEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }//E-mail standartlarına uyuyor mu

    @Override
    public void sendLinkForMail(String email) {
        System.out.println(email + " adresine aktivasyon linki gönderilmiştir");
    }

    @Override
    public void activateLinkForMail(String email) {
        System.out.println(email + " için aktivasyon işlemi tamamlanmıştır.");
    }
}