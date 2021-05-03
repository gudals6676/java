package c;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DaoVo.StudentDAO;
import DaoVo.StudentVO;
import DaoVo.TeacherDAO;
import DaoVo.TeacherVO;

public class P0_2TeacherLogin {

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

	String id = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = "a1";
					P0_2TeacherLogin window = new P0_2TeacherLogin(id);
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
	public P0_2TeacherLogin() {
		initialize();
		frame.setVisible(true);
	}

	public P0_2TeacherLogin(String id) {
		this.id = id;
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
		panel.setBounds(120, 39, 455, 198);
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JLabel mainImage = new JLabel("");
		panel.add(mainImage, "name_27704402491100");
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img1);
		panel.setLayout(new CardLayout(0, 0));

		// 아이디 비밀번호
		JPanel panel_stulogin = new JPanel();
		panel_stulogin.setBounds(70, 271, 196, 130);
		panel_stulogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P0_1StudentLogin();
				frame.dispose();
			}
		});

		panel_stulogin.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_stulogin);

		JLabel mainImage2 = new JLabel("");
		panel_stulogin.add(mainImage2);
		mainImage2.setBackground(new Color(255, 255, 255));
		mainImage2.setIcon(CI_img2);

		// 로그인 사진
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(437, 290, 140, 60);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();

				if (!id.equals("") && !pw.equals("")) {
					TeacherDAO dao = new TeacherDAO();
					TeacherVO vo = dao.TeacherLogin(id, pw);

					if (vo != null) {
						JOptionPane.showMessageDialog(null, "행복한 하루 보내세요 !");
						new P2_0TeacherMain(id);
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
		frame.getContentPane().add(panel_2);

		JLabel mainImagelogin = new JLabel("");
		panel_2.add(mainImagelogin);
		mainImagelogin.setBackground(Color.WHITE);
		mainImagelogin.setIcon(CI_img3);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 21, 640, 420);
		panel_1.setBackground(new Color(255, 255, 255));
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
