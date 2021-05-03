package c;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DaoVo.StudentDAO;
import DaoVo.StudentVO;

public class LoginMain {

	private JFrame frame;
	ImageIcon img1 = new ImageIcon("img/logo.png");
	Image C_img1 = img1.getImage().getScaledInstance(396, 90, Image.SCALE_SMOOTH);// ¿ÃπÃ¡ˆ≈©±‚ ∫Ø»Ø
	ImageIcon CI_img1 = new ImageIcon(C_img1);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMain window = new LoginMain();
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
	public LoginMain() {
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

		JButton btn_stulogin = new JButton("\uD559\uC0DD \uB85C\uADF8\uC778");
		btn_stulogin.setBackground(Color.WHITE);
		btn_stulogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentLogin();
				frame.dispose();
			}
		});
		btn_stulogin.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 24));

		btn_stulogin.setBounds(130, 255, 196, 131);
		frame.getContentPane().add(btn_stulogin);

		JButton btn_tealogin = new JButton("\uC120\uC0DD\uB2D8 \uB85C\uADF8\uC778");
		btn_tealogin.setBackground(Color.WHITE);
		btn_tealogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeacherLogin();
				frame.dispose();
			}
		});
		btn_tealogin.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 24));

		btn_tealogin.setBounds(364, 255, 196, 131);
		frame.getContentPane().add(btn_tealogin);

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
