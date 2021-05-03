package Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DAO.DAO;
import VO.PlayerVO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class PLAYER_LIST_GUI {

	private JFrame frame;
	private JTable tb_player;

	int click = 0;
	private JLabel ����;
	private JLabel ����;
	private JLabel ���ư���;
	private JLabel lblNewLabel;
	
	
	public PLAYER_LIST_GUI() {
		initialize();
		frame.setVisible(true);
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 43, 410, 172);
		frame.getContentPane().add(scrollPane);
		
		
		DAO dao = new DAO();
		String[] colNames = {"��ȣ", "����", "�̸�", "����", "���⿩��", "����"};
		ArrayList<PlayerVO> voList = dao.seePlayer();
		Object[][] data = new Object[voList.size()][6];
		for(int i = 0; i < voList.size(); i++) {
			data[i][0] = voList.get(i).getNum();
			data[i][1] = voList.get(i).getTeam();
			data[i][2] = voList.get(i).getName();
			data[i][3] = voList.get(i).getAge();
			data[i][4] = voList.get(i).getElite();
			data[i][5] = voList.get(i).getTitle();
		}
		
		tb_player = new JTable(data, colNames);
		tb_player.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				click = (int)tb_player.getValueAt(tb_player.getSelectedRow(), 0);
			}
		});
		scrollPane.setViewportView(tb_player);
		
		���� = new JLabel("");
		����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editMember edit = new editMember(click);
				//System.out.println(click);
				frame.dispose();
			}
		});
		����.setBounds(303, 230, 84, 26);
		frame.getContentPane().add(����);
		
		���� = new JLabel("");
		����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cnt = dao.deletePlayer(click);
				//System.out.println(click);
				
				if(cnt==1) {
					JOptionPane.showMessageDialog(null, "���� ���� ����!");
					frame.dispose();
					PLAYER_ADD_GUI add = new PLAYER_ADD_GUI();
					//���� �����ϰ� ���� ����â����
				}else {
					JOptionPane.showMessageDialog(null, "���� ���� ����!");
				}
			}
		});
		����.setBounds(399, 230, 73, 26);
		frame.getContentPane().add(����);
		
		���ư��� = new JLabel("");
		���ư���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					PLAYER_ADD_GUI playerAdd = new PLAYER_ADD_GUI();
					frame.dispose(); 
				}
				
			
		});
		���ư���.setBounds(0, 230, 92, 26);
		frame.getContentPane().add(���ư���);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uD50C\uB808\uC774\uC5B4\uB9AC\uC2A4\uD2B8.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
