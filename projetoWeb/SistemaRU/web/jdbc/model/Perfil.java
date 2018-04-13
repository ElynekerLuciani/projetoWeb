package web.jdbc.model;

import java.sql.SQLException;

import web.jdbc.dao.PerfilDAO;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Perfil implements InterfaceManipulable{
	
	private int id;
	private String descricao;
	private float valor;
	
	public Perfil() {
		super();
	}
	
	public Perfil(String descricao, float valor) {
		this.setDescricao(descricao);
		this.setValor(valor);
	}
	
	public void setDescricao(String descricao) {
		if(descricao != null) {
			this.descricao = descricao;
		}
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setValor(float valor) {
		if(valor > 0) {
			this.valor = valor;
		}
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public int getId() {
		return this.id;
	}
	
	public float calculaValor(int quantidade) {
		return quantidade * this.valor;
	}

	@Override
	public void save() {
		if(this.descricao != null && this.valor > 0 && this.id == 0) {
			try {
				PerfilDAO.getInstancia().save(this);
			} catch (ClassNotFoundException | SQLException e) {
				Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, e);
			}
		}
	}

	@Override
	public void update() {
		if(this.descricao != null && this.valor > 0 && this.id != 0) {
			try {
				PerfilDAO.getInstancia().update(this);
			} catch (ClassNotFoundException | SQLException e) {
				Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, e);
			}
		}
	}

	@Override
	public void find(int codigo) {
		if(codigo > 0) {
			try {
				this.id = codigo;
				PerfilDAO.getInstancia().find(this);
			} catch (ClassNotFoundException | SQLException e) {
				Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, e);
			}
		}
	}

	@Override
	public void delete() {
		if(this.id != 0) {
			try {
				PerfilDAO.getInstancia().delete(this);
			} catch (ClassNotFoundException | SQLException e) {
				Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, e);
			}
		}
	}
	
}
