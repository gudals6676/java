package c;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import DaoVo.StudentDAO;

import DaoVo.StudentVO;
import DaoVo.TeacherDAO;
import DaoVo.TeacherVO;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

public class P2_1Classmgment_GUI {
	ArrayList<TeacherVO> al = new ArrayList<TeacherVO>();
	TeacherDAO dao = new TeacherDAO();
	private JFrame frame;
	private JTable table;
	String id;
	ImageIcon imgmain = new ImageIcon("img/반 관리.png");
	Image C_imgmain = imgmain.getImage().getScaledInstance(155, 61, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_imgmain = new ImageIcon(C_imgmain);

	ImageIcon imghome = new ImageIcon("img/home.png");
	Image C_imghome = imghome.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_imghome = new ImageIcon(C_imghome);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = "a1";
					P2_1Classmgment_GUI window = new P2_1Classmgment_GUI(id);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public P2_1Classmgment_GUI(String id) {
		System.out.println(id);
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
		panel0.setBounds(250, 30, 150, 60);
		frame.getContentPane().add(panel0);
		panel0.setLayout(new CardLayout(0, 0));

		JLabel mainImage0 = new JLabel("");
		panel0.add(mainImage0, "name_27704402491100");
		mainImage0.setBackground(new Color(255, 255, 255));
		mainImage0.setIcon(CI_imgmain);

		// 홈 버튼
		JPanel panel_home = new JPanel();
		panel_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P2_0TeacherMain(id);
				frame.dispose();
			}
		});
		panel_home.setBackground(Color.WHITE);
		panel_home.setBounds(30, 30, 45, 45);
		frame.getContentPane().add(panel_home);

		JLabel mainImagehome = new JLabel("");
		panel_home.add(mainImagehome, "name_27704402491100");
		mainImagehome.setBackground(new Color(255, 255, 255));
		mainImagehome.setIcon(CI_imghome);

		al = dao.selectClass();
		String[] header = { "Class_number", "Class_className", "Tea_id", "Class_branch" };
		String[][] data = new String[al.size()][4];// 3:7

		for (int i = 0; i < al.size(); i++) {

			data[i][0] = al.get(i).getClass_Number();
			data[i][1] = al.get(i).getClass_className();
			data[i][2] = al.get(i).getC_tea_id();
			data[i][3] = al.get(i).getClass_branch();

		}

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(21, 21, 640, 420);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btn_insert = new JButton("\uBC18 \uC0DD\uC131");
		btn_insert.setBackground(new Color(255, 255, 255));
		btn_insert.setBounds(512, 143, 97, 60);
		panel_1.add(btn_insert);
		btn_insert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P2_2createClass();
			}
		});
		btn_insert.setFont(new Font("맑은 고딕", Font.PLAIN, 16));

		JButton btn_delete = new JButton("\uBC18 \uC0AD\uC81C");
		btn_delete.setBackground(new Color(255, 255, 255));
		btn_delete.setBounds(512, 213, 97, 60);
		panel_1.add(btn_delete);
		btn_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectRow = table.getSelectedRow();
				System.out.println(selectRow);
				System.out.println(data[selectRow][0]);
				int cnt = dao.deleteClass(data[selectRow][0]);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "반 삭제완료!");
					frame.dispose();
					new P2_1Classmgment_GUI(id);
				} else {
					JOptionPane.showMessageDialog(null, "삭제 실패!");
				}
			}
		});
//		btn_delete.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String Class_number = "0";
//				boolean result = dao.Class_delete(Class_number);
//				System.out.println();
//				System.out.println(result);
//				if(result == true) {
//					JOptionPane.showMessageDialog(null, "반삭제 성공");
//					new Classmgment_GUI();
//					frame.dispose();
//				}else {
//					JOptionPane.showMessageDialog(null, "반삭제 실패", "반삭제", JOptionPane.ERROR_MESSAGE);
//				}
//			}
//		});
		btn_delete.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 93, 452, 297);
		panel_1.add(scrollPane);

		JTable table_1 = new JTable(data, header);
		table_1.setFillsViewportHeight(true);// 꽉차게하기
		// 테이블에 스크롤 패널 추가 ,, 칼럼이름 보이기 위해서 추가 **
		scrollPane.setViewportView(table_1);

		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);

	}
}
