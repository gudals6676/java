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

public class P2_8BoardWrite {
	String bd_number;
	String bd_content;
	String bd_NOP;
	String id = "";
	ArrayList<BoardVO> al;
	BoardDAO BdDao = new BoardDAO();

	private JFrame frame;

	ImageIcon imghome = new ImageIcon("img/home.png");
	Image C_imghome = imghome.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_imghome = new ImageIcon(C_imghome);

	ImageIcon imgmain = new ImageIcon("img/게시글 쓰기.png");
	Image C_imgmain = imgmain.getImage().getScaledInstance(175, 65, Image.SCALE_SMOOTH);// 이미지크기 변환
	ImageIcon CI_imgmain = new ImageIcon(C_imgmain);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = "a1";
					P2_8BoardWrite window = new P2_8BoardWrite(id);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public P2_8BoardWrite() {
		initialize();
		frame.setVisible(true);
	}

	public P2_8BoardWrite(String id) {
		this.id = id;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel mainImage0 = new JLabel("");
		mainImage0.setBounds(156, 14, 175, 52);
		frame.getContentPane().add(mainImage0);
		mainImage0.setBackground(new Color(255, 255, 255));
		mainImage0.setIcon(CI_imgmain);

		JPanel panel = new JPanel();
		panel.setBounds(68, 73, 360, 135);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textPane.setBackground(new Color(240, 248, 255));
		textPane.setBounds(0, 0, 360, 135);
		panel.add(textPane);

		JButton btn_작성 = new JButton("작성");
		btn_작성.setBackground(new Color(255, 255, 255));
		btn_작성.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btn_작성.setBounds(139, 228, 97, 32);
		btn_작성.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bd_content = textPane.getText();// 입력받음
				BdDao.Tbd_insert(id, bd_content);
				frame.dispose();
				new P2_7Board(id);
			}
		});
		frame.getContentPane().add(btn_작성);

		JButton btn_닫기 = new JButton("\uB2EB\uAE30");
		btn_닫기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new P2_7Board(id);
			}
		});
		btn_닫기.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btn_닫기.setBackground(Color.WHITE);
		btn_닫기.setBounds(253, 229, 97, 32);
		frame.getContentPane().add(btn_닫기);
	}
}
