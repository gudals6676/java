package Main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class teamGUI {

	private JFrame frame;

	public teamGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				teamMenu_GUI tm = new teamMenu_GUI();
				frame.dispose();
			}
		});
		lblNewLabel.setBounds(113, 158, 144, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RankGUI rk = new RankGUI();
				//RankingGUI rank = new RankingGUI();
				frame.dispose();
			}
		});
		lblNewLabel_1.setBounds(134, 103, 125, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wr_user_GUI wu = new wr_user_GUI();
				//wr_list_GUI wlg = new wr_list_GUI();
				frame.dispose();				
			}
		});
		lblNewLabel_2.setBounds(63, 328, 153, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.main(null);
				frame.dispose();
			}
		});
		lblNewLabel_3.setBounds(91, 216, 150, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				signoutGUI out = new signoutGUI();
				frame.dispose();
			}
		});
		lblNewLabel_4.setBounds(79, 271, 144, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC2AC\uB77C\uC774\uB4DC5.JPG"));
		lblNewLabel_5.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
