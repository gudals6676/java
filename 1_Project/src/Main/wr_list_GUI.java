package Main;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.DAO;
import VO.wr_list_VO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class wr_list_GUI {

	private JFrame frame;
	private JTable table;
	int num ;
	public wr_list_GUI() {
		initialize();
		frame.setVisible(true);
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DAO dao = new DAO();
		String[] colNames = {"�ۼ� ��ȣ", "���̸�", "����", "����"};
		ArrayList<wr_list_VO> al = dao.WritingList();
		Object[][] data = new Object[al.size()][4];
		for(int i = 0; i<al.size(); i++) {
			data[i][0] = al.get(i).getNum();
			data[i][1] = al.get(i).getTeam();
			data[i][2] = al.get(i).getB_title();
			data[i][3] = al.get(i).getContent();
			
			
		}
		

		table = new JTable(data, colNames);
		table.addMouseListener(new MouseAdapter() {
			
	         public void mouseClicked(MouseEvent me) {
	        	 
	        
	        	 num = (int)table.getValueAt(table.getSelectedRow(), 0);
	 			DAO dao = new DAO();
	 			dao.postDelete(num);
	 			
	         }
	           
	      });
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 46, 460, 160);
		frame.getContentPane().add(scrollPane);
		
		scrollPane.setViewportView(table);
		
		JLabel ���ۼ� = new JLabel("");
		���ۼ�.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				post_GUI post = new post_GUI();
				frame.dispose();
			}
		});
		���ۼ�.setBounds(289, 229, 90, 24);
		frame.getContentPane().add(���ۼ�);
		
		JLabel �ۻ��� = new JLabel("");
		�ۻ���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DAO dao = new DAO();
				int cnt = dao.postDelete(num);
				
				if(cnt == 0) {
					JOptionPane.showMessageDialog(null, "�ۻ��� �Ϸ�");
				} else {
					JOptionPane.showMessageDialog(null,"�ۻ��� ����");					
				}
				
				
				frame.dispose();
				wr_list_GUI WLG = new wr_list_GUI();
			}
		});
		�ۻ���.setBounds(391, 229, 81, 22);
		frame.getContentPane().add(�ۻ���);
		
		JLabel ���ư��� = new JLabel("");
		���ư���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminGUI ad = new adminGUI();
				//teamGUI tg = new teamGUI();
				frame.dispose();
			}
		});
		���ư���.setBounds(0, 229, 90, 32);
		frame.getContentPane().add(���ư���);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC4.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
		
	

	}
}