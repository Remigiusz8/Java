/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cw96;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Aplikacja extends JFrame implements ActionListener {
    
    Grafika oknoG = new Grafika();
    static String cmd="Start";
    
    public Aplikacja() {
        super("Aplikacja z menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Plik");
        JMenu menu2 = new JMenu("Menu 2");
        JMenu menu3 = new JMenu("Menu 3");
        JMenuItem menuItem11 = new JMenuItem("Zamknij");
        menuItem11.addActionListener(this);
        menu1.add(menuItem11);
        JMenuItem menuItem21 = new JMenuItem("Pozycja 2 1");
        JMenuItem menuItem22 = new JMenuItem("Pozycja 2 2");
        menuItem21.addActionListener(this);
        menuItem22.addActionListener(this);
        menu2.add(menuItem21);
        menu2.add(menuItem22);
        JMenuItem menuItem31 = new JMenuItem("Pozycja 3 1");
        JMenuItem menuItem32 = new JMenuItem("Pozycja 3 2");
        JMenuItem menuItem33 = new JMenuItem("Pozycja 3 3");
        menuItem31.addActionListener(this);
        menuItem32.addActionListener(this);
        menuItem33.addActionListener(this);
        menu3.add(menuItem31);
        menu3.add(menuItem32);
        menu3.add(menuItem33);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        setJMenuBar(menuBar);
        setSize(320, 200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        cmd = e.getActionCommand();
        //System.out.println(cmd);
        oknoG.wid=true;
        oknoG.odswiez();
        if ("Zamknij".equals(cmd)){
            dispose();
            oknoG.dispose();
        }
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Aplikacja();
                
            }
        });
    }
}
