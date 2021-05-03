package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class teamMenu_GUI {

	private JFrame frame;

	public teamMenu_GUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 292, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editTeamInfoGUI eti = new editTeamInfoGUI();
				frame.dispose();
			}
		});
		lblNewLabel.setBounds(132, 101, 128, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PLAYER_ADD_GUI padg = new PLAYER_ADD_GUI();
				frame.dispose();
			}
		});
		label.setBounds(115, 157, 134, 24);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MatchGUI match = new MatchGUI();
				frame.dispose();
			}
		});
		label_1.setBounds(99, 214, 134, 24);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				teamGUI tg = new teamGUI();
				frame.dispose();
			}
		});
		label_2.setBounds(64, 325, 154, 24);
		frame.getContentPane().add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MatchJoinGUI mjg = new MatchJoinGUI();
				frame.dispose();
				
			}
		});
		lblNewLabel_1.setBounds(79, 270, 139, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uB274 \uACBD\uAE30\uBA54\uB274.jpg"));
		lblNewLabel_2.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
