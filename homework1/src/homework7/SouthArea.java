package homework7;

import javax.swing.*;
import java.awt.*;

public class SouthArea extends JPanel {

    private JButton exit;

    SouthArea() {
        configureSouthArea();
    }

    private void configureSouthArea() {
        exit = new JButton("Exit");
        exit.setPreferredSize(new Dimension(772,35));
        add(exit);
    }
}
