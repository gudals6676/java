package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;


public class Student_GUI extends JFrame{
// T_S_007 사용자 성적 조회(버튼 클릭->성적 창 열기)
	JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Student_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);  // 여기 가로 세로 숫자 변경. 
		frame.setLocationRelativeTo(null);   //  여기 추가.  창이 가운데 위치하게 함
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(23, 10, 158, 44);
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(243, 10, 229, 341);
		frame.getContentPane().add(panel);
		
		
		JButton btn_scoreinfo = new JButton("\uC131\uC801\uC870\uD68C");
		btn_scoreinfo.addActionListener(new ActionListener() {             // 여기 추가.
			public void actionPerformed(ActionEvent e) {
				new Scoreinfo_GUI();
			}
		});
		
		btn_scoreinfo.setBounds(63, 64, 97, 44);
		frame.getContentPane().add(btn_scoreinfo);
		
		JButton btn_schedule = new JButton("\uC2DC\uAC04\uD45C");
		btn_schedule.setBounds(63, 118, 97, 44);
		frame.getContentPane().add(btn_schedule);
		
		JButton btn_board = new JButton("\uAC8C\uC2DC\uD310");
		btn_board.setBounds(63, 172, 97, 50);
		frame.getContentPane().add(btn_board);
		
		JButton btn_lunch = new JButton("\uC810\uC2EC \uBB50\uBA39\uC9D5?");
		btn_lunch.setBounds(63, 232, 115, 44);
		frame.getContentPane().add(btn_lunch);
		
		JButton btn_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_logout.setBounds(12, 311, 85, 23);
		frame.getContentPane().add(btn_logout);
		
	}
	
	

	
}
