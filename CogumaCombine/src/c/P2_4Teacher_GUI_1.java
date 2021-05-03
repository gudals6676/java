package c;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DaoVo.TeacherDAO;
import DaoVo.TeacherVO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;


public class P2_4Teacher_GUI_1 {

	JFrame frame;
	TeacherDAO dao=null;
	String qwe = "";
	String id="";
	JTextField textField;
	ArrayList<TeacherVO> al = null;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="a1";
					P2_4Teacher_GUI_1 window = new P2_4Teacher_GUI_1(id);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public P2_4Teacher_GUI_1() {
		initialize();
		frame.setVisible(true);
	}

	public P2_4Teacher_GUI_1(String id) {
		System.out.println();
		this.id=id;
		initialize();
		frame.setVisible(true);
	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(490, 123, 182, 216);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel stu_id = new JLabel(" 학생 ID");
		panel_1.add(stu_id);

		JLabel stu_id1 = new JLabel("");
		panel_1.add(stu_id1);

		JLabel s_tea_id = new JLabel(" 담당 선생님 ID");
		panel_1.add(s_tea_id);

		JLabel s_tea_id1 = new JLabel("");
		panel_1.add(s_tea_id1);

		JLabel s_Class_number = new JLabel("반 이름");
		panel_1.add(s_Class_number);

		JLabel s_Class_number1 = new JLabel("");
		panel_1.add(s_Class_number1);

		JLabel stu_pw = new JLabel("학생비밀번호");
		panel_1.add(stu_pw);

		JLabel stu_pw1 = new JLabel("");
		panel_1.add(stu_pw1);

		JLabel stu_name = new JLabel("학생이름");
		panel_1.add(stu_name);

		JLabel stu_name1 = new JLabel("");
		panel_1.add(stu_name1);

		JLabel stu_birthday = new JLabel("생일");
		panel_1.add(stu_birthday);

		JLabel stu_birthday1 = new JLabel("");
		panel_1.add(stu_birthday1);

		JLabel stu_tel = new JLabel("전화번호");
		panel_1.add(stu_tel);

		JLabel stu_tel1 = new JLabel("");
		panel_1.add(stu_tel1);

		JLabel stu_address = new JLabel("주소");
		panel_1.add(stu_address);

		JLabel stu_address1 = new JLabel("");
		panel_1.add(stu_address1);

		JLabel stu_email = new JLabel("E-mail");
		panel_1.add(stu_email);

		JLabel stu_email1 = new JLabel("");
		panel_1.add(stu_email1);

		JLabel stu_meet = new JLabel("학생 면담신청");
		panel_1.add(stu_meet);

		JLabel stu_meet1 = new JLabel("");
		panel_1.add(stu_meet1);

		JLabel stu_BMN = new JLabel("학생의 보충 횟수");
		panel_1.add(stu_BMN);

		JLabel stu_BMN1 = new JLabel("");
		panel_1.add(stu_BMN1);
		
		TeacherDAO dao = new TeacherDAO();
		al = dao.teacher_STUDENT_noselect();
		
		String[] header = { "stu_id", "s_tea_id", "s_Class_number", "stu_pw", "HOBBY", "stu_name", "stu_birthday",
				"stu_tel", "stu_address", "stu_email", "stu_BMN", };
		// 커럼값(데이터) -2차원 배열
		String[][] data1 = new String[al.size()][11]; // 표시하고 싶은 값만 표시
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
		// 테이블 생성
		////////////////////////////////////////
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
		// 패널 전체에 테이블이 꽉차게 만들고 싶을때
		table.setFillsViewportHeight(true);
		// 테이블을 스크롤 패널에 추가, 컬럼이름이 보이기 위해서 추가
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("\uC810\uC218 \uC870\uD68C");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {//점수조회
			public void actionPerformed(ActionEvent e) {
				new P2_5Teacher_GUI_2(id);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(490, 351, 182, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("                   \uD559\uC0DD\uC870\uD68C");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 39));
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
				// 새로고침 하는 부분 (창 끄고 다시 띄우기)
				frame.dispose();
				new P2_4Teacher_GUI_1(id);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 11));
		btnNewButton_1.setBounds(585, 383, 87, 23);
		frame.getContentPane().add(btnNewButton_1);

	}
}
