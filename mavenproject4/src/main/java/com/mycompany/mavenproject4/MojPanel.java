package com.mycompany.mavenproject4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
 
public class MojPanel extends JPanel implements ActionListener{
 
	int dzialanie = 0;
 	private double arg1;
	private double arg2;
	private double wynik;
 	private JTextField poleTekstowe;
 	private JButton[] cyfry;
 	private JButton plus;
 	private JButton minus;
 	private JButton iloczyn;
 	private JButton iloraz;
 	private JButton rowne;
 	private JButton clr;
 	private JButton zero;
 	private String str="";
 	public MojPanel() {
 		
            
 	setLayout(new BorderLayout());
 	poleTekstowe = new JTextField(17);
 	cyfry = new JButton[9];
 	plus = new JButton("+");
 	minus = new JButton("-");
 	iloczyn = new JButton("*");
 	iloraz = new JButton("/");
 	rowne = new JButton("=");
 	clr = new JButton("CLR");
 	zero = new JButton("0");
 	JPanel p1 = new JPanel();
 	p1.setLayout(new GridLayout(4,4));
 	for(int i=0; i<9; i++)
 		cyfry[i]=new JButton(""+(i+1));
 	for(int i=0; i<3; i++)
 		p1.add(cyfry[i]);
 	p1.add(iloczyn);
 	for(int i=3; i<6; i++)
 		p1.add(cyfry[i]);
 	p1.add(minus);
 	for(int i=6; i<9; i++)
 		p1.add(cyfry[i]);
 	p1.add(plus);
 	p1.add(iloraz);
 	p1.add(zero);
 	p1.add(clr);
 	p1.add(rowne);
 		
 	add(p1,BorderLayout.CENTER);
 	add(poleTekstowe,BorderLayout.NORTH); 
 		
 	for(int i=0;i<9;i++)
 		cyfry[i].addActionListener(this);
 	plus.addActionListener(this);
	minus.addActionListener(this);
	iloraz.addActionListener(this);
	iloczyn.addActionListener(this);
	rowne.addActionListener(this);
	clr.addActionListener(this);
	zero.addActionListener(this);
 	
 	setVisible(true);
 		
 	}
 
 	public void actionPerformed (ActionEvent e)
	{
            
            if ("cmdGetText".equals(e.getActionCommand())){
            //String tekst = textField.getText();
            JOptionPane.showMessageDialog(this, "Odczytany tekst: " + 1, "Informacja!", JOptionPane.INFORMATION_MESSAGE);
            
        }
            
                String cmd = e.getActionCommand();
        if ("Zamknij".equals(cmd)) {
            dispose();
        }
		
		Object source = e.getSource();
		if (source == cyfry[0])
			str = str+"1";
		if (source == cyfry[1])
			str = str+"2";
		if (source == cyfry[2])
			str = str+"3";
		if (source == cyfry[3])
			str = str+"4";
		if (source == cyfry[4])
			str = str+"5";
		if (source == cyfry[5])
			str = str+"6";
		if (source == cyfry[6])
			str = str+"7";
		if (source == cyfry[7])
			str = str+"8";
		if (source == cyfry[8])
			str = str+"9";
		if (source == zero)
			str = str+"0";
		
		
		
		if (source == plus)
		{
			arg1 = Double.parseDouble(poleTekstowe.getText());
			str="";
			poleTekstowe.setText("");
			dzialanie = 1;
		}
		if (source == minus)
		{
			arg1 = Double.parseDouble(poleTekstowe.getText());
			str="";
			poleTekstowe.setText("");
			dzialanie = 2;
		}
		if (source == iloczyn)
		{
			arg1 = Double.parseDouble(poleTekstowe.getText());
			str="";
			poleTekstowe.setText("");
			dzialanie = 3;
		}
		if (source == iloraz)
		{
			arg1 = Double.parseDouble(poleTekstowe.getText());
			str="";
			poleTekstowe.setText("");
			dzialanie = 4;
		}
		if (source == rowne)
		{
			arg2 = Double.parseDouble(poleTekstowe.getText());
			double wynik = 0;
			switch(dzialanie) {
			case 1:
				wynik = arg1 + arg2;
				break;
			case 2:
				wynik = arg1 - arg2;
				break;
			case 3:
				wynik = arg1 * arg2;
				break;
			case 4:
				if (arg2 == 0) {
					wynik = 0;
				} else {
					wynik = arg1 / arg2;
				}
				break;
			default:
				System.out.println("cos sie popsuło");
				break;
			}
			str = "";
			str = Double.toString(wynik);
		}
		if (source == clr) {
			str = "";
			arg1 = 0;
			arg2 = 0;
		}
		poleTekstowe.setText(str);
	}

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
        
 }
