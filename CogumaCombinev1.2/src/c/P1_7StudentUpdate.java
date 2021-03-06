package c;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import DaoVo.StudentDAO;
import DaoVo.StudentVO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P1_7StudentUpdate {

	static StudentVO vo = null;
	StudentDAO dao = new StudentDAO();

	private JFrame frame;
	ImageIcon img1 = new ImageIcon("img/info.png");
	Image C_img1 = img1.getImage().getScaledInstance(98, 343, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img1 = new ImageIcon(C_img1);

	ImageIcon img2 = new ImageIcon("img/myinfo.png");
	Image C_img2 = img2.getImage().getScaledInstance(160, 63, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img2 = new ImageIcon(C_img2);

	ImageIcon img3 = new ImageIcon("img/home.png");
	Image C_img3 = img3.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img3 = new ImageIcon(C_img3);

	/**
	 * @wbp.nonvisual location=320,-16
	 */

	private final JTextField textField = new JTextField();
	private JLabel lb_id;
	private JTextField tf_name;
	private JTextField tf_tel;
	private JTextField tf_email;
	private JTextField tf_address;
	private JTextField tf_birth;
	private JTextField tf_pw;
	private String stu_id;
	String id = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = "b1";
					P1_7StudentUpdate window = new P1_7StudentUpdate(id);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @param vo
	 */
	public P1_7StudentUpdate(String id) {
		this.id = id;
		System.out.println(id);
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		StudentVO al = null;
		String[] header = { "stu_id", "stu_name", "stu_pw", "stu_birth", "stu_tel", "stu_address", "stu_email" };
		al = dao.StudentUpdate(null);

		textField.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 205));
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel info = new JPanel();
		info.setBackground(Color.WHITE);
		info.setBounds(140, 70, 100, 360);
		frame.getContentPane().add(info);
		JLabel mainImage = new JLabel("");

		info.add(mainImage, "name_27704402491100");
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img1);

		JPanel panel_home = new JPanel();
		panel_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P1_0StudentMain(id);
				frame.dispose();
			}
		});
		panel_home.setBackground(Color.WHITE);
		panel_home.setBounds(25, 25, 40, 40);
		frame.getContentPane().add(panel_home);
		JLabel mainImage2 = new JLabel("");

		panel_home.add(mainImage2, "home");
		mainImage2.setBackground(new Color(255, 255, 255));
		mainImage2.setIcon(CI_img3);

		JPanel myinfo = new JPanel();
		myinfo.setBackground(Color.WHITE);
		myinfo.setBounds(200, 14, 270, 60);
		frame.getContentPane().add(myinfo);
		JLabel mainImage1 = new JLabel("");

		myinfo.add(mainImage1, "myinfo");
		mainImage1.setBackground(new Color(255, 255, 255));
		mainImage1.setIcon(CI_img2);

		JPanel panel_id = new JPanel();
		panel_id.setBounds(270, 86, 300, 28);
		frame.getContentPane().add(panel_id);

		JLabel lbl_id = new JLabel("");
		lbl_id.setFont(new Font("굴림", Font.PLAIN, 17));
		panel_id.add(lbl_id);

		JPanel panel_pw = new JPanel();
		panel_pw.setBounds(270, 136, 300, 28);
		frame.getContentPane().add(panel_pw);

		tf_pw = new JTextField();
		panel_pw.add(tf_pw);
		tf_pw.setColumns(10);

		JPanel panel_name = new JPanel();
		panel_name.setBounds(270, 186, 300, 28);
		frame.getContentPane().add(panel_name);

		tf_name = new JTextField();
		panel_name.add(tf_name);
		tf_name.setColumns(10);

		JPanel panel_birth = new JPanel();
		panel_birth.setBounds(270, 236, 300, 28);
		frame.getContentPane().add(panel_birth);

		tf_birth = new JTextField();
		panel_birth.add(tf_birth);
		tf_birth.setColumns(10);

		JPanel panel_tel = new JPanel();
		panel_tel.setBounds(270, 288, 300, 28);
		frame.getContentPane().add(panel_tel);

		tf_tel = new JTextField();
		panel_tel.add(tf_tel);
		tf_tel.setColumns(10);

		JPanel panel_email = new JPanel();
		panel_email.setBounds(270, 338, 300, 28);
		frame.getContentPane().add(panel_email);

		tf_email = new JTextField();
		panel_email.add(tf_email);
		tf_email.setColumns(10);

		JPanel panel_address = new JPanel();
		panel_address.setBounds(270, 390, 300, 28);
		frame.getContentPane().add(panel_address);

		tf_address = new JTextField();
		panel_address.add(tf_address);
		tf_address.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(14, 14, 654, 429);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btn_update = new JButton("\uC218\uC815");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				String pw = tf_pw.getText();
				String name = tf_name.getText();
				String addr = tf_address.getText();
				String birth = tf_birth.getText();
				String email = tf_email.getText();
				String tel = tf_tel.getText();
				StudentVO u_vo = new StudentVO(id, pw, name, birth, tel, addr, email);
				int cnt = dao.updateInfo(u_vo);

				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "수정 성공");
				} else {

					JOptionPane.showMessageDialog(null, "수정 실패");
				}

			}
		});
		btn_update.setBounds(569, 369, 73, 23);
		panel_1.add(btn_update);

		JButton close = new JButton("\uB2EB\uAE30");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new P1_0StudentMain(id);
			}
		});
		close.setBounds(569, 396, 73, 23);
		panel_1.add(close);

		StudentVO myInfo = dao.StudentUpdate(id);

		tf_pw.setText(myInfo.getStu_pw());
		tf_name.setText(myInfo.getStu_name());
		tf_address.setText(myInfo.getStu_address());
		tf_birth.setText(myInfo.getStu_birthday());
		tf_email.setText(myInfo.getStu_email());
		tf_tel.setText(myInfo.getStu_tel());
		lbl_id.setText(myInfo.getStu_id());

	}
}
