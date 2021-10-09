package homework7;

import javax.swing.*;
import java.awt.*;

public class NorthLabel extends JPanel {

    private JLabel welcomeMessage;

    NorthLabel() {
        configureNorthLabel();
        constructNorthLabel();
    }

    private void constructNorthLabel() {
        add(welcomeMessage);
    }

    public void configureNorthLabel() {
        welcomeMessage = new JLabel("Здравствуй, уважаемый пользователь!  Я - блокнот.  Напечатай в меня что-нибудь");
    }

}
