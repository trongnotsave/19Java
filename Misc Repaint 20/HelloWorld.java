import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloWorld extends Frame implements MouseMotionListener{

	int x = 60, y = 90, xLevel = 1, yLevel = 1;
	int minX = 60, maxX = 440, minY = 60, maxY = 440;
	public HelloWorld(){
		this.addMouseMotionListener(this);
	}
	
	public void randomRepaint() {
		while(true) {
			System.out.println("Run random...");
			
			if(y < 30 || y > this.getHeight() - 30) {
				yLevel *= -1;
			}
			if(x < 30 || x > this.getWidth() - 30) {
				xLevel *= -1;
			}
			x += 10 * xLevel;
			y += 15 * yLevel;
			try {
				Thread.sleep(100);
			}catch(Exception ex) {
				System.out.println("Throw Exeption Here");
			}
			this.repaint();
		}
	}

	@Override
	public void paint(Graphics g) {
		g.fillOval(x, y, 30, 30);
	}

	public static void main(String[] args) {
		
		HelloWorld hw = new HelloWorld();
		hw.setSize(500, 500);
		hw.show();
		hw.randomRepaint();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
//		x = e.getXOnScreen();
//		y = e.getYOnScreen();
//		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// DO Nothing
	}
	
}