package domain;

import java.util.ArrayList;

import com.compan.Customer;
import com.compan.Gender;
import com.compan.Manager;
import com.compan.Order;
import com.compan.Weiter;

import domain.food.Drink;
import domain.food.Food;
import domain.food.Item;


public class Main {

	public static void main(String[] args) {
		
		//Manager mngr = new Manager("Mitko", "Dermendjiev");
		Index index = Index.getInstance(); 
		
		//add Restaurants
		Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София",  "Пица за душата от Италия", new Manager("Васил Цветков", Gender.MALE) ); 
		Restaurant rest2 = new Restaurant("Дон Вито–2", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "ул. Христо Ботев 43, София",   "Пица за душата от Италия", new Manager("Горан Петров", Gender.MALE)); 
		Restaurant rest3 = new Restaurant("Casa Mia", Type.PIZZA, "http://casamia.com/bg/", "08834344934","бл 153, Младост 3, София",  "Твоята пицария в Младост " , new Manager("Лозан Иванов", Gender.MALE)); 
		Restaurant rest4 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул Дондуков 42, София",  "Студена бира в гореща вечер", new Manager("Яни Петров", Gender.MALE));
		Restaurant rest5 = new Restaurant("Test", Type.CHINESE, "tets.bg", "3434523", "Luli 10", "Test hrana za vkushti", new Manager("Василена Илиева", Gender.FEMALE)); 
		Restaurant rest10 = new Restaurant("Casa de Lava", Type.PIZZA, "http://pizzadonvito.com/", "0889934934", "бул. Васил Левски, 34, София","Пица за душата от Италия", new Manager("Илина Илиева", Gender.FEMALE) ); 
		index.addToList(rest1);	
		index.addToList(rest2);
		index.addToList(rest3);
		index.addToList(rest4);
		index.addToList(rest5);
		index.addToList(rest10);
		index.displayAll();
		
		//Menu : 
		Item mandja = new Food("mandja", 21.99, 600.00, "peppers and tomatoes", true);
		Item salad = new Food("Salad", 21.99, 600.00, "Fresh Salad from the field", true);
		Item tarator = new Food("Tarator", 21.99, 600.00, "Fresh Salad from the field", true);
	    Item water = new Drink("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania", false, false);
	    Item vodka = new Drink("Vodka Savoy",2.99,1500.00,"Ph 9.65, Fire Water From The Deep Balkan", false, false);
	    Item vodka2 = new Drink("Vodka Smirnoff",2.99,1500.00,"Ph 9.65, Fire Water From Mother Russia", false, false);
	    Item juice = new Drink("Lemon Shock",1.99,1000.00,"Squeezed lemon in a plastic bag", false, false);
	    Item rabit = new Food("Rabit Stew",22.99,1000.00,"Young rabit cooked with carrots", false);
		
	    rest1.getMenu().addToList(mandja);  
		rest1.getMenu().addToList(salad);  
		rest1.getMenu().addToList(tarator);  
		rest1.getMenu().addToList(water);  
		rest1.getMenu().addToList(vodka);  
		rest1.getMenu().addToList(vodka2);  
		rest1.getMenu().addToList(juice);  
		rest1.getMenu().addToList(rabit);  
		
		//Customers 
		Customer cust1 = new Customer("Iani", Gender.MALE, "iani_1"); 
		Customer cust2 = new Customer("Petar", Gender.MALE, "great_peter");
		Customer cust3 = new Customer("Genadi", Gender.MALE, "genadi_3"); 
		Customer cust4 = new Customer("Stoiko", Gender.MALE, "sto_r");
		Customer cust5 = new Customer("Sokrat", Gender.MALE, "gre_pte");
		
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
		System.out.println("---- Find by name: Дон Вито–2 ---- ");
		ISearchable casaMia = index.findByName("Дон Вито–2"); 
		System.out.println(((Restaurant) casaMia).getId() + " " + ((Restaurant) casaMia).getName() + "  " + ((Restaurant) casaMia).getRating());
		
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
		Manager mngr = new Manager("Ivanov", Gender.MALE); 
		Order order1 = new Order(rest1, mngr) ;
		
		System.out.println("------ Name from Order ------");
		System.out.println(order1.getRestaurant().getName());
		System.out.println(order1);
		
		//save to archive 
//		rest1.getOrderManager().saveToArchive(order1);
//		Order ordR = rest1.getOrderManager().findByIdFromArchive(1001); 
//		System.out.println( order1.getSum()); 
		
		//restaurants get the order 
		rest1.getOrderFromCustomer(cust1, salad);
		rest1.getOrderFromCustomer(cust1, rabit);
		rest1.getOrderFromCustomer(cust1, vodka);
		rest1.getOrderFromCustomer(cust2, vodka);
		rest1.getOrderFromCustomer(cust3, juice);
		//System.out.println(rest1.getOrderManager().getCurrentOrders()); 
		
		//rest1.getOrderManager().sendFinishedOrdersToArchive();
		System.out.println("------ Show Orders By Client ------------");
		rest1.getOrderManager().showOrders();
		
		
//		System.out.println("------- Show retrieved order from archive ------");
//		System.out.println(ordR.getRestaurant().getName());
//		
//		
//		cust1.evaluate(rest1, 3.2);
//		cust2.evaluate(rest1, 0.3);
//		System.out.println("----- Get Rating of rest1 ----");
//		System.out.println("Rating of " + rest1.getName() + "  " + rest1.getRating());
//		
//		//sort by rating: 
//		System.out.println("---- Sort by rating:  ---- ");
//		ArrayList<Restaurant> sortedByRating2 = index.sortByRating(); 
//		for (Restaurant rest : sortedByRating2) {
//			System.out.println( rest.getRating() + " " +  rest.getName() );
//		}
//		
//		//Food 
//		System.out.println();
//		System.out.println("------   MENU -------");
//		
//		
//	    
//	    System.out.println("Name: " + mandja.getName() + " \nDescribe: " + mandja.getDescription() + " id:" + mandja.getId());
//	    System.out.println("Name: " + water.getName() + " \nDescribe: " + water.getDescription() + " id:" + water.getId());
//	    
//	 // add food to Menu
//		
//		//Menu menuRest1 = rest1.getMenu(); 
//		System.out.println("----Show the menu of : " + rest1.getName() +  " ---- ");
//		rest1.getMenu().displayAll();
//		System.out.println();
//		System.out.println("------Delete by Id : 1 --------");
//		rest1.getMenu().deleteFromList(1);;
//		
//		rest1.getMenu().displayAll();
//		System.out.println("----Show the menu of to customers: " + rest1.getName() +  " ---- ");
//		rest1.getMenu().displayAllToCustomers();
//		
//		System.out.println("------Find by Id : 3 --------");
//		Item vodkaFound =  (Item) rest1.getMenu().findById(3); 
//		System.out.println(vodkaFound.getName());
//		// !!!
//		System.out.println("----- Find by word ------");
//		ArrayList<Item> allVodkas = rest1.getMenu().findByWord("Savoy"); 
//		for (Item v:  allVodkas) {
//			System.out.println(v.getName());
//		}
//		// !!!
//		
//		System.out.println("----- Find vegeterian ------");
//		ArrayList<Food> vegeterianFood = rest1.getMenu().findVegetarianOnly() ;  
//		for (Food v:  vegeterianFood) {
//			System.out.println(v.getName());
//		}
//		
//		System.out.println("----- Get all items of menu -----------");
//		ArrayList<IAddable> men = rest1.getMenu().getMenu(); 
//		for (IAddable itemN : men) {
//			Item item = (Item) itemN;
//			System.out.println(item.getName());
//		}
//		System.out.println();
//		
//		//Comments Part 
//		//Write a comment: 
//		//rest1.getCommentFromCustomer("Great music , great barbeque, lovely service", "boiko_123");
//		//rest1.displayAllCustomerComments();
//		
//		System.out.println(" ------ Customer comments --------------");
//		Customer pesho = new Customer("Pesho", Gender.MALE, "gre_pte");
//		pesho.writeAComment(rest1, "Great music , great barbeque, lovely service");
//		rest1.displayAllCustomerComments();
//		
//		System.out.println(" ------ Get all comments as an ArrayList:  --------------");
//		ArrayList<IAddable> allComments = rest1.getCommentsManager().getAllComments();
//		for (IAddable commentN : allComments) {
//			Comment comment = (Comment) commentN;
//			System.out.println(comment.getTimestamp() + "  " + comment.getAuthorName() + ":  " + comment.getContent());
//		}
//		System.out.println();
		
	}
}
