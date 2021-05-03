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

public class P0_1StudentLogin {
	// T_S_004 학생 로그인
	// 로그인 버튼을 누르면 학생 메인화면으로 이동

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	ImageIcon img1 = new ImageIcon("img/main.png");
	Image C_img1 = img1.getImage().getScaledInstance(450, 190, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img1 = new ImageIcon(C_img1);

	ImageIcon img2 = new ImageIcon("img/idpw.png");
	Image C_img2 = img2.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img2 = new ImageIcon(C_img2);

	ImageIcon img3 = new ImageIcon("button/login.png");
	Image C_img3 = img3.getImage().getScaledInstance(130, 52, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img3 = new ImageIcon(C_img3);

	ImageIcon img4 = new ImageIcon("button/join.png");
	Image C_img4 = img4.getImage().getScaledInstance(130, 52, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img4 = new ImageIcon(C_img4);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P0_1StudentLogin window = new P0_1StudentLogin();
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
	public P0_1StudentLogin() {
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

		// 메인 사진
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(108, 39, 455, 198);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JLabel mainImage = new JLabel("");
		panel.add(mainImage, "name_27704402491100");
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img1);

		// 아이디 비밀번호
		JPanel panel_stulogin = new JPanel();
		panel_stulogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P0_1StudentLogin();
				frame.dispose();
			}
		});

		panel_stulogin.setBackground(Color.WHITE);
		panel_stulogin.setBounds(70, 271, 196, 130);
		frame.getContentPane().add(panel_stulogin);

		JLabel mainImage2 = new JLabel("");
		panel_stulogin.add(mainImage2);
		mainImage2.setBackground(new Color(255, 255, 255));
		mainImage2.setIcon(CI_img2);

		// 로그인 사진
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();

				if (!id.equals("") && !pw.equals("")) {
					StudentDAO dao = new StudentDAO();
					StudentVO vo = dao.StudentLogin(id, pw);

					if (vo != null) {
						JOptionPane.showMessageDialog(null, "행복한 하루 보내세요 !");
						new P1_0StudentMain(id);
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
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(437, 265, 140, 60);
		frame.getContentPane().add(panel_2);

		JLabel mainImagelogin = new JLabel("");
		panel_2.add(mainImagelogin);
		mainImagelogin.setBackground(Color.WHITE);
		mainImagelogin.setIcon(CI_img3);
		panel.setLayout(new CardLayout(0, 0));

		// 회원가입 사진
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P0_1StudentJoin();
				frame.dispose();
			}
		});
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(437, 325, 140, 60);
		frame.getContentPane().add(panel_3);

		JLabel mainImagejoin = new JLabel("");
		panel_3.add(mainImagejoin);
		mainImagejoin.setBackground(Color.WHITE);
		mainImagejoin.setIcon(CI_img4);
		panel.setLayout(new CardLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(21, 21, 640, 420);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		tf_id = new JTextField();
		tf_id.setBounds(230, 256, 180, 39);
		panel_1.add(tf_id);
		tf_id.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		tf_id.setColumns(10);

		tf_pw = new JTextField();
		tf_pw.setBounds(230, 310, 180, 39);
		panel_1.add(tf_pw);
		tf_pw.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		tf_pw.setColumns(10);

	}
}
