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

public class P0_0LoginMain {

	private JFrame frame;
	ImageIcon img1 = new ImageIcon("img/main.png");
	Image C_img1 = img1.getImage().getScaledInstance(450, 190, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img1 = new ImageIcon(C_img1);

	ImageIcon img2 = new ImageIcon("button/stulogin.png");
	Image C_img2 = img2.getImage().getScaledInstance(171, 117, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img2 = new ImageIcon(C_img2);

	ImageIcon img3 = new ImageIcon("button/tealogin.png");
	Image C_img3 = img3.getImage().getScaledInstance(171, 117, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img3 = new ImageIcon(C_img3);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P0_0LoginMain window = new P0_0LoginMain();
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
	public P0_0LoginMain() {
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
		panel.setLayout(null);

		JLabel mainImage = new JLabel("");
		mainImage.setBounds(0, 0, 455, 198);
		panel.add(mainImage);
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img1);

		// 선생님 로그인 사진
		JPanel panel_tealogin = new JPanel();
		panel_tealogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P0_2TeacherLogin();
				frame.dispose();
			}
		});
		panel_tealogin.setBackground(Color.WHITE);
		panel_tealogin.setBounds(340, 271, 196, 130);
		frame.getContentPane().add(panel_tealogin);
		
		JLabel mainImagelogin1 = new JLabel("");
		panel_tealogin.add(mainImagelogin1, "name_27704402491100");
		mainImagelogin1.setBackground(new Color(255, 255, 255));
		mainImagelogin1.setIcon(CI_img3);


		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(21, 21, 640, 420);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		// 학생 로그인 사진
		JPanel panel_stulogin = new JPanel();
		panel_stulogin.setBounds(113, 252, 196, 130);
		panel_1.add(panel_stulogin);
		panel_stulogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P0_1StudentLogin();
				frame.dispose();
			}
		});
		
		panel_stulogin.setBackground(Color.WHITE);
		
		JLabel mainImagelogin = new JLabel("");
		panel_stulogin.add(mainImagelogin, "name_27704402491100");
		mainImagelogin.setBackground(new Color(255, 255, 255));
		mainImagelogin.setIcon(CI_img2);

	}

}
