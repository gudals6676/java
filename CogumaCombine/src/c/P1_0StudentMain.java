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
	Image C_img1 = img1.getImage().getScaledInstance(198, 45, Image.SCALE_SMOOTH);// ÀÌ¹ÌÁöÅ©±â º¯È¯
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
		panel.setBounds(299, 115, 327, 290);
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
		label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		panel.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 46, 303, 108);
		panel.add(scrollPane);
		String[] header = {"No","Á¦¸ñ","³»¿ë"};
		String[][] data = new String[6][3];
		data[0][0] = "1";
		data[0][1] = "Á¦¸ñ1";
		data[0][2] = "¿­½ÉÈ÷ÇÕ½Ã´Ù¿­½ÉÈ÷ÇÕ½Ã´Ù";
		data[1][0] = "2";
		data[1][1] = "Á¦¸ñ2";
		data[1][2] = "È­ÀÌÆÃ";
		data[2][0] = "3";
		data[2][1] = "Á¦¸ñ3";
		data[2][2] = "¤·¤·¤·";
		data[3][0] = "4";
		data[3][1] = "Á¦¸ñ4";
		data[3][2] = "222";
		data[4][0] = "5";
		data[4][1] = "Á¦¸ñ5";
		data[4][2] = "11";
		
		table = new JTable(data,header);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int R = table.getSelectedRow();
				
				contents.setText(data[R][2]);
			}
		});
		table.getColumn("No").setPreferredWidth(1);
		table.getColumn("Á¦¸ñ").setPreferredWidth(205);
		table.getColumn("³»¿ë").setPreferredWidth(0);
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		
		JLabel d_label = new JLabel("\uB0B4\uC6A9");
		d_label.setHorizontalAlignment(SwingConstants.LEFT);
		d_label.setBounds(0, 1, 84, 21);
		detail.add(d_label);

		JButton btn_scoreinfo = new JButton("\uC131\uC801\uC870\uD68C");
		btn_scoreinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new P1_5Scoreinfo_GUI(id);
				frame.dispose();
			}
		});
		btn_scoreinfo.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		btn_scoreinfo.setBackground(new Color(255, 255, 255));
		btn_scoreinfo.setBounds(108, 115, 150, 62);
		frame.getContentPane().add(btn_scoreinfo);

		JButton btn_schedule = new JButton("\uC2DC\uAC04\uD45C");
		btn_schedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new P1_3TimeTable();
			}
		});
		btn_schedule.setBackground(Color.WHITE);
		btn_schedule.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		btn_schedule.setBounds(108, 192, 150, 62);
		frame.getContentPane().add(btn_schedule);

		JButton btn_board = new JButton("\uAC8C\uC2DC\uD310");
		btn_board.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new P1_1Board(id);
			}
		});
		btn_board.setBackground(Color.WHITE);
		btn_board.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		btn_board.setBounds(108, 269, 150, 62);
		frame.getContentPane().add(btn_board);

		JButton btn_lunch = new JButton("\uC810\uC2EC \uBB50\uBA39\uC9D5?");
		btn_lunch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new P2_3Lunchinfo(id);
				frame.dispose();
			}
		});
		btn_lunch.setBackground(Color.WHITE);
		btn_lunch.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		btn_lunch.setBounds(108, 343, 150, 62);
		frame.getContentPane().add(btn_lunch);

		JButton btn_info = new JButton("\uB0B4 \uC815\uBCF4");
		btn_info.setBackground(Color.WHITE);
		btn_info.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		btn_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_info.setBounds(550, 30, 100, 35);
		frame.getContentPane().add(btn_info);

		JButton btn_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "·Î±×¾Æ¿ô ÇÏ½Ã°Ú½À´Ï±î?", "·Î±×¾Æ¿ô", 0);
				if (result == JOptionPane.YES_OPTION) {
					new P0_0LoginMain();
					frame.dispose();
				}
			}	
		});
		btn_logout.setBackground(Color.WHITE);
		btn_logout.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		btn_logout.setBounds(30, 30, 100, 35);
		frame.getContentPane().add(btn_logout);

		JPanel logo = new JPanel();
		logo.setBackground(Color.WHITE);
		logo.setBounds(223, 22, 240, 68);
		frame.getContentPane().add(logo);
		JLabel mainImage = new JLabel("");

		logo.add(mainImage, "name_27704402491100");
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(14, 14, 654, 429);
		frame.getContentPane().add(panel_1);
	}
}
