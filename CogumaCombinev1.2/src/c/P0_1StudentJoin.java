package c;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import DaoVo.StudentDAO;
import javax.swing.JPanel;
import java.awt.Color;

public class P0_1StudentJoin {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	private JTextField tf_name;
	private JTextField tf_birthday;
	private JTextField tf_tel;
	private JTextField tf_address;
	private JTextField tf_email;
	ImageIcon img1 = new ImageIcon("img/logo2.png");
	Image C_img1 = img1.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img1 = new ImageIcon(C_img1);

//	JLabel lblNewLabel_1 = new JLabel("");
//	lblNewLabel_1.setBounds(12, 10, 60, 60);
//	panel.add(lblNewLabel_1);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P0_1StudentJoin window = new P0_1StudentJoin();
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
	public P0_1StudentJoin() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 291, 439);
		frame.getContentPane().setBackground(new Color(0, 139, 205));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("JOIN");
		lblNewLabel.setBounds(103, 27, 72, 33);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel);

		JLabel lbl_ID = new JLabel("ID :");
		lbl_ID.setBounds(27, 80, 57, 15);
		frame.getContentPane().add(lbl_ID);

		JLabel lbl_PW = new JLabel("Password : ");
		lbl_PW.setBounds(27, 120, 90, 15);
		frame.getContentPane().add(lbl_PW);

		JLabel lbl_Name = new JLabel("Name : ");
		lbl_Name.setBounds(27, 160, 57, 15);
		frame.getContentPane().add(lbl_Name);

		JLabel lbl_birthday = new JLabel("Birthday : ");
		lbl_birthday.setBounds(27, 200, 57, 15);
		frame.getContentPane().add(lbl_birthday);

		JLabel lbl_Tel = new JLabel("Tel : ");
		lbl_Tel.setBounds(27, 240, 57, 15);
		frame.getContentPane().add(lbl_Tel);

		JLabel lbl_Address = new JLabel("Address : ");
		lbl_Address.setBounds(27, 280, 57, 15);
		frame.getContentPane().add(lbl_Address);

		JLabel lbl_Email = new JLabel("Email : ");
		lbl_Email.setBounds(27, 320, 57, 15);
		frame.getContentPane().add(lbl_Email);

		tf_id = new JTextField();
		tf_id.setBounds(111, 80, 134, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);

		tf_pw = new JTextField();
		tf_pw.setBounds(111, 120, 134, 21);
		frame.getContentPane().add(tf_pw);
		tf_pw.setColumns(10);

		tf_name = new JTextField();
		tf_name.setBounds(111, 160, 134, 21);
		frame.getContentPane().add(tf_name);
		tf_name.setColumns(10);

		tf_birthday = new JTextField();
		tf_birthday.setBounds(111, 200, 134, 21);
		frame.getContentPane().add(tf_birthday);
		tf_birthday.setColumns(20);

		tf_tel = new JTextField();
		tf_tel.setBounds(111, 240, 134, 21);
		frame.getContentPane().add(tf_tel);
		tf_tel.setColumns(20);

		tf_address = new JTextField();
		tf_address.setBounds(111, 280, 134, 21);
		frame.getContentPane().add(tf_address);
		tf_address.setColumns(20);

		tf_email = new JTextField();
		tf_email.setBounds(111, 320, 134, 21);
		frame.getContentPane().add(tf_email);
		tf_email.setColumns(20);

		JButton btn_join = new JButton("회원가입 등록");
		btn_join.setBounds(95, 351, 97, 23);
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = tf_id.getText();
				String pw = tf_pw.getText();
				String name = tf_name.getText();
				String birthday = tf_birthday.getText();
				String tel = tf_tel.getText();
				String address = tf_address.getText();
				String email = tf_email.getText();

				if (!id.equals("") && !pw.equals("") && !name.equals("") && !birthday.equals("") && !tel.equals("")
						&& !address.equals("") && !email.equals("")) {
					StudentDAO dao = new StudentDAO();
					int cnt = dao.Student_Join(id, pw, name, birthday, tel, address, email);
					if (cnt > 0) {
						JOptionPane.showMessageDialog(null, "회원가입 성공!!");
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "회원가입 실패!!", "회원가입", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "모든 정보를 입력해 주세요!", "회원가입", JOptionPane.ERROR_MESSAGE); // 어느창에
																												// 띄울지
				}
			}
		});
		frame.getContentPane().add(btn_join);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 251, 380);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel logo2 = new JLabel("");
		logo2.setBounds(0, 0, 60, 60);
		panel.add(logo2);
		logo2.setIcon(CI_img1);
	}
}
