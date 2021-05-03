package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

public class joinGUI {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	private JTextField tf_area;
	private JTextField tf_team;
	private JTextField tf_chpw;
	private JLabel ���;
	private JLabel ���ư���;
	private JLabel lblNewLabel;

	public joinGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tf_id = new JTextField("���̵� �Է��ϼ���.");
		tf_id.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_id.setText("");
			}
		});
		tf_id.setBounds(59, 119, 173, 20);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);

		tf_pw = new JTextField("��й�ȣ�� �Է��ϼ���.");
		tf_pw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_pw.setText("");
			}
		});
		tf_pw.setColumns(10);
		tf_pw.setBounds(59, 245,173, 20);
		frame.getContentPane().add(tf_pw);

		tf_area = new JTextField("Ȱ�� ������ �Է��ϼ���.");
		tf_area.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_area.setText("");
			}
		});
		tf_area.setColumns(10);
		tf_area.setBounds(59, 161,173, 20);
		frame.getContentPane().add(tf_area);

		tf_team = new JTextField("������ �Է��ϼ���.");
		tf_team.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_team.setText("");
			}
		});
		tf_team.setColumns(10);
		tf_team.setBounds(59, 202,173, 20);
		frame.getContentPane().add(tf_team);

		tf_chpw = new JTextField("��й�ȣ Ȯ��.");
		tf_chpw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_chpw.setText("");
			}
		});
		tf_chpw.setColumns(10);
		tf_chpw.setBounds(59, 290, 173, 20);
		frame.getContentPane().add(tf_chpw);
		
		��� = new JLabel("");
		���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();
				String chpw = tf_chpw.getText();
				String area = tf_area.getText();
				String team = tf_team.getText();

				if (pw.equals(chpw)) {

					DAO dao = new DAO();
					TeamVO teamvo = new TeamVO(id, pw, area, team);
					int cnt = dao.join(teamvo);

					if (cnt == 0) {
						JOptionPane.showMessageDialog(null, "ȸ������ ����", "ȸ������", JOptionPane.CANCEL_OPTION);

					} else {

						JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.", "ȸ������", JOptionPane.CANCEL_OPTION);
						teamGUI teamgui = new teamGUI();
						frame.dispose();
					}
				} else {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.", "ȸ������", JOptionPane.ERROR_MESSAGE);
					
					tf_team.setText("��");
					tf_area.setText("����");
					tf_id.setText("ID");
					tf_pw.setText("PW");
					tf_chpw.setText("CHPW");
				}

			}
		});
		���.setBounds(87, 334, 110, 36);
		frame.getContentPane().add(���);
		
		���ư��� = new JLabel("");
		���ư���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.main(null);
				frame.dispose();
			}
		});
		���ư���.setBounds(87, 387, 110, 39);
		frame.getContentPane().add(���ư���);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC2.JPG"));
		lblNewLabel.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel);

	}
}
