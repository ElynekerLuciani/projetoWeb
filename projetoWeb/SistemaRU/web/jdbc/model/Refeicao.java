package web.jdbc.model;

import java.sql.SQLException;
import java.util.ArrayList;

import web.jdbc.dao.RefeicaoDAO;

public class Refeicao {
	private int idRefeicao;
	private CategoriaRefeicao categoria = new CategoriaRefeicao();
	private String descricaoRefeicao;
	private RefeicaoDAO refeicaoDAO = RefeicaoDAO.getInstancia();
	
	public Refeicao() {
		
	}
	
	public void criarRefeicao(Refeicao refeicao) {
		Refeicao novaRefeicao = new Refeicao();
		try {
			novaRefeicao.categoria.setIdCategoria(refeicao.categoria.getIdCategoria());
			novaRefeicao.setDescricaoRefeicao(refeicao.getDescricaoRefeicao());
			refeicaoDAO.criarRefeicaoDAO(novaRefeicao);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public void excluirRefeicao(int idRefeicao) {
		try {
			refeicaoDAO.excluirRefeicaoDAO(idRefeicao);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void alterarRefeicao(Refeicao refeicao) {
		Refeicao alterarRefeicao = new Refeicao();
	
		try {
			alterarRefeicao.setIdRefeicao(refeicao.getIdRefeicao());
			alterarRefeicao.categoria.setIdCategoria(refeicao.getCategoria().getIdCategoria());
			alterarRefeicao.setDescricaoRefeicao(refeicao.getDescricaoRefeicao());
			refeicaoDAO.alterarRefeicaoDAO(alterarRefeicao);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ArrayList<Refeicao> listarRefeicao() throws ClassNotFoundException, SQLException {
		ArrayList<Refeicao> listar = refeicaoDAO.listarRefeicao();
		return listar;
	}
	
	//METODOS GETTERS E SETTERS
	public int getIdRefeicao() {
		return idRefeicao;
	}

	public void setIdRefeicao(int idRefeicao) {
		this.idRefeicao = idRefeicao;
	}

	public CategoriaRefeicao getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaRefeicao categoria) {
		this.categoria = categoria;
	}

	public String getDescricaoRefeicao() {
		return descricaoRefeicao;
	}

	public void setDescricaoRefeicao(String descricaoRefeicao) {
		this.descricaoRefeicao = descricaoRefeicao;
	}
	
}
