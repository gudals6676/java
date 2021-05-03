import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Lunch_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Lunch_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uC624\uB298\uC740 \uBB50\uBA39\uC9D5?");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		label.setBounds(154, 82, 146, 50);
		frame.getContentPane().add(label);
		
		JLabel lbl_1 = new JLabel("New label");
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setBounds(75, 159, 129, 112);
		frame.getContentPane().add(lbl_1);
		
		JLabel lbl_2 = new JLabel("New label");
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setBounds(241, 159, 129, 112);
		frame.getContentPane().add(lbl_2);
		
		JLabel lbl_3 = new JLabel("New label");
		lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3.setBounds(75, 286, 129, 112);
		frame.getContentPane().add(lbl_3);
		
		JLabel lbl_4 = new JLabel("New label");
		lbl_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4.setBounds(241, 281, 129, 112);
		frame.getContentPane().add(lbl_4);
	}

}
