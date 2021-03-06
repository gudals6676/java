import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class MusicPlayerGUI {

	private JFrame frame;
	Musicplayer player = new Musicplayer();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayerGUI window = new MusicPlayerGUI();
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
	public MusicPlayerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		//setBounds(x????ġ, y????ġ, ????, ????)
		frame.setBounds(300, 300, 750, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(30, 28, 675, 97);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_musicinfo = new JLabel("Music Info");
		lbl_musicinfo.setBackground(Color.YELLOW);
		lbl_musicinfo.setFont(new Font("???? ????", Font.PLAIN, 44));
		lbl_musicinfo.setForeground(Color.BLACK);
		lbl_musicinfo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_musicinfo, "name_230437708654000");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(30, 135, 675, 97);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btn_pre = new JButton("\u25C0\u25C0");
		btn_pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music m = player.preplay();
				lbl_musicinfo.setText(musicInfo(m));
			}
		});
		btn_pre.setBackground(Color.ORANGE);
		panel_1.add(btn_pre);
		
		JButton btn_play = new JButton("\u25B6");
		btn_play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music m = player.play();
				lbl_musicinfo.setText(musicInfo(m));
			}
		});
		btn_play.setBackground(Color.GREEN);
		panel_1.add(btn_play);
		
		JButton btn_stop = new JButton("\u25A0");
		btn_stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m = player.stop();
				lbl_musicinfo.setText(m);
			}
		});
		btn_stop.setBackground(Color.RED);
		panel_1.add(btn_stop);
		
		JButton btn_next = new JButton("\u25B6\u25B6");
		btn_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music m = player.nextplay();
				lbl_musicinfo.setText(musicInfo(m));
			}
		});
		btn_next.setBackground(Color.PINK);
		panel_1.add(btn_next);
	}
	private static String musicInfo(Music m) {
		return m.getSinger()+", "+m.getMusicName()+", "+changeTime(m);
	}

	private static String changeTime(Music m) {
		return m.getPlayTime()/60+"??"+m.getPlayTime()%60+"??";
	}
}
