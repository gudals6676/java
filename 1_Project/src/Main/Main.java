package Main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import DAO.DAO;
import VO.TeamVO;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
	

	private JFrame frame;
	public static TeamVO loginMember = null;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(750, 200, 289, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel 라벨종료 = new JLabel("");
		라벨종료.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "프로그램이 종료됩니다.", "프로그램 종료", JOptionPane.CANCEL_OPTION);
				frame.dispose();
			}
		});
		라벨종료.setBounds(86, 411, 109, 27);
		frame.getContentPane().add(라벨종료);
		
		
		JLabel 라벨회원가입 = new JLabel("");
		라벨회원가입.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				joinGUI join = new joinGUI();
				frame.dispose();
				
			}
		});
		라벨회원가입.setBounds(86, 365, 109, 27);
		frame.getContentPane().add(라벨회원가입);
		
		JLabel 라벨로그인 = new JLabel("");
		라벨로그인.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginGUI login = new loginGUI();
				frame.dispose();
				
			}
		});
		라벨로그인.setBounds(86, 315, 109, 27);
		frame.getContentPane().add(라벨로그인);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uB274_\uC378\uB124\uC77C.jpg"));
		lblNewLabel.setBounds(0, 0, 304, 460);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
