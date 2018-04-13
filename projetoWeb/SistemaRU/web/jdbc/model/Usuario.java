package web.jdbc.model;

public class Usuario implements InterfaceManipulable{
	
	private int id;
	private int matricula;
	private String nome;
	private Perfil perfil;
	//historico
	// carteira
	private Validacao acesso;
	

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

}
