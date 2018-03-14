package web.jdbc.dao;

import web.jdbc.conexao.ConnectionFactory;

public class AlunoDAO {
	private ConnectionFactory dao = ConnectionFactory.getInstancia();
	
	private static AlunoDAO instancia;
	
	protected AlunoDAO() {
		
	}
	
	public static AlunoDAO getInstancia() {
		if(instancia == null) {
			instancia = new AlunoDAO();
		}
		return instancia;
	}
	
	
	

}
