import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Schedule_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Schedule_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uC2DC\uAC04\uD45C");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		label.setBounds(151, 48, 113, 48);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(34, 115, 358, 217);
		frame.getContentPane().add(label_1);
	}

}
