package homework7;

import javax.swing.*;
import java.awt.*;

public class TextFieldAndScrollBar extends JPanel{

    private JTextArea textField;
    private JScrollPane scrollBar;

    TextFieldAndScrollBar() {
        configureTextField();
        constructTextFieldAndScrollBar();
    }

    private void constructTextFieldAndScrollBar() {
        add(scrollBar);
    }

    private void configureTextField() {
        textField = new JTextArea();
        scrollBar = new JScrollPane(textField);
        textField.setLineWrap(true);
        textField.setColumns(50);
        textField.setRows(30);
    }
}
