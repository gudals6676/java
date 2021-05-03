package c;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DaoVo.BoardDAO;
import DaoVo.BoardVO;
import javax.swing.SwingConstants;

//�л����� �α��ν� ������ ������ ��� -> �Խñ� �ۼ��� boardwrite�� �̵�
public class P2_7Board {
	String bd_number;
	String bd_content;
	String bd_NOP;

	JFrame frame;
	String id;
	ArrayList<BoardVO> al;

	ImageIcon imghome = new ImageIcon("img/home.png");
	Image C_imghome = imghome.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_imghome = new ImageIcon(C_imghome);

	ImageIcon img2 = new ImageIcon("button/�Խ���.png");
	Image C_img2 = img2.getImage().getScaledInstance(132, 58, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_img2 = new ImageIcon(C_img2);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P2_7Board window = new P2_7Board("a1");
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
	public P2_7Board() {
		initialize();
		frame.setVisible(true);
	}

	public P2_7Board(String id) {
		this.id = id;
		initialize();
		frame.setVisible(true);
		System.out.println(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.getContentPane().setBackground(new Color(0, 139, 205));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// ����
		BoardDAO BdDao = new BoardDAO();
		al = BdDao.SelectALL();

		String[] header = { "bd_number", "bd_content", "bd_NOP" };
		String[][] data = new String[al.size()][3];// 3:7

		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					data[i][j] = al.get(i).getBd_number();
				} else if (j == 1) {
					data[i][j] = al.get(i).getBd_content();
				} else if (j == 2) {
					data[i][j] = al.get(i).getBd_NOP();
				}
			}
		}

		JLabel info_bd_number = new JLabel("");
		info_bd_number.setFont(new Font("���� ���", Font.PLAIN, 16));
		info_bd_number.setBounds(520, 153, 82, 21);
		frame.getContentPane().add(info_bd_number);

		JLabel info_bd_content = new JLabel("");
		info_bd_content.setFont(new Font("���� ���", Font.PLAIN, 16));
		info_bd_content.setBounds(520, 215, 134, 21);
		frame.getContentPane().add(info_bd_content);

		JLabel info_bd_NOP = new JLabel("");
		info_bd_NOP.setFont(new Font("���� ���", Font.PLAIN, 16));
		info_bd_NOP.setBounds(520, 278, 82, 21);
		frame.getContentPane().add(info_bd_NOP);

		JPanel panel = new JPanel();
		panel.setBounds(15, 116, 471, 272);
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 0, 459, 306);
		// ��ũ�� �߰�.
		panel.add(scrollPane);

		JTable table = new JTable(data, header);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = table.getSelectedRow();
				String bd_number = (String) table.getModel().getValueAt(row, 0);
				String bd_content = (String) table.getModel().getValueAt(row, 1);
				String bd_NOP = (String) table.getModel().getValueAt(row, 2);
				info_bd_number.setText(bd_number);
				info_bd_content.setText(bd_content);
				info_bd_NOP.setText(bd_NOP);
			}
		});

		table.setFillsViewportHeight(true);// �������ϱ�
		// ���̺� ��ũ�� �г� �߰� ,, Į���̸� ���̱� ���ؼ� �߰� **
		scrollPane.setViewportView(table);

		JPanel logo = new JPanel();
		logo.setBackground(Color.WHITE);
		logo.setBounds(223, 22, 240, 68);
		frame.getContentPane().add(logo);
		JLabel mainImage = new JLabel("");

		logo.add(mainImage, "name_27704402491100");
		mainImage.setBackground(new Color(255, 255, 255));
		mainImage.setIcon(CI_img2);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 660, 441);
		panel_1.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_home = new JPanel();
		panel_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P2_0TeacherMain(id);
				frame.dispose();
			}
		});
		
		panel_1.setLayout(null);
		panel_home.setBackground(Color.WHITE);
		panel_home.setBounds(15, 5, 45, 45);
		panel_1.add(panel_home);
		JLabel mainImagehome = new JLabel("");
		
		panel_home.add(mainImagehome, "name_27704402491100");
		mainImagehome.setBackground(new Color(255, 255, 255));
		mainImagehome.setIcon(CI_imghome);

		JLabel lbl_bd_number = new JLabel("->");
		lbl_bd_number.setBounds(485, 143, 30, 21);
		panel_1.add(lbl_bd_number);
		lbl_bd_number.setFont(new Font("���� ���", Font.BOLD, 15));

		JLabel lbl_bd_content = new JLabel("\uAC8C\uC2DC\uB0B4\uC6A9");
		lbl_bd_content.setBounds(485, 174, 82, 21);
		panel_1.add(lbl_bd_content);
		lbl_bd_content.setFont(new Font("���� ���", Font.BOLD, 15));

		JLabel lbl_bd_NOP = new JLabel("\uD604\uC7AC \uCC38\uC5EC \uC778\uC6D0 \uC218");
		lbl_bd_NOP.setBounds(485, 236, 120, 21);
		panel_1.add(lbl_bd_NOP);
		lbl_bd_NOP.setFont(new Font("���� ���", Font.BOLD, 15));

		JLabel label = new JLabel("\uAC8C\uC2DC\uBC88\uD638");
		label.setFont(new Font("���� ���", Font.BOLD, 15));
		label.setBounds(485, 112, 82, 21);
		panel_1.add(label);

		JLabel label_1 = new JLabel("->");
		label_1.setFont(new Font("���� ���", Font.BOLD, 15));
		label_1.setBounds(485, 267, 30, 21);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("->");
		label_2.setFont(new Font("���� ���", Font.BOLD, 15));
		label_2.setBounds(485, 205, 30, 21);
		panel_1.add(label_2);

		JButton btnNewButton = new JButton("�Խñ� ����");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("���� ���", Font.PLAIN, 14));
		btnNewButton.setBounds(503, 356, 129, 34);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new P2_8BoardWrite(id);
			}
		});
	}
}
