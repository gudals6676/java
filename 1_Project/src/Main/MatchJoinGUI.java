package Main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.table.TableColumn;

import DAO.GameDAO;
import VO.GameVO;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class MatchJoinGUI {

	private JFrame frame;
	private JTable table;
	public MatchJoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_check = new JLabel("\uC2E0\uCCAD \uC0C1\uD0DC");
		lbl_check.setBounds(316, 230, 55, 21);
		frame.getContentPane().add(lbl_check);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 45, 385, 167);
		frame.getContentPane().add(scrollPane);
		
		GameDAO dao = new GameDAO();
		String[] colNames = {"����ȣ", "����","�����","�ð�","���","��¥"};
		ArrayList<GameVO> al = dao.Select();
		Object[][] data = new Object[al.size()][6];
		for(int i=0; i<al.size(); i++) {
			data[i][0] = al.get(i).getNum();
			data[i][1] = al.get(i).getTeam();
			data[i][2] = al.get(i).getOppose();
			data[i][3] = al.get(i).getG_time();
			data[i][4] = al.get(i).getG_place();
			data[i][5] = al.get(i).getG_date();
		}
		
		table = new JTable(data, colNames);
		table.setToolTipText("\uD568\uAED8 \uACBD\uAE30\uB97C \uD558\uACE0 \uC2F6\uC740 \uD300\uBA85\uC744 \uB354\uBE14\uD074\uB9AD\uD558\uC138\uC694!");
		table.setRowSelectionAllowed(false);
		
		//���̺��� ���ϴ� ���� ����Ŭ���ϸ� �ɼ��гο��� ���� ������ ��������� �Է��ϵ��� �ȳ�
		//���콺�� ���ٴ� �� ������ �� 
		int[] point = new int[2];
		//������ �� ��ġ�� �����ؼ� �Ʒ��� ����ϴϱ� �迭 �ϳ� �������		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2) {
					int row = table.rowAtPoint(e.getPoint());
				    int col = 1;
					Object value = table.getValueAt(row, col);
					String input = JOptionPane.showInputDialog(value+"���� ��⿡ ������ ����");
					table.setValueAt(input, row, 2);
					point[0] = row;
					point[1] = 2;
					
					System.out.println(point[0]);
					System.out.println(point[1]);
					
				}
			}
		});
		
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		JLabel lbl_chmatch = new JLabel("���� ����");
		lbl_chmatch.setForeground(Color.BLUE);
		lbl_chmatch.setBounds(383, 230, 63, 21);
		frame.getContentPane().add(lbl_chmatch);
		
		JLabel ������û = new JLabel("");
		������û.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int num = (int) (data[point[0]][0] = al.get(point[0]).getNum());
				String opp = String.valueOf(table.getValueAt(point[0], 2));
				int cnt = dao.OppInsert(num, opp);
				
				if(cnt==1) {
					JOptionPane.showMessageDialog(null, "���� ��û �Ϸ�!");
					//���� ��û ���� �� �� ����
					lbl_chmatch.setForeground(Color.RED);
					lbl_chmatch.setText("���� ���");
					
				}else {
					JOptionPane.showMessageDialog(null, "���� ��û ����!");
					
				}
				
				
			}
		});
		������û.setBounds(109, 230, 79, 24);
		frame.getContentPane().add(������û);
		
		JLabel ���ư��� = new JLabel("");
		���ư���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
					teamMenu_GUI tmg = new teamMenu_GUI();
					frame.dispose();
				
			}
		});
		���ư���.setBounds(12, 233, 79, 21);
		frame.getContentPane().add(���ư���);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC9.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);

	}
}
