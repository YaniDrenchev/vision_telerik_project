package domain;

import java.util.ArrayList;
import java.util.regex.Pattern;

import domain.food.Food;
import domain.food.Item;

public class Menu implements ICRUD {
	private ArrayList<IAddable> menu;
	private String currency; 
	
	public Menu() {
		this.menu = new ArrayList<>();
		this.currency = "lv";
	}
	
	public void displayAllToCustomers() {
		int i = 0;
		for (IAddable itemN : menu) {
	 		Item item = (Item) itemN ;
	 		 i++; 
		System.out.println(  i + ". " + item.getName() + ", " +  item.getDescription() + ", " + item.getPrice() + " " + currency +  " , " + item.getContent() + " ml");
		}
	}
	
	public void displayItemAndPrice(){
		int i = 0;
		for (IAddable itemN : menu) {
	 		Item item = (Item) itemN ;
	 		 i++; 
		System.out.println(  i + ". " + item.getName() + ", " +  ", " + item.getPrice() + " " + currency +  " , " + item.getContent() + " ml");
		}
	}
	
	
	//TODO check if drink
	@Override
	public void displayAll() {
		int i = 1;
		for (IAddable itemN : menu) {
	 		Item item = (Item) itemN ;
	 		 i++; 
			System.out.println(  item.getId() + ". " + item.getName() + ", " +  item.getDescription() + ", " + item.getPrice() + " " + currency +  " , " + item.getContent() + " ml");
		}
	}

	@Override
	public void addToList(IAddable obj) {
		menu.add(obj); 
	}

	@Override
	public void deleteFromList(int id) {
		int indexToDelete = 0;
		for (IAddable itemN : menu){
			Item item = (Item) itemN;  
			if( item.getId() == id ){
				indexToDelete =  menu.indexOf(item);
			} 
		}
		menu.remove(indexToDelete);  
	}

	public ArrayList<IAddable> getMenu() {
		return menu;
	}

	public ArrayList<Item> findByWord(String name) {
		ArrayList<Item> found = new ArrayList<>(); 
		for (IAddable itemN : menu){
			Item item = (Item) itemN; 
			if(Pattern.compile(Pattern.quote(name), Pattern.CASE_INSENSITIVE).matcher(item.getName()).find())	
				found.add(item);  
			}
		return found;
	}

	public IAddable findById(int id) {
		for (IAddable itemN : menu){
			Item item = (Item) itemN;
			if(item.getId() == id ){
				return item; 
			}
		}
		return null; 
	}
	
	public IAddable findByName(String name) {
        for (IAddable itemN : menu){
            Item item = (Item) itemN;
            if(item.getName().equals(name) ){
                return item;
            }
        }
        return null;
    }
	
	public ArrayList<Food> findVegetarianOnly() {
		ArrayList<Food> vegsOnly = new ArrayList<>(); 
		for (IAddable itemN : menu) {
			if(itemN instanceof Food ){
				Food item = (Food) itemN;
				if(item.getVegetarianism()){
					vegsOnly.add(item); 
				}
			}else {
				continue ; 
			}
		}
		return vegsOnly;
	}
}
