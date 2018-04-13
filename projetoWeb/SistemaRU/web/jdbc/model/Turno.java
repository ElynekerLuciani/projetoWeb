package web.jdbc.model;

import java.util.List;

public class Turno implements InterfaceManipulable{
	private int id;
	private  TurnoSemana turno;
	private List<Alimento> alimentos;

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
	
	public void addAlimento(Alimento a) {
		if(a != null) {
			alimentos.add(a);
		}
	}
	
	public Alimento getAlimento(int id) {
		for(Alimento ali : alimentos) {
			if(ali.getId() == id) {
				return ali;
			}
		}
		return null;
	}
	
	public void setTurno(TurnoSemana turno) {
		if(turno != null) {
			this.turno = turno;
		}
	}
	
	public TurnoSemana getTurnoSemana() {
		return turno;
	}
	
	public void setId(int id) {
		if(id >= 0) {
			this.id = id;
		}
	}
	
	public int getId() {
		return id;
	}
}
