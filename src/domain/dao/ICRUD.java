package domain.dao;

public interface ICRUD {
	
	public void displayAll(); 
	
	public void addToList(IAddable obj );
	
	//public void retrieve(int id); 
	
	public void deleteFromList(int id);
	
}
