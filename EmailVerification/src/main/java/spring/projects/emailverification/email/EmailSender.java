package spring.projects.emailverification.email;

public interface EmailSender {

    void send(String to, String email);
}
