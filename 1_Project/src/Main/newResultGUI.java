package Main;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import DAO.DAO;
import VO.ScoreVO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class newResultGUI {

	private JFrame frame;
	private JTable game_table;

	public newResultGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 64, 430, 140);
		frame.getContentPane().add(scrollPane);

		String[] colNames = { "팀명", "득점", "실점", "경기 결과", "경기 날짜" };
		DAO dao = new DAO();
		ArrayList<ScoreVO> sv = dao.setScore();
		Object[][] data = new Object[sv.size()][5];

		for (int i = 0; i < sv.size(); i++) {
			data[i][0] = sv.get(i).getTeam();
			data[i][1] = sv.get(i).getGoal();
			data[i][2] = sv.get(i).getLost();
			data[i][3] = sv.get(i).getResult();
			data[i][4] = sv.get(i).getG_Date();
		}

		game_table = new JTable(data, colNames);
		game_table.setEnabled(false);
//		game_table.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				
//				String getTeam = (String)game_table.getValueAt(game_table.getSelectedRow(), 0);
//				UpdateScoreGUI usg = new UpdateScoreGUI();
//				frame.dispose();
//			}
//		});

		// 셀 크기 조절
		game_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		TableColumnModel colModel = game_table.getColumnModel();
		colModel.getColumn(0).setPreferredWidth(120);
		colModel.getColumn(1).setPreferredWidth(70);
		colModel.getColumn(2).setPreferredWidth(70);
		colModel.getColumn(3).setPreferredWidth(70);
		colModel.getColumn(4).setPreferredWidth(70);

		// 가운데 정렬
		DefaultTableCellRenderer align = new DefaultTableCellRenderer();
		align.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < colModel.getColumnCount(); i++) {
			colModel.getColumn(i).setCellRenderer(align);
		}

		scrollPane.setViewportView(game_table);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InputResultGUI ir = new InputResultGUI();
				// adminGUI ad = new adminGUI();
				frame.dispose();
			}
		});
		lblNewLabel.setBounds(12, 233, 80, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC6.jpg"));
		lblNewLabel_1.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel_1);

	}
}
