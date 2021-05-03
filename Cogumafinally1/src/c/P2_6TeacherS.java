package c;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DaoVo.TeacherDAO;
import DaoVo.TeacherVO;
import javax.swing.SwingConstants;

public class P2_6TeacherS {

	private JFrame frame;
	TeacherDAO dao = new TeacherDAO();
	ArrayList<TeacherVO> al = null;
	String id="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="a1";
					String name="������";
					P2_6TeacherS window = new P2_6TeacherS(id,name);
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
	public P2_6TeacherS() {
		initialize();
	}
	public P2_6TeacherS(String id,String name) {
		this.id=id;
		al=dao.teacher_calss_S(id,name);
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 235, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String[] header = { "�̸�", "����", "����" };
		// Ŀ����(������) -2���� �迭
		String[][] data = new String[al.size()][4]; // �޾ƿ� ���� ǥ���ϰ� ���� ���� ǥ����
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
		panel.setBounds(17, 60, 180, 260);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 180, 260);
		panel.add(scrollPane);
		// ���̺� ����
		JTable table = new JTable(data, header);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		// �г� ��ü�� ���̺��� ������ ����� ������
		table.setFillsViewportHeight(true);
		// ���̺��� ��ũ�� �гο� �߰�, �÷��̸��� ���̱� ���ؼ� �߰�
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("\uAC1C\uBCC4 \uC810\uC218 \uC870\uD68C");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(17, 10, 188, 40);
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel);
	}
}
