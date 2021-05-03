package Main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import DAO.GameDAO;
import VO.GameVO;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class MatchGUI {

	private JFrame frame;
	private JTextField tf_team;
	private JTextField tf_loc;
	private JTextField textField;
	private JTextField textField_1;

	public MatchGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf_team = new JTextField(Main.loginMember.getId());
		tf_team.setBounds(104, 72, 264, 21);
		frame.getContentPane().add(tf_team);
		tf_team.setColumns(10);
		
		tf_loc = new JTextField("��Ҹ� �Է� �� �ּ���.");
		tf_loc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_loc.setText("");
			}
		});
		tf_loc.setColumns(10);
		tf_loc.setBounds(103, 100, 265, 21);
		frame.getContentPane().add(tf_loc);
		
		
		//Ķ���� �ҷ�����
		Calendar cal = Calendar.getInstance();
		String year = addZeroString(cal.get(Calendar.YEAR));
		String month = addZeroString(cal.get(Calendar.MONTH)+1);
		String day = addZeroString(cal.get(Calendar.DAY_OF_MONTH));
		
		//��
		String[] �� = new String[11];
		for(int i=0, y=2021; i<��.length; i++, y++) {
			��[i] = Integer.toString(y);
		}
		
		JComboBox comboBox_yr = new JComboBox();
		comboBox_yr.setModel(new DefaultComboBoxModel(��));
		comboBox_yr.setBounds(104, 131, 58, 21);
		comboBox_yr.setSelectedItem(year);
		frame.getContentPane().add(comboBox_yr);
		
		//��
		String[] �� = new String[12];
		for(int i=0; i<��.length; i++) {
			��[i] = addZeroString(i+1);
		}
		
		JComboBox comboBox_m = new JComboBox();
		comboBox_m.setModel(new DefaultComboBoxModel(��));
		comboBox_m.setBounds(196, 131, 58, 21);
		comboBox_m.setSelectedItem(month);
		frame.getContentPane().add(comboBox_m);
		
		//��
		String[] �� = new String[31];
		for(int i=0; i<��.length; i++) {
			��[i] = addZeroString(i+1);
		}
		
		JComboBox comboBox_d = new JComboBox();
		comboBox_d.setModel(new DefaultComboBoxModel(��));
		comboBox_d.setBounds(104, 162, 58, 21);
		comboBox_d.setSelectedItem(day);
		frame.getContentPane().add(comboBox_d);
		
		//�ð�
		String[] �� = new String[24];
		for(int i=0; i<��.length; i++) {
			��[i] = addZeroString(i);
		}
		
		//���� �ð� ��
		String hour = addZeroString(cal.get(Calendar.HOUR));
		String min = addZeroString(cal.get(Calendar.MINUTE)/10*10);
		
		JComboBox cb_hour = new JComboBox();
		cb_hour.setModel(new DefaultComboBoxModel(��));
		cb_hour.setSelectedItem(hour);
		cb_hour.setBounds(196, 162, 58, 21);
		frame.getContentPane().add(cb_hour);
		
		String[] �� = {"00","10","20","30","40","50"};
		JComboBox cb_min = new JComboBox();
		cb_min.setModel(new DefaultComboBoxModel(��));
		cb_min.setSelectedItem(min);
		cb_min.setBounds(288, 162, 58, 21);
		frame.getContentPane().add(cb_min);
		
		
		
		JLabel ����ϱ� = new JLabel("");
		����ϱ�.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//�޺��ڽ� �������� ���ڿ��� ����
				String d = (String)comboBox_d.getSelectedItem();
				String m = (String)comboBox_m.getSelectedItem();
				String y = (String)comboBox_yr.getSelectedItem();
				
				//�޺��ڽ� �ð� ���� ���ڿ��� ���� 
				String hr = (String)cb_hour.getSelectedItem();
				String min = (String)cb_min.getSelectedItem();
				
				//����ϱ⸦ ������ �� �ؽ�Ʈ�ʵ忡 �Է��� ������ vo�� ���
				GameDAO dao = new GameDAO();
				
				int num = 0;
				String team = tf_team.getText();
				String oppose = null;
				String g_time = hr+":"+min;
				String g_place = tf_loc.getText();
				String g_date = y+m+d;
				String status = null;
				
				GameVO vo = new GameVO(num, team, oppose, g_time, g_place, g_date, status);
				int cnt = dao.matchInsert(vo);
				
				if(cnt==1) {
					JOptionPane.showMessageDialog(null, "��� ��� ����!");
					teamMenu_GUI tmg = new teamMenu_GUI();
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "��� ��� ����!");
					tf_team.setText("");
					tf_loc.setText("");
				}
			}
		});
		
		textField = new JTextField("                    ��                          ��");
		textField.setBounds(104, 131, 264, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("                    ��                           ��                          ��");
		textField_1.setColumns(10);
		textField_1.setBounds(104, 162, 264, 21);
		frame.getContentPane().add(textField_1);
		����ϱ�.setBounds(104, 230, 91, 31);
		frame.getContentPane().add(����ϱ�);
		
		JLabel ���ư��� = new JLabel("");
		���ư���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				teamMenu_GUI tmg = new teamMenu_GUI();
				frame.dispose();
			}
		});
		���ư���.setBounds(0, 230, 91, 31);
		frame.getContentPane().add(���ư���);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC8.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("��");
		lblNewLabel_1.setBounds(273, 134, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
	
	//���⿡ ����
	

	//db�� ���ڿ��� �����ؾߵǴϱ� 202011�� 20200101�� �ٲ��ִ� �޼ҵ�
	private String addZeroString(int i) {
		String value = Integer.toString(i);
		if(value.length()==1) {
			value = "0"+value;
		}
		return value;
	}
}
