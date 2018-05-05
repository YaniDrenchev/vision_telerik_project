package domain;

import java.util.ArrayList;

import domain.food.Food;
import domain.food.Item;

public class Main {

	public static void main(String[] args) {
		Manager mngr = new Manager("Mitko", "Dermendjiev");
		Index index = Index.getInstance(); 
		
		//add Restaurants
		Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София",  "Пица за душата от Италия", 5.6); 
		Restaurant rest2 = new Restaurant("Дон Вито–2", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "ул. Христо Ботев 43, София",   "Пица за душата от Италия", 6.6); 
		Restaurant rest3 = new Restaurant("Casa Mia", Type.PIZZA, "http://casamia.com/bg/", "08834344934","бл 153, Младост 3, София",  "Твоята пицария в Младост ", 5.7 ); 
		Restaurant rest4 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул Дондуков 42, София",  "Студена бира в гореща вечер", 8.6);
		index.addToList(rest1);	
		index.addToList(rest2);
		index.addToList(rest3);
		index.addToList(rest4);
		index.displayAll();
		
		//search
		//find by name: 
		System.out.println("---- Find by name: Casa Mia ---- ");
		ISearchable casaMia = index.findByName("Casa Mia"); 
		System.out.println(((Restaurant) casaMia).getId() + " " + ((Restaurant) casaMia).getName() );
				
		//find by Id:
		System.out.println("---- Find by id: 101 ---- ");
		Restaurant idRest = (Restaurant) index.findById(101); 
		System.out.println(idRest.getId() + " " + idRest.getName() );
		
		//find by Type
		System.out.println("---- Find by type: Pizza ---- ");
		ArrayList<ISearchable> pizzaPlaces = index.findByType(Type.valueOf("PIZZA"));
		for (ISearchable rest : pizzaPlaces) {
			System.out.println(((Restaurant) rest).getId() + " " + ((Restaurant) rest).getName() );
		}
		
		//sort by Id
		System.out.println("---- Sort by rating:  ---- ");
		ArrayList<Restaurant> sortedByRating = index.sortByRating(); 
		for (Restaurant rest : sortedByRating) {
			System.out.println( rest.getRating() + " " +  rest.getName() );
		}
		
		//delete by id :
		index.deleteFromList(101);
		System.out.println("----After deletion of 101:  ---- ");
		index.displayAll(); 
		
		// add food to Menu
		Item bread = new Food("Bread", 4.50);
		Item wine = new Food("Wine", 12.40);
		Menu menu = new Menu();
		menu.addToList(bread);
		menu.addToList(wine);
		rest1.setMenu(menu);
		Menu menuRest1 = rest1.getMenu(); 
		System.out.println("----Show the menu of : " + rest1.getName() +  " ---- ");
		menuRest1.displayAll();
		
		//delete by id from menu 
		menuRest1.deleteFromList(2);
		System.out.println("--------- After deleting 2 from menu  -----------");
		menuRest1.displayAll();
		
		//order test
		//Order order1 = new Order(id, restaurant, manager); 
		Order order = new Order(12, new Restaurant("При Бачо", Type.PIZZA, "www.bacho.bg", "089943435", "Люлин 10", "Домашни гозби", 7), new Manager("DImo", "Padalski")) ;
		Order order1 = rest1.createOrder(); 
		Order order2 = rest1.createOrder(); 
		Order order3 = rest1.createOrder(); 
		System.out.println("------ Name from Order ------");
		System.out.println(order1.getRestaurant().getName());
		
		//save to archive 
		rest1.getOrderManager().saveToArchive(order);
		Order ordR = rest1.getOrderManager().findByIdFromArchive(12); 
		System.out.println("------- Show retrieved order from archive ------");
		System.out.println(ordR.getRestaurant().getName());
	}
}
