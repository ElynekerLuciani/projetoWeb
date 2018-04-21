package web.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import web.jdbc.conexao.ConnectionFactory;
import web.jdbc.model.Alimento;
import web.jdbc.model.CategoriaAlimento;
import web.jdbc.model.Turno;

public class TurnoDAO {
	private ConnectionFactory dao = ConnectionFactory.getInstancia();
    private static TurnoDAO instancia;
    
    public static TurnoDAO getInstancia() {
    	if(instancia == null) {
    		instancia = new TurnoDAO();
    	}
    	
    	return instancia;
    }
    
    public void save(Turno turno) throws SQLException, ClassNotFoundException{
    	Connection conexao = dao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement("");
            stmt.setString(1, turno.getTurnoSemana().name());
            
            if(turno.getAlimento() != null) {
            	for(Alimento a : turno.getAlimento()) {
            		a.save();
            	}
            }
            
            stmt.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void update(CategoriaAlimento catAlime) throws SQLException, ClassNotFoundException{
    	Connection conexao = dao.getConnection();
        PreparedStatement stmt = null;
        try { 
            stmt = conexao.prepareStatement("");
            stmt.setString(1, catAlime.getNome().toString());
         
            stmt.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void delete(CategoriaAlimento catAlime) throws SQLException, ClassNotFoundException{
    	Connection conexao = dao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement("");
            stmt.setInt(1, catAlime.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void find(CategoriaAlimento catAlime) throws SQLException, ClassNotFoundException{
    	Connection conexao = dao.getConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            stmt = conexao.prepareStatement("");
            stmt.setInt(1, catAlime.getId());
            stmt.executeQuery();
            
            while(result.next()) {
            	catAlime.setId(result.getInt(""));
                catAlime.setNome(result.getString(""));
                
            } 
        } catch (Exception e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }

	
}
