import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;

public class Scoremgment_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Scoremgment_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(158, 10, 142, 49);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(344, 10, 128, 41);
		frame.getContentPane().add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 148, 353, 303);
		frame.getContentPane().add(scrollPane);
		
		JLabel label_2 = new JLabel("SCORE INFO");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		label_2.setBounds(103, 89, 173, 49);
		frame.getContentPane().add(label_2);
		
		JButton button = new JButton("\uC218\uC815");
		button.setBounds(377, 329, 80, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uCD94\uAC00");
		button_1.setBounds(377, 362, 80, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\uC0AD\uC81C");
		button_2.setBounds(377, 395, 80, 23);
		frame.getContentPane().add(button_2);
	}

}
