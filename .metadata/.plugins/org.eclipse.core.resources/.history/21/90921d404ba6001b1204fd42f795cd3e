package c;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DaoVo.TeacherDAO;
import DaoVo.TeacherVO;

import java.awt.GridLayout;
import java.awt.Font;

public class P2_5Teacher_GUI_2 {

	private JFrame frame;
	TeacherDAO dao = new TeacherDAO();
	ArrayList<TeacherVO> al = null;
	String id="";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="a1";
					P2_5Teacher_GUI_2 window = new P2_5Teacher_GUI_2(id);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public P2_5Teacher_GUI_2() {
		al = dao.teacher_calss_select(); // 조인으로 값을 받아온다
		initialize();
		frame.setVisible(true);
	}
	public P2_5Teacher_GUI_2(String id) {
		al = dao.teacher_calss_select(); // 조인으로 값을 받아온다
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

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(490, 123, 182, 283);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(3, 2, 0, 0));

		JLabel stu_id = new JLabel("\uC774 \uB984");
		panel_1.add(stu_id);

		JLabel stu_id1 = new JLabel("");
		panel_1.add(stu_id1);

		JLabel sco_subject = new JLabel("\uACFC \uBAA9");
		panel_1.add(sco_subject);

		JLabel sco_subject1 = new JLabel("");
		panel_1.add(sco_subject1);

		JLabel sco_score = new JLabel("\uC810 \uC218");
		panel_1.add(sco_score);

		JLabel sco_score1 = new JLabel("");
		panel_1.add(sco_score1);

		String[] header = { "stu_id", "sco_subject1", "sco_score1" };
		// 커럼값(데이터) -2차원 배열
		String[][] data = new String[al.size()][4]; // 받아온 값중 표시하고 싶은 값만 표시함
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j <= 2; j++) {
				if (j == 0) {
					data[i][j] = al.get(i).getStu_name();
				} else if (j == 1) {
					data[i][j] = al.get(i).getSco_subject();
				} else if (j == 2) {
					data[i][j] = al.get(i).getSco_score();
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
		JTable table = new JTable(data, header);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				String stu_id = (String) table.getModel().getValueAt(row, 0);
				String sco_subject = (String) table.getModel().getValueAt(row, 1);
				String sco_score = (String) table.getModel().getValueAt(row, 2);

				stu_id1.setText(stu_id);
				sco_subject1.setText(sco_subject);
				sco_score1.setText(sco_score);

			}
		});
		// 패널 전체에 테이블이 꽉차게 만들고 싶을때
		table.setFillsViewportHeight(true);
		// 테이블을 스크롤 패널에 추가, 컬럼이름이 보이기 위해서 추가
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("                 \uC810\uC218 \uC870\uD68C");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBounds(17, 10, 655, 103);
		frame.getContentPane().add(lblNewLabel);

	}

}
