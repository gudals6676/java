package c;

import java.awt.CardLayout;
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
import javax.swing.JTextField;

import DaoVo.StudentDAO;
import DaoVo.StudentVO;

public class P2_8Lunchinfo {
	String id = "";
	private JFrame frame;

	ImageIcon imgmain = new ImageIcon("img/eat.png");
	Image C_imgmain = imgmain.getImage().getScaledInstance(189, 58, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_imgmain = new ImageIcon(C_imgmain);

	ImageIcon imghome = new ImageIcon("img/home.png");
	Image C_imghome = imghome.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_imghome = new ImageIcon(C_imghome);

	ImageIcon img1 = new ImageIcon("img/food1.png");
	Image C_img1 = img1.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img1 = new ImageIcon(C_img1);

	ImageIcon img1_1 = new ImageIcon("img/food1_1.jpg");
	Image C_img1_1 = img1_1.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img1_1 = new ImageIcon(C_img1_1);

	ImageIcon img2 = new ImageIcon("img/food2.png");
	Image C_img2 = img2.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img2 = new ImageIcon(C_img2);

	ImageIcon img1_2 = new ImageIcon("img/food1_2.jpg");
	Image C_img1_2 = img1_2.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img1_2 = new ImageIcon(C_img1_2);

	ImageIcon img3 = new ImageIcon("img/food3.png");
	Image C_img3 = img3.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img3 = new ImageIcon(C_img3);

	ImageIcon img1_3 = new ImageIcon("img/food1_3.jpg");
	Image C_img1_3 = img1_3.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img1_3 = new ImageIcon(C_img1_3);

	ImageIcon img4 = new ImageIcon("img/food4.png");
	Image C_img4 = img4.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img4 = new ImageIcon(C_img4);

	ImageIcon img1_4 = new ImageIcon("img/food1_4.jpg");
	Image C_img1_4 = img1_4.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img1_4 = new ImageIcon(C_img1_4);

	ImageIcon img5 = new ImageIcon("img/food5.png");
	Image C_img5 = img5.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img5 = new ImageIcon(C_img5);

	ImageIcon img1_5 = new ImageIcon("img/food1_5.jpg");
	Image C_img1_5 = img1_5.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img1_5 = new ImageIcon(C_img1_5);

	ImageIcon img6 = new ImageIcon("img/food6.png");
	Image C_img6 = img6.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img6 = new ImageIcon(C_img6);

	ImageIcon img1_6 = new ImageIcon("img/food1_6.jpg");
	Image C_img1_6 = img1_6.getImage().getScaledInstance(194, 156, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img1_6 = new ImageIcon(C_img1_6);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = "b1";
					P2_8Lunchinfo window = new P2_8Lunchinfo(id);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public P2_8Lunchinfo(String id) {
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

		// ���� ����
		JPanel panel0 = new JPanel();
		panel0.setBackground(new Color(255, 255, 255));
		panel0.setBounds(250, 30, 200, 60);
		frame.getContentPane().add(panel0);
		panel0.setLayout(new CardLayout(0, 0));

		JLabel mainImage0 = new JLabel("");
		panel0.add(mainImage0, "name_27704402491100");
		mainImage0.setBackground(new Color(255, 255, 255));
		mainImage0.setIcon(CI_imgmain);

		// Ȩ ��ư
		JPanel panel_home = new JPanel();
		panel_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P1_0StudentMain(id);
				frame.dispose();
			}
		});
		panel_home.setBackground(Color.WHITE);
		panel_home.setBounds(25, 25, 40, 40);
		frame.getContentPane().add(panel_home);

		JLabel mainImagehome = new JLabel("");
		panel_home.add(mainImagehome, "name_27704402491100");
		mainImagehome.setBackground(new Color(255, 255, 255));
		mainImagehome.setIcon(CI_imghome);

		// 1�� ����
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setBounds(37, 100, 194, 156);
		frame.getContentPane().add(panel1);
		panel1.setLayout(new CardLayout(0, 0));

		JLabel mainImage1 = new JLabel("");
		mainImage1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mainImage1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent arg0) {
						mainImage1.setIcon(CI_img1_1);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						mainImage1.setIcon(CI_img1);
					}
				});
			}
		});
		panel1.add(mainImage1, "name_27704402491100");
		mainImage1.setBackground(new Color(255, 255, 255));
		mainImage1.setIcon(CI_img1);

		// 2�� ����
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setBounds(243, 100, 194, 156);
		frame.getContentPane().add(panel2);
		panel2.setLayout(new CardLayout(0, 0));

		JLabel mainImage2 = new JLabel("");
		panel2.add(mainImage2, "name_96514950650100");
		mainImage2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mainImage2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent arg0) {
						mainImage2.setIcon(CI_img1_2);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						mainImage2.setIcon(CI_img2);
					}
				});
			}
		});
		mainImage2.setBackground(new Color(255, 255, 255));
		mainImage2.setIcon(CI_img2);

		// 3�� ����
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 255, 255));
		panel3.setBounds(450, 100, 194, 156);
		frame.getContentPane().add(panel3);
		panel3.setLayout(new CardLayout(0, 0));

		JLabel mainImage3 = new JLabel("");
		panel3.add(mainImage3, "name_96514950650100");
		mainImage3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mainImage3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent arg0) {
						mainImage3.setIcon(CI_img1_3);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						mainImage3.setIcon(CI_img3);
					}
				});
			}
		});
		mainImage3.setBackground(new Color(255, 255, 255));
		mainImage3.setIcon(CI_img3);

		// 4�� ����
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(255, 255, 255));
		panel4.setBounds(37, 270, 194, 156);
		frame.getContentPane().add(panel4);

		JLabel mainImage4 = new JLabel("");
		panel4.add(mainImage4);
		mainImage4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mainImage4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent arg0) {
						mainImage4.setIcon(CI_img1_4);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						mainImage4.setIcon(CI_img4);
					}
				});
			}
		});
		mainImage4.setBackground(new Color(255, 255, 255));
		mainImage4.setIcon(CI_img4);
		panel4.setLayout(new CardLayout(0, 0));

		// 5�� ����
		JPanel panel5 = new JPanel();
		panel5.setBackground(new Color(255, 255, 255));
		panel5.setBounds(243, 270, 194, 156);
		frame.getContentPane().add(panel5);
		panel5.setLayout(new CardLayout(0, 0));

		JLabel mainImage5 = new JLabel("");
		panel5.add(mainImage5, "name_99679160885900");
		mainImage5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mainImage5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent arg0) {
						mainImage5.setIcon(CI_img1_5);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						mainImage5.setIcon(CI_img5);
					}
				});
			}
		});
		mainImage5.setBackground(new Color(255, 255, 255));
		mainImage5.setIcon(CI_img5);

		// 6�� ����
		JPanel panel6 = new JPanel();
		panel6.setBackground(new Color(255, 255, 255));
		panel6.setBounds(450, 270, 194, 156);
		frame.getContentPane().add(panel6);
		panel6.setLayout(new CardLayout(0, 0));

		JLabel mainImage6 = new JLabel("");
		panel6.add(mainImage6, "name_100461649942400");
		mainImage6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mainImage6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent arg0) {
						mainImage6.setIcon(CI_img1_6);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						mainImage6.setIcon(CI_img6);
					}
				});
			}
		});
		mainImage6.setBackground(new Color(255, 255, 255));
		mainImage6.setIcon(CI_img6);

		// ��ü �ǳ�
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(21, 21, 640, 420);
		frame.getContentPane().add(panel_5);

	}

}
