package c;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import DaoVo.BoardDAO;
import DaoVo.BoardVO;

import javax.swing.JFormattedTextField;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class P1_2BoardWrite {
	String bd_number;
	String bd_content;
	String bd_NOP;
	String id ="";
	ArrayList<BoardVO> al;
	BoardDAO BdDao = new BoardDAO();
	

	private JFrame frame;

	ImageIcon imghome = new ImageIcon("img/home.png");
	Image C_imghome = imghome.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);// ¿ÃπÃ¡ˆ≈©±‚ ∫Ø»Ø
	ImageIcon CI_imghome = new ImageIcon(C_imghome);
	
	ImageIcon imgmain = new ImageIcon("img/∞‘Ω√±€ æ≤±‚.png");
	Image C_imgmain = imgmain.getImage().getScaledInstance(175, 65, Image.SCALE_SMOOTH);// ¿ÃπÃ¡ˆ≈©±‚ ∫Ø»Ø
	ImageIcon CI_imgmain = new ImageIcon(C_imgmain);
	
	public P1_2BoardWrite() {
		initialize();
		frame.setVisible(true);
	}
	public P1_2BoardWrite(String id) {
		this.id=id;
		initialize();
		frame.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel mainImage0 = new JLabel("");
		mainImage0.setBounds(156, 14, 175, 52);
		frame.getContentPane().add(mainImage0);
		mainImage0.setBackground(new Color(255, 255, 255));
		mainImage0.setIcon(CI_imgmain);
		
		JPanel panel = new JPanel();
		panel.setBounds(68, 65, 360, 135);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JTextPane textPane = new JTextPane();
		panel.add(textPane, "name_454830201547300");
		
		JButton btnNewButton = new JButton("¿€º∫");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bd_content =textPane.getText();//¿‘∑¬πﬁ¿Ω
				BdDao.bd_insert(id,bd_content);
				frame.dispose();
				new P1_1Board();
			}
		});
		frame.getContentPane().add(btnNewButton);

		JButton btn_¥›±‚ = new JButton("\uB2EB\uAE30");
		btn_¥›±‚.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new P1_1Board(id);
			}
		});
		btn_¥›±‚.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 14));
		btn_¥›±‚.setBackground(Color.WHITE);
		btn_¥›±‚.setBounds(253, 229, 97, 32);
		frame.getContentPane().add(btn_¥›±‚);
	}
}
