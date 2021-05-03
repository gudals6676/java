package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import DAO.DAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class editMember {

	private JFrame frame;
	private JTextField tf_name;
	private JTextField tf_age;
	private JTextField tf_elite;
	private JTextField tf_title;
	int cclick;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	public editMember(int click) {
		cclick = click;
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("\uC120\uC218 \uC815\uBCF4 \uC218\uC815");
		label.setBounds(43, -22, 102, 23);
		frame.getContentPane().add(label);

		tf_name = new JTextField("이름을 입력하세요.");
		tf_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_name.setText("");
			}
		});
		tf_name.setBounds(52, 133, 180, 21);
		tf_name.setColumns(10);
		frame.getContentPane().add(tf_name);

		tf_age = new JTextField("나이를 입력하세요");
		tf_age.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_age.setText("");
			}
		});
		tf_age.setBounds(52, 175, 180, 21);
		tf_age.setColumns(10);
		frame.getContentPane().add(tf_age);

		tf_elite = new JTextField("선출여부 Y / N");
		tf_elite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_elite.setText("");
			}
		});
		tf_elite.setBounds(52, 220, 180, 21);
		tf_elite.setColumns(10);
		frame.getContentPane().add(tf_elite);

		tf_title = new JTextField("직합을 입력하세요");
		tf_title.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf_title.setText("");
			}
		});
		tf_title.setBounds(52, 261, 180, 21);
		tf_title.setColumns(10);
		frame.getContentPane().add(tf_title);

		lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int num = cclick;
				String name = tf_name.getText();
				int age = Integer.parseInt(tf_age.getText());
				String elite = tf_elite.getText();
				String title = tf_title.getText();

				DAO dao = new DAO();
				boolean result = dao.updatePlayer(num, name, age, elite, title);

				if (result == true) {
					JOptionPane.showMessageDialog(null, "업데이트 되었습니다.");
					frame.setVisible(true);
					tf_name.setText("");
					tf_age.setText("");
					tf_elite.setText("");
					tf_title.setText("");

				} else if (result == false) {

					JOptionPane.showMessageDialog(null, "비어있는 칸이 존재합니다.");
					frame.dispose();
					tf_name.setText("");
					tf_age.setText("");
					tf_elite.setText("");
					tf_title.setText("");
				}
			PLAYER_LIST_GUI alg = new PLAYER_LIST_GUI();
				frame.dispose();
			}
		});
		lblNewLabel.setBounds(86, 333, 112, 38);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PLAYER_LIST_GUI pag = new PLAYER_LIST_GUI();
				frame.dispose();
			}
		});
		lblNewLabel_1.setBounds(86, 381, 112, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC120\uC218\uC815\uBCF4\uC218\uC815.jpg"));
		lblNewLabel_2.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
