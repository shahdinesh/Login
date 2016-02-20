import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Font;


public class NewWindow extends JFrame {

	private JPanel contentPane;
	private JPanel contentPnl;
	private JButton btnLogOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWindow frame = new NewWindow();
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
	public NewWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getContentPnl());
		contentPane.add(getBtnLogOut());
	}

	private JPanel getContentPnl() {
		if (contentPnl == null) {
			contentPnl = new JPanel();
			contentPnl.setBorder(new TitledBorder(null, "Main Content", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			contentPnl.setBounds(10, 35, 414, 215);
		}
		return contentPnl;
	}
	private JButton getBtnLogOut() {
		if (btnLogOut == null) {
			btnLogOut = new JButton("Log Out");
			btnLogOut.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			btnLogOut.setBounds(335, 11, 89, 23);
		}
		return btnLogOut;
	}
}
