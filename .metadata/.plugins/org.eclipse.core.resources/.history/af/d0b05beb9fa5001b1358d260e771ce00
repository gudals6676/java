package c;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


import DaoVo.StudentDAO;

import DaoVo.StudentVO;
import DaoVo.TeacherDAO;
import DaoVo.TeacherVO;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

public class Classmgment_GUI {
	ArrayList<TeacherVO> al = new ArrayList<TeacherVO>();
   
	
	
    StudentDAO dao = new StudentDAO();
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Classmgment_GUI() {
		
		
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("CLASS LIST");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 85, 186, 52);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JButton btn_insert = new JButton("\uBC18 \uC0DD\uC131");
		btn_insert.setFont(new Font("굴림", Font.BOLD, 13));
		btn_insert.setBounds(459, 199, 97, 43);
		frame.getContentPane().add(btn_insert);
		
		JButton btn_delete = 
				new JButton("\uBC18 \uC0AD\uC81C");
//		btn_delete.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String Class_number = "0";
//				boolean result = dao.Class_delete(Class_number);
//				System.out.println();
//				System.out.println(result);
//				if(result == true) {
//					JOptionPane.showMessageDialog(null, "반삭제 성공");
//					new Classmgment_GUI();
//					frame.dispose();
//				}else {
//					JOptionPane.showMessageDialog(null, "반삭제 실패", "반삭제", JOptionPane.ERROR_MESSAGE);
//				}
//			}
//		});
		btn_delete.setFont(new Font("굴림", Font.BOLD, 13));
		btn_delete.setBounds(459, 262, 97, 43);
		frame.getContentPane().add(btn_delete);
		
		TeacherDAO dao = new TeacherDAO();		
		al = dao.selectClass();
		String[] header = {"Class_number","Class_className","Tea_id","Class_branch"};
		String[][] data = new String[al.size()][4];//3:7
		
		for (int i = 0; i < al.size(); i++) {
	        
	        	 data[i][0] = al.get(i).getClass_Number();
	        	 data[i][1] = al.get(i).getClass_className();
	        	 data[i][2] = al.get(i).getC_tea_id();
	        	 data[i][3] = al.get(i).getClass_branch();
	        	
	         
	      }
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 154, 422, 277);
		
		JTable table = new JTable(data,header);
		table.setFillsViewportHeight(true);// 꽉차게하기
		//테이블에 스크롤 패널 추가 ,, 칼럼이름 보이기 위해서 추가 **
		scrollPane.setViewportView(table);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		
	}
}
