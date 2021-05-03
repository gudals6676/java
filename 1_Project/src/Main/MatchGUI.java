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
		
		tf_loc = new JTextField("장소를 입력 해 주세요.");
		tf_loc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_loc.setText("");
			}
		});
		tf_loc.setColumns(10);
		tf_loc.setBounds(103, 100, 265, 21);
		frame.getContentPane().add(tf_loc);
		
		
		//캘린더 불러오기
		Calendar cal = Calendar.getInstance();
		String year = addZeroString(cal.get(Calendar.YEAR));
		String month = addZeroString(cal.get(Calendar.MONTH)+1);
		String day = addZeroString(cal.get(Calendar.DAY_OF_MONTH));
		
		//연
		String[] 연 = new String[11];
		for(int i=0, y=2021; i<연.length; i++, y++) {
			연[i] = Integer.toString(y);
		}
		
		JComboBox comboBox_yr = new JComboBox();
		comboBox_yr.setModel(new DefaultComboBoxModel(연));
		comboBox_yr.setBounds(104, 131, 58, 21);
		comboBox_yr.setSelectedItem(year);
		frame.getContentPane().add(comboBox_yr);
		
		//월
		String[] 월 = new String[12];
		for(int i=0; i<월.length; i++) {
			월[i] = addZeroString(i+1);
		}
		
		JComboBox comboBox_m = new JComboBox();
		comboBox_m.setModel(new DefaultComboBoxModel(월));
		comboBox_m.setBounds(196, 131, 58, 21);
		comboBox_m.setSelectedItem(month);
		frame.getContentPane().add(comboBox_m);
		
		//일
		String[] 일 = new String[31];
		for(int i=0; i<일.length; i++) {
			일[i] = addZeroString(i+1);
		}
		
		JComboBox comboBox_d = new JComboBox();
		comboBox_d.setModel(new DefaultComboBoxModel(일));
		comboBox_d.setBounds(104, 162, 58, 21);
		comboBox_d.setSelectedItem(day);
		frame.getContentPane().add(comboBox_d);
		
		//시간
		String[] 시 = new String[24];
		for(int i=0; i<시.length; i++) {
			시[i] = addZeroString(i);
		}
		
		//현재 시간 분
		String hour = addZeroString(cal.get(Calendar.HOUR));
		String min = addZeroString(cal.get(Calendar.MINUTE)/10*10);
		
		JComboBox cb_hour = new JComboBox();
		cb_hour.setModel(new DefaultComboBoxModel(시));
		cb_hour.setSelectedItem(hour);
		cb_hour.setBounds(196, 162, 58, 21);
		frame.getContentPane().add(cb_hour);
		
		String[] 분 = {"00","10","20","30","40","50"};
		JComboBox cb_min = new JComboBox();
		cb_min.setModel(new DefaultComboBoxModel(분));
		cb_min.setSelectedItem(min);
		cb_min.setBounds(288, 162, 58, 21);
		frame.getContentPane().add(cb_min);
		
		
		
		JLabel 등록하기 = new JLabel("");
		등록하기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//콤보박스 연월일을 문자열로 저장
				String d = (String)comboBox_d.getSelectedItem();
				String m = (String)comboBox_m.getSelectedItem();
				String y = (String)comboBox_yr.getSelectedItem();
				
				//콤보박스 시간 분을 문자열로 저장 
				String hr = (String)cb_hour.getSelectedItem();
				String min = (String)cb_min.getSelectedItem();
				
				//등록하기를 누르면 각 텍스트필드에 입력한 정보를 vo에 담기
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
					JOptionPane.showMessageDialog(null, "경기 등록 성공!");
					teamMenu_GUI tmg = new teamMenu_GUI();
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "경기 등록 실패!");
					tf_team.setText("");
					tf_loc.setText("");
				}
			}
		});
		
		textField = new JTextField("                    년                          월");
		textField.setBounds(104, 131, 264, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("                    일                           시                          분");
		textField_1.setColumns(10);
		textField_1.setBounds(104, 162, 264, 21);
		frame.getContentPane().add(textField_1);
		등록하기.setBounds(104, 230, 91, 31);
		frame.getContentPane().add(등록하기);
		
		JLabel 돌아가기 = new JLabel("");
		돌아가기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				teamMenu_GUI tmg = new teamMenu_GUI();
				frame.dispose();
			}
		});
		돌아가기.setBounds(0, 230, 91, 31);
		frame.getContentPane().add(돌아가기);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC8.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("연");
		lblNewLabel_1.setBounds(273, 134, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
	
	//여기에 넣자
	

	//db에 문자열로 저장해야되니까 202011을 20200101로 바꿔주는 메소드
	private String addZeroString(int i) {
		String value = Integer.toString(i);
		if(value.length()==1) {
			value = "0"+value;
		}
		return value;
	}
}
