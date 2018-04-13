package web.jdbc.model;

import java.util.Date;
import java.util.List;

public class Dia implements InterfaceManipulable{
	private int id;
	private Date data;
	private List<Turno> turnos;
	
	public int getId() {
		return this.id;
	}
	
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
	
	public void addTurno(Turno t) {
		if(t != null) {
			turnos.add(t);
		}
	}
	
	public Turno getTurno(int id) {
		for(Turno t : turnos) {
			if(t.getId() == id) {
				return t;
			}
		}
		return null;
	}
	
	public Date getData() {
		return this.data;
	}
	
	public void setData(Date data) {
		if(data != null) {
			this.data = data;
		}
	}
	
	
}
