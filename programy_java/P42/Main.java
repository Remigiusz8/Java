package lekcja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame {
    String content = "test";

    Main() {
        super("Program");

        JMenuBar menu = new JMenuBar();

        ArrayList<JMenu> menuOption = new ArrayList<>();

        for(int x = 0; x<5; x++) {
            menuOption.add(new JMenu("Kolumna "+x));
            for(int y = 0; y<8; y++) {
                JMenuItem item = new JMenuItem("Opcja "+y);
                item.addActionListener(this::getAction);
                item.setActionCommand(item.getName());
                menuOption.get(x).add(item);
            }
            menu.add(menuOption.get(x));
        }

        setJMenuBar(menu);
        setSize(800,  600);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0,70, getSize().width, getSize().height);
        g.drawString(content, getSize().width/2, getSize().height/2);
    }

    public void getAction(ActionEvent ev) {
        content = ev.getActionCommand();

        System.out.println(content);
        repaint();
    }

    public static void main(String[] args) {
        new Main();
    }
}
