package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DAO.GameDAO;
import VO.GameVO;
import VO.RankVO2;
import VO.ScoreVO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class InputResultGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Create the application.
	 */
	public InputResultGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 85, 386, 90);
		frame.getContentPane().add(scrollPane);
		
		//승인된 경기 목록 불러오기
		GameDAO dao = new GameDAO();
		String[] colNames = {"번호", "팀명", "상대팀", "시간", "장소", "날짜"};
		ArrayList<GameVO> al = dao.blankResult();
		Object[][] data = new Object[al.size()][colNames.length];
		for(int i=0; i<al.size(); i++) {
			data[i][0] = al.get(i).getNum();
			data[i][1] = al.get(i).getTeam();
			data[i][2] = al.get(i).getOppose();
			data[i][3] = al.get(i).getG_time();
			data[i][4] = al.get(i).getG_place();
			data[i][5] = al.get(i).getG_date();
			//data[i][6] = al.get(i).getStatus();
		}
		
		table = new JTable(data, colNames);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UpdateResultGUI ur = new UpdateResultGUI();
				frame.dispose();
			}
		});
		lblNewLabel.setBounds(305, 232, 81, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				newResultGUI nr = new newResultGUI();
				frame.dispose();
			}
		});
		lblNewLabel_1.setBounds(394, 232, 78, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminGUI adm = new adminGUI();
				frame.dispose();
			}
		});
		lblNewLabel_2.setBounds(0, 232, 91, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC7.jpg"));
		lblNewLabel_3.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
