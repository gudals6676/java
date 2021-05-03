package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import DAO.DAO;
import VO.PlayerVO;
import VO.TeamVO;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class PLAYER_ADD_GUI {

	private JFrame frame;
	private JTextField tf_name;
	private JTextField tf_age;
	private JTextField tf_title;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tf_elite;
	private JTextField tf_teamName;
	private JTextField textField;

	public PLAYER_ADD_GUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tf_name = new JTextField("이름을 입력하세요.");
		tf_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_name.setText("");
			}
		});
		tf_name.setBounds(156, 114, 174, 21);
		frame.getContentPane().add(tf_name);
		tf_name.setColumns(10);

		tf_age = new JTextField("나이를 입력하세요.");
		tf_age.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_age.setText("");
			}
		});
		tf_age.setColumns(10);
		tf_age.setBounds(156, 145, 174, 21);
		frame.getContentPane().add(tf_age);

		tf_title = new JTextField("직함을 입력하세요");
		tf_title.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_title.setText("");
			}
		});
		tf_title.setColumns(10);
		tf_title.setBounds(156, 204, 174, 21);
		frame.getContentPane().add(tf_title);

		JButton tf_add = new JButton("\uCD94\uAC00");
		frame.getContentPane().add(tf_add);
		String id = Main.loginMember.getId();

		JRadioButton rb_eliteYes = new JRadioButton("Y");
		rb_eliteYes.setBounds(238, 175, 46, 23);
		frame.getContentPane().add(rb_eliteYes);
		
		JRadioButton rb_eliteNo = new JRadioButton("N");
		rb_eliteNo.setBounds(284, 175, 46, 23);
		frame.getContentPane().add(rb_eliteNo);
		
		tf_teamName = new JTextField(Main.loginMember.getId());
		tf_teamName.setBounds(156, 83, 174, 21);
		frame.getContentPane().add(tf_teamName);
		tf_teamName.setColumns(10);
		
		textField = new JTextField("선출여부");
		textField.setBounds(156, 175, 82, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel 조회및수정 = new JLabel("");
		조회및수정.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PLAYER_LIST_GUI playList = new PLAYER_LIST_GUI();
				frame.dispose();
			}
		});
		조회및수정.setBounds(370, 10, 114, 21);
		frame.getContentPane().add(조회및수정);
		
		JLabel 이전 = new JLabel("");
		이전.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				teamMenu_GUI tmg = new teamMenu_GUI();
				frame.dispose();
			}
		});
		이전.setBounds(12, 226, 79, 35);
		frame.getContentPane().add(이전);
		
		JLabel 등록 = new JLabel("");
		등록.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String team = Main.loginMember.getId();
				String name = tf_name.getText();
				int age = Integer.parseInt(tf_age.getText());
				String elite = "";
				if(rb_eliteYes.isSelected()) {
					elite = rb_eliteYes.getText();
				}else if(rb_eliteNo.isSelected()) {
					elite = rb_eliteNo.getText();
				}
				
				String title = tf_title.getText();

				DAO dao = new DAO();
				int cnt = dao.addPlayer(team, name, age, elite, title);

				if (cnt == 0) {

					JOptionPane.showMessageDialog(null, "선수 등록 실패!");

				} else {
					frame.dispose();
					JOptionPane.showMessageDialog(null, "선수 등록 성공!");
					frame.setVisible(true);
					tf_name.setText("");
					tf_age.setText("");
					tf_title.setText("");

				}
				frame.dispose();
				//추가하고 나면 창 끄고 조회창 뜨면 좋을 것 같아서 불러봤음
				PLAYER_LIST_GUI add = new PLAYER_LIST_GUI();
			}
		});
		등록.setBounds(103, 226, 87, 35);
		frame.getContentPane().add(등록);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uAC00\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC2.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		frame.getContentPane().add(lblNewLabel);
		
		
		

	}
}
