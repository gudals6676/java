package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import DAO.DAO;
import VO.TeamVO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class team_Reference {

	private JFrame frame;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel label;
	private JLabel lblNewLabel;

	
	public team_Reference() {
		initialize();
		frame.setVisible(true);
	}

	
	private void initialize() {

		
		frame = new JFrame();
		frame.setBounds(750, 200, 494, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 87, 478, 107);
		frame.getContentPane().add(scrollPane);
		
		DAO dao = new DAO();
		dao.TeamList();
		
		String[] colNames = {"활동지역","팀명","Id","Pw"};
		ArrayList<TeamVO> plList = dao.TeamList();
		Object[][] data = new Object[plList.size()][4];
		for(int i = 0; i < plList.size(); i++) {
			data[i][0] = plList.get(i).getTeam();
			data[i][1] = plList.get(i).getId();
			data[i][2] = plList.get(i).getPw();
			data[i][3] = plList.get(i).getArea();

		}
		
		
	
		DefaultTableModel model = new DefaultTableModel(data,colNames) {
			
			public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminGUI admin = new adminGUI();
				frame.dispose();
			}
		});
		label.setBounds(0, 238, 93, 33);
		frame.getContentPane().add(label);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\가로수정본\\슬라이드3.jpg"));
		lblNewLabel.setBounds(0, 0, 478, 278);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
