package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Register;

public class RegisterDao {
	private Connection con = null;
	public RegisterDao() throws ClassNotFoundException, SQLException{
		con = MysqlConn.getConnection();
	}
	public void saveUser(Register reg) throws SQLException{
		PreparedStatement stm = con.prepareStatement("insert into user(id,name,username,password,gender,email) values(?,?,?,?,?,?)");
		stm.setInt(1, reg.getId());
		stm.setString(2, reg.getName());
		stm.setString(3, reg.getUsername());
		stm.setString(4, reg.getPassword());
		stm.setString(5, reg.getGender());
		stm.setString(6, reg.getEmail());
		stm.executeUpdate();
	}
}
