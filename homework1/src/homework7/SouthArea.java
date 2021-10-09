package homework7;

import javax.swing.*;
import java.awt.*;

public class SouthArea extends JPanel {

    private JButton exit;

    SouthArea() {
        configureSouthArea();
        constructSouthArea();
    }

    private void configureSouthArea() {
        exit = new JButton("Exit");
        exit.setPreferredSize(new Dimension(772,35));
    }

    private void constructSouthArea() {
        add(exit);
    }
}
