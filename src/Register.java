import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;


public class Register extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel registerPnl;
	private JLabel label;
	private JTextField nameTxt;
	private JPasswordField passwordField;
	private JLabel label_1;
	private JButton registerBtn;
	private JLabel label_2;
	private JTextField emailTxt;
	private JLabel label_3;
	private JTextField usernameTxt;
	private JPanel genderPnl;
	private JLabel genderLbl;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getPanel_1(), BorderLayout.WEST);
		contentPane.add(getPanel_2(), BorderLayout.SOUTH);
		contentPane.add(getPanel_3(), BorderLayout.EAST);
		contentPane.add(getPanel_4(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setForeground(Color.DARK_GRAY);
			panel.setBackground(Color.DARK_GRAY);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setForeground(Color.DARK_GRAY);
			panel_1.setBackground(Color.DARK_GRAY);
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setForeground(Color.DARK_GRAY);
			panel_2.setBackground(Color.DARK_GRAY);
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBackground(Color.DARK_GRAY);
			panel_3.setForeground(Color.DARK_GRAY);
		}
		return panel_3;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setLayout(null);
			panel_4.add(getRegisterPnl());
		}
		return panel_4;
	}
	private JPanel getRegisterPnl() {
		if (registerPnl == null) {
			registerPnl = new JPanel();
			registerPnl.setLayout(null);
			registerPnl.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Register Panel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(139, 0, 0)));
			registerPnl.setBackground(Color.CYAN);
			registerPnl.setBounds(10, 11, 330, 190);
			registerPnl.add(getLabel());
			registerPnl.add(getNameTxt());
			registerPnl.add(getPasswordField());
			registerPnl.add(getLabel_1());
			registerPnl.add(getRegisterBtn());
			registerPnl.add(getLabel_2());
			registerPnl.add(getEmailTxt());
			registerPnl.add(getLabel_3());
			registerPnl.add(getUsernameTxt());
			registerPnl.add(getGenderPnl());
		}
		return registerPnl;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Name");
			label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			label.setBounds(26, 11, 77, 20);
		}
		return label;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setColumns(10);
			nameTxt.setBounds(126, 12, 189, 20);
		}
		return nameTxt;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(126, 104, 189, 20);
		}
		return passwordField;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Password");
			label_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			label_1.setBounds(26, 103, 77, 20);
		}
		return label_1;
	}
	private JButton getRegisterBtn() {
		if (registerBtn == null) {
			registerBtn = new JButton("Register");
			registerBtn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			registerBtn.setBackground(Color.LIGHT_GRAY);
			registerBtn.setBounds(226, 156, 89, 23);
			
			registerBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login login = new Login();
					login.setVisible(true);
				}
			});
		}
		return registerBtn;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Email");
			label_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			label_2.setBounds(26, 41, 77, 20);
		}
		return label_2;
	}
	private JTextField getEmailTxt() {
		if (emailTxt == null) {
			emailTxt = new JTextField();
			emailTxt.setColumns(10);
			emailTxt.setBounds(126, 42, 189, 20);
		}
		return emailTxt;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Username");
			label_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			label_3.setBounds(26, 72, 77, 20);
		}
		return label_3;
	}
	private JTextField getUsernameTxt() {
		if (usernameTxt == null) {
			usernameTxt = new JTextField();
			usernameTxt.setColumns(10);
			usernameTxt.setBounds(126, 73, 189, 20);
		}
		return usernameTxt;
	}
	private JPanel getGenderPnl() {
		if (genderPnl == null) {
			genderPnl = new JPanel();
			genderPnl.setLayout(null);
			genderPnl.setBackground(Color.CYAN);
			genderPnl.setBounds(26, 134, 176, 45);
			genderPnl.add(getGenderLbl());
			genderPnl.add(getRdbtnMale());
			genderPnl.add(getRdbtnFemale());
			
			ButtonGroup btnGrp = new ButtonGroup();
			btnGrp.add(getRdbtnFemale());
			btnGrp.add(getRdbtnMale());
		}
		return genderPnl;
	}
	private JLabel getGenderLbl() {
		if (genderLbl == null) {
			genderLbl = new JLabel("Gender");
			genderLbl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			genderLbl.setBounds(10, 11, 52, 23);
		}
		return genderLbl;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
			rdbtnMale.setBackground(Color.CYAN);
			rdbtnMale.setBounds(81, 0, 109, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			rdbtnFemale.setBackground(Color.CYAN);
			rdbtnFemale.setBounds(81, 22, 109, 23);
		}
		return rdbtnFemale;
	}
}
