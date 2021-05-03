package Main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DAO.DAO;
import VO.TeamVO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class signoutGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;

	public signoutGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tf_id = new JTextField("탈퇴할 아이디를 입력하세요.");
		tf_id.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_id.setText("");
			}
		});
		tf_id.setBounds(56, 161, 175, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);

		tf_pw = new JTextField("비밀번호를 입력하세요");
		tf_pw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_pw.setText("");
			}
		});
		tf_pw.setColumns(10);
		tf_pw.setBounds(56, 204, 175, 21);
		frame.getContentPane().add(tf_pw);
		
		JLabel 탈퇴 = new JLabel("");
		탈퇴.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DAO dao = new DAO();
				String id = tf_id.getText();
				String pw = tf_pw.getText();
				int cnt = dao.delete(new TeamVO(id, pw));

				if (Main.loginMember.getId().equals("admin")) {

					JOptionPane.showMessageDialog(null, "관리자는 회원탈퇴를 할 수 없습니다!", "회원탈퇴", JOptionPane.ERROR_MESSAGE);
				}

				if (id.equals(Main.loginMember.getId()) && pw.equals(Main.loginMember.getPw())) {

					if (cnt > 0) {

						JOptionPane.showMessageDialog(null, "회원탈퇴성공");
						frame.dispose();
						Main.loginMember = null;
						Main.main(null);

					} else {
						JOptionPane.showMessageDialog(null, "회원정보를 다시입력해주세요.", "회원탈퇴", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		탈퇴.setBounds(88, 340, 107, 28);
		frame.getContentPane().add(탈퇴);
		
		JLabel 돌아가기 = new JLabel("");
		돌아가기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				teamGUI team = new teamGUI();
				frame.dispose();
			}
		});
		돌아가기.setBounds(88, 388, 107, 34);
		frame.getContentPane().add(돌아가기);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC3.JPG"));
		lblNewLabel.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel);
	}
}
