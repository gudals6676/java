package c;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import DaoVo.StudentDAO;

import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.MouseMotionAdapter;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class P1_6supplementarydata {

	private JFrame frame;
	String id = "";

	ImageIcon imgmain = new ImageIcon("img/보충 자료.png");
	Image C_imgmain = imgmain.getImage().getScaledInstance(189, 58, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_imgmain = new ImageIcon(C_imgmain);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = "b1";
					P1_6supplementarydata window = new P1_6supplementarydata(id);
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
	public P1_6supplementarydata() {
		initialize();
		frame.setVisible(true);
	}

	public P1_6supplementarydata(String id) {
		this.id = id;
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
		
		// 메인 사진
		JPanel panel0 = new JPanel();
		panel0.setBackground(new Color(255, 255, 255));
		panel0.setBounds(250, 30, 200, 60);
		frame.getContentPane().add(panel0);
		panel0.setLayout(new CardLayout(0, 0));
		
				JLabel mainImage0 = new JLabel("");
				panel0.add(mainImage0, "name_27704402491100");
				mainImage0.setBackground(new Color(255, 255, 255));
				mainImage0.setIcon(CI_imgmain);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(21, 21, 640, 420);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel label_1 = new JLabel("1. \uAC1C\uB150 \uC815\uB9AC \uC790\uB8CC");
		label_1.setBounds(18, 133, 263, 28);
		panel_1.add(label_1);
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));

		JLabel label_2 = new JLabel("2. \uC720\uD615\uBCC4 \uBB38\uC81C");
		label_2.setBounds(18, 209, 263, 28);
		panel_1.add(label_2);
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));

		JLabel label_3 = new JLabel("3. \uC2A4\uB9C8\uD2B8\uC778\uC7AC\uAC1C\uBC1C\uC6D0 \uC720\uD29C\uBE0C");
		label_3.setBounds(18, 289, 263, 28);
		panel_1.add(label_3);
		label_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));

		JLabel data_1 = new JLabel(
				"\uC218\uC5C5\uC790\uB8CC_Dropbox(https://www.dropbox.com/sh/kd52fl6w4tls1iv/AAC1vM5InB2SFzhY3lA_HZHKa?dl=0)");
		data_1.setBounds(45, 171, 590, 28);
		panel_1.add(data_1);

		data_1.addMouseMotionListener(new MouseMotionAdapter() {

		});
		data_1.setToolTipText("https://www.dropbox.com/sh/kd52fl6w4tls1iv/AAC1vM5InB2SFzhY3lA_HZHKa?dl=0");
		data_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						URI uri = new URI("https://www.dropbox.com/sh/kd52fl6w4tls1iv/AAC1vM5InB2SFzhY3lA_HZHKa?dl=0");
						desktop.browse(uri);
					} catch (IOException ex) {
						ex.printStackTrace();
					} catch (URISyntaxException ex) {
						ex.printStackTrace();
					}
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				data_1.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				data_1.setForeground(Color.BLACK);
				data_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		data_1.setFont(new Font("맑은 고딕", Font.PLAIN, 13));

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(8, 167, 34, 32);
		panel_1.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);

		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBackground(Color.WHITE);
		checkBox.setBounds(8, 247, 34, 32);
		panel_1.add(checkBox);
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel data_2 = new JLabel("\uD30C\uC774\uC36C 300\uC81C(https://wikidocs.net/7014)");
		data_2.setBounds(45, 251, 590, 28);
		panel_1.add(data_2);
		data_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						URI uri = new URI("https://wikidocs.net/7014");
						desktop.browse(uri);
					} catch (IOException ex) {
						ex.printStackTrace();
					} catch (URISyntaxException ex) {
						ex.printStackTrace();
					}
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				data_2.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				data_2.setForeground(Color.BLACK);
				data_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		data_2.setFont(new Font("맑은 고딕", Font.PLAIN, 13));

		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setBounds(8, 323, 34, 32);
		panel_1.add(checkBox_1);
		checkBox_1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel data_3 = new JLabel(
				"\uC778\uC324TV_\uC790\uBC14 \uAE30\uCD08(https://www.youtube.com/watch?v=5meyGXiNgeY)");
		data_3.setBounds(45, 327, 590, 28);
		panel_1.add(data_3);
		data_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						URI uri = new URI("https://www.youtube.com/watch?v=5meyGXiNgeY");
						desktop.browse(uri);
					} catch (IOException ex) {
						ex.printStackTrace();
					} catch (URISyntaxException ex) {
						ex.printStackTrace();
					}
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				data_3.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				data_3.setForeground(Color.BLACK);
				data_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		data_3.setFont(new Font("맑은 고딕", Font.PLAIN, 13));

		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(0, 0, 139));
		textPane.setBounds(20, 85, 600, 37);
		panel_1.add(textPane);
		textPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));

		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		btnNewButton.setBounds(517, 370, 101, 30);
		panel_1.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P1_5Scoreinfo_GUI(id);
				frame.dispose();
			}
		});

		StudentDAO Sdao = new StudentDAO();
		int Savg = Sdao.SupplementaryData(id); // 95
		String SN = Sdao.SupplementaryName(id); // 정지윤
		if (Savg >= 60) {
			textPane.setText(SN + " 학생은 유형별 문제 풀이에 집중하면 학습 능력 향상에 도움이 됩니다 !");
		} else {
			textPane.setText(SN + " 학생은 개념 정리, 유형별 문제, 스마트인재개발원 유튜브 시청 중 2개 이상 하면 학습 능력 향상에 도움이 됩니다 !");
		}
	}
}
