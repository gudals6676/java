import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginJoin {

private JFrame frame;
ImageIcon img1 = new ImageIcon("img/kkomi1.jpg");
ImageIcon img2 = new ImageIcon("img/kkomi2.jpg");
Image changed_img1 = img1.getImage().getScaledInstance(281, 184, Image.SCALE_SMOOTH);
ImageIcon changed_icon_img1 = new ImageIcon(changed_img1);
Image changed_img2 = img2.getImage().getScaledInstance(281, 184, Image.SCALE_SMOOTH);
ImageIcon changed_icon_img2 = new ImageIcon(changed_img2);



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginJoin window = new LoginJoin();
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
	public LoginJoin() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 366, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(34, 31, 281, 184);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel mainImage = new JLabel("");
		mainImage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mainImage.setIcon(changed_icon_img2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mainImage.setIcon(changed_icon_img1);
			}
		});
		panel.add(mainImage);
		//라벨에 이미지 적용
		mainImage.setIcon(changed_icon_img1);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginGUI();
				frame.dispose();//현재 창 사라지게 함
			}
		});
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setBounds(34, 242, 281, 49);
		frame.getContentPane().add(btnLogin);
		
		JButton btnJoin = new JButton("JOIN");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JoinGUI();
				frame.dispose();//현재 창 안보이게
			}
		});
		btnJoin.setBackground(Color.LIGHT_GRAY);
		btnJoin.setBounds(34, 314, 281, 49);
		frame.getContentPane().add(btnJoin);
	}

}
