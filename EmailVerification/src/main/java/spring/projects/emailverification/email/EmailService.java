package spring.projects.emailverification.email;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
//import java.util.logging.Logger;

@Service
@AllArgsConstructor
public class EmailService implements EmailSender {

    private final static Logger LOGGER = LoggerFactory.getLogger(EmailService.class);
    private final static String CONFIRM_EMAIL_MSG = "Please confirm your email";
    private final static String EMAIL_SEND_MSG = "Failed to send email";
    private final static String MY_EMAIL = "af4092@ajou.ac.kr";

    private final JavaMailSender mailSender;
    @Override
    @Async
    public void send(String to, String email) {

        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper =
                    new MimeMessageHelper(mimeMessage, "utf-8");
            helper.setText(email, true);
            helper.setTo(to);
            helper.setSubject(CONFIRM_EMAIL_MSG);
            helper.setFrom(MY_EMAIL);
        } catch (MessagingException e) {
//            e.printStackTrace();
            LOGGER.error(EMAIL_SEND_MSG, e);
//            LOGGER.log("Failed to send email", e);
            throw new IllegalStateException(EMAIL_SEND_MSG);
        }
    }

    @Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
}
