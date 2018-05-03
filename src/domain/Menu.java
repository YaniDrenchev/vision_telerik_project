package domain;

import java.util.ArrayList;

import domain.dao.IAddable;
import domain.dao.ICRUD;
import domain.food.Item;

public class Menu implements ICRUD {
	private ArrayList<Item> menu;
	private String currency; 
	
	public Menu() {
		this.menu = new ArrayList<>();
		this.currency = "lv";
	}

	@Override
	public void displayAll() {
		for (Item item : menu) {
			System.out.println( item.getId()  + "  " +  item.getName() + " " + item.getPrice() + " " + currency ) ;
		}
	}

	@Override
	public void addToList(IAddable item) {
		menu.add((Item) item); 
	}

	@Override
	public void deleteFromList(int id) {
		int indexToDelete = 0;  
		for (Item item : menu){
			if( item.getId() == id ){
				System.out.println(item.getName());
				indexToDelete =  menu.indexOf(item); 
			} 
		}
		menu.remove(indexToDelete);
	}
}
