/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cw96;

import javax.swing.JFrame;
import java.awt.Graphics;

public class Grafika extends JFrame {
    
    boolean wid=false;
    
    public Grafika () {
        super("Grafika");
        setSize(320, 200);
        setVisible(wid);
    }
    
    public void paint(Graphics gDC) {
        gDC.clearRect(0, 0, getSize().width, getSize().height);
        gDC.drawString (Aplikacja.cmd, 120, 100);
    }
    void odswiez(){
        setVisible(wid);
        repaint();     
    }
    
}
