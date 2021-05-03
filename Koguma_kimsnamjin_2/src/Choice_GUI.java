import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Choice_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choice_GUI window = new Choice_GUI();
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
	public Choice_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(151, 10, 108, 33);
		frame.getContentPane().add(lblNewLabel);

		JLabel lbl_student = new JLabel("New label");
		lbl_student.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_student.setBounds(56, 97, 132, 106);
		frame.getContentPane().add(lbl_student);

		JLabel lbl_teacher = new JLabel("New label");
		lbl_teacher.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_teacher.setBounds(246, 97, 132, 106);
		frame.getContentPane().add(lbl_teacher);

		JButton btn_student = new JButton("New button");
		btn_student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// new Classmgment_GUI(); �� ����
				new Teacher_GUI(); //������ ����
				// new Board_GUI(); �Խ���
				// new JoinGUI(); �л� ����
				// new Login_GUI(); �α���
				// new Lunch_GUI(); ����
				// new Schedule_GUI(); �ð�ǥ
				// new Scoreinfo_GUI(); ����ǥ �� �����û ��ư
				// new Scoremgment_GUI(); ���� ���� �߰� ���� ���� ��ư
				// new Student_GUI(); �л� ���� �α׾ƿ� ������ȸ �ð�ǥ �Խ��� ���ɹ���¡ ��ư
				// new Studentinfo_GUI(); �л� ���� ���� �� ��� ��û
				frame.dispose();
			}
		});
		btn_student.setBounds(69, 227, 97, 74);
		frame.getContentPane().add(btn_student);

		JButton btn_teacher = new JButton("New button");
		btn_teacher.setBounds(264, 227, 97, 74);
		frame.getContentPane().add(btn_teacher);
	}
}
