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

public class P2_1Classmgment_GUI {
	ArrayList<TeacherVO> al = new ArrayList<TeacherVO>();
	TeacherDAO dao = new TeacherDAO();
	private JFrame frame;
	private JTable table;
	String id;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="a1";
					P2_1Classmgment_GUI window = new P2_1Classmgment_GUI(id);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public P2_1Classmgment_GUI(String id) {
		System.out.println(id);
		this.id=id;
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
		table.setFillsViewportHeight(true);// ??????????
		//???????? ?????? ???? ???? ,, ???????? ?????? ?????? ???? **
		scrollPane.setViewportView(table);
		frame.getContentPane().add(scrollPane);
		
		
		
		JLabel lblNewLabel = new JLabel("CLASS LIST");
		lblNewLabel.setFont(new Font("???? ????", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 85, 186, 52);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JButton btn_insert = new JButton("\uBC18 \uC0DD\uC131");
		btn_insert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P2_2createClass();
			}
		});
		btn_insert.setFont(new Font("????", Font.BOLD, 13));
		btn_insert.setBounds(459, 199, 97, 43);
		frame.getContentPane().add(btn_insert);
		
		JButton btn_delete = 
				new JButton("\uBC18 \uC0AD\uC81C");
		btn_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectRow = table.getSelectedRow();
				System.out.println(selectRow);
				System.out.println(data[selectRow][0]);
				int cnt = dao.deleteClass(data[selectRow][0]);
				if(cnt > 0) {
					JOptionPane.showMessageDialog(null, "?? ????????!");
					frame.dispose();
					new P2_1Classmgment_GUI(id);
				}else {
					JOptionPane.showMessageDialog(null, "???? ????!");
				}
			}
		});
//		btn_delete.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String Class_number = "0";
//				boolean result = dao.Class_delete(Class_number);
//				System.out.println();
//				System.out.println(result);
//				if(result == true) {
//					JOptionPane.showMessageDialog(null, "?????? ????");
//					new Classmgment_GUI();
//					frame.dispose();
//				}else {
//					JOptionPane.showMessageDialog(null, "?????? ????", "??????", JOptionPane.ERROR_MESSAGE);
//				}
//			}
//		});
		btn_delete.setFont(new Font("????", Font.BOLD, 13));
		btn_delete.setBounds(459, 262, 97, 43);
		frame.getContentPane().add(btn_delete);
		
				
		
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		
		JButton button = new JButton("\uB2EB\uAE30");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		button.setFont(new Font("????", Font.BOLD, 13));
		button.setBounds(575, 408, 97, 43);
		frame.getContentPane().add(button);
		
	}
}
