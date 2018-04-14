package web.jdbc.model;

public class Alimento implements InterfaceManipulable{
	private int id;
	private String nome;
	private CategoriaAlimento categoria;
	private float calorias;
	private float carboidratos;
	private float fibras;
	
	
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

	public CategoriaAlimento getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaAlimento categoria) {
		if(categoria != null) {
			this.categoria = categoria;
		}
	}

	public float getCalorias() {
		return calorias;
	}

	public void setCalorias(float calorias) {
		if(calorias >= 0) {
			this.calorias = calorias;
		}
	}

	public float getCarboidratos() {
		return carboidratos;
	}

	public void setCarboidratos(float carboidratos) {
		if(carboidratos >= 0) {
			this.carboidratos = carboidratos;
		}
	}

	public float getFibras() {
		return fibras;
	}

	public void setFibras(float fibras) {
		if(fibras >= 0) {
			this.fibras = fibras;
		}
	}
}