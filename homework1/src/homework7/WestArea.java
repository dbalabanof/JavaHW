package homework7;

import javax.swing.*;
import java.awt.*;

public class WestArea extends JPanel{

    private JButton save;

    WestArea() {
        configureWestArea();
    }

    private void configureWestArea() {
        save = new JButton("Save");
        save.setPreferredSize(new Dimension(100,482));
        add(save);
    }
}
