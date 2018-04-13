package web.jdbc.model;

public class CategoriaAlimento implements InterfaceManipulable{
	private int id;
	private CategoriaAlimentoEnum nome;
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id >= 0) {
			this.id = id;
		}
	}

	public CategoriaAlimentoEnum getNome() {
		return nome;
	}

	public void setNome(CategoriaAlimentoEnum nome) {
		if(nome != null) {
			this.nome = nome;
		}
	}

}
