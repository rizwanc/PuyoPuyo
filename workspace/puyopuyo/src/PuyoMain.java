import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PuyoMain {
	public static void main(String[] args) {
		JOptionPane window = new JOptionPane();
		JFrame frame = new JFrame();
		frame.add(new PuyoBoard());
		frame.setSize(200, 400);
		frame.setVisible(true);
		//frame.setResizable(false);
		frame.setFocusable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
