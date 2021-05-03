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

		tf_id = new JTextField("Ż���� ���̵� �Է��ϼ���.");
		tf_id.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_id.setText("");
			}
		});
		tf_id.setBounds(56, 161, 175, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);

		tf_pw = new JTextField("��й�ȣ�� �Է��ϼ���");
		tf_pw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_pw.setText("");
			}
		});
		tf_pw.setColumns(10);
		tf_pw.setBounds(56, 204, 175, 21);
		frame.getContentPane().add(tf_pw);
		
		JLabel Ż�� = new JLabel("");
		Ż��.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DAO dao = new DAO();
				String id = tf_id.getText();
				String pw = tf_pw.getText();
				int cnt = dao.delete(new TeamVO(id, pw));

				if (Main.loginMember.getId().equals("admin")) {

					JOptionPane.showMessageDialog(null, "�����ڴ� ȸ��Ż�� �� �� �����ϴ�!", "ȸ��Ż��", JOptionPane.ERROR_MESSAGE);
				}

				if (id.equals(Main.loginMember.getId()) && pw.equals(Main.loginMember.getPw())) {

					if (cnt > 0) {

						JOptionPane.showMessageDialog(null, "ȸ��Ż�𼺰�");
						frame.dispose();
						Main.loginMember = null;
						Main.main(null);

					} else {
						JOptionPane.showMessageDialog(null, "ȸ�������� �ٽ��Է����ּ���.", "ȸ��Ż��", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		Ż��.setBounds(88, 340, 107, 28);
		frame.getContentPane().add(Ż��);
		
		JLabel ���ư��� = new JLabel("");
		���ư���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				teamGUI team = new teamGUI();
				frame.dispose();
			}
		});
		���ư���.setBounds(88, 388, 107, 34);
		frame.getContentPane().add(���ư���);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC3.JPG"));
		lblNewLabel.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel);
	}
}
