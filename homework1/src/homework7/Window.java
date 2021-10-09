package homework7;

// 5) Практика: потренироваться создавать окна и элементы окна

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private int winWidth = 800;
    private int winHeight = 600;
    private int winPositionX = 500;
    private int winPositionY = 250;

    private NorthLabel northLabel;
    private TextFieldAndScrollBar area1;
    private EastArea eastArea;
    private WestArea westArea;
    private SouthArea southArea;


    Window(){
        configureWindow();

        northLabel = new NorthLabel();
        add(northLabel, BorderLayout.NORTH);

        area1 = new TextFieldAndScrollBar();
        add(area1, BorderLayout.CENTER);

        eastArea = new EastArea();
        add(eastArea, BorderLayout.EAST);

        westArea = new WestArea();
        add(westArea, BorderLayout.WEST);

        southArea = new SouthArea();
        add(southArea, BorderLayout.SOUTH);

        setVisible(true);
    }


    private void configureWindow() {
        setLocation(winPositionX, winPositionY);
        setSize(winWidth, winHeight);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Тест1 - блокнот");
        setResizable(false);
    }
}
