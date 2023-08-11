package ieee.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Client {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("adi247u@gmail.com");
        message.setTo(email.getToEmail());
        message.setText(email.getBody());
        message.setSubject(email.getSubject());
        System.out.println("Mail Sent");
        mailSender.send(message);
        }
}
