package cnloja.loja_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

import cnloja.loja_jsp.model.User;

public class UserDao {

	private Connection con;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public UserDao(Connection con) {
			this.con = con;
	}//fecha construtor
	
	public User userLogin(String email, String password) {
		User user = null;
		
		try {
			
			query = "select*from usuario where email=? and password =?";
			pst = this.con.prepareStatement(query);
			pst.setString(1, email);
			pst.setString(1, password);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return user;
				 
	}//fecha metodo userLogin
	

}//fecha class UserDao

