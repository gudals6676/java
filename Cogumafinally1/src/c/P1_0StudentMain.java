package c;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class P1_0StudentMain {
	
	
	private JTable table;
	JFrame frame;
	String id="";
	
	ImageIcon img1 = new ImageIcon("img/logo.png");
	Image C_img1 = img1.getImage().getScaledInstance(218, 50, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img1 = new ImageIcon(C_img1);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="b1";
					P1_0StudentMain window = new P1_0StudentMain(id);
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
	public P1_0StudentMain(String id) {
		this.id=id;
		System.out.println(id);
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

		JPanel panel = new JPanel();
		panel.setBounds(299, 105, 327, 290);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel detail = new JPanel();
		detail.setBounds(12, 164, 303, 116);
		panel.add(detail);
		detail.setLayout(null);
		
		JTextPane contents = new JTextPane();
		contents.setBounds(0, 22, 300, 86);
		detail.add(contents);
		
		JLabel label = new JLabel("\uACF5\uC9C0\uC0AC\uD56D");
		label.setBounds(123, 5, 80, 27);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		panel.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 42, 300, 112);
		panel.add(scrollPane);
		String[] header = {"No","제목","내용"};
		String[][] data = new String[6][3];
		data[0][0] = "1";
		data[0][1] = "<공지사항>";
		data[0][2] = "여러분 오늘도 8시간 수업에 보충에 너무나 고생많았어요 ㅎㅎ 오히려 다른 보충은 없냐고 물어보시는 분들도 있고 그 열정들에 저도 많이 자극을 받습니다^^";
		data[1][0] = "2";
		data[1][1] = "<공지사항 리마인드>";
		data[1][2] = "1. 본인 집 PC에 줌 설치\r\n" + "2. 구글원격으로 강의실 PC에 접속해서 메모장 남기기\r\n" + "3. QR 다시한번 퇴실 시간 찍혀있는지 확인할 것";
		data[2][0] = "3";
		data[2][1] = "<등원전 꼭! 해야할 일!>";
		data[2][2] = "- 구글 아이디/비밀번호 알아오기!(구글 원격 설정시 필요)\r\n"
				+ "- HDR-Net 어플 설치 및 로그인(입퇴실시 QR코드를 안찍으면 여러분들 훈련 수당이 안나와요 ㅠㅠ)\r\n" + "\r\n" + "[ 준비물 ] \r\n"
				+ "- 증명사진(이미지파일)\r\n" + "- 개인물품(슬리퍼/텀블러/담요 등)\r\n" + "- 졸업증명서 및 졸업예정서(재학증명서)";
		
		table = new JTable(data,header);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int R = table.getSelectedRow();
				
				contents.setText(data[R][2]);
			}
		});
		table.getColumn("No").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(135);
		table.getColumn("내용").setPreferredWidth(135);
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		
		JLabel d_label = new JLabel("\uB0B4\uC6A9");
		d_label.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		d_label.setHorizontalAlignment(SwingConstants.LEFT);
		d_label.setBounds(0, 0, 84, 21);
		detail.add(d_label);

		JButton btn_scoreinfo = new JButton("\uC131\uC801\uC870\uD68C");
		btn_scoreinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new P1_5Scoreinfo_GUI(id);
				frame.dispose();
			}
		});
		btn_scoreinfo.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btn_scoreinfo.setBackground(new Color(255, 255, 255));
		btn_scoreinfo.setBounds(108, 105, 150, 62);
		frame.getContentPane().add(btn_scoreinfo);

		JButton btn_schedule = new JButton("\uC2DC\uAC04\uD45C");
		btn_schedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new P1_3TimeTable();
			}
		});
		btn_schedule.setBackground(Color.WHITE);
		btn_schedule.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btn_schedule.setBounds(108, 182, 150, 62);
		frame.getContentPane().add(btn_schedule);

		JButton btn_board = new JButton("\uAC8C\uC2DC\uD310");
		btn_board.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new P1_1Board(id);
			}
		});
		btn_board.setBackground(Color.WHITE);
		btn_board.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btn_board.setBounds(108, 259, 150, 62);
		frame.getContentPane().add(btn_board);

		JButton btn_lunch = new JButton("\uC810\uC2EC \uBB50\uBA39\uC9D5?");
		btn_lunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new P1_4Lunchinfo(id);
			}
		});
		btn_lunch.setBackground(Color.WHITE);
		btn_lunch.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btn_lunch.setBounds(108, 333, 150, 62);
		frame.getContentPane().add(btn_lunch);

		JButton btn_info = new JButton("\uB0B4 \uC815\uBCF4");
		btn_info.setBackground(Color.WHITE);
		btn_info.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btn_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new P1_7StudentUpdate(id);
			}
		});
		btn_info.setBounds(550, 30, 100, 35);
		frame.getContentPane().add(btn_info);

		JButton btn_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", 0);
				if (result == JOptionPane.YES_OPTION) {
					new P0_0LoginMain();
					frame.dispose();
				}
			}	
		});
		btn_logout.setBackground(Color.WHITE);
		btn_logout.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btn_logout.setBounds(30, 30, 100, 35);
		frame.getContentPane().add(btn_logout);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(14, 14, 654, 429);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel showid = new JLabel("");
		showid.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		showid.setBounds(264, 397, 185, 15);
		showid.setText(id+" 님 환영합니다 ");
		panel_1.add(showid);
		
				JPanel logo = new JPanel();
				logo.setBounds(194, 10, 240, 68);
				panel_1.add(logo);
				logo.setBackground(Color.WHITE);
				JLabel mainImage = new JLabel("");
				
						logo.add(mainImage, "name_27704402491100");
						mainImage.setBackground(new Color(255, 255, 255));
						mainImage.setIcon(CI_img1);
	}
}
