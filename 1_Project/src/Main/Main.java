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
		
		JLabel ������ = new JLabel("");
		������.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "���α׷��� ����˴ϴ�.", "���α׷� ����", JOptionPane.CANCEL_OPTION);
				frame.dispose();
			}
		});
		������.setBounds(86, 411, 109, 27);
		frame.getContentPane().add(������);
		
		
		JLabel ��ȸ������ = new JLabel("");
		��ȸ������.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				joinGUI join = new joinGUI();
				frame.dispose();
				
			}
		});
		��ȸ������.setBounds(86, 365, 109, 27);
		frame.getContentPane().add(��ȸ������);
		
		JLabel �󺧷α��� = new JLabel("");
		�󺧷α���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginGUI login = new loginGUI();
				frame.dispose();
				
			}
		});
		�󺧷α���.setBounds(86, 315, 109, 27);
		frame.getContentPane().add(�󺧷α���);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uB274_\uC378\uB124\uC77C.jpg"));
		lblNewLabel.setBounds(0, 0, 304, 460);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
