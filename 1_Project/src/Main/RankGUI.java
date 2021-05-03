package Main;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import DAO.GameDAO;
import VO.RankVO2;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class RankGUI {

	private JFrame frame;
	private JTable tb_rank;

	/**
	 * Create the application.
	 */
	public RankGUI() {
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
		scrollPane.setBounds(50, 70, 385, 108);
		frame.getContentPane().add(scrollPane);
		
		GameDAO dao = new GameDAO();
		String[] colNames = {"순위", "팀명", "승수", "총 득점", "총 실점"};
		ArrayList<RankVO2> al = dao.rankView();
		Object[][] data = new Object[al.size()][colNames.length];
		for(int i=0; i<al.size(); i++) {
			data[i][0] = (i+1)+"위";
			data[i][1] = al.get(i).getTeam();
			data[i][2] = al.get(i).getCountWin();
			data[i][3] = al.get(i).getSumGoal();
			data[i][4] = al.get(i).getSumLost();
		}
		
		tb_rank = new JTable(data, colNames);
		tb_rank.setEnabled(false);
		scrollPane.setViewportView(tb_rank);
		
		//셀 크기 조절
		tb_rank.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		TableColumnModel 
		colModel = tb_rank.getColumnModel();
		colModel.getColumn(0).setPreferredWidth(40);
		colModel.getColumn(1).setPreferredWidth(120);
		colModel.getColumn(2).setPreferredWidth(80);
		colModel.getColumn(3).setPreferredWidth(80);
		colModel.getColumn(4).setPreferredWidth(80);
		
		//가운데 정렬
		DefaultTableCellRenderer align = new DefaultTableCellRenderer();
		align.setHorizontalAlignment(SwingConstants.CENTER);
		for(int i=0; i<colModel.getColumnCount(); i++) {
			colModel.getColumn(i).setCellRenderer(align);
		}
		
		JLabel 돌아가기 = new JLabel("");
		돌아가기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				teamGUI team = new teamGUI();
				frame.dispose();
			}
		});
		돌아가기.setBounds(12, 230, 80, 21);
		frame.getContentPane().add(돌아가기);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC10.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
