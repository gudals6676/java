package Main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import DAO.DAO;
import VO.GameSearchVO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;


public class OkayGUI {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	int okay;

	private JFrame frame;

	
	public OkayGUI(int click) {
		okay = click;
		initialize();
		frame.setVisible(true);

	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(750, 200, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cnt = 0;
				DAO dao = new DAO();
				boolean result = dao.ookay(okay);
				
				if(result==true) {
					JOptionPane.showMessageDialog(null, "매치가 성사되었습니다!");
					GameSearchGUI gsg = new GameSearchGUI();
					frame.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "Error!");
					frame.dispose();
				}
			}
		});
		lblNewLabel_1.setBounds(84, 335, 116, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cnt = 0;
				DAO dao = new DAO();
				boolean result = dao.nopp(okay);
				
				
				if(result==true) {
					
					JOptionPane.showMessageDialog(null, "매치를 취소하였습니다.");
					GameSearchGUI gsg = new GameSearchGUI();
					frame.dispose();
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Error!");
					frame.dispose();
				}
			}
		});
		lblNewLabel_2.setBounds(84, 378, 116, 43);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM05\\Desktop\\\uC138\uB85C\uC218\uC815\uBCF8\\\uC2B9\uC778\uAC70\uC808_GUI.jpg"));
		lblNewLabel.setBounds(0, 0, 284, 461);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
