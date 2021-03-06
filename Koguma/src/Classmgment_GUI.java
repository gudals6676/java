import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


import DAO.StudentDAO;

import VO.StudentVO;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

public class Classmgment_GUI {
	ArrayList<StudentVO> al = new ArrayList<StudentVO>();
   
	
	
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
		lblNewLabel.setFont(new Font("???? ????", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 85, 186, 52);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JButton btn_insert = new JButton("\uBC18 \uC0DD\uC131");
		btn_insert.setFont(new Font("????", Font.BOLD, 13));
		btn_insert.setBounds(459, 199, 97, 43);
		frame.getContentPane().add(btn_insert);
		
		JButton btn_delete = 
				new JButton("\uBC18 \uC0AD\uC81C");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Class_number = "0";
				boolean result = dao.Class_delete(Class_number);
				System.out.println();
				System.out.println(result);
				if(result == true) {
					JOptionPane.showMessageDialog(null, "?ݻ??? ????");
					new Classmgment_GUI();
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "?ݻ??? ????", "?ݻ???", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn_delete.setFont(new Font("????", Font.BOLD, 13));
		btn_delete.setBounds(459, 262, 97, 43);
		frame.getContentPane().add(btn_delete);
		
		StudentDAO dao = new StudentDAO();		
		al = dao.SelectALL();
		String[] header = {"Class_className","Class_number","Tea_id","Class_branch"};
		String[][] data = new String[al.size()][4];//3:7
		
		for (int i = 0; i < al.size(); i++) {
	         for (int j = 0; j < 4; j++) {
	            if(j == 0) {
	               data[i][j] = al.get(i).getClass_className();
	            }else if(j == 1) {
	               data[i][j] = al.get(i).getClass_number();
	            }else if(j == 2) {
	               data[i][j] = al.get(i).getClass_branch();
	            }else if(j == 3) {
	            	data[i][j] = al.get(i).getTea_id();
	            }
	         }
	      }
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 154, 422, 277);
		
		JTable table = new JTable(data,header);
		table.setFillsViewportHeight(true);// ???????ϱ?
		//???̺??? ??ũ?? ?г? ?߰? ,, Į???̸? ???̱? ???ؼ? ?߰? **
		scrollPane.setViewportView(table);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		
	}
}
