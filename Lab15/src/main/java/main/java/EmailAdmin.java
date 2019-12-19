package main.java;

import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;

public class EmailAdmin {
    public static String showMessages(final String userEmail, final String password) throws MessagingException, IOException {
        String host = "pop.gmail.com";
        Properties properties = new Properties();
        properties.put("mail.pop3.host", host);
        properties.put("mail.pop3.port", "995");
        properties.put("mail.pop3.starttls.enable", "true");

        Store store = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userEmail, password);
            }
        }).getStore("pop3s");
        store.connect(host, userEmail, password);
        Folder folder = store.getFolder("INBOX");
        folder.open(Folder.READ_ONLY);

        StringBuilder result = new StringBuilder();
        for (Message message: folder.getMessages()) {
            result.append("<div>");
            result.append("<p>").append(InternetAddress.toString(message.getFrom())).append("</p>");
            result.append("<p>").append(message.getSubject()).append("</p>");
            result.append("<p>").append(message.getContent()).append("</p>");
            result.append("<p>").append(message.getSentDate()).append("</p>");
            result.append("</div>");
            result.append("</br>");
        }

        folder.close(true);
        store.close();

        return result.toString();
    }
}
