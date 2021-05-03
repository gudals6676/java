package c;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import DaoVo.StudentDAO;
import DaoVo.StudentVO;

import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P1_5Scoreinfo_GUI {

	private JFrame frame;
	StudentDAO dao = new StudentDAO();
	ArrayList<StudentVO> al = null;
	String selected_id = "";
	String id="";
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id ="b1";
					P1_5Scoreinfo_GUI window = new P1_5Scoreinfo_GUI(id);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public P1_5Scoreinfo_GUI() {
		initialize();
		frame.setVisible(true);
	}
	public P1_5Scoreinfo_GUI(String id) {
		this.id=id;
		al = dao.Studentinfo(id);
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
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 3, 158, 54);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(308, 10, 114, 41);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("SCORE INFO");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		label_2.setBounds(48, 38, 330, 41);
		frame.getContentPane().add(label_2);
		
		JButton btn = new JButton("\uBCF4\uCDA9 \uC790\uB8CC");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new P1_6supplementarydata();
				new P1_5Scoreinfo_GUI();
				frame.dispose();
			}
		});
		btn.setBounds(308, 89, 100, 23);
		frame.getContentPane().add(btn);
		
		JLabel lbl_Id = new JLabel("ID");
		lbl_Id.setBounds(495, 123, 82, 21);
		frame.getContentPane().add(lbl_Id);
		
		JLabel lbl_date = new JLabel("시험 날짜");
		lbl_date.setBounds(495, 167, 82, 21);
		frame.getContentPane().add(lbl_date);
		
		JLabel lbl_subject = new JLabel("과목명");
		lbl_subject.setBounds(495, 217, 82, 21);
		frame.getContentPane().add(lbl_subject);
		
		JLabel lbl_score = new JLabel("점수");
		lbl_score.setBounds(495, 269, 82, 21);
		frame.getContentPane().add(lbl_score);
		
		JLabel select_id = new JLabel("");
		select_id.setBounds(566, 123, 82, 21);
		frame.getContentPane().add(select_id);
		
		JLabel select_date = new JLabel("");
		select_date.setBounds(566, 167, 82, 21);
		frame.getContentPane().add(select_date);
		
		JLabel select_subject = new JLabel("");
		select_subject.setBounds(566, 217, 82, 21);
		frame.getContentPane().add(select_subject);
		
		JLabel select_score = new JLabel("");
		select_score.setBounds(566, 269, 82, 21);
		frame.getContentPane().add(select_score);

		
		//테이블 컬럼 이름
		String[] header = {"ID","시험 날짜","과목명","점수"};
		//컬럼값(데이터) - 2차원 배열 형태로
		String[][] data = new String[al.size()][4];
				
		for(int i = 0; i<al.size(); i++) {
					data[i][0] = al.get(i).getSc_stu_id();
					data[i][1] = al.get(i).getSco_date();
					data[i][2] = al.get(i).getSco_subject();
					data[i][3] = al.get(i).getSco_score();
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(17, 123, 461, 283);
		frame.getContentPane().add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 403, 398, -278);
		//패널에 스크롤패널 추가하기
		panel.add(scrollPane);
		
		
		
		//테이블 생성
		JTable table = new JTable(data,header);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = table.getSelectedRow();
				select_id.setText(data[row][0]);
				select_date.setText(data[row][1]);
				select_subject.setText(data[row][2]);
				select_score.setText(data[row][3]);
			
			}
		});
		scrollPane.add(table);
		
		//패널전체에 테이블이 꽉차게 만들고 싶을 때
		table.setFillsViewportHeight(true);
		
		//테이블을 스크롤 패널에 추가, 컬럼이름 보이기 위해서 추가해야 함
		scrollPane.setViewportView(table);
		
		
		
		
	}
}
