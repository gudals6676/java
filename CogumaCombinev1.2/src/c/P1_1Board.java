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
public class P1_1Board {
	String bd_number;
	String bd_content;
	String bd_NOP;

	JFrame frame;
	String id;
	ArrayList<BoardVO> al;
	ImageIcon imghome = new ImageIcon("img/home.png");
	Image C_imghome = imghome.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);// �̹���ũ�� ��ȯ
	ImageIcon CI_imghome = new ImageIcon(C_imghome);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P1_1Board window = new P1_1Board("b1");
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
	public P1_1Board() {
		initialize();
		frame.setVisible(true);
	}

	public P1_1Board(String id) {
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

		JLabel lbl_bd_number = new JLabel("\uAC8C\uC2DC\uBC88\uD638");
		lbl_bd_number.setBounds(495, 209, 82, 21);
		frame.getContentPane().add(lbl_bd_number);

		JLabel lbl_bd_content = new JLabel("\uAC8C\uC2DC\uB0B4\uC6A9");
		lbl_bd_content.setBounds(495, 271, 82, 21);
		frame.getContentPane().add(lbl_bd_content);

		JLabel lbl_bd_NOP = new JLabel("\uD604\uC7AC \uCC38\uC5EC\uC218");
		lbl_bd_NOP.setBounds(495, 333, 82, 21);
		frame.getContentPane().add(lbl_bd_NOP);

		JLabel lblNewLabel_1 = new JLabel("\uAC8C\uC2DC\uD310");
		lblNewLabel_1.setBounds(217, 35, 274, 51);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("HY�߸���", Font.PLAIN, 34));
		frame.getContentPane().add(lblNewLabel_1);

		JLabel info_bd_number = new JLabel("");
		info_bd_number.setBounds(563, 240, 82, 21);
		frame.getContentPane().add(info_bd_number);

		JLabel info_bd_content = new JLabel("");
		info_bd_content.setBounds(563, 302, 82, 21);
		frame.getContentPane().add(info_bd_content);

		JLabel info_bd_NOP = new JLabel("");
		info_bd_NOP.setBounds(563, 364, 82, 21);
		frame.getContentPane().add(info_bd_NOP);
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

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(15, 116, 471, 272);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 471, 433);
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
		// ���̺��� ��ũ�� �г� �߰� ,, Į���̸� ���̱� ���ؼ� �߰� **
		scrollPane.setViewportView(table);

		JButton btn_meet = new JButton("\uCC38\uC5EC");
		btn_meet.setBounds(531, 403, 129, 29);
		btn_meet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int row = table.getSelectedRow();
					String bd_number = (String) table.getModel().getValueAt(row, 0);
					String bd_NOP = (String) table.getModel().getValueAt(row, 2);
					System.out.println("�Ű����� Ȯ�� : " + id + bd_number + bd_NOP);// �ߵ�
					BdDao.BoardMeet_update(id, bd_number, bd_NOP);

//				P1_1Board window = new P1_1Board();
//				window.frame.setVisible(true);
					new P1_1Board();
					frame.dispose();
					// ������ �̺κ� �ٲ�����
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "���ϴ� ���͵� ������ �ּ��� !!!", "ȸ������", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		frame.getContentPane().add(btn_meet);

		JButton btnNewButton = new JButton("�Խñ� ����");
		btnNewButton.setBounds(390, 403, 129, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(id);
				new P1_2BoardWrite(id);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 10, 660, 441);
		frame.getContentPane().add(panel_1);

		JPanel panel_home = new JPanel();
		panel_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P1_0StudentMain(id);
				frame.dispose();
			}
		});
		panel_1.setLayout(null);
		panel_home.setBackground(Color.WHITE);
		panel_home.setBounds(15, 5, 30, 30);
		panel_1.add(panel_home);
		JLabel mainImagehome = new JLabel("");

		panel_home.add(mainImagehome, "name_27704402491100");
		mainImagehome.setBackground(new Color(255, 255, 255));
		mainImagehome.setIcon(CI_imghome);
	}
}