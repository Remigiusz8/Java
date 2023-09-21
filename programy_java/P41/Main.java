package leckja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame {
    String content = "test";
    int a;

    Main() {
        super("Program");

        JMenuBar menu = new JMenuBar();

        JMenu square = new JMenu("Kwadrat");

        for(int y = 1; y<9; y++) {
            JMenuItem item = new JMenuItem(y+"x"+y);
            item.addActionListener(this::getAction);
            item.setActionCommand("Kwadrat "+y);

            square.add(item);
        }

        JMenu circle = new JMenu("Koło");

        for(int y = 1; y<9; y++) {
            JMenuItem item = new JMenuItem(String.valueOf(y));
            item.addActionListener(this::getAction);
            item.setActionCommand("Koło "+y);

            circle.add(item);
        }

        menu.add(square);
        menu.add(circle);

        setJMenuBar(menu);

        setSize(800,  600);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0,70, getSize().width, getSize().height);

        if(content.contains("Kwadrat")) {
            int MULTIPLIER = 50;
            a = Integer.valueOf(content.substring(content.indexOf(" ")+1))*MULTIPLIER;
            int offset = a / 10;

            int width = (getSize().width/2)-(a/2);
            int height = (getSize().height/2)-(a/2);

            int ow = (getSize().width/2)-((a-offset)/2);
            int oh = (getSize().height/2)-((a-offset)/2);


            g.fillRect(width, height, a, a);
            g.setColor(Color.orange);
            g.fillRect(ow, oh, a-offset, a-offset);

            //g.setColor(Color.BLACK);
            //g.drawString(String.valueOf(a), getSize().width/2, height);
            return;
        };

        if(content.contains("Koło")) {
            int MULTIPLIER = 50;
            a = Integer.valueOf(content.substring(content.indexOf(" ")+1))*MULTIPLIER;

            int offset = a / 10;

            int width = (getSize().width/2)-(a/2);
            int height = (getSize().height/2)-(a/2);

            int ow = (getSize().width/2)-((a-offset)/2);
            int oh = (getSize().height/2)-((a-offset)/2);


            g.fillArc(width, height, a, a, 0, 360);
            g.setColor(Color.ORANGE);
            g.fillArc(ow,oh, a-offset, a-offset, 0, 360);

            return;
        }

        g.drawString(content, getSize().width/2, getSize().height/2);
    }

    public void getAction(ActionEvent ev) {
        content = ev.getActionCommand();
        repaint();
    }

    public static void main(String[] args) {
        new Main();
    }
}
