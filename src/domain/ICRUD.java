package domain;

public interface ICRUD {
	
	public void displayAll(); 
	
	public void addToList(IAddable obj );
	
	//TODO add and ceck what does not compile
	//public void retrieve(int id); 
	
	public void deleteFromList(int id);
	
}
