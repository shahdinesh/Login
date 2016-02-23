package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Register;

public class RegisterDao1 {
	private Connection conn = null;
	
	
	/*private List<Register> getData() throws SQLException{
		List<Register> reg = new ArrayList<Register>();
		try(Statement stm = conn.createStatement()){
			ResultSet rs = stm.executeQuery("select * from user");
			while(rs.next()){
				Register regs = copyResult(rs);
				reg.add(regs);
				
				System.out.println(regs);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return reg;
	}
	
	private Register copyResult(ResultSet rs) throws SQLException{
		Register reg = new Register();
		reg.setId(rs.getInt("id"));
		reg.setEmail(rs.getString("email"));
		reg.setGender(rs.getString("gender"));
		reg.setName(rs.getString("name"));
		reg.setUsername(rs.getString("username"));
		reg.setPassword(rs.getString("password"));
		
		return reg;
	}*/
}
