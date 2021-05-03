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
	private JLabel 수정;
	private JLabel 삭제;
	private JLabel 돌아가기;
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
		String[] colNames = {"번호", "팀명", "이름", "나이", "선출여부", "직함"};
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
		
		수정 = new JLabel("");
		수정.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editMember edit = new editMember(click);
				//System.out.println(click);
				frame.dispose();
			}
		});
		수정.setBounds(303, 230, 84, 26);
		frame.getContentPane().add(수정);
		
		삭제 = new JLabel("");
		삭제.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cnt = dao.deletePlayer(click);
				//System.out.println(click);
				
				if(cnt==1) {
					JOptionPane.showMessageDialog(null, "선수 삭제 성공!");
					frame.dispose();
					PLAYER_ADD_GUI add = new PLAYER_ADD_GUI();
					//삭제 성공하고 나면 이전창으로
				}else {
					JOptionPane.showMessageDialog(null, "선수 삭제 실패!");
				}
			}
		});
		삭제.setBounds(399, 230, 73, 26);
		frame.getContentPane().add(삭제);
		
		돌아가기 = new JLabel("");
		돌아가기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					PLAYER_ADD_GUI playerAdd = new PLAYER_ADD_GUI();
					frame.dispose(); 
				}
				
			
		});
		돌아가기.setBounds(0, 230, 92, 26);
		frame.getContentPane().add(돌아가기);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uD50C\uB808\uC774\uC5B4\uB9AC\uC2A4\uD2B8.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
