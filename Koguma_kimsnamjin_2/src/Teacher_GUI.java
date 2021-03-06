import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teacher_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Teacher_GUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(236, 10, 186, 345);
		frame.getContentPane().add(panel);

		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(22, 10, 202, 51);
		frame.getContentPane().add(label);

		JButton btn_classmgm = new JButton("\uBC18 \uAD00\uB9AC");
		btn_classmgm.setFont(new Font("???? ????", Font.PLAIN, 15));
		btn_classmgm.setBounds(63, 67, 97, 36);
		frame.getContentPane().add(btn_classmgm);

		JButton btn_studentinfo = new JButton("\uD559\uC0DD \uC870\uD68C");
		btn_studentinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Teacher_GUI_1();
				frame.dispose();
			}
		});
		btn_studentinfo.setFont(new Font("???? ????", Font.PLAIN, 15));
		btn_studentinfo.setBounds(63, 113, 97, 36);
		frame.getContentPane().add(btn_studentinfo);

		JButton btn_scoremgm = new JButton("\uC131\uC801 \uAD00\uB9AC");
		btn_scoremgm.setFont(new Font("???? ????", Font.PLAIN, 15));
		btn_scoremgm.setBounds(63, 157, 97, 36);
		frame.getContentPane().add(btn_scoremgm);

		JButton btn_board = new JButton("\uAC8C\uC2DC\uD310");
		btn_board.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_board.setFont(new Font("???? ????", Font.PLAIN, 15));
		btn_board.setBounds(63, 203, 97, 36);
		frame.getContentPane().add(btn_board);

		JButton btn_lunch = new JButton("\uC810\uC2EC \uBB50\uBA39\uC9D5?");
		btn_lunch.setFont(new Font("???? ????", Font.PLAIN, 15));
		btn_lunch.setBounds(62, 249, 119, 43);
		frame.getContentPane().add(btn_lunch);

		JButton btn_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btn_logout.setBounds(12, 328, 85, 23);
		frame.getContentPane().add(btn_logout);
	}

}
