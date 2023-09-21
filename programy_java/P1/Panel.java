/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author klasa4tp
 */
public class Panel extends JPanel {
    private String text = "";
    public void printText(String tex , Graphics g){
        text = tex;
        this.repaint();
        //this.paintComponent(g);
    }
    
     @Override
    public void paintComponent(Graphics gDC) {
        gDC.clearRect(0, 0, getSize().width, getSize().height);
        gDC.drawString (text, 100, 10);
    }
}
