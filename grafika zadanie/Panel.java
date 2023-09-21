package grafika;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Panel extends JPanel {
	boolean wid = false;
    private String text = "";
    public void printText(String tex , Graphics g){
        text = tex;
        this.repaint();
    }
    
     @Override
    public void paintComponent(Graphics gDC) {
        gDC.clearRect(0, 0, getSize().width, getSize().height);
        gDC.drawString (text, 150, 60);
    }
}