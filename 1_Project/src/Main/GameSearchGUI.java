package Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DAO.DAO;
import VO.GameSearchVO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class GameSearchGUI {

	private JFrame frame;
	private JTable game_table;
	int click;

	
	public GameSearchGUI() {
		initialize();
		frame.setVisible(true);
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 650, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 85, 584, 140);
		frame.getContentPane().add(scrollPane);
		
		DAO dao = new DAO();
		String[] colNames = {"경기번호", "팀명","상대팀","시간","장소","날짜","승인여부"};
		ArrayList<GameSearchVO> GSV = dao.search();
		Object[][] data = new Object[GSV.size()][7];
		
		for (int i = 0; i < GSV.size(); i++) {
			data[i][0] = GSV.get(i).getNum();
			data[i][1] = GSV.get(i).getTeam();
			data[i][2] = GSV.get(i).getOppose();
			data[i][3] = GSV.get(i).getHour();
			data[i][4] = GSV.get(i).getArea();
			data[i][5] = GSV.get(i).getDate();
			data[i][6] = GSV.get(i).getCheck();
			
		}
		
		
		game_table = new JTable(data, colNames);
		game_table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			click = (int)game_table.getValueAt(game_table.getSelectedRow(), 0);
			OkayGUI okay = new OkayGUI(click);
			frame.dispose();
			
			}
		});
		scrollPane.setViewportView(game_table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uAD00\uB9AC\uC790_\uACBD\uAE30 \uC870\uD68C.jpg"));
		lblNewLabel.setBounds(0, 0, 634, 311);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminGUI adg = new adminGUI();
				frame.dispose();
			}
		});
		lblNewLabel_1.setBounds(12, 278, 111, 23);
		frame.getContentPane().add(lblNewLabel_1);
	}
}

