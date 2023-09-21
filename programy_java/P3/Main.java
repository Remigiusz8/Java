package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Actions {
    draw,
    clear,
}

public class Main implements ActionListener {
    JFrame frame = new JFrame("App");
    boolean circlePainted = true;

    JPanel panel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            if (circlePainted) {
                g.setColor(Color.RED);
                int x = 175;
                g.fillOval(x, x, 50, 50);
            }
        }
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400,400);
        }
    };

    public Main() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem draw = new JMenuItem("Draw circle");
        JMenuItem clear = new JMenuItem("Clear screen");

        draw.setActionCommand(Actions.draw.name());
        draw.addActionListener(this);
        clear.setActionCommand(Actions.clear.name());
        clear.addActionListener(this);

        file.add(draw);
        file.add(clear);
        menuBar.add(file);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String cmd = actionEvent.getActionCommand();

        if (cmd.equals(Actions.draw.name())) {
            circlePainted = true;
            panel.repaint();
        } else if (cmd.equals(Actions.clear.name())) {
            circlePainted = false;
            panel.repaint();
        }
    }

    public static void main(String[] args) {
	    new Main();
    }

}
