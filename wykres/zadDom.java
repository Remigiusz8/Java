/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wykres;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class zadDom extends JFrame implements ActionListener {
    double a=2, b=1, c=0;
    boolean czysc = true;
    public zadDom() {
        super("Daniel Kałuża");
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Wykres");
        JMenu menu2 = new JMenu("f(x) = ax^2 + bx + c");
        menu2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                czysc=false;
                repaint();
            }
        });
        JMenuItem menuItem2 = new JMenuItem("Rysuj");
        JMenuItem menuItem3 = new JMenuItem("Zamknij");

        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                czysc=true;
                repaint();
            }
        });
        menu1.add(menu2);
        menu1.add(menuItem2);
        menu1.add(menuItem3);

        JMenu menuA = new JMenu("A");
        JMenu menuB = new JMenu("B");
        JMenu menuC = new JMenu("C");

        menu2.add(menuA);
        menu2.add(menuB);
        menu2.add(menuC);

        JMenuItem menuA1 = new JMenuItem("10");
        JMenuItem menuA2 = new JMenuItem("0");
        JMenuItem menuA3 = new JMenuItem("-5");
        menuA1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = 10;
                czysc=false;
                repaint();
            }
        });
        menuA2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = 0;
                czysc=false;
                repaint();
            }
        });
        menuA3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = -5;
                czysc=false;
                repaint();
            }
        });
        menuA.add(menuA1);
        menuA.add(menuA2);
        menuA.add(menuA3);

        JMenuItem menuB1 = new JMenuItem("10");
        JMenuItem menuB2 = new JMenuItem("0");
        JMenuItem menuB3 = new JMenuItem("-5");

        menuB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = 10;
                czysc=false;
                repaint();
            }
        });
        menuB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = 0;
                czysc=false;
                repaint();
            }
        });
        menuB3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = -5;
                czysc=false;
                repaint();
            }
        });
        menuB.add(menuB1);
        menuB.add(menuB2);
        menuB.add(menuB3);

        JMenuItem menuC1 = new JMenuItem("10");
        JMenuItem menuC2 = new JMenuItem("0");
        JMenuItem menuC3 = new JMenuItem("-5");

        menuC1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = 10;
                czysc=false;
                repaint();
            }
        });
        menuC2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = 0;
                czysc=false;
                repaint();
            }
        });
        menuC3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = -5;
                czysc=false;
                repaint();
            }
        });
        menuC.add(menuC1);
        menuC.add(menuC2);
        menuC.add(menuC3);

        menuBar.add(menu1);
        setJMenuBar(menuBar);

    }


    public void linie (Graphics g){
        g.setColor(Color.blue);
        g.drawLine((getWidth()/2)+200,(getHeight()/2),(getWidth()/2)-200,getHeight()/2);
        g.drawLine(getWidth()/2,(getHeight()/2)+200,getWidth()/2,(getHeight()/2)-200);
    }

    public void grafika(Graphics g) {
        g.setColor(Color.red);
        for (double x=(-100);x<=100;x = x+0.1){
            double y = a * x * x + b * x + c;
            int X = (int)Math.round(((getWidth()/2))+5 + x*20);
            int Y = (int)Math.round((700-getHeight()/2) - y*20);
            g.fillOval((X-2),Y-2,4,4);
        }
    }

    public void paint (Graphics g){
        super.paint(g);
        g.clearRect(0, 70, getSize().width, getSize().height);
        linie(g);
        if(czysc) {
            grafika(g);
        }
    }

    static String cmd;
    public void actionPerformed(ActionEvent e) {
        cmd = e.getActionCommand();
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new zadDom();
            }
        });
    }
}