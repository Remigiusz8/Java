
package com.mycompany.aplikacja;

import static com.mycompany.aplikacja.Aplikacja.content;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Grafika extends JFrame {
    
    boolean wid=false;
    
    public Grafika () {
        super("Grafika");
        setSize(400, 200);
        setVisible(wid);
    }
    
    public void paint(Graphics gDC) {
         gDC.clearRect(0,70, getSize().width, getSize().height);
        gDC.drawString(content, getSize().width/2-35, getSize().height/2);
    }
    void odswiez(){
        setVisible(wid);
        repaint();     
    }
    
}