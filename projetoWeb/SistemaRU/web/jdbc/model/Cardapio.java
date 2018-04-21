package web.jdbc.model;

import java.util.Date;
import java.util.List;

public class Cardapio implements InterfaceManipulable{
	private int id;
	private int idNutricionista;
	private Date dataInicio;
	private Date dataFim;
	private List<Dia> dias;
	
	
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

	public void addDia(Dia dia) {
		if(dia != null) {
			dias.add(dia);
		}
	}
	
	public Dia getDia(int id) {
		for(Dia d : dias) {
			if(d.getId() == id) {
				return d;
			}
		}
		return null;
	}
	
	public int getId() {
		return id;
	}

	public int getIdNutricionista() {
		return idNutricionista;
	}

	public void setIdNutricionista(int idNutricionista) {
		if(idNutricionista >= 0) {
			this.idNutricionista = idNutricionista;
		}
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		if(dataInicio != null) {
			this.dataInicio = dataInicio;
		}
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		if(dataFim != null) {
			this.dataFim = dataFim;
		}
	}	

}
