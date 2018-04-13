package web.jdbc.model;

import java.util.List;

public abstract class Manipulable{
	private int id;
	
	public abstract void save();
	public abstract void delete();
	public abstract void update();
		
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
