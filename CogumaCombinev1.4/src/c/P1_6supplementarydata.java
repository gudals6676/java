package c;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import DaoVo.StudentDAO;

import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class P1_6supplementarydata {

	private JFrame frame;
	String id="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="b1";
					P1_6supplementarydata window = new P1_6supplementarydata(id);
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
	public P1_6supplementarydata() {
		initialize();
		frame.setVisible(true);
	}
	public P1_6supplementarydata(String id) {
		this.id=id;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uBCF4\uCDA9\uC790\uB8CC");
		label.setBounds(263, 10, 144, 28);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("1.\uAC1C\uB150 \uC815\uB9AC \uC790\uB8CC");
		label_1.setBounds(12, 183, 263, 28);
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("2.\uC720\uD615\uBCC4 \uBB38\uC81C");
		label_2.setBounds(12, 259, 263, 28);
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("3. \uC2A4\uB9C8\uD2B8\uC778\uC7AC\uAC1C\uBC1C\uC6D0 \uC720\uD29C\uBE0C");
		label_3.setBounds(12, 339, 263, 28);
		label_3.setFont(new Font("굴림", Font.PLAIN, 20));
		frame.getContentPane().add(label_3);
		
		JLabel data_1 = new JLabel("\uC218\uC5C5\uC790\uB8CC_Dropbox(https://www.dropbox.com/sh/kd52fl6w4tls1iv/AAC1vM5InB2SFzhY3lA_HZHKa?dl=0)");
		data_1.setBounds(49, 221, 590, 28);
		
		data_1.addMouseMotionListener(new MouseMotionAdapter() {
			
		});
		data_1.setToolTipText("https://www.dropbox.com/sh/kd52fl6w4tls1iv/AAC1vM5InB2SFzhY3lA_HZHKa?dl=0");
		data_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Desktop.isDesktopSupported()) {
		            Desktop desktop = Desktop.getDesktop();
		            try {
		                URI uri = new URI("https://www.dropbox.com/sh/kd52fl6w4tls1iv/AAC1vM5InB2SFzhY3lA_HZHKa?dl=0");
		                desktop.browse(uri);
		            } catch (IOException ex) {
		                ex.printStackTrace();
		            } catch (URISyntaxException ex) {
		                ex.printStackTrace();
		            }
		    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				data_1.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				data_1.setForeground(Color.BLACK);
				data_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		data_1.setFont(new Font("굴림", Font.PLAIN, 13));
		frame.getContentPane().add(data_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(12, 217, 34, 32);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(12, 297, 34, 32);
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(checkBox);
		
		JLabel data_2 = new JLabel("\uD30C\uC774\uC36C 300\uC81C(https://wikidocs.net/7014)");
		data_2.setBounds(49, 301, 590, 28);
		data_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Desktop.isDesktopSupported()) {
		            Desktop desktop = Desktop.getDesktop();
		            try {
		                URI uri = new URI("https://wikidocs.net/7014");
		                desktop.browse(uri);
		            } catch (IOException ex) {
		                ex.printStackTrace();
		            } catch (URISyntaxException ex) {
		                ex.printStackTrace();
		            }
		    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				data_2.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				data_2.setForeground(Color.BLACK);
				data_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		data_2.setFont(new Font("굴림", Font.PLAIN, 13));
		frame.getContentPane().add(data_2);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(12, 373, 34, 32);
		checkBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(checkBox_1);
		
		JLabel data_3 = new JLabel("\uC778\uC324TV_\uC790\uBC14 \uAE30\uCD08(https://www.youtube.com/watch?v=5meyGXiNgeY)");
		data_3.setBounds(49, 377, 590, 28);
		data_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Desktop.isDesktopSupported()) {
		            Desktop desktop = Desktop.getDesktop();
		            try {
		                URI uri = new URI("https://www.youtube.com/watch?v=5meyGXiNgeY");
		                desktop.browse(uri);
		            } catch (IOException ex) {
		                ex.printStackTrace();
		            } catch (URISyntaxException ex) {
		                ex.printStackTrace();
		            }
		    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				data_3.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				data_3.setForeground(Color.BLACK);
				data_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		data_3.setFont(new Font("굴림", Font.PLAIN, 13));
		frame.getContentPane().add(data_3);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setBounds(575, 428, 97, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new P1_5Scoreinfo_GUI(id);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(106, 68, 456, 105);
		frame.getContentPane().add(textPane);
		
		StudentDAO Sdao = new StudentDAO();
		int Savg = Sdao.SupplementaryData(id); //95
		String SN = Sdao.SupplementaryName(id); // 정지윤
		if(Savg>=60) {
			textPane.setText(SN+" 학생은 유형별 문제 풀이에 집중하면 학습 능력 향상에 도움이 됩니다 !");
		}else {
			textPane.setText(SN+" 학생은 개념 정리, 유형별 문제, 스마트인재개발원 유튜브 시청 중 2개 이상 하면 학습 능력 향상에 도움이 됩니다 !");
		}
	}
}
