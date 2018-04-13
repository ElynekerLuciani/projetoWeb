package web.jdbc.model;

public class InformacaoNutricional implements InterfaceManipulable{
	private int id;
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
		return id;
	}

	public void setId(int id) {
		if(id >= 0) {
			this.id = id;
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

	public float getFibras() {
		return fibras;
	}

	public void setFibras(float fibras) {
		if(fibras >= 0) {
			this.fibras = fibras;
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

}
