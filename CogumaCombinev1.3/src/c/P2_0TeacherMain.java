package c;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
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
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class P2_0TeacherMain {

	private JFrame frame;
	ImageIcon img1 = new ImageIcon("img/logo.png");
	Image C_img1 = img1.getImage().getScaledInstance(198, 45, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_img1 = new ImageIcon(C_img1);
	private JTable table;
	String id="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="a1";
					P2_0TeacherMain window = new P2_0TeacherMain(id);
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
	public P2_0TeacherMain(String id) {
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

		JButton btn_studentinfo = new JButton("\uD559\uC0DD \uC870\uD68C");
		btn_studentinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new P2_4Teacher_GUI_1();
				frame.dispose();
			}
		});
		btn_studentinfo.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btn_studentinfo.setBackground(new Color(255, 255, 255));
		btn_studentinfo.setBounds(108, 115, 150, 62);
		frame.getContentPane().add(btn_studentinfo);

		JButton btn_classinfo = new JButton("\uBC18 \uAD00\uB9AC");
		btn_classinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new P2_1Classmgment_GUI(id);
				
			}
		});
		btn_classinfo.setBackground(Color.WHITE);
		btn_classinfo.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btn_classinfo.setBounds(108, 192, 150, 62);
		frame.getContentPane().add(btn_classinfo);

		JButton btn_board = new JButton("\uAC8C\uC2DC\uD310");
		btn_board.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new P2_6Board(id);
			}
		});
		btn_board.setBackground(Color.WHITE);
		btn_board.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btn_board.setBounds(108, 269, 150, 62);
		frame.getContentPane().add(btn_board);

		JButton btn_lunch = new JButton("\uC810\uC2EC \uBB50\uBA39\uC9D5?");
		btn_lunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new P2_8Lunchinfo(id);
			}
		});
		btn_lunch.setBackground(Color.WHITE);
		btn_lunch.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btn_lunch.setBounds(108, 343, 150, 62);
		frame.getContentPane().add(btn_lunch);


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

		JPanel logo = new JPanel();
		logo.setBackground(Color.WHITE);
		logo.setBounds(223, 30, 240, 68);
		frame.getContentPane().add(logo);
		JLabel mainImage = new JLabel("");

		logo.add(mainImage, "name_27704402491100");
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(14, 14, 654, 429);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(296, 100, 327, 290);
		panel_1.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(12, 164, 303, 108);
		panel.add(panel_2);
		
		JTextPane contents = new JTextPane();
		contents.setBounds(0, 22, 291, 86);
		panel_2.add(contents);
		
		JLabel label = new JLabel("\uC0C1\uC138\uB0B4\uC6A9");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(0, 1, 91, 15);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("\uACF5\uC9C0\uC0AC\uD56D");
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_1.setBounds(123, 5, 80, 27);
		panel.add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 46, 300, 108);
		panel.add(scrollPane);
		
		
		
		String[] header = {"No","제목","내용"};
		String[][] data = new String[6][3];
		data[0][0] = "1";
		data[0][1] = "제목1";
		data[0][2] = "열심히합시다열심히합시다열심히합시다열심히합시다열심히합시다열심히합시다열심히합시다열심히합시다열심히합시다열심히합시다열심히합시다열심히합시다";
		data[1][0] = "2";
		data[1][1] = "제목2";
		data[1][2] = "화이팅";
		data[2][0] = "3";
		data[2][1] = "제목3";
		data[2][2] = "ㅇㅇㅇ";
		data[3][0] = "4";
		data[3][1] = "제목4";
		data[3][2] = "222";
		data[4][0] = "5";
		data[4][1] = "제목5";
		data[4][2] = "11";
		
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
		
		JLabel showid = new JLabel("");
		showid.setBounds(12, 404, 162, 15);
		showid.setText(id+" 님 환영합니다 ");
		panel_1.add(showid);

	}
}
