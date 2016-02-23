package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Register;

public class DashboardDao {
	private Connection conn = null;
	public void displayUser() throws ClassNotFoundException, SQLException{
		conn = MysqlConn.getConnection();
	}
	public List<Register> allUser() throws SQLException{
		List<Register> user = new ArrayList<Register>();
		try(Statement stm = conn.createStatement()){
			ResultSet rs = stm.executeQuery("select * from user");
			while(rs.next()){
				Register res = copyUser(rs);
				user.add(res);
				System.out.println(res);
			} 
		}catch(Exception e){
			System.out.println(e);
		}
		return user;
	}
	
	private Register copyUser(ResultSet rs) throws SQLException{
		Register regs = new Register();
		regs.setEmail(rs.getString("email"));
		regs.setName(rs.getString("name"));
		regs.setUsername(rs.getString("username"));
		regs.setGender(rs.getString("gender"));
		regs.setId(rs.getInt("id"));
		return regs;
	}
}
