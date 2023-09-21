package graficzna;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;

public class HelloApp extends JFrame implements WindowListener {
	public HelloApp () {
	super("Moja pierwsza aplikacja");
	addWindowListener(this);
	setSize(320, 200);
	setVisible(true);
	}
	
	public void paint(Graphics gDC) {
	gDC.clearRect(100, 100, getSize().width, getSize().height);
	gDC.drawString ("To jest aplikacja.", 120, 100);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
				public void run() {
				new HelloApp();
				}
		});
	}
	
	public void windowClosing(WindowEvent e) {
		dispose();
	}
	
	public void windowClosed(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
}
