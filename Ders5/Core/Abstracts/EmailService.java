package Ders5.Core.Abstracts;

public interface EmailService {
    boolean isValidEmail(String email);
    void sendLinkForMail(String email);
    void activateLinkForMail(String email);
}
