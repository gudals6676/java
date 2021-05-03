package c;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import DaoVo.TeacherDAO;
import DaoVo.TeacherVO;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Image;

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
	String id = "";
	TeacherDAO dao = new TeacherDAO();
	
	ImageIcon imgmain = new ImageIcon("img/¹Ý »ý¼º.png");
	Image C_imgmain = imgmain.getImage().getScaledInstance(121, 56, Image.SCALE_SMOOTH);// ÀÌ¹ÌÁöÅ©±â º¯È¯
	ImageIcon CI_imgmain = new ImageIcon(C_imgmain);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = "a1";
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
		this.id = id;
		System.out.println(id);
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(200, 150, 450, 367);
		frame.getContentPane().setBackground(new Color(0, 139, 205));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
				JLabel mainImage0 = new JLabel("");
				mainImage0.setBounds(156, 14, 125, 50);
				frame.getContentPane().add(mainImage0);
				mainImage0.setBackground(new Color(255, 255, 255));
				mainImage0.setIcon(CI_imgmain);

		c_num = new JTextField();
		c_num.setBounds(201, 78, 155, 34);
		frame.getContentPane().add(c_num);
		c_num.setColumns(10);

		c_name = new JTextField();
		c_name.setBounds(201, 126, 155, 34);
		c_name.setColumns(10);
		frame.getContentPane().add(c_name);

		t_id = new JTextField();
		t_id.setBounds(201, 176, 155, 34);
		t_id.setColumns(10);
		frame.getContentPane().add(t_id);

		c_branch = new JTextField();
		c_branch.setBounds(201, 222, 155, 34);
		c_branch.setColumns(10);
		frame.getContentPane().add(c_branch);

		label_1 = new JLabel("\uBC18 \uBC88\uD638");
		label_1.setBounds(58, 87, 102, 15);
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label_1);

		label_2 = new JLabel("\uBC18 \uC774\uB984");
		label_2.setBounds(58, 135, 102, 15);
		label_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label_2);

		lblId = new JLabel("\uB2F4\uB2F9 \uC120\uC0DD\uB2D8 ID");
		lblId.setBounds(58, 183, 115, 15);
		lblId.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblId);

		label_4 = new JLabel("\uC18C\uC18D");
		label_4.setBounds(58, 230, 102, 15);
		label_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label_4);

		JButton create = new JButton("\uC0DD\uC131");
		create.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		create.setBounds(119, 274, 97, 27);
		create.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String class_Number = c_num.getText();
				String c_tea_id = t_id.getText();
				String class_className = c_name.getText();
				String class_branch = c_branch.getText();
				TeacherVO vo = new TeacherVO(class_Number, c_tea_id, class_className, class_branch);
				int cnt = dao.insertClass(vo);

				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "¹Ý »ý¼º¿Ï·á!");
					frame.dispose();
					new P2_1Classmgment_GUI(id);
				} else {
					JOptionPane.showMessageDialog(null, "»ý¼º ½ÇÆÐ!");
				}
			}
		});
		frame.getContentPane().add(create);

		JButton cancle = new JButton("\uCDE8\uC18C");
		cancle.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		cancle.setBounds(229, 274, 97, 27);
		cancle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		frame.getContentPane().add(cancle);
				
				JPanel panel = new JPanel();
				panel.setBackground(new Color(255, 255, 255));
				panel.setBounds(12, 10, 410, 308);
				frame.getContentPane().add(panel);
	}
}
