package web.jdbc.model;

public abstract class Manipulable{
	private int id;
	
	public abstract void save();
	public abstract void delete();
	public abstract void update();
	public abstract void find(int id);
		
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
