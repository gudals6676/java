package c;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import DaoVo.StudentVO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JSplitPane;

public class StudentMain {
	
	static StudentVO vo;
	JFrame frame;
	ImageIcon img1 = new ImageIcon("img/logo.png");
	Image C_img1 = img1.getImage().getScaledInstance(198, 45, Image.SCALE_SMOOTH);// ?̹???ũ?? ??ȯ
	ImageIcon CI_img1 = new ImageIcon(C_img1);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					StudentMain window = new StudentMain(vo);
//					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param vo 
	 */
	public StudentMain(StudentVO r_vo) {
		vo = r_vo;
		initialize();
		frame.setVisible(true);
		System.out.println(vo.getStu_id());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 205));
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(299, 115, 327, 290);
		frame.getContentPane().add(panel);

		JLabel label = new JLabel("\uACF5\uC9C0\uC0AC\uD56D");
		label.setFont(new Font("???? ????", Font.PLAIN, 20));
		panel.add(label);

		JButton btn_scoreinfo = new JButton("\uC131\uC801\uC870\uD68C");
		btn_scoreinfo.setFont(new Font("???? ????", Font.PLAIN, 20));
		btn_scoreinfo.setBackground(new Color(255, 255, 255));
		btn_scoreinfo.setBounds(108, 115, 150, 62);
		frame.getContentPane().add(btn_scoreinfo);

		JButton btn_schedule = new JButton("\uC2DC\uAC04\uD45C");
		btn_schedule.setBackground(Color.WHITE);
		btn_schedule.setFont(new Font("???? ????", Font.PLAIN, 20));
		btn_schedule.setBounds(108, 192, 150, 62);
		frame.getContentPane().add(btn_schedule);

		JButton btn_board = new JButton("\uAC8C\uC2DC\uD310");
		btn_board.setBackground(Color.WHITE);
		btn_board.setFont(new Font("???? ????", Font.PLAIN, 20));
		btn_board.setBounds(108, 269, 150, 62);
		frame.getContentPane().add(btn_board);

		JButton btn_lunch = new JButton("\uC810\uC2EC \uBB50\uBA39\uC9D5?");
		btn_lunch.setBackground(Color.WHITE);
		btn_lunch.setFont(new Font("???? ????", Font.PLAIN, 20));
		btn_lunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Lunchinfo(vo);
				frame.dispose();
			}
		});
		btn_lunch.setBounds(108, 343, 150, 62);
		frame.getContentPane().add(btn_lunch);
		

		JButton btn_info = new JButton("\uB0B4 \uC815\uBCF4");
		btn_info.setBackground(Color.WHITE);
		btn_info.setFont(new Font("???? ????", Font.PLAIN, 14));
		btn_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentUpdate(vo);
				frame.dispose();
			}
		});
		btn_info.setBounds(550, 30, 100, 35);
		frame.getContentPane().add(btn_info);

		JButton btn_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "?α׾ƿ? ?Ͻðڽ??ϱ??", "?α׾ƿ?", 0);
				if (result == JOptionPane.YES_OPTION) {
					new LoginMain();
					frame.dispose();
				}
			}	
		});
		btn_logout.setBackground(Color.WHITE);
		btn_logout.setFont(new Font("???? ????", Font.PLAIN, 14));
		btn_logout.setBounds(30, 30, 100, 35);
		frame.getContentPane().add(btn_logout);

		JPanel logo = new JPanel();
		logo.setBackground(Color.WHITE);
		logo.setBounds(223, 22, 240, 68);
		frame.getContentPane().add(logo);
		JLabel mainImage = new JLabel("");

		logo.add(mainImage, "name_27704402491100");
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(14, 14, 654, 429);
		frame.getContentPane().add(panel_1);
	}
}
