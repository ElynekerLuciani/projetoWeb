package web.jdbc.model;

public interface InterfaceManipulable {
	
	abstract void save();
	abstract void update();
	abstract void find(int codigo);
	abstract void delete();
	
}
