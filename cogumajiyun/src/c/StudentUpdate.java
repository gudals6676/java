package c;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import DaoVo.StudentDAO;
import DaoVo.StudentVO;

import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;

public class StudentUpdate {





	   StudentDAO dao = new StudentDAO();
	  
	   private JFrame frame;
	   ImageIcon img1 = new ImageIcon("img/info.png");
	   Image C_img1 = img1.getImage().getScaledInstance(98, 343, Image.SCALE_SMOOTH);// 이미지크기 변환
	   ImageIcon CI_img1 = new ImageIcon(C_img1);

	   ImageIcon img2 = new ImageIcon("img/myinfo.png");
	   Image C_img2 = img2.getImage().getScaledInstance(160, 63, Image.SCALE_SMOOTH);// 이미지크기 변환
	   ImageIcon CI_img2 = new ImageIcon(C_img2);

	   /**
	    * @wbp.nonvisual location=320,-16
	    */

	   private final JTextField textField = new JTextField();
	   private JLabel lb_id;
	   private JTextField tf_name;
	   private JTextField tf_tel;
	   private JTextField tf_email;
	   private JTextField tf_address;
	   private JTextField tf_birth;
	   private JTextField tf_pw;
	   private String stu_id;
	   private String stu_name;
	   private String stu_tel;
	   private String stu_address;
	   private String stu_birthday;
	   private String stu_pw;
	   private String stu_email;
	   StudentVO al = new StudentVO(stu_id, stu_pw, stu_name, stu_birthday, stu_tel, stu_address, stu_email);
	   /**
	    * Launch the application.
	    */
	   public static void main(String[] args) {
	      EventQueue.invokeLater(new Runnable() {
	         public void run() {
	            try {
	               StudentUpdate window = new StudentUpdate();
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
	   public StudentUpdate() {	
		  
		   frame.setVisible(true);
	      initialize();
	   }

	   /**
	    * Initialize the contents of the frame.
	    */
	   private void initialize() {
	      StudentVO al = new StudentVO(stu_id, stu_pw, stu_name, stu_birthday, stu_tel, stu_address, stu_email);
	      String[] header = {"stu_id", "stu_name", "stu_pw", "stu_birth", "stu_tel", "stu_address", "stu_email"};
	      
		 
		  al = dao.StudentUpdate(stu_id);
	      
	      textField.setColumns(10);
	      frame = new JFrame();
	      frame.getContentPane().setBackground(new Color(0, 139, 205));
	      frame.setBounds(100, 100, 700, 500);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.getContentPane().setLayout(null);

	      JPanel info = new JPanel();
	      info.setBackground(Color.WHITE);
	      info.setBounds(140, 70, 100, 360);
	      frame.getContentPane().add(info);
	      JLabel mainImage = new JLabel("");

	      info.add(mainImage, "name_27704402491100");
	      mainImage.setBackground(new Color(255, 255, 255));
	      mainImage.setIcon(CI_img1);

	      JPanel myinfo = new JPanel();
	      myinfo.setBackground(Color.WHITE);
	      myinfo.setBounds(200, 14, 270, 60);
	      frame.getContentPane().add(myinfo);
	      JLabel mainImage1 = new JLabel("");

	      myinfo.add(mainImage1, "myinfo");
	      mainImage1.setBackground(new Color(255, 255, 255));
	      mainImage1.setIcon(CI_img2);

	      JPanel panel_id = new JPanel();
	      panel_id.setBounds(270, 86, 300, 28);
	      frame.getContentPane().add(panel_id);

	      JLabel lbl_id = new JLabel("New label");
	      lbl_id.setFont(new Font("굴림", Font.PLAIN, 17));
	      panel_id.add(lbl_id);

	      JPanel panel_pw = new JPanel();
	      panel_pw.setBounds(270, 136, 300, 28);
	      frame.getContentPane().add(panel_pw);

	      tf_pw = new JTextField();
	      
	      panel_pw.add(tf_pw);
	      tf_pw.setColumns(10);
	      tf_pw.setText(al.getStu_pw());
	      
	      JPanel panel_name = new JPanel();
	      panel_name.setBounds(270, 186, 300, 28);
	      frame.getContentPane().add(panel_name);

	      tf_name = new JTextField();
	      panel_name.add(tf_name);
	      tf_name.setColumns(10);

	      JPanel panel_birth = new JPanel();
	      panel_birth.setBounds(270, 236, 300, 28);
	      frame.getContentPane().add(panel_birth);

	      tf_birth = new JTextField();
	      panel_birth.add(tf_birth);
	      tf_birth.setColumns(10);

	      JPanel panel_tel = new JPanel();
	      panel_tel.setBounds(270, 288, 300, 28);
	      frame.getContentPane().add(panel_tel);

	      tf_tel = new JTextField();
	      panel_tel.add(tf_tel);
	      tf_tel.setColumns(10);

	      JPanel panel_email = new JPanel();
	      panel_email.setBounds(270, 338, 300, 28);
	      frame.getContentPane().add(panel_email);

	      tf_email = new JTextField();
	      panel_email.add(tf_email);
	      tf_email.setColumns(10);

	      JPanel panel_address = new JPanel();
	      panel_address.setBounds(270, 390, 300, 28);
	      frame.getContentPane().add(panel_address);

	      tf_address = new JTextField();
	      panel_address.add(tf_address);
	      tf_address.setColumns(10);

	      JPanel panel_1 = new JPanel();
	      panel_1.setBackground(new Color(255, 255, 255));
	      panel_1.setBounds(14, 14, 654, 429);
	      frame.getContentPane().add(panel_1);

	   }	   }