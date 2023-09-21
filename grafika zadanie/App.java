package grafika;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class App extends JFrame implements ActionListener {
	static Panel pane = new Panel();
	//static public String cmd;
	int c = 0;
	int view = 0;
	
	public App() {
		super("Remigiusz Zaj¹c");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu1 = new JMenu("Opcje");
		JMenu menu2 = new JMenu("      ");
		JMenu menu3 = new JMenu("A");
		JMenu menu4 = new JMenu("B");
		
		JMenuItem menuItem11 = new JMenuItem("CON");
		JMenuItem menuItem12 = new JMenuItem("IN");
		JMenuItem menuItem13 = new JMenuItem("OUT");
		JMenuItem menuItem14 = new JMenuItem("Zamknij");
		menuItem11.addActionListener(this);
		menuItem12.addActionListener(this);
		menuItem13.addActionListener(this);
		menuItem14.addActionListener(this);
		menu1.add(menuItem11);
		menu1.add(menuItem12);
		menu1.add(menuItem13);
		menu1.add(menuItem14);
		
		JMenuItem menuItem31 = new JMenuItem("A1");
		JMenuItem menuItem32 = new JMenuItem("A2");
		JMenuItem menuItem33 = new JMenuItem("A3");
		menuItem31.addActionListener(this);
		menuItem32.addActionListener(this);
		menuItem33.addActionListener(this);
		menu3.add(menuItem31);
		menu3.add(menuItem32);
		menu3.add(menuItem33);
		
		JMenu menu5 = new JMenu("B");
		JMenuItem menu5Item1 = new JMenuItem("B1");
		menu5Item1.addActionListener(this);
		menu5.add(menu5Item1);
		
		JMenu menu6 = new JMenu("B");
		JMenuItem menu6Item1 = new JMenuItem("B2");
		menu6Item1.addActionListener(this);
		menu6.add(menu6Item1);
		
		JMenu menu7 = new JMenu("B");
		JMenuItem menu7Item1 = new JMenuItem("B3");
		menu7Item1.addActionListener(this);
		menu7.add(menu7Item1);
		
		menu4.add(menu5);
		menu4.add(menu6);
		menu4.add(menu7);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		
		setJMenuBar(menuBar);
		setSize(320,200);
		setVisible(true);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		
       String cmd = e.getActionCommand();
       if (c == 1) {
    	   System.out.println(cmd); 
       }
       if (view == 1) {
    	   pane.printText(cmd, this.getGraphics());
       }
       	if (pane.wid == true) {
       		pane.repaint();
       	}
       
       if ("CON".equals(cmd)) {
    	   c = 1;
    	   view = 0;
    	   pane.wid = false;
       }
       if ("IN".equals(cmd)) {
    	   c = 0;
    	   view = 1;
    	   pane.wid = false;
       }
       if ("OUT".equals(cmd)) {
    	   pane.wid = true;
    	   c = 0;
    	   view = 0;
    	   pane.setVisible(true);
       }
       
       if ("Zamknij".equals(cmd)) {
    	   dispose();
       }
    }
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				App ap = new App();
				ap.getContentPane().add(pane);
			}
		});
	}
}
