package c;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import DaoVo.StudentDAO;
import DaoVo.StudentVO;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


public class StudentLogin {
	public String myId;
	// T_S_004 학생 로그인
	// 로그인 버튼을 누르면 학생 메인화면으로 이동

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	ImageIcon img1 = new ImageIcon("img/logo.png");
	Image C_img1 = img1.getImage().getScaledInstance(396, 90, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img1 = new ImageIcon(C_img1);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLogin window = new StudentLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentLogin() {
		initialize();
		frame.setVisible(true);
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

		JLabel lbl_id = new JLabel("\uC544\uC774\uB514 :");
		lbl_id.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lbl_id.setBounds(106, 279, 94, 37);
		frame.getContentPane().add(lbl_id);

		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lbl_pw.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lbl_pw.setBounds(99, 328, 120, 37);
		frame.getContentPane().add(lbl_pw);

		tf_id = new JTextField();
		tf_id.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		tf_id.setBounds(233, 277, 180, 39);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);

		tf_pw = new JTextField();
		tf_pw.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		tf_pw.setColumns(10);
		tf_pw.setBounds(233, 331, 180, 39);
		frame.getContentPane().add(tf_pw);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setFont(new Font("굴림", Font.PLAIN, 24));
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();

				if (!id.equals("") && !pw.equals("")) {
					StudentDAO dao = new StudentDAO();
					StudentVO vo = dao.StudentLogin(id, pw);

					if (vo != null) {
						JOptionPane.showMessageDialog(null, "행복한 하루 보내세요 !");
						new StudentMain(vo);
						frame.dispose();

					} else {
						JOptionPane.showMessageDialog(null, "로그인 실패 !", "로그인", JOptionPane.ERROR_MESSAGE);
						tf_id.setText("");
						tf_pw.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(null, "모든 정보를 입력해주세요 !", "로그인", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btn_login.setBounds(446, 274, 129, 96);
		frame.getContentPane().add(btn_login);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(120, 39, 455, 198);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JLabel mainImage = new JLabel("");
		panel.add(mainImage, "name_27704402491100");
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(21, 21, 640, 420);
		frame.getContentPane().add(panel_1);

	}
}
