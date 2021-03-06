import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DAO.TeacherDAO;
import DAO.TeacherVO1;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Teacher_GUI_1 extends Teacher_GUI_2 {

	private JFrame frame;
	TeacherDAO dao = new TeacherDAO();
	ArrayList<TeacherVO1> al = null;
	String qwe = "";
	private JTextField textField;

	public Teacher_GUI_1() {
		System.out.println();
		al = dao.teacher_STUDENT_noselect();

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

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(490, 123, 182, 216);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel stu_id = new JLabel(" stu_id");
		panel_1.add(stu_id);

		JLabel stu_id1 = new JLabel("");
		panel_1.add(stu_id1);

		JLabel s_tea_id = new JLabel(" s_tea_id");
		panel_1.add(s_tea_id);

		JLabel s_tea_id1 = new JLabel("");
		panel_1.add(s_tea_id1);

		JLabel s_Class_number = new JLabel("s_Class_number");
		panel_1.add(s_Class_number);

		JLabel s_Class_number1 = new JLabel("");
		panel_1.add(s_Class_number1);

		JLabel stu_pw = new JLabel("stu_pw");
		panel_1.add(stu_pw);

		JLabel stu_pw1 = new JLabel("");
		panel_1.add(stu_pw1);

		JLabel stu_name = new JLabel("stu_name");
		panel_1.add(stu_name);

		JLabel stu_name1 = new JLabel("");
		panel_1.add(stu_name1);

		JLabel stu_birthday = new JLabel("stu_birthday");
		panel_1.add(stu_birthday);

		JLabel stu_birthday1 = new JLabel("");
		panel_1.add(stu_birthday1);

		JLabel stu_tel = new JLabel("stu_tel");
		panel_1.add(stu_tel);

		JLabel stu_tel1 = new JLabel("");
		panel_1.add(stu_tel1);

		JLabel stu_address = new JLabel("stu_address");
		panel_1.add(stu_address);

		JLabel stu_address1 = new JLabel("");
		panel_1.add(stu_address1);

		JLabel stu_email = new JLabel("stu_email");
		panel_1.add(stu_email);

		JLabel stu_email1 = new JLabel("");
		panel_1.add(stu_email1);

		JLabel stu_meet = new JLabel("stu_meet");
		panel_1.add(stu_meet);

		JLabel stu_meet1 = new JLabel("");
		panel_1.add(stu_meet1);

		JLabel stu_BMN = new JLabel("stu_BMN");
		panel_1.add(stu_BMN);

		JLabel stu_BMN1 = new JLabel("");
		panel_1.add(stu_BMN1);

		String[] header = { "stu_id", "s_tea_id", "s_Class_number", "stu_pw", "HOBBY", "stu_name", "stu_birthday",
				"stu_tel", "stu_address", "stu_email", "stu_BMN", };
		// ??????(??????) -2???? ????
		String[][] data1 = new String[al.size()][11]; // ???????? ???? ???? ????
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j <= 10; j++) {
				if (j == 0) {
					data1[i][j] = al.get(i).getStu_id();
				} else if (j == 1) {
					data1[i][j] = al.get(i).getS_tea_id();
				} else if (j == 2) {
					data1[i][j] = al.get(i).getS_Class_number();
				} else if (j == 3) {
					data1[i][j] = al.get(i).getStu_pw();
				} else if (j == 4) {
					data1[i][j] = al.get(i).getStu_name();
				} else if (j == 5) {
					data1[i][j] = al.get(i).getStu_birthday();
				} else if (j == 6) {
					data1[i][j] = al.get(i).getStu_tel();
				} else if (j == 7) {
					data1[i][j] = al.get(i).getStu_address();
				} else if (j == 8) {
					data1[i][j] = al.get(i).getStu_email();
				} else if (j == 9) {
					data1[i][j] = al.get(i).getStu_meet();
				} else if (j == 10) {
					data1[i][j] = al.get(i).getStu_BMN();
				}
			}
		}

		JPanel panel = new JPanel();
		panel.setBounds(17, 123, 461, 283);
		frame.getContentPane().add(panel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 403, 398, -278);
		panel.add(scrollPane);
		// ?????? ????
		JTable table = new JTable(data1, header);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				String stu_id = (String) table.getModel().getValueAt(row, 0);
				String s_tea_id = (String) table.getModel().getValueAt(row, 1);
				String s_Class_number = (String) table.getModel().getValueAt(row, 2);
				String stu_pw = (String) table.getModel().getValueAt(row, 3);
				String stu_name = (String) table.getModel().getValueAt(row, 4);
				String stu_birthday = (String) table.getModel().getValueAt(row, 5);
				String stu_tel = (String) table.getModel().getValueAt(row, 6);
				String stu_address = (String) table.getModel().getValueAt(row, 7);
				String stu_email = (String) table.getModel().getValueAt(row, 8);
				String stu_meet = (String) table.getModel().getValueAt(row, 9);
				String stu_BMN = (String) table.getModel().getValueAt(row, 10);

				stu_id1.setText(stu_id);
				s_tea_id1.setText(s_tea_id);
				s_Class_number1.setText(s_Class_number);
				stu_pw1.setText(stu_pw);
				stu_name1.setText(stu_name);
				stu_birthday1.setText(stu_birthday);
				stu_tel1.setText(stu_tel);
				stu_address1.setText(stu_address);
				stu_email1.setText(stu_email);
				stu_meet1.setText(stu_meet);
				stu_BMN1.setText(stu_BMN);
			}
		});
		// ???? ?????? ???????? ?????? ?????? ??????
		table.setFillsViewportHeight(true);
		// ???????? ?????? ?????? ????, ?????????? ?????? ?????? ????
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("\uC810\uC218 \uC870\uD68C");
		btnNewButton.setFont(new Font("????", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Teacher_GUI_2();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(490, 351, 182, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("                   \uD559\uC0DD\uC870\uD68C");
		lblNewLabel.setFont(new Font("????", Font.PLAIN, 39));
		lblNewLabel.setBounds(17, 10, 655, 103);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(490, 383, 83, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("\uBA74\uB2F4 \uC2E0\uCCAD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String qwe = textField.getText();
				dao.teacher_student_UPDATE(qwe);
				// ???????? ???? ???? (?? ???? ???? ??????)
				frame.dispose();
				new Teacher_GUI_1();
			}
		});
		btnNewButton_1.setFont(new Font("????", Font.PLAIN, 11));
		btnNewButton_1.setBounds(585, 383, 87, 23);
		frame.getContentPane().add(btnNewButton_1);

	}
}
