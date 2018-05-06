package domain;

import java.util.ArrayList;

import com.compan.Customer;
import com.compan.Gender;

import domain.foodIvelin.Drink;
import domain.foodIvelin.Food;
import domain.foodIvelin.Item;

public class Main {

	public static void main(String[] args) {
		
		Manager mngr = new Manager("Mitko", "Dermendjiev");
		Index index = Index.getInstance(); 
		
		//add Restaurants
		Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София",  "Пица за душата от Италия"); 
		Restaurant rest2 = new Restaurant("Дон Вито–2", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "ул. Христо Ботев 43, София",   "Пица за душата от Италия"); 
		Restaurant rest3 = new Restaurant("Casa Mia", Type.PIZZA, "http://casamia.com/bg/", "08834344934","бл 153, Младост 3, София",  "Твоята пицария в Младост " ); 
		Restaurant rest4 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул Дондуков 42, София",  "Студена бира в гореща вечер");
		Restaurant rest5 = new Restaurant("Test", Type.CHINESE, "tets.bg", "3434523", "Luli 10", "Test hrana za vkushti"); 
		Restaurant rest10 = new Restaurant("Casa de Lava", Type.PIZZA, "http://pizzadonvito.com/", "0889934934", "бул. Васил Левски, 34, София","Пица за душата от Италия", 4.5); 
		index.addToList(rest1);	
		index.addToList(rest2);
		index.addToList(rest3);
		index.addToList(rest4);
		index.addToList(rest5);
		index.addToList(rest10);
		index.displayAll();
		System.out.println("Casa de Lava: " + rest10.getRating());
		//
		//Test Customers 
		Customer cust1 = new Customer("Iani", Gender.MALE, "iani_1"); 
		Customer cust2 = new Customer("Petar", Gender.MALE, "great_peter");
		Customer cust3 = new Customer("Genadi", Gender.MALE, "genadi_3"); 
		Customer cust4 = new Customer("Stoiko", Gender.MALE, "sto_r");
		Customer cust5 = new Customer("Sokrat", Gender.MALE, "gre_pte");
				
		cust1.evaluate(rest1, 8.4);
		cust2.evaluate(rest1, 0.3);
		cust3.evaluate(rest2, 0.3);
		cust4.evaluate(rest3, 3.6);
		cust5.evaluate(rest4, 0.3);
		cust4.evaluate(rest3, 0.2);
		
		System.out.println("-------Customer's comments-----------");
		cust1.writeAComment(rest1, "Great service , cool music");
		cust2.writeAComment(rest1, "Food is incredible , nice ambience");
		cust2.writeAComment(rest2, "Wasn't too happy with the service");
		
		rest1.displayAllCustomerComments();
		rest2.displayAllCustomerComments();
		System.out.println();
		
		System.out.println("----- Get Rating of rest1 ----");
		System.out.println("Rating of " + rest1.getName() + "  " + rest1.getRating());
		
		//search
		//find by name: 
		System.out.println("---- Find by name: Casa Mia ---- ");
		ISearchable casaMia = index.findByName("Test"); 
		System.out.println(((Restaurant) casaMia).getId() + " " + ((Restaurant) casaMia).getName() + ((Restaurant) casaMia).getRating());
				
		
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
		
		//sort by rating
		System.out.println();
		System.out.println("---- ********  ---- ");
		System.out.println("----   ****  ---- ");
		System.out.println();
		
		System.out.println("---- Sorted by rating:  ---- ");
		ArrayList<Restaurant> sortedByRating = index.sortByRating(); 
		for (Restaurant rest : sortedByRating) {
			System.out.println( rest.getRating() + " " +  rest.getName() );
		}
		
		System.out.println("Get rating: Don Vito");
		System.out.println(rest1.getRating());
		
		
		//delete by id :
		index.deleteFromList(101);
		System.out.println("----After deletion of 101:  ---- ");
		index.displayAll(); 
		
		//order test
		//Order order1 = new Order(id, restaurant, manager); 
//		Order order = new Order(12, new Restaurant("При Бачо", Type.PIZZA, "www.bacho.bg", "089943435", "Люлин 10", "Домашни гозби", 7), new Manager("DImo", "Padalski")) ;
//		Order order1 = rest1.createOrder(); 
//		Order order2 = rest1.createOrder(); 
//		Order order3 = rest1.createOrder(); 
		System.out.println("------ Name from Order ------");
//		System.out.println(order1.getRestaurant().getName());
		
		//save to archive 
//		rest1.getOrderManager().saveToArchive(order);
//		Order ordR = rest1.getOrderManager().findByIdFromArchive(12); 
//		System.out.println("------- Show retrieved order from archive ------");
//		System.out.println(ordR.getRestaurant().getName());
		
		
		cust1.evaluate(rest1, 8.4);
		cust2.evaluate(rest1, 0.3);
		System.out.println("----- Get Rating of rest1 ----");
		System.out.println("Rating of " + rest1.getName() + "  " + rest1.getRating());
		
		//sort by rating: 
		System.out.println("---- Sort by rating:  ---- ");
		ArrayList<Restaurant> sortedByRating2 = index.sortByRating(); 
		for (Restaurant rest : sortedByRating2) {
			System.out.println( rest.getRating() + " " +  rest.getName() );
		}
		
		//Food 
		System.out.println();
		System.out.println("------   MENU -------");
		
		//Menu : 
		Item mandja = new Food("mandja", 21.99, 600.00, "peppers and tomatoes", true);
		Item salad = new Food("Salad", 21.99, 600.00, "Fresh Salad from the field", true);
		Item tarator = new Food("Tarator", 21.99, 600.00, "Fresh Salad from the field", true);
	    Item water = new Drink("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania", false, false);
	    Item vodka = new Drink("Vodka Savoy",2.99,1500.00,"Ph 9.65, Fire Water From The Deep Balkan", false, false);
	    Item vodka2 = new Drink("Vodka Smirnoff",2.99,1500.00,"Ph 9.65, Fire Water From Mother Russia", false, false);
	    
	    System.out.println("Name: " + mandja.getName() + " \nDescribe: " + mandja.getDescribe() + " id:" + mandja.getId());
	    System.out.println("Name: " + water.getName() + " \nDescribe: " + water.getDescribe() + " id:" + water.getId());
	    
	 // add food to Menu
		Menu menu = new Menu();
		menu.addToList(mandja);
		menu.addToList(water);
		menu.addToList(vodka);
		rest1.getMenu().addToList(mandja);  
		rest1.getMenu().addToList(water);  
		rest1.getMenu().addToList(vodka);  
		rest1.getMenu().addToList(vodka2);  
		rest1.getMenu().addToList(salad);  
		rest1.getMenu().addToList(tarator);  
		//Menu menuRest1 = rest1.getMenu(); 
		System.out.println("----Show the menu of : " + rest1.getName() +  " ---- ");
		rest1.getMenu().displayAll();
		System.out.println();
		System.out.println("------Delete by Id : 1 --------");
		rest1.getMenu().deleteFromList(1);;
		
		rest1.getMenu().displayAll();
		System.out.println("----Show the menu of to customers: " + rest1.getName() +  " ---- ");
		rest1.getMenu().displayAllToCustomers();
		
		System.out.println("------Find by Id : 3 --------");
		Item vodkaFound =  (Item) rest1.getMenu().findById(3); 
		System.out.println(vodkaFound.getName());
		// !!!
		System.out.println("----- Find by word ------");
		ArrayList<Item> allVodkas = rest1.getMenu().findByWord("Savoy"); 
		for (Item v:  allVodkas) {
			System.out.println(v.getName());
		}
		// !!!
		
		System.out.println("----- Find vegeterian ------");
		ArrayList<Food> vegeterianFood = rest1.getMenu().findVegetarianOnly() ;  
		for (Food v:  vegeterianFood) {
			System.out.println(v.getName());
		}
	    
	}
}
