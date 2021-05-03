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
		String[] colNames = {"작성 번호", "팀이름", "제목", "내용"};
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
		
		JLabel 글작성 = new JLabel("");
		글작성.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				post_GUI post = new post_GUI();
				frame.dispose();
			}
		});
		글작성.setBounds(289, 229, 90, 24);
		frame.getContentPane().add(글작성);
		
		JLabel 글삭제 = new JLabel("");
		글삭제.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DAO dao = new DAO();
				int cnt = dao.postDelete(num);
				
				if(cnt == 0) {
					JOptionPane.showMessageDialog(null, "글삭제 완료");
				} else {
					JOptionPane.showMessageDialog(null,"글삭제 실패");					
				}
				
				
				frame.dispose();
				wr_list_GUI WLG = new wr_list_GUI();
			}
		});
		글삭제.setBounds(391, 229, 81, 22);
		frame.getContentPane().add(글삭제);
		
		JLabel 돌아가기 = new JLabel("");
		돌아가기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminGUI ad = new adminGUI();
				//teamGUI tg = new teamGUI();
				frame.dispose();
			}
		});
		돌아가기.setBounds(0, 229, 90, 32);
		frame.getContentPane().add(돌아가기);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC4.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
		
	

	}
}