import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintTest extends Frame implements MouseMotionListener{

	int x = 0, y= 0;
	
	public PaintTest() {
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            dispose();
         }
     });
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getXOnScreen();
		y = e.getYOnScreen();
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(0, 0, x, y);
		g.fillOval(x, y, 30, 30);
	}
	
	public static void main(String[] args) {
		PaintTest tp = new PaintTest();
		tp.setSize(500, 500);
		tp.show();
	}
	
}
