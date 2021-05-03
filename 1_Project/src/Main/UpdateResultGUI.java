package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

import DAO.GameDAO;
import VO.ScoreVO;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class UpdateResultGUI {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tf_goal;
	private JTextField tf_lose;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField tf_team;
	private JTextField tf_result;
	private JTextField tf_date;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Create the application.
	 */
	public UpdateResultGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tf_team = new JTextField();
		tf_team.setText("팀명을 입력하세요");
		tf_team.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_team.setText("");
			}
		});
		tf_team.setColumns(10);
		tf_team.setBounds(55, 130, 174, 21);
		frame.getContentPane().add(tf_team);

		tf_result = new JTextField();
		tf_result.setText("승/패/무");
		tf_result.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_result.setText("");
			}
		});
		tf_result.setColumns(10);
		tf_result.setBounds(55, 172, 174, 21);
		frame.getContentPane().add(tf_result);

		tf_goal = new JTextField();
		tf_goal.setText("득점을 입력하세요");
		tf_goal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_goal.setText("");
			}
		});
		tf_goal.setBounds(55, 214, 174, 21);
		frame.getContentPane().add(tf_goal);
		tf_goal.setColumns(10);

		tf_lose = new JTextField();
		tf_lose.setText("실점을 입력하세요");
		tf_lose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_lose.setText("");
			}
		});
		tf_lose.setColumns(10);
		tf_lose.setBounds(55, 254, 174, 21);
		frame.getContentPane().add(tf_lose);

		tf_date = new JTextField();
		tf_date.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_date.setText("");
			}
		});
		tf_date.setText("날짜 입력(20210000)");
		tf_date.setColumns(10);
		tf_date.setBounds(55, 299, 174, 21);
		frame.getContentPane().add(tf_date);

		lblNewLabel = new JLabel("\uB4A4\uB85C\uAC00\uAE30");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC2B9\uD328\uACB0\uACFC\uC785\uB825.jpg"));
		lblNewLabel.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GameDAO dao = new GameDAO();

				String team = tf_team.getText();
				int goal = Integer.parseInt(tf_goal.getText());
				int lost = Integer.parseInt(tf_lose.getText());
				String result = tf_result.getText();
				String date = tf_date.getText();

				ScoreVO vo = new ScoreVO(team, goal, lost, result, date);
				int cnt = dao.InputScore(vo);

				if (cnt == 1) {
					JOptionPane.showMessageDialog(null, "결과 입력 성공!");
					frame.dispose();
					InputResultGUI ir = new InputResultGUI();

				} else {
					JOptionPane.showMessageDialog(null, "결과 입력 실패!");
				}
			}
		});
		lblNewLabel_1.setBounds(84, 346, 113, 33);
		frame.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InputResultGUI ir = new InputResultGUI();
				frame.dispose();
			}
		});
		lblNewLabel_2.setBounds(84, 399, 113, 27);
		frame.getContentPane().add(lblNewLabel_2);

	}

}
