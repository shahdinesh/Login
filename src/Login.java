import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;


public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel topPnl;
	private JPanel leftPnl;
	private JPanel buttomPnl;
	private JPanel rightPnl;
	private JPanel centerPnl;
	private JLabel lblUsername;
	private JTextField usernameTxtLogin;
	private JLabel lblPassword;
	private JPasswordField passwordFieldLogin;
	private JLayeredPane layeredPane;
	private JPanel loginPnl;
	private JButton btnLogin;
	private JButton btnSignup;
	private JCheckBox chckbxRememberMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\backup\\destop\\mjd\\CROPPED-DSC_0977.JPG"));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTopPnl(), BorderLayout.NORTH);
		contentPane.add(getLeftPnl(), BorderLayout.WEST);
		contentPane.add(getButtomPnl(), BorderLayout.SOUTH);
		contentPane.add(getRightPnl(), BorderLayout.EAST);
		contentPane.add(getCenterPnl(), BorderLayout.CENTER);
	}

	private JPanel getTopPnl() {
		if (topPnl == null) {
			topPnl = new JPanel();
			topPnl.setBackground(Color.DARK_GRAY);
			topPnl.setForeground(Color.DARK_GRAY);
		}
		return topPnl;
	}
	private JPanel getLeftPnl() {
		if (leftPnl == null) {
			leftPnl = new JPanel();
			leftPnl.setForeground(Color.DARK_GRAY);
			leftPnl.setBackground(Color.DARK_GRAY);
		}
		return leftPnl;
	}
	private JPanel getButtomPnl() {
		if (buttomPnl == null) {
			buttomPnl = new JPanel();
			buttomPnl.setBackground(Color.DARK_GRAY);
			buttomPnl.setForeground(Color.DARK_GRAY);
		}
		return buttomPnl;
	}
	private JPanel getRightPnl() {
		if (rightPnl == null) {
			rightPnl = new JPanel();
			rightPnl.setForeground(new Color(0, 0, 0));
			rightPnl.setBackground(Color.DARK_GRAY);
		}
		return rightPnl;
	}
	private JPanel getCenterPnl() {
		if (centerPnl == null) {
			centerPnl = new JPanel();
			centerPnl.setLayout(null);
			centerPnl.add(getLayeredPane_1());
			centerPnl.add(getLoginPnl());
		}
		return centerPnl;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setBounds(25, 10, 77, 20);
			lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		}
		return lblUsername;
	}
	private JTextField getUsernameTxtLogin() {
		if (usernameTxtLogin == null) {
			usernameTxtLogin = new JTextField();
			usernameTxtLogin.setBounds(125, 11, 190, 20);
			usernameTxtLogin.setColumns(10);
		}
		return usernameTxtLogin;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(25, 41, 77, 20);
			lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		}
		return lblPassword;
	}
	private JPasswordField getPasswordFieldLogin() {
		if (passwordFieldLogin == null) {
			passwordFieldLogin = new JPasswordField();
			passwordFieldLogin.setBounds(125, 42, 190, 20);
		}
		return passwordFieldLogin;
	}
	private JLayeredPane getLayeredPane_1() {
		if (layeredPane == null) {
			layeredPane = new JLayeredPane();
			layeredPane.setBounds(69, 162, 1, 1);
		}
		return layeredPane;
	}
	private JPanel getLoginPnl() {
		if (loginPnl == null) {
			loginPnl = new JPanel();
			loginPnl.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Login Panel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(139, 0, 0)));
			loginPnl.setBackground(Color.CYAN);
			loginPnl.setBounds(10, 11, 350, 115);
			loginPnl.setLayout(null);
			loginPnl.add(getUsernameTxtLogin());
			loginPnl.add(getLblUsername());
			loginPnl.add(getPasswordFieldLogin());
			loginPnl.add(getLblPassword());
			loginPnl.add(getBtnLogin());
			loginPnl.add(getBtnSignup());
			loginPnl.add(getChckbxRememberMe());
		}
		return loginPnl;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Sign In");
			btnLogin.setBackground(Color.LIGHT_GRAY);
			btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			btnLogin.setBounds(135, 82, 89, 23);
			
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					switchScreenToData();
				}
			});
		}
		return btnLogin;
	}
	public void switchScreenToData(){

		passwordFieldLogin.setText("");
		
		DashBoard board = new DashBoard();
		board.getLblUser().setText(usernameTxtLogin.getText().toUpperCase());
		board.setVisible(true);
		WindowsManager.ui.put("DashBoard", board);
		
		Login frame = (Login) WindowsManager.ui.get("Login");
		frame.setVisible(false);
	}
	private JButton getBtnSignup() {
		if (btnSignup == null) {
			btnSignup = new JButton("Sign Up");
			btnSignup.setBackground(Color.LIGHT_GRAY);
			btnSignup.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			btnSignup.setBounds(240, 82, 89, 23);
			
			btnSignup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Register reg = new Register();
					reg.setVisible(true);
					
				}
			});
		}
		return btnSignup;
	}
	private JCheckBox getChckbxRememberMe() {
		if (chckbxRememberMe == null) {
			chckbxRememberMe = new JCheckBox("Remember Me");
			chckbxRememberMe.setFont(new Font("Tahoma", Font.PLAIN, 12));
			chckbxRememberMe.setBackground(Color.CYAN);
			chckbxRememberMe.setBounds(20, 68, 109, 23);
		}
		return chckbxRememberMe;
	}
}
