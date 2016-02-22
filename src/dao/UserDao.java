package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.User;

public class UserDao {
	private Connection con = null;
	
	public boolean validUser(User user) throws SQLException, ClassNotFoundException{
		con = MysqlConn.getConnection();
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from user where username ='" + user.getUsername() + 
				"' and password = '" + user.getPassword() + "'");
		if(rs.next()){
			return true;
		}else{
			return false;
		}
	}
}
