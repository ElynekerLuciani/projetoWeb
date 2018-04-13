package web.jdbc.model;

public class Alimento implements InterfaceManipulable{
	private int id;
	private String nome;
	private InformacaoNutricional infNutricional;
	private CategoriaAlimento categoria;
	
	
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
		return this.id;
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

	public InformacaoNutricional getInfNutricional() {
		return infNutricional;
	}

	public void setInfNutricional(InformacaoNutricional infNutricional) {
		if(infNutricional != null) {
			this.infNutricional = infNutricional;
		}
	}

	public CategoriaAlimento getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaAlimento categoria) {
		if(categoria != null) {
			this.categoria = categoria;
		}
	}
}
