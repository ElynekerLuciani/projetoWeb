package web.jdbc.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import web.jdbc.conexao.ConnectionFactory;
import web.jdbc.model.CategoriaRefeicao;

public class CategoriaRefeicaoDAO {
	private ConnectionFactory dao = ConnectionFactory.getInstancia();
	private static CategoriaRefeicaoDAO instancia;
	
	public CategoriaRefeicaoDAO() {
		
	}
	
	public static CategoriaRefeicaoDAO getInstancia() {
		if(instancia == null) {
			instancia = new CategoriaRefeicaoDAO();
		}
		return instancia;
	}
	
	public void addCategoriaDAO(CategoriaRefeicao novaCategoria) throws SQLException, ClassNotFoundException {
		Connection conexao = dao.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement("INSERT INTO CATEGORIAREFEICAO(NOMECATEGORIA) VALUES(?)");
			stmt.setString(1, novaCategoria.getNomeCategoria());
			stmt.executeUpdate();
		} catch (Exception e) {
			Logger.getLogger(CategoriaRefeicaoDAO.class.getName()).log(Level.SEVERE, null, e);
			//System.out.println(e.getMessage());
		}finally {
			ConnectionFactory.closeConnection(conexao, stmt);
		}
	}
	
	public void removerCatedogiaDAO(int removerCategoria) throws SQLException, ClassNotFoundException {
		Connection conexao = dao.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement("DELETE FROM CATEGORIAREFEICAO WHERE IDCATEGORIA = '"+ removerCategoria +"'");
			stmt.executeUpdate();
		} catch (Exception e) {
			Logger.getLogger(CategoriaRefeicao.class.getName()).log(Level.SEVERE, null, e);
			System.out.println("erro em " + e.getMessage());
		}finally{
			ConnectionFactory.closeConnection(conexao, stmt);
		}
		
	}
	
	public Vector<CategoriaRefeicao> listarCategoria() {
		Vector<CategoriaRefeicao> categorias = new Vector<CategoriaRefeicao>();
		Connection conexao = dao.getConnection();
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			stmt = conexao.prepareStatement("SELECT * FROM CATEGORIAREFEICAO");
			result = stmt.executeQuery();
			while(result.next()) {
				CategoriaRefeicao categoria = new CategoriaRefeicao();
				categoria.setIdCategoria(result.getInt("IDCATEGORIA"));
				categoria.setNomeCategoria(result.getString("NOMECATEGORIA"));
				categorias.add(categoria);
				
			}
		} catch (Exception e) {
			Logger.getLogger(CategoriaRefeicaoDAO.class.getName()).log(Level.SEVERE, null, e);
		}finally {
			ConnectionFactory.closeConnection(conexao, stmt, result);
		}
		return categorias;
	}
	

}
