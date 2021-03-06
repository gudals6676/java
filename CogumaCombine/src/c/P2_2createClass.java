package c;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import DaoVo.TeacherDAO;
import DaoVo.TeacherVO;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class P2_2createClass {

	private JFrame frame;
	private JTextField c_num;
	private JTextField c_name;
	private JTextField t_id;
	private JTextField c_branch;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblId;
	private JLabel label_4;
	String id="";
	TeacherDAO dao = new TeacherDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="a1";
					P2_2createClass window = new P2_2createClass(id);
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
	public P2_2createClass() {
		initialize();
		frame.setVisible(true);
	}
	public P2_2createClass(String id) {
		this.id=id;
		System.out.println(id);
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uBC18 \uC0DD\uC131\uD558\uAE30");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(160, 10, 102, 15);
		frame.getContentPane().add(label);
		
		c_num = new JTextField();
		c_num.setBounds(202, 35, 155, 34);
		frame.getContentPane().add(c_num);
		c_num.setColumns(10);
		
		c_name = new JTextField();
		c_name.setColumns(10);
		c_name.setBounds(202, 84, 155, 34);
		frame.getContentPane().add(c_name);
		
		t_id = new JTextField();
		t_id.setColumns(10);
		t_id.setBounds(202, 132, 155, 34);
		frame.getContentPane().add(t_id);
		
		c_branch = new JTextField();
		c_branch.setColumns(10);
		c_branch.setBounds(202, 176, 155, 34);
		frame.getContentPane().add(c_branch);
		
		label_1 = new JLabel("\uBC18 \uBC88\uD638");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(43, 44, 102, 15);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("\uBC18 \uC774\uB984");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(43, 93, 102, 15);
		frame.getContentPane().add(label_2);
		
		lblId = new JLabel("\uB2F4\uB2F9 \uC120\uC0DD\uB2D8 ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(43, 141, 102, 15);
		frame.getContentPane().add(lblId);
		
		label_4 = new JLabel("\uC18C\uC18D");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(43, 185, 102, 15);
		frame.getContentPane().add(label_4);
		
		JButton create = new JButton("\uC0DD\uC131");
		create.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String class_Number = c_num.getText();
				String c_tea_id = t_id.getText();
				String class_className = c_name.getText();
				String class_branch = c_branch.getText();
				TeacherVO vo = new TeacherVO(class_Number, c_tea_id, class_className, class_branch);
				int cnt = dao.insertClass(vo);
				
				if(cnt > 0) {
					JOptionPane.showMessageDialog(null, "?? ????????!");
					frame.dispose();
					new P2_1Classmgment_GUI(id);
				}else {
					JOptionPane.showMessageDialog(null, "???? ????!");
				}
			}
		});
		create.setBounds(107, 228, 97, 23);
		frame.getContentPane().add(create);
		
		JButton cancle = new JButton("\uCDE8\uC18C");
		cancle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		cancle.setBounds(212, 228, 97, 23);
		frame.getContentPane().add(cancle);
	}
}
