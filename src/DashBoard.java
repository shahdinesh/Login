import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import model.Register;
import dao.DashboardDao;


public class DashBoard extends JFrame {

	private JPanel contentPane;
	private JPanel contentPnl;
	private JButton btnLogOut;
	private JLabel lblUser;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public DashBoard() throws ClassNotFoundException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getContentPnl());
		contentPane.add(getBtnLogOut());
		contentPane.add(getLblUser());
		displayUser();
	}

	private JPanel getContentPnl() {
		if (contentPnl == null) {
			contentPnl = new JPanel();
			contentPnl.setBorder(new TitledBorder(null, "Main Content", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			contentPnl.setBounds(10, 35, 414, 215);
			contentPnl.setLayout(null);
			contentPnl.add(getScrollPane());
		}
		return contentPnl;
	}
	private JButton getBtnLogOut() {
		if (btnLogOut == null) {
			btnLogOut = new JButton("Log Out");
			btnLogOut.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			btnLogOut.setBounds(335, 11, 89, 23);
			
			btnLogOut.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return btnLogOut;
	}
	public JLabel getLblUser() {
		if (lblUser == null) {
			lblUser = new JLabel("user");
			lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblUser.setBounds(186, 11, 139, 17);
		}
		return lblUser;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{1, "Dinesh", "shahdn", "shahdn@gmail.com", "Male"},
				},
				new String[] {
					"ID", "Name", "Username", "Email", "Gender"
				}
			));
		}
		return table;
	}
	private void displayUser() throws ClassNotFoundException, SQLException{
		DefaultTableModel model = new DefaultTableModel();
		model.setRowCount(0);
		DashboardDao regDao = new DashboardDao();
		List<Register> userList = regDao.allUser();
		
		for(Register regs : userList){
			model.addRow(new Object[]{regs.getId(),regs.getName(),regs.getUsername(),regs.getEmail(),regs.getGender()});
		}
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 394, 114);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
}
