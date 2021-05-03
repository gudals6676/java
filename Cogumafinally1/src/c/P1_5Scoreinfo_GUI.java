package c;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import DaoVo.StudentDAO;
import DaoVo.StudentVO;

import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
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
	String id = "";

	ImageIcon imgmain = new ImageIcon("img/성적 조회.png");
	Image C_imgmain = imgmain.getImage().getScaledInstance(160, 50, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_imgmain = new ImageIcon(C_imgmain);

	ImageIcon imghome = new ImageIcon("img/home.png");
	Image C_imghome = imghome.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_imghome = new ImageIcon(C_imghome);

	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = "b1";
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
		this.id = id;
		al = dao.Studentinfo(id);
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 205));
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel select_id = new JLabel("");
		select_id.setBounds(576, 185, 82, 21);
		frame.getContentPane().add(select_id);
		select_id.setFont(new Font("맑은 고딕", Font.PLAIN, 16));

		JLabel select_date = new JLabel("");
		select_date.setBounds(576, 236, 82, 21);
		frame.getContentPane().add(select_date);
		select_date.setFont(new Font("맑은 고딕", Font.PLAIN, 16));

		JLabel select_subject = new JLabel("");
		select_subject.setBounds(576, 288, 82, 21);
		frame.getContentPane().add(select_subject);
		select_subject.setFont(new Font("맑은 고딕", Font.PLAIN, 16));

		JLabel select_score = new JLabel("");
		select_score.setBounds(576, 340, 82, 21);
		frame.getContentPane().add(select_score);
		select_score.setFont(new Font("맑은 고딕", Font.PLAIN, 16));

		// 메인 사진
		JPanel panel0 = new JPanel();
		panel0.setBounds(250, 30, 160, 50);
		panel0.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel0);
		panel0.setLayout(new CardLayout(0, 0));

		JLabel mainImage0 = new JLabel("");
		panel0.add(mainImage0, "name_27704402491100");
		mainImage0.setBackground(new Color(255, 255, 255));
		mainImage0.setIcon(CI_imgmain);

		// 홈 버튼
		JPanel panel_home = new JPanel();
		panel_home.setBounds(30, 30, 45, 45);
		panel_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P1_0StudentMain(id);
				frame.dispose();
			}
		});
		panel_home.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_home);

		JLabel mainImagehome = new JLabel("");
		panel_home.add(mainImagehome, "name_27704402491100");
		mainImagehome.setBackground(new Color(255, 255, 255));
		mainImagehome.setIcon(CI_imghome);

		// 테이블 컬럼 이름
		String[] header = { "ID", "시험 날짜", "과목명", "점수" };
		// 컬럼값(데이터) - 2차원 배열 형태로
		String[][] data = new String[al.size()][4];

		for (int i = 0; i < al.size(); i++) {
			data[i][0] = al.get(i).getSc_stu_id();
			data[i][1] = al.get(i).getSco_date();
			data[i][2] = al.get(i).getSco_subject();
			data[i][3] = al.get(i).getSco_score();
		}

		JPanel panel = new JPanel();
		panel.setBounds(26, 123, 452, 283);
		frame.getContentPane().add(panel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 403, 398, -278);
		// 패널에 스크롤패널 추가하기
		panel.add(scrollPane);

		// 테이블 생성
		JTable table = new JTable(data, header);
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

		// 패널전체에 테이블이 꽉차게 만들고 싶을 때
		table.setFillsViewportHeight(true);

		// 테이블을 스크롤 패널에 추가, 컬럼이름 보이기 위해서 추가해야 함
		scrollPane.setViewportView(table);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 21, 640, 420);
		panel_1.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btn = new JButton("\uBCF4\uCDA9 \uC790\uB8CC");
		btn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btn.setBounds(492, 107, 116, 35);
		panel_1.add(btn);

		JLabel lbl_Id = new JLabel("ID");
		lbl_Id.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lbl_Id.setBounds(467, 164, 69, 21);
		panel_1.add(lbl_Id);

		JLabel lbl_date = new JLabel("시험 날짜");
		lbl_date.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lbl_date.setBounds(467, 215, 82, 21);
		panel_1.add(lbl_date);

		JLabel lbl_subject = new JLabel("과목명");
		lbl_subject.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lbl_subject.setBounds(467, 268, 82, 21);
		panel_1.add(lbl_subject);

		JLabel lbl_score = new JLabel("점수");
		lbl_score.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lbl_score.setBounds(467, 320, 82, 21);
		panel_1.add(lbl_score);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new P1_6supplementarydata(id);
				frame.dispose();
			}
		});

	}
}
