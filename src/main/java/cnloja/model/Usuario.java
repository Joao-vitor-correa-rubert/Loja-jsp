package cnloja.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String password;
	
	private Usuario(){
		
	}
	public Usuario(int id, String nome, String email, String password) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}
	
	
	

}
