import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JoinGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	private JTextField tf_name;
	private JTextField tf_birthday;
	private JTextField tf_email;
	private JTextField tf_tel;
	private JTextField tf_address;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public JoinGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 200, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(122, 10, 148, 51);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(327, 10, 95, 51);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uD658\uC601\uD569\uB2C8\uB2E4!!");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		label_2.setBounds(137, 88, 148, 60);
		frame.getContentPane().add(label_2);
		
		JLabel lbl_id = new JLabel("\uC544\uC774\uB514 :");
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setBounds(87, 162, 64, 26);
		frame.getContentPane().add(lbl_id);
		
		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setBounds(87, 198, 64, 26);
		frame.getContentPane().add(lbl_pw);
		
		JLabel lbl_name = new JLabel("\uC774\uB984 :");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setBounds(87, 234, 64, 26);
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_birthday = new JLabel("\uC0DD\uB144\uC6D4\uC77C :");
		lbl_birthday.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_birthday.setBounds(87, 270, 64, 26);
		frame.getContentPane().add(lbl_birthday);
		
		JLabel lbl_email = new JLabel("\uC774\uBA54\uC77C :");
		lbl_email.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_email.setBounds(87, 306, 64, 26);
		frame.getContentPane().add(lbl_email);
		
		JLabel lbl_tel = new JLabel("\uC804\uD654\uBC88\uD638 :");
		lbl_tel.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tel.setBounds(87, 342, 64, 26);
		frame.getContentPane().add(lbl_tel);
		
		JLabel lbl_address = new JLabel("\uC8FC\uC18C :");
		lbl_address.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_address.setBounds(87, 378, 64, 26);
		frame.getContentPane().add(lbl_address);
		
		tf_id = new JTextField();
		tf_id.setColumns(10);
		tf_id.setBounds(176, 165, 129, 21);
		frame.getContentPane().add(tf_id);
		
		tf_pw = new JTextField();
		tf_pw.setColumns(10);
		tf_pw.setBounds(176, 201, 129, 21);
		frame.getContentPane().add(tf_pw);
		
		tf_name = new JTextField();
		tf_name.setColumns(10);
		tf_name.setBounds(176, 237, 129, 21);
		frame.getContentPane().add(tf_name);
		
		tf_birthday = new JTextField();
		tf_birthday.setColumns(10);
		tf_birthday.setBounds(176, 273, 129, 21);
		frame.getContentPane().add(tf_birthday);
		
		tf_email = new JTextField();
		tf_email.setColumns(10);
		tf_email.setBounds(176, 309, 129, 21);
		frame.getContentPane().add(tf_email);
		
		tf_tel = new JTextField();
		tf_tel.setColumns(10);
		tf_tel.setBounds(176, 345, 129, 21);
		frame.getContentPane().add(tf_tel);
		
		tf_address = new JTextField();
		tf_address.setColumns(10);
		tf_address.setBounds(176, 381, 129, 21);
		frame.getContentPane().add(tf_address);
		
		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.setBounds(316, 471, 106, 40);
		frame.getContentPane().add(btn_join);
	}

}
