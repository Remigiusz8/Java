package com.mycompany.aplikacja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Aplikacja extends JFrame implements ActionListener {

    Grafika oknoG = new Grafika();
    static String content = " ";
    int widok = 1;
    int konsola = 1;
    
 public Aplikacja() {
 super("Jakub Wencel");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 JMenuBar menuBar = new JMenuBar();
 
 JMenu menu1 = new JMenu("               ");
 JMenu menu2 = new JMenu("Komunikat");
 JMenu menu3 = new JMenu("Zamknij");
 JMenu menu4 = new JMenu("Otwórz");
 
 JMenuItem menuItem21 = new JMenuItem("Pierwszy");
 JMenuItem menuItem22 = new JMenuItem("Drugi");
 JMenuItem menuItem23 = new JMenuItem("Trzeci");
 menuItem21.addActionListener(this);
 menuItem22.addActionListener(this);
 menuItem23.addActionListener(this);
 menu2.add(menuItem21);
 menu2.add(menuItem22);
 menu2.add(menuItem23);
 
 JMenuItem menuItem31 = new JMenuItem("Teraz");
 JMenuItem menuItem32 = new JMenuItem("Grafika");
 JMenuItem menuItem33 = new JMenuItem("Konsola");
 menuItem32.setActionCommand("WyłGrafika");
 menuItem33.setActionCommand("WyłKonsola");
 menuItem31.addActionListener(this);
 menuItem32.addActionListener(this);
 menuItem33.addActionListener(this);
 menu3.add(menuItem31);
 menu3.add(menuItem32);
 menu3.add(menuItem33);
 
 JMenuItem menuItem41 = new JMenuItem(" ");
 JMenuItem menuItem42 = new JMenuItem("Grafika");
 JMenuItem menuItem43 = new JMenuItem("Konsola");
 menuItem42.setActionCommand("WłGrafika");
 menuItem43.setActionCommand("WłKonsola");
 menuItem42.addActionListener(this);
 menuItem43.addActionListener(this);
 menu4.add(menuItem41);
 menu4.add(menuItem42);
 menu4.add(menuItem43);
 
 menuBar.add(menu1);
 menuBar.add(menu2);
 menuBar.add(menu3);
 menuBar.add(menu4);
 setJMenuBar(menuBar);
 
 setSize(800, 400);
 setVisible(true);
 }
   public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0,70, getSize().width, getSize().height);
        g.drawString(content, getSize().width/2-35, getSize().height/2);
    }

    
    public void actionPerformed(ActionEvent e) {
    
        content = e.getActionCommand();
        if(widok==1){
        oknoG.wid=true;
        }

        if ("Teraz".equals(content)){
            dispose();
            oknoG.dispose();
           
           
        }
        if ("WyłGrafika".equals(content)){
            oknoG.setVisible(false);
            widok = 0;
              
        }        
        if ("WłGrafika".equals(content)){
            content = "";
            oknoG.setVisible(true);
            widok = 1;
          return;
        }
        if ("WłKonsola".equals(content)){
            konsola = 1;
           
        }
        if ("WyłKonsola".equals(content)){
            konsola = 0;
            
        }
        
            content = e.getActionCommand();
if("Pierwszy".equals(content) || "Drugi".equals(content) || "Trzeci".equals(content) ){
        if(konsola==1) {
            System.out.println(content);
            }
        if(widok==1){
            
        oknoG.repaint();
        }
      
        repaint();
    }
    }
 public static void main(String args[]) {
 new Aplikacja();
 }
}

 
 