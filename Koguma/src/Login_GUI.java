import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login_GUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;

	/**
	 * Launch the application.
	 */



	/**
	 * Create the application.
	 */
	public Login_GUI() {
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
		
		JLabel label = new JLabel("New label");
		label.setBounds(12, 0, 243, 55);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(286, 5, 136, 45);
		frame.getContentPane().add(label_1);
		
		JLabel lbl_id = new JLabel("ID :");
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setBounds(106, 90, 57, 15);
		frame.getContentPane().add(lbl_id);
		
		JLabel lbl_pw = new JLabel("PW :");
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setBounds(106, 127, 57, 15);
		frame.getContentPane().add(lbl_pw);
		
		tf_id = new JTextField();
		tf_id.setColumns(10);
		tf_id.setBounds(188, 87, 116, 21);
		frame.getContentPane().add(tf_id);
		
		tf_pw = new JTextField();
		tf_pw.setColumns(10);
		tf_pw.setBounds(188, 124, 116, 21);
		frame.getContentPane().add(tf_pw);
		
		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.setBounds(106, 191, 97, 23);
		frame.getContentPane().add(btn_join);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setBounds(253, 191, 97, 23);
		frame.getContentPane().add(btn_login);
	}
}
