package web.jdbc.model;

public abstract class Manipulable {
	private int id;
	
	public abstract void save();
	public abstract void delete();
	public abstract void update();
	
	public int getId() {
		return this.id;
	}
}
