package domain;

import java.util.ArrayList;
import java.util.Collections;

public class Index  implements ICRUD, IFind{
	private static Index INSTANCE = null ;
	//TODO Fix this make it with ISearchable
	private ArrayList<Restaurant> restaurants ; 
	
	private Index(){
		this.restaurants = new ArrayList<>(); 
	}
	
	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}

	public static Index getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Index();
		}
		return INSTANCE ; 
	}

	@Override
	public void addToList(IAddable restaurant) {
		restaurants.add( (Restaurant) restaurant);
	}

	@Override
	public void deleteFromList(int id) {
		int indexToDelete = 0;  
		for (Restaurant rest : restaurants){
			if( rest.getId() == id ){
				indexToDelete =  restaurants.indexOf(rest); 
			} 
		}
		restaurants.remove(indexToDelete); 
	}
	

	public void displayAll(){
		for (ISearchable restaurant : restaurants) {
			System.out.println( ((Restaurant) restaurant).getId() + " " + ((Restaurant) restaurant).getName() + "  " + 
					((Restaurant) restaurant).getType());
		}
	}
	
	//TODO add exceptions
	public ISearchable findById(int id){
		ISearchable found = new Restaurant();
		for (ISearchable rest : restaurants){
			if(((Restaurant) rest).getId() == id ){
				found = rest ; 
			} 
		}
		return found;
	}
	
	public ISearchable findByName(String name){
		Restaurant found = new Restaurant(); 
		for (ISearchable restaurant : restaurants){
			if(((Restaurant) restaurant).getName().equalsIgnoreCase(name)){
				found = (Restaurant) restaurant ; 
			}
		}
		return found;
	}

	
	public ArrayList<ISearchable> findByType(Type type){
		ArrayList<ISearchable> found = new ArrayList<>(); 
		
		for (ISearchable rest : restaurants) {
			if(((Restaurant) rest).getType() == type) {
				found.add(rest); 
			}
		}
		return found; 
	}
	
	public ArrayList<Restaurant> sortByRating(){
		ArrayList<Restaurant> toBeSorted = this.restaurants; 
		Collections.sort(toBeSorted);
		
		return toBeSorted ; 
	}
}
