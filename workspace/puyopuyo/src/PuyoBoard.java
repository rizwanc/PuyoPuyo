import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

public class PuyoBoard extends JPanel {
	Puyo puyo1 = new Puyo(64,0, Color.yellow);
	Puyo puyo2 = new Puyo(96,0, Color.green);
	Puyo puyo3 = new Puyo(64,0, Color.red);
	Puyo puyo4 = new Puyo(96,0, Color.blue);
	Puyo[] puyoArray = new Puyo[4];
	Random r = new Random();
	
	PuyoBoard() {
		puyoArray[0] = puyo1;
		puyoArray[1] = puyo2;
		puyoArray[2] = puyo3;
		puyoArray[3] = puyo4;
	}
	
	protected void paintComponent(Graphics g) { 
	    int h = getHeight();
	    int w = getWidth();
	    super.paintComponent(g); 
	    g.setColor(puyoArray[r.nextInt(4)].color);
	    g.fillOval(puyo1.x, puyo1.y, 32, 32); 
	    g.setColor(puyo2.color);
	    g.fillOval(puyo2.x, puyo2.y, 32, 32); 
	} 
}

