package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DAO.DAO;
import VO.TeamVO;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class loginGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JPasswordField pwfield;

	public loginGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tf_id = new JTextField("ID를 입력 하세요.");
		tf_id.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tf_id.setText("");
			}
		});
		tf_id.setBounds(58, 160, 168, 20);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		pwfield = new JPasswordField("****");
		pwfield.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pwfield.setText("");
			}
		});
		pwfield.setBounds(58, 202, 168, 21);
		frame.getContentPane().add(pwfield);
		
		JLabel 라벨돌아가기 = new JLabel("");
		라벨돌아가기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Main.main(null);
				frame.dispose();
			}
		});
		라벨돌아가기.setBounds(85, 390, 116, 33);
		frame.getContentPane().add(라벨돌아가기);
		
		JLabel 라벨로그인 = new JLabel("");
		라벨로그인.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = tf_id.getText();
				String pw = pwfield.getText();
				DAO dao = new DAO();
				TeamVO teamvo = new TeamVO(id, pw);
				Main.loginMember = dao.login(teamvo);
				if (Main.loginMember == null) {
					JOptionPane.showMessageDialog(null, "로그인 실패", "로그인", JOptionPane.ERROR_MESSAGE);
				} else {

					if (Main.loginMember.getId().equals("admin")) {
						JOptionPane.showMessageDialog(null, "관리자님 환영합니다.");
						adminGUI ad = new adminGUI();
						frame.dispose();

					} else {

						JOptionPane.showMessageDialog(null, teamvo.getId() + "님 환영합니다.");
						teamGUI team = new teamGUI();
						frame.dispose();

					}
				}
				
				
			}
		});
		라벨로그인.setBounds(99, 337, 90, 33);
		frame.getContentPane().add(라벨로그인);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC4.JPG"));
		lblNewLabel.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel);
	}
}
