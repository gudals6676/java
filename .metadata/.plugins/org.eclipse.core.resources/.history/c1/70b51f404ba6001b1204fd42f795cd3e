package c;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DaoVo.BoardDAO;
import DaoVo.BoardVO;
import javax.swing.SwingConstants;

//학생으로 로그인시 수행할 보드의 목록 -> 게시글 작성시 boardwrite로 이동
public class P2_6Board {
	String bd_number;
	String bd_content;
	String bd_NOP;
	
	JFrame frame;
	String id;
	ArrayList<BoardVO> al;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P2_6Board window = new P2_6Board("b1");
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
	public P2_6Board() {
		initialize();
		frame.setVisible(true);
	}
	
	public P2_6Board(String id) {
		this.id=id;
		initialize();
		frame.setVisible(true);
		System.out.println(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.getContentPane().setBackground(new Color(0, 139, 205));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_bd_number = new JLabel("\uAC8C\uC2DC\uBC88\uD638");
		lbl_bd_number.setBounds(495, 209, 82, 21);
		frame.getContentPane().add(lbl_bd_number);
		
		JLabel lbl_bd_content = new JLabel("\uAC8C\uC2DC\uB0B4\uC6A9");
		lbl_bd_content.setBounds(495, 271, 82, 21);
		frame.getContentPane().add(lbl_bd_content);
		
		JLabel lbl_bd_NOP = new JLabel("\uD604\uC7AC \uCC38\uC5EC\uC218");
		lbl_bd_NOP.setBounds(495, 333, 82, 21);
		frame.getContentPane().add(lbl_bd_NOP);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC8C\uC2DC\uD310");
		lblNewLabel_1.setBounds(217, 35, 274, 51);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("HY견명조", Font.PLAIN, 34));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel info_bd_number = new JLabel("");
		info_bd_number.setBounds(563, 240, 82, 21);
		frame.getContentPane().add(info_bd_number);
		
		JLabel info_bd_content = new JLabel("");
		info_bd_content.setBounds(563, 302, 82, 21);
		frame.getContentPane().add(info_bd_content);
		
		JLabel info_bd_NOP = new JLabel("");
		info_bd_NOP.setBounds(563, 364, 82, 21);
		frame.getContentPane().add(info_bd_NOP);
		//여기
		BoardDAO BdDao = new BoardDAO();
		al = BdDao.SelectALL();
		
		String[] header = {"bd_number","bd_content","bd_NOP"};
		String[][] data = new String[al.size()][3];//3:7
		
		for (int i = 0; i < al.size(); i++) {
	         for (int j = 0; j < 3; j++) {
	            if(j == 0) {
	               data[i][j] = al.get(i).getBd_number();
	            }else if(j == 1) {
	               data[i][j] = al.get(i).getBd_content();
	            }else if(j == 2) {
	               data[i][j] = al.get(i).getBd_NOP();
	            }
	         }
	      }
	
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(15, 116, 471, 272);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 471, 433);
		//스크롤 추가.
		panel.add(scrollPane);
		
		JTable table = new JTable(data,header);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					int row = table.getSelectedRow();
					String bd_number = (String)table.getModel().getValueAt(row, 0);
					String bd_content = (String)table.getModel().getValueAt(row, 1);
					String bd_NOP = (String)table.getModel().getValueAt(row, 2);
					info_bd_number.setText(bd_number);
					info_bd_content.setText(bd_content);
					info_bd_NOP.setText(bd_NOP);
			}
		});
		
		table.setFillsViewportHeight(true);// 꽉차게하기
		//테이블에 스크롤 패널 추가 ,, 칼럼이름 보이기 위해서 추가 **
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("게시글 쓰기");
		btnNewButton.setBounds(525, 405, 129, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(id);
				new P1_2BoardWrite(id);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 10, 660, 441);
		frame.getContentPane().add(panel_1);
	}
}
