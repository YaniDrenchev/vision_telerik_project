package domain;

public interface ICRUD {
	
	public void displayAll(); 
	
	public void addToList(IAddable obj );
	
	public void deleteFromList(int id);
	
}
