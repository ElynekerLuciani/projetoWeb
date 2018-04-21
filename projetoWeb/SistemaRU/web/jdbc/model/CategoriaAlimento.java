package web.jdbc.model;

import java.sql.SQLException;

import web.jdbc.dao.CategoriaAlimentoDAO;

public class CategoriaAlimento implements InterfaceManipulable{
	private int id;
	private String nome;
	
	@Override
	public void save() {
		if(id == 0 && nome != null) {
			try {
				CategoriaAlimentoDAO.getInstancia().save(this);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update() {
		if(id != 0 && nome != null) {
			try {
				CategoriaAlimentoDAO.getInstancia().update(this);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void find(int codigo) {
		if(codigo > 0) {
			this.id = codigo;
			try {
				CategoriaAlimentoDAO.getInstancia().find(this);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void delete() {
		if(this.id != 0) {
			try {
				CategoriaAlimentoDAO.getInstancia().delete(this);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id >= 0) {
			this.id = id;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null) {
			this.nome = nome;
		}
	}

}
