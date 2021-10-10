package homework7;

import javax.swing.*;
import java.awt.*;

public class EastArea extends JPanel{

    private JButton info;

    EastArea() {
        configureEastButton();
    }

    private void configureEastButton() {
        info = new JButton("Info");
        info.setPreferredSize(new Dimension(100,482));
        add(info);
    }
}
