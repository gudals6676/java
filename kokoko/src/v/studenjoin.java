package v;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import c.DAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studenjoin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studenjoin frame = new studenjoin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public studenjoin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO dao = new DAO();
		
				String studnetnumber = "1";
				String id = "������";
				String pw = "������";
				String name = "������";
				String age = "������";
				String tel = "������";
				String address = "������";
				String email = "������";
				String data = "������";
				String class_classNumber = "www";
				String teacher_teacherNumber = "aaaa";
				dao.studnet_join(studnetnumber, id, pw, name, age, tel, address, email, data, class_classNumber, teacher_teacherNumber);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
	}

}
