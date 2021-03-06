import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import DAO.StudentDAO;
import VO.StudentVO;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
//T_S_018
public class Studentinfo_GUI {
	String Stu_name;
	String Stu_tel;
	String Stu_email;
	String Stu_address;
	StudentDAO dao = new StudentDAO();
	String S_id ="";
	ArrayList<StudentVO> al = null;
	private JFrame frame;
	private JTable table;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Studentinfo_GUI() {
		al = dao.SelectALL();			
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame();
		frame.setBounds(100, 100, 727, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(265, 10, 159, 48);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(466, 10, 111, 48);
		frame.getContentPane().add(label_1);
		
				
		al = dao.SelectALL();
		String[] header = {"Stu_name","Stu_tel","Stu_email","Stu_address"};
		String[][] data = new String[al.size()][4];//3:7
		
		for (int i = 0; i < al.size(); i++) {
	         for (int j = 0; j < 4; j++) {
	            if(j == 0) {
	               data[i][j] = al.get(i).getStu_name();
	            }else if(j == 1) {
	               data[i][j] = al.get(i).getStu_tel();
	            }else if(j == 2) {
	               data[i][j] = al.get(i).getStu_email();
	            }else if(j == 3) {
	            	data[i][j] = al.get(i).getStu_address();
	            }
	         }
	      }
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 154, 422, 277);
		
		table = new JTable(data,header);
		table.setFillsViewportHeight(true);// ??????????
		//???????? ?????? ???? ???? ,, ???????? ?????? ?????? ???? **
		scrollPane.setViewportView(table);
		frame.getContentPane().add(scrollPane);
		
		JLabel label_2 = new JLabel("STUDENT INFO");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("???? ????", Font.PLAIN, 25));
		label_2.setBounds(123, 83, 206, 48);
		frame.getContentPane().add(label_2);
		
		JLabel lbl_name = new JLabel("\uC774\uB984");
		lbl_name.setBounds(481, 170, 82, 24);
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_tel = new JLabel("\uC804\uD654\uBC88\uD638");
		lbl_tel.setBounds(481, 204, 82, 24);
		frame.getContentPane().add(lbl_tel);
		
		JLabel lbl_email = new JLabel("\uC774\uBA54\uC77C");
		lbl_email.setBounds(481, 238, 82, 24);
		frame.getContentPane().add(lbl_email);
		
		JLabel lbl_address = new JLabel("\uC8FC\uC18C");
		lbl_address.setBounds(481, 275, 82, 24);
		frame.getContentPane().add(lbl_address);
		
		JLabel info_name = new JLabel("");
		info_name.setHorizontalAlignment(SwingConstants.CENTER);
		info_name.setBounds(589, 170, 82, 24);
		frame.getContentPane().add(info_name);
		
		JLabel info_tel = new JLabel("");
		info_tel.setHorizontalAlignment(SwingConstants.CENTER);
		info_tel.setBounds(589, 204, 82, 24);
		frame.getContentPane().add(info_tel);
		
		JLabel info_email = new JLabel("");
		info_email.setHorizontalAlignment(SwingConstants.CENTER);
		info_email.setBounds(589, 238, 82, 24);
		frame.getContentPane().add(info_email);
		
		JLabel info_address = new JLabel("");
		info_address.setHorizontalAlignment(SwingConstants.CENTER);
		info_address.setBounds(589, 275, 82, 24);
		frame.getContentPane().add(info_address);
		
		JButton btn = new JButton("\uBA74\uB2F4 \uC2E0\uCCAD");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {/////????????
					JOptionPane.showMessageDialog(null, "???????? ??????????.");
					new Studentinfo_GUI();//
					frame.dispose();
			}
		});
		btn.setFont(new Font("???? ????", Font.PLAIN, 14));
		btn.setBounds(590, 379, 97, 33);
		frame.getContentPane().add(btn);
	}

}
