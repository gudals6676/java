package c;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import DaoVo.BoardDAO;
import DaoVo.BoardVO;

import javax.swing.JFormattedTextField;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class P1_2BoardWrite {
	String bd_number;
	String bd_content;
	String bd_NOP;
	String id = "";
	ArrayList<BoardVO> al;
	BoardDAO BdDao = new BoardDAO();

	private JFrame frame;

	public P1_2BoardWrite() {
		initialize();
		frame.setVisible(true);
	}

	public P1_2BoardWrite(String id) {
		this.id = id;
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

		JPanel panel = new JPanel();
		panel.setBounds(68, 65, 360, 135);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JTextPane textPane = new JTextPane();
		panel.add(textPane, "name_454830201547300");

		JButton btnNewButton = new JButton("작성");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bd_content = textPane.getText();// 입력받음
				BdDao.bd_insert(id, bd_content);
				frame.dispose();
				new P1_1Board();
			}
		});
		btnNewButton.setBounds(362, 212, 97, 32);
		frame.getContentPane().add(btnNewButton);
	}
}
