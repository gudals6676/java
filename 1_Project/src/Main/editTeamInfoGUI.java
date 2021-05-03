package Main;

import java.awt.Font;
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
import javax.swing.SwingConstants;

import DAO.DAO;
import VO.TeamVO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;


public class editTeamInfoGUI {

	private JFrame frame;
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private JTextField tf_pw;
	private JTextField tf_area;
	private JTextField tf_id;
	private JLabel ����;
	private JLabel ���ư���;
	private JLabel lblNewLabel;

	public editTeamInfoGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String id = Main.loginMember.getTeam();

		tf_pw = new JTextField("��й�ȣ�� ���� �� �ּ���.");
		tf_pw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_pw.setText("");
			}
		});
		tf_pw.setColumns(10);
		tf_pw.setBounds(41, 223, 195, 21);
		frame.getContentPane().add(tf_pw);

		tf_area = new JTextField("���ο� Ȱ�� ������ �����ϼ���.");
		tf_area.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_area.setText("");
			}
		});
		tf_area.setColumns(10);
		tf_area.setBounds(41, 262, 195, 21);
		frame.getContentPane().add(tf_area);
		
		tf_id = new JTextField("���� ID�� �Է��ϼ���.");
		tf_id.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tf_id.setText("");
			}
		});
		tf_id.setColumns(10);
		tf_id.setBounds(41, 175, 195, 21);
		frame.getContentPane().add(tf_id);
		
		���� = new JLabel("");
		����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();
				String area = tf_area.getText();
			
				if (pw.equals("") || area.equals("")) {
					JOptionPane.showMessageDialog(null, "��ĭ�� �����մϴ�.", "ȸ������ ����", JOptionPane.ERROR_MESSAGE);
				} else {
					TeamVO vo = new TeamVO(id, pw, area);
					
					DAO dao = new DAO();
					int cnt = dao.updateinfo(vo);
					if (cnt > 0) {
						Main.loginMember = vo;
						JOptionPane.showMessageDialog(null, "ȸ������ ���� ����");
						frame.dispose();
						Main.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "ȸ������ ���� ����", "ȸ������ ����", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		����.setBounds(87, 334, 111, 36);
		frame.getContentPane().add(����);
		
		���ư��� = new JLabel("");
		���ư���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				teamMenu_GUI tm = new teamMenu_GUI();
				frame.dispose();
			}
		});
		���ư���.setBounds(87, 387, 111, 36);
		frame.getContentPane().add(���ư���);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC7.JPG"));
		lblNewLabel.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
