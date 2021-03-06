import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class Student_GUI {

	private JFrame frame;
	private JTextField txtTestetstetset;
	private JTable table;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Student_GUI() {
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
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(89, 10, 158, 44);
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(351, 10, 321, 441);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACF5\uC9C0 \uC0AC\uD56D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(74, 10, 86, 37);
		panel.add(lblNewLabel);
		
		JButton btnAsd = new JButton("asd");
		btnAsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAsd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel test = new JPanel();
				test.setBounds(0, 0, 321, 441);
				panel.add(test);
				
				txtTestetstetset = new JTextField();
				txtTestetstetset.setText("testetstetset");
				txtTestetstetset.setHorizontalAlignment(SwingConstants.RIGHT);
				test.add(txtTestetstetset);
				txtTestetstetset.setColumns(10);
				frame.setVisible(true);
			}
		});
		btnAsd.setBounds(212, 72, 97, 23);
		panel.add(btnAsd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 73, 172, 358);
		panel.add(scrollPane);
		
		String[] header = {"No","????"};
		String[][] data = new String[10][2];
		data[0][0] = "1";
		data[0][1] = "??????????";
		data[1][0] = "2";
		data[1][1] = "??????????";
		data[2][0] = "3";
		data[2][1] = "??????????";
		data[3][0] = "4";
		data[3][1] = "??????????";
		
		table = new JTable(data,header);
		table.getColumn("No").setPreferredWidth(2);
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		
		
		
		
	
		
		
		JButton btn_scoreinfo = new JButton("\uC131\uC801\uC870\uD68C");
		btn_scoreinfo.setBounds(129, 64, 97, 44);
		frame.getContentPane().add(btn_scoreinfo);
		
		JButton btn_schedule = new JButton("\uC2DC\uAC04\uD45C");
		btn_schedule.setBounds(129, 118, 97, 44);
		frame.getContentPane().add(btn_schedule);
		
		JButton btn_board = new JButton("\uAC8C\uC2DC\uD310");
		btn_board.setBounds(129, 172, 97, 50);
		frame.getContentPane().add(btn_board);
		
		JButton btn_lunch = new JButton("\uC810\uC2EC \uBB50\uBA39\uC9D5?");
		btn_lunch.setBounds(129, 232, 97, 44);
		frame.getContentPane().add(btn_lunch);
		
		JButton btn_logout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_logout.setBounds(78, 311, 97, 23);
		frame.getContentPane().add(btn_logout);
	}
}
