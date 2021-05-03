package DaoVo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentinfoVO {

	private JLabel lbl_id;
	private JTextField tf_name;
	private JTextField tf_pw;
	private JTextField tf_birth;
	private JTextField tf_tel;
	private JTextField tf_address;
	private JTextField tf_email;
	
	public StudentinfoVO(JLabel lbl_id, JTextField tf_name, JTextField tf_pw, JTextField tf_birth, JTextField tf_tel,
			JTextField tf_address, JTextField tf_email) {
		super();
		this.lbl_id = lbl_id;
		this.tf_name = tf_name;
		this.tf_pw = tf_pw;
		this.tf_birth = tf_birth;
		this.tf_tel = tf_tel;
		this.tf_address = tf_address;
		this.tf_email = tf_email;
	}
	
}


