package web.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import web.jdbc.conexao.ConnectionFactory;
import web.jdbc.model.Refeicao;

public class RefeicaoDAO {
	private ConnectionFactory dao = ConnectionFactory.getInstancia();
	private static RefeicaoDAO instancia;
	
	public RefeicaoDAO() {
		
	}
	
	public static RefeicaoDAO getInstancia() {
		if(instancia == null) {
			instancia = new RefeicaoDAO();
		}
		return instancia;
	}
	
	public void criarRefeicaoDAO(Refeicao novaRefeicao) throws SQLException, ClassNotFoundException {
		Connection conexao = dao.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement("INSERIR O CODIGO SQL PARA ADICIONAR REFEICAO AO BANCO");
			stmt.setInt(1, novaRefeicao.getCategoria().getIdCategoria());
			stmt.setString(2, novaRefeicao.getDescricaoRefeicao());
			stmt.executeQuery();
		} catch (Exception e) {
			Logger.getLogger(RefeicaoDAO.class.getName()).log(Level.SEVERE, null, e);
		}finally {
			ConnectionFactory.closeConnection(conexao, stmt);
		}
		
	}

}
