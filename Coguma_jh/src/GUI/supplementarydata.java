package GUI;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
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

public class supplementarydata {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supplementarydata window = new supplementarydata();
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
	public supplementarydata() {
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
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("����", Font.PLAIN, 20));
		label.setBounds(263, 10, 144, 28);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("1.\uAC1C\uB150 \uC815\uB9AC \uC790\uB8CC");
		label_1.setFont(new Font("����", Font.PLAIN, 20));
		label_1.setBounds(12, 77, 263, 28);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("2.\uC720\uD615\uBCC4 \uBB38\uC81C");
		label_2.setFont(new Font("����", Font.PLAIN, 20));
		label_2.setBounds(12, 194, 263, 28);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("3. \uC2A4\uB9C8\uD2B8\uC778\uC7AC\uAC1C\uBC1C\uC6D0 \uC720\uD29C\uBE0C");
		label_3.setFont(new Font("����", Font.PLAIN, 20));
		label_3.setBounds(12, 295, 263, 28);
		frame.getContentPane().add(label_3);
		
		JLabel data_1 = new JLabel("\uC218\uC5C5\uC790\uB8CC_Dropbox(https://www.dropbox.com/sh/kd52fl6w4tls1iv/AAC1vM5InB2SFzhY3lA_HZHKa?dl=0)");
		
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
		data_1.setFont(new Font("����", Font.PLAIN, 13));
		data_1.setBounds(49, 115, 590, 28);
		frame.getContentPane().add(data_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(12, 111, 34, 32);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setBounds(12, 232, 34, 32);
		frame.getContentPane().add(checkBox);
		
		JLabel data_2 = new JLabel("\uD30C\uC774\uC36C 300\uC81C(https://wikidocs.net/7014)");
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
		data_2.setFont(new Font("����", Font.PLAIN, 13));
		data_2.setBounds(49, 236, 590, 28);
		frame.getContentPane().add(data_2);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_1.setBounds(12, 333, 34, 32);
		frame.getContentPane().add(checkBox_1);
		
		JLabel data_3 = new JLabel("\uC778\uC324TV_\uC790\uBC14 \uAE30\uCD08(https://www.youtube.com/watch?v=5meyGXiNgeY)");
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
		data_3.setFont(new Font("����", Font.PLAIN, 13));
		data_3.setBounds(49, 337, 590, 28);
		frame.getContentPane().add(data_3);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Scoreinfo_GUI();
			}
		});
		btnNewButton.setBounds(575, 428, 97, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
