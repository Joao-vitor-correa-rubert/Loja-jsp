package cnloja.loja_jsp.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
	
private static Connection connection= null;
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Loja_jsp","root","12345678");
			
			System.out.print("Conexão com sucesso");
		}
		return connection;
	}

}

