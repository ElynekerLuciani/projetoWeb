package web.jdbc.model;

public class Validacao {

	private String login;
	private String senha;
	
	public Validacao() {
		super();
	}
	
	public Validacao(String login, String senha) {
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	public void setLogin(String login) {
		if(login != null) {
			this.login = login;
		}
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public void setSenha(String senha) {
		if(senha != null) {
			this.senha = senha;
		}
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public boolean validarAcesso() {
		return true;
	}
}
