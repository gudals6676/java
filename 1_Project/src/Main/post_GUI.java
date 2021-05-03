package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DAO.DAO;
import VO.wr_list_VO;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class post_GUI {

	private JFrame frame;
	private JTextField tf_B_title;
	private JTextField tf_team;
	private JTextField tf_content;
	private JLabel �ۼ�;
	private JLabel lblNewLabel;

	public post_GUI() {
		initialize();
		frame.setVisible(true);
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel ���ư��� = new JLabel("");
		���ư���.setBounds(0, 233, 90, 21);
		frame.getContentPane().add(���ư���);
		
		�ۼ� = new JLabel("");
		�ۼ�.setBounds(386, 228, 86, 26);
		frame.getContentPane().add(�ۼ�);
		
		tf_team = new JTextField((Main.loginMember.getId()));
		tf_team.setBounds(53, 35, 173, 21);
		frame.getContentPane().add(tf_team);
		tf_team.setColumns(10);
		
		tf_B_title = new JTextField("������ �Է��ϼ���.");
		tf_B_title.setBounds(238, 35, 183, 21);
		frame.getContentPane().add(tf_B_title);
		tf_B_title.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tf_B_title.setText("");
			}
		});
		tf_B_title.setColumns(10);
		
		tf_content = new JTextField("������ �Է��ϼ���.");
		tf_content.setBounds(53, 69, 368, 141);
		frame.getContentPane().add(tf_content);
		tf_content.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_content.setText("");
			}
		});
		tf_content.setColumns(10);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC5.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
		�ۼ�.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String team = Main.loginMember.getId();
				String B_title = tf_B_title.getText();
				String content = tf_content.getText();
				
				DAO dao = new DAO();
				wr_list_VO vo = new wr_list_VO(team, B_title, content);
				int cnt = dao.PostInsert(vo);
				
				if (cnt == 0) {
					JOptionPane.showMessageDialog(null, "Error!");
				} else {
					JOptionPane.showMessageDialog(null,"�� �ۼ��Ϸ�");
					
					if(!tf_team.getText().equals("admin")) {
					     wr_user_GUI wlg = new wr_user_GUI();
						 frame.dispose();
						}else {
							wr_list_GUI adminlist = new wr_list_GUI();
							frame.dispose();
						}
					
					
				}
			}
		});
		���ư���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!tf_team.getText().equals("admin")) {
				     wr_user_GUI wlg = new wr_user_GUI();
					 frame.dispose();
					}else {
						wr_list_GUI adminlist = new wr_list_GUI();
						frame.dispose();
					}
			}
			
			
		});
	}
}
