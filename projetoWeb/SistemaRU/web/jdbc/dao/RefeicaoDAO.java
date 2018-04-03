package web.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
            stmt = conexao.prepareStatement("INSERT INTO REFEICAO(IDCATEGORIAREFEICAO,DESCRICAO) VALUES(?,?)");
            stmt.setInt(1, novaRefeicao.getCategoria().getIdCategoria());
            //stmt.setInt(1, novaRefeicao.getCategoria().getIdCategoria());
            stmt.setString(2, novaRefeicao.getDescricaoRefeicao());
            stmt.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(RefeicaoDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            ConnectionFactory.closeConnection(conexao, stmt);
        }

    }

    public void excluirRefeicaoDAO(int idRefeicao) throws SQLException, ClassNotFoundException {
        Connection conexao = dao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement("DELETE FROM REFEICAO WHERE IDREFEICAO = '"+idRefeicao +"'");
            stmt.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(RefeicaoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectionFactory.closeConnection(conexao,stmt);
        }

    }

    public void alterarRefeicaoDAO(Refeicao alterarRefeicao) throws SQLException, ClassNotFoundException {
        Connection conexao = dao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("UPDATE REFEICAO SET IDCATEGORIAREFEICAO = ' "+ alterarRefeicao.getCategoria().getIdCategoria() +
                                                                                "', DESCRICAO = '"+ alterarRefeicao.getDescricaoRefeicao() + 
                                                                                "' WHERE IDREFEICAO = ' "+ alterarRefeicao.getIdRefeicao()+ " '");
            stmt.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(RefeicaoDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            ConnectionFactory.closeConnection(conexao,stmt);
        }
    }

    public ArrayList<Refeicao> listarRefeicao() throws SQLException, ClassNotFoundException {
        ArrayList<Refeicao> refeicao = new ArrayList<Refeicao>();
        Connection conexao = dao.getConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        Refeicao ref = new Refeicao();
        try {
            stmt = conexao.prepareStatement("SELECT * FROM REFEICAO");
            result = stmt.executeQuery();
            while(result.next()) {
                ref.setIdRefeicao(result.getInt("IDREFEICAO"));
                ref.getCategoria().setIdCategoria(result.getInt("IDCATEGORIAREFEICAO"));
                ref.setDescricaoRefeicao(result.getString("DESCRICAO"));
                refeicao.add(ref);	
            }
        } catch (Exception e) {
            Logger.getLogger(RefeicaoDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            ConnectionFactory.closeConnection(conexao, stmt, result);
        }
        return refeicao;
    }

}
