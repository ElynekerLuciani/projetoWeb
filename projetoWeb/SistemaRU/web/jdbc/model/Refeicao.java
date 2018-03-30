package web.jdbc.model;

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
			novaRefeicao.setCategoria(refeicao.getCategoria());
			novaRefeicao.setDescricaoRefeicao(refeicao.getDescricaoRefeicao());
			refeicaoDAO.criarRefeicaoDAO(novaRefeicao);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
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
