package domain;

import java.util.ArrayList;

import com.compan.Customer;
import com.compan.Gender;
import com.compan.Manager;
import com.compan.Order;
import com.compan.Waiter;

import domain.food.Drink;
import domain.food.Food;
import domain.food.Item;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager("Vasilev", Gender.MALE); 
		System.out.println(manager.getName()); 
		
		// The index of all restaurants in town 
		Index index = Index.getInstance(); 
		
		//add Restaurants
		Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София",  "Пица за душата от Италия", new Manager("Васил Цветков", Gender.MALE) ); 
		Restaurant rest2 = new Restaurant("Casa Mia", Type.BURGER, "http://casamia.com/bg/", "08834344934","бл 153, Младост 3, София",  "Твоята пицария в Младост " , new Manager("Лозан Иванов", Gender.MALE)); 
		Restaurant rest3 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул Дондуков 42, София",  "Студена бира в гореща вечер", new Manager("Яни Петров", Gender.MALE));
		Restaurant rest4 = new Restaurant("При Китаеца", Type.CHINESE, "http://wu.bg", "3434523", "Люлин 3 бл 234", "Китайска храна за вкъщи", new Manager("Василена Илиева", Gender.FEMALE)); 
		Restaurant rest5 = new Restaurant("Cafe Roma", Type.CAFETERIA, "http://pizzadonvito.com/", "0889934934", "бул. Васил Левски, 34, София","Пица за душата от Италия", new Manager("Илина Илиева", Gender.FEMALE) ); 
		index.addToList(rest1);	
		index.addToList(rest2);
		index.addToList(rest3);
		index.addToList(rest4);
		index.addToList(rest5);
		
		//Show all  
		index.displayAll();
		
		//Generate Items for the Menu
		Item mandja = new Food("mandja", 21.99, 600.00, "peppers and tomatoes", true);
		Item salad = new Food("Salad", 21.99, 600.00, "Fresh Salad from the field", true);
		Item tarator = new Food("Tarator", 21.99, 600.00, "Fresh Salad from the field", true);
	    Item water = new Drink("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania", false, false);
	    Item vodka = new Drink("Vodka Savoy",2.99,1500.00,"Ph 9.65, Fire Water From The Deep Balkan", false, false);
	    Item vodka2 = new Drink("Vodka Smirnoff",2.99,1500.00,"Ph 9.65, Fire Water From Mother Russia", false, false);
	    Item juice = new Drink("Lemon Shock",1.99,1000.00,"Squeezed lemon in a plastic bag", false, false);
	    Item rabit = new Food("Rabit Stew",22.99,1000.00,"Young rabit cooked with carrots", false);

	    //Some more food and drinks: 
	    Item chickenFajitas = new Food("Chicken Fajitas", 169.95, 900.00, "1/2 c. extra-virgin olive oil\n" +
	            "1/4 c. lime juice\n" +
	            "2 tsp. cumin\n" +
	            "1/2 tsp. red pepper flakes\n" +
	            "4 boneless, skinless chicken breast\n" +
	            "Kosher salt\n" +
	            "Freshly ground black pepper", false);
	    rest1.getMenu().addToList(chickenFajitas);
	    Item steakFajitaPowerBowls = new Food("Steak Fajita Power Bowls", 25.99, 600.00, "2 tbsp. vegetable oil, divided\n" +
	            "1/2 yellow onion, sliced into half moons\n" +
	            "2 bell peppers, thinly sliced\n" +
	            "kosher salt\n" +
	            "Freshly ground black pepper\n" +
	            "1 lb. skirt steak, cut into 1/2\" slices\n" +
	            "Juice of 1/2 lime\n" +
	            "1/2 tsp. cumin\n" +
	            "1/2 tsp. chili powder\n" +
	            "4 c. cooked brown rice\n" +
	            "1 c. black beans, drained and rinsed\n" +
	            "1 c. frozen corn, warmed\n" +
	            "1 avocado, thinly sliced\n" +
	            "1 tbsp. finely chopped cilantro, for garnish\n" +
	            "Sour cream, for serving", false);
	    rest3.getMenu().addToList(steakFajitaPowerBowls); 
	    Item onionSoupBreadBowls = new Food("Onion Soup Bread Bowls", 17.95, 400.00, "2 tbsp. butter\n" +
	            "2 medium onions, thinly sliced\n" +
	            "2 sprigs thyme\n" +
	            "kosher salt\n" +
	            "Freshly ground black pepper\n" +
	            "1/4 c. red wine\n" +
	            "1/4 c. flour\n" +
	            "2 garlic cloves, minced\n" +
	            "2 c. beef broth\n" +
	            "6 dinner rolls\n" +
	            "6 slices swiss\n" +
	            "1 c. Gruyere, shredded\n" +
	            "1 tbsp. chopped parsley", false);
	    rest1.getMenu().addToList(onionSoupBreadBowls); 
	    Item italianPastaSalad = new Food("Italian Pasta Salad", 8.95, 600.00, "16 oz. fusili pasta, cooked according to package instructions\n" +
	            "8 oz. mozzarella balls, halved\n" +
	            "4 oz. salami, quartered\n" +
	            "2 c. baby spinach\n" +
	            "1 c. cherry tomatoes, halved\n" +
	            "1 c. artichoke hearts, chopped\n" +
	            "1/2 c. pitted black olives, sliced", false);
	    rest1.getMenu().addToList(italianPastaSalad);  
	    Item creamyTuscanChicken = new Food("Creamy Tuscan Chicken", 21.99, 600.00, "1 tbsp. extra-virgin olive oil\n" +
	            "4 boneless skinless chicken breasts\n" +
	            "Kosher salt\n" +
	            "Freshly ground black pepper\n" +
	            "1 tsp. dried oregano\n" +
	            "3 tbsp. unsalted butter\n" +
	            "3 cloves garlic, minced\n" +
	            "1 1/2 c. cherry tomatoes\n" +
	            "2 c. baby spinach\n" +
	            "1/2 c. heavy cream\n" +
	            "1/4 c. freshly grated Parmesan\n" +
	            "Lemon wedges, for serving", false);
	    rest1.getMenu().addToList(creamyTuscanChicken); 
	    Item veganPizza = new Food("Vegan Pizza", 11.99, 700.00, "1 small head cauliflower, cut into small florets\n" +
	            "1 tbsp. extra-virgin olive oil\n" +
	            "1 tbsp. apple cider vinegar\n" +
	            "1/2 tsp. garlic powder\n" +
	            "1/2 tsp. cayenne pepper\n" +
	            "Kosher salt\n" +
	            "Freshly ground black pepper\n" +
	            "2/3 c. barbecue sauce, divided\n" +
	            "1 store bought pizza dough\n" +
	            "1/2 small red onion, thinly sliced\n" +
	            "2 scallions, thinly sliced, for garnish", true);
	    rest1.getMenu().addToList(veganPizza); 
	    Item slowCookerBrisket = new Food("Slow-Cooker Brisket", 21.99, 600.00, "3 lb. beef brisket\n" +
	            "1 small white onion, sliced\n" +
	            "2 garlic cloves, smashed and peeled\n" +
	            "2 c. low sodium chicken stock\n" +
	            "2 sprigs fresh thyme\n" +
	            "Kosher salt\n" +
	            "Freshly ground black pepper", false);
	    rest2.getMenu().addToList(slowCookerBrisket); 
	    Item grilledShrimp = new Food("Grilled Shrimp", 21.99, 400.00, "2 lb. shrimp, peeled and deveined\n" +
	            "1/4 c. extra-virgin olive oil\n" +
	            "1/4 c. lime juice\n" +
	            "4 garlic cloves, minced\n" +
	            "3 tbsp. honey\n" +
	            "2 tbsp. low-sodium soy sauce\n" +
	            "1 tbsp. chili garlic sauce or sriracha\n" +
	            "1/4 c. freshly chopped cilantro, for garnish\n" +
	            "Lime slices, for serving", false);
	    rest4.getMenu().addToList(grilledShrimp); 
	    Item generalTsoMeatballs = new Food("General Tso Meatballs", 44.99, 600.00, "1 lb. ground beef\n" +
	            "1/2 c. panko bread crumbs\n" +
	            "4 green onions, thinly sliced, divided\n" +
	            "1 egg\n" +
	            "2 cloves garlic, minced\n" +
	            "1 tsp. ginger, minced or grated\n" +
	            "1 tsp. sesame oil\n" +
	            "kosher salt\n" +
	            "pinch red pepper flakes\n" +
	            "1/4 c. cornstarch\n" +
	            "Vegetable oil, for frying\n" +
	            "1/2 c. low-sodium chicken broth\n" +
	            "1/4 c. soy sauce\n" +
	            "2 tbsp. apple cider vinegar\n" +
	            "2 tbsp. hoisin sauce\n" +
	            "1 tbsp. honey\n" +
	            "2 tsp. sesame seeds", false);
	    rest4.getMenu().addToList(generalTsoMeatballs); 
	    Item mediterraneanChickpeaSalad = new Food("Mediterranean Chickpea Salad", 11.99, 600.00, "1/4 c. white wine vinegar\n" +
	            "1/2 c. extra-virgin olive oil\n" +
	            "1 tbsp. lemon juice\n" +
	            "1 tbsp. freshly chopped parsley\n" +
	            "1/4 tsp. red pepper flakes\n" +
	            "Kosher salt\n" +
	            "Freshly ground black pepper\n", true);
	    rest5.getMenu().addToList(mediterraneanChickpeaSalad);
	    Item cheesesteakSloppyJoes = new Food("Cheesesteak Sloppy Joes", 21.99, 250.00, "1 tbsp. vegetable oil\n" +
	            "1 onion, chopped\n" +
	            "2 bell peppers, chopped\n" +
	            "1 Garlic clove, minced\n" +
	            "1 lb. ground beef\n" +
	            "1/2 c. beef broth\n" +
	            "2 tbsp. ketchup\n" +
	            "1 tbsp. Worcestershire sauce\n" +
	            "1 tbsp. brown sugar\n" +
	            "kosher salt\n" +
	            "Freshly ground black pepper\n" +
	            "4 slices provolone\n" +
	            "4 Hamburger buns", false);
	    rest2.getMenu().addToList(cheesesteakSloppyJoes);
	    Item cauliflowerGrilledCheese = new Food("Cauliflower Grilled Cheese", 21.99, 400.00, "1 head cauliflower, (to make about 4 cups processed cauliflower)\n" +
	            "2 eggs, lightly beaten\n" +
	            "1/2 c. finely grated Parmesan\n" +
	            "1/2 tsp. oregano\n" +
	            "1 1/2 c. shredded white Cheddar", true);
	    rest2.getMenu().addToList(cauliflowerGrilledCheese);
	    Item primaveraCarbonara = new Food("Primavera Carbonara", 21.99, 600.00, "6 slices bacon, cut into 1\" pieces\n" +
	            "1 zucchini, cut into half moons\n" +
	            "1/2 red onion, thinly sliced\n" +
	            "4 oz. baby bella mushrooms, sliced\n" +
	            "3/4 lb. spaghetti, cooked according to package directions\n" +
	            "5 egg yolks\n" +
	            "1 c. heavy cream\n" +
	            "1/2 c. freshly grated Parmesan, plus more for serving\n" +
	            "Kosher salt\n" +
	            "Freshly ground black pepper", false);
	    rest1.getMenu().addToList(primaveraCarbonara); 
	    Item shepherdsPie = new Food("Shepherd's Pie", 199.95, 900.00, "1 tbsp. extra-virgin olive oil\n" +
	            "1 large onion, chopped\n" +
	            "2 Carrots, peeled and chopped\n" +
	            "2 cloves garlic, minced\n" +
	            "1 tsp. fresh thyme\n" +
	            "1 1/2 lb. ground beef\n" +
	            "1 c. frozen peas\n" +
	            "1 c. frozen corn\n" +
	            "2 tbsp. flour\n" +
	            "2/3 c. chicken broth\n" +
	            "1 tbsp. Freshly chopped parsley, for garnish", false);
	    rest3.getMenu().addToList(shepherdsPie); 
	    Item lemonAsparagusChickenPasta = new Food("Lemon Asparagus Chicken Pasta", 151.99, 900.00, "kosher salt\n" +
	            "1 lb. linguine or spaghetti\n" +
	            "1 tbsp. extra-virgin olive oil\n" +
	            "1 lb. boneless skinless chicken breasts\n" +
	            "Freshly ground black pepper\n" +
	            "2 tsp. Italian seasoning\n" +
	            "2 tbsp. butter\n" +
	            "1 small red onion, chopped\n" +
	            "1 lb. asparagus, stalks trimmed and cut into thirds or quartered if large\n" +
	            "3/4 c. heavy cream\n" +
	            "1/2 c. low-sodium chicken broth\n" +
	            "Juice of 1 lemon\n" +
	            "3 cloves garlic, minced\n" +
	            "3/4 c. shredded mozzarella\n" +
	            "1/2 c. freshly grated Parmesan, plus more for garnish\n" +
	            "1 lemon, sliced into half moons\n" +
	            "Freshly chopped parsley, for garnish", false);
	    rest5.getMenu().addToList(lemonAsparagusChickenPasta); 
	    Item whiskeyGlazedSteakwithShoestringPotatoes = new Food("Whiskey-Glazed Steak with Shoestring Potatoes", 201.99, 900.00, "4 russet potatoes, peeled and cut into shoestrings using a mandoline\n" +
	            "2 tbsp. extra-virgin olive oil, divided\n" +
	            "1/2 c. Grated Gruyère\n" +
	            "2 tbsp. unsalted butter, divided\n" +
	            "1 1/2 lb. skirt steak, cut into 4\" pieces\n" +
	            "kosher salt\n" +
	            "Freshly ground black pepper\n" +
	            "1 tbsp. all-purpose flour\n" +
	            "2 tbsp. whiskey\n" +
	            "1 c. low-sodium beef broth\n" +
	            "1 tbsp. heavy cream\n" +
	            "1/4 c. chopped fresh parsley, plus more for garnish", false);
	    rest3.getMenu().addToList(whiskeyGlazedSteakwithShoestringPotatoes);  
	  //Dessert.
	    Item BananaSplitLasagna = new Food("Banana Split Lasagna", 21.99, 200.00, "8 oz. cool whip\n" +
	            "1/2 c. walnuts, toasted and chopped\n" +
	            "chocolate syrup, for serving\n" +
	            "Rainbow sprinkles, for serving\n" +
	            "Maraschino cherries, for serving", true);
	    rest5.getMenu().addToList(BananaSplitLasagna); 
	    Item BananaSplitKebabs = new Food("Banana Split Kebabs", 21.99, 200.00, "2 bananas, cut into 1\" pieces\n" +
	            "24 1\" pieces pineapple\n" +
	            "12 large strawberries, rinsed, dried, and halved\n" +
	            "2 c. chocolate chips\n" +
	            "1/2 c. peanuts, chopped", true);
	    rest1.getMenu().addToList(BananaSplitKebabs); 
	    Item smoresBars = new Food("S'mores Bars", 21.99, 200.00, "3 tbsp. butter\n" +
	            "1 package mini marshmallows\n" +
	            "7 c. Golden Grahams cereal\n" +
	            "3 Hershey's milk chocolate bars, broken into pieces", true);
	    rest3.getMenu().addToList(smoresBars); 
	    Item strawberryShortcakeTrifles = new Food("Strawberry Shortcake Trifles", 21.99, 200.00, "1 c. heavy cream\n" +
	            "1 tbsp. sugar\n" +
	            "1/2 tsp. pure vanilla extract\n" +
	            "3 c. chopped pound cake or angel food cake\n" +
	            "2 c. sliced or chopped strawberries", true);
	    rest1.getMenu().addToList(strawberryShortcakeTrifles); 
	    Item lemonBlueberryLayerCake = new Food("Lemon Blueberry Layer Cake", 21.99, 300.00, "1 1/2 c. all-purpose flour\n" +
	            "3 tbsp. cornstarch\n" +
	            "1/2 tsp. baking soda\n" +
	            "1/4 tsp. kosher salt\n" +
	            "1 1/2 c. granulated sugar\n" +
	            "1 1/2 c. unsalted butter\n" +
	            "3 large eggs\n" +
	            "1/2 c. sour cream\n" +
	            "1 tsp. pure vanilla extract\n" +
	            "8 oz. cream cheese\n" +
	            "1 lb. confectioners' sugar\n" +
	            "1 lemon\n" +
	            "3 pt. fresh blueberries", true);
	    rest5.getMenu().addToList(lemonBlueberryLayerCake); 
	    
	    //Cocktails.
	    Item PinaColadaSangria = new Drink("Piña Colada Sangria",15.00,350.00,"1 750-ml. bottle white wine, such as Sauvignon Blanc\n" +
	            "2 c. pineapple juice\n" +
	            "1 c. Seltzer\n" +
	            "1 c. chopped pineapple\n" +
	            "1/2 c. coconut rum\n" +
	            "1/4 c. maraschino cherries",true,true);
	    rest1.getMenu().addToList(PinaColadaSangria); 
	    Item LemonadeRumPunch = new Drink("Lemonade Rum Punch",17.99,350.00,"4 oz. lemonade\n" +
	            "2 oz. pineapple juice\n" +
	            "2 oz. coconut rum\n" +
	            "1 oz. dark rum",true,true);
	    rest3.getMenu().addToList(LemonadeRumPunch); 
	    Item sangriaLemonade = new Drink("Sangria Lemonade",17.99,350.00,"1/2 g. lemonade\n" +
	            "1 bottle Chardonnay or other white wine (750 ml)\n" +
	            "2/3 c. light rum\n" +
	            "1/2 c. raspberries\n" +
	            "1 Orange, Sliced\n" +
	            "1 Granny Smith apple, sliced",true,true);
	    rest2.getMenu().addToList(sangriaLemonade); 
	    Item coldBrewSangria = new Drink("Cold Brew Sangria",19.99,350.00,"32 oz. cold brew (iced coffee is okay too)\n" +
	            "8 oz. tequila\n" +
	            "4 oz. Cointreau (or other orange-flavored liqueur)\n" +
	            "1 tbsp. simple syrup\n" +
	            "1 Orange, Sliced\n" +
	            "1 lime, sliced\n" +
	            "1 Granny Smith apple, diced",true,true);
	    rest5.getMenu().addToList(coldBrewSangria); 
	    Item sharkPunch = new Drink("Shark Punch",29.99,350.00,"2 strawberry fruit roll-ups\n" +
	            "4 c. vanilla ice cream\n" +
	            "4 c. Blue Hawaiian Punch\n" +
	            "4 c. sprite\n" +
	            "3 c. Vanilla Vodka\n" +
	            "1 gummy shark, if desired",true,true);
	    rest4.getMenu().addToList(sharkPunch); 
	    
	    //Add Items to Menu 
	    rest1.getMenu().addToList(mandja);  
		rest1.getMenu().addToList(salad);  
		rest1.getMenu().addToList(vodka);  
		rest2.getMenu().addToList(tarator);  
		rest3.getMenu().addToList(water);  
		rest4.getMenu().addToList(vodka2);  
		rest4.getMenu().addToList(juice);  
		rest4.getMenu().addToList(rabit);  
		
		//Show restaurants by rating  : 
		index.sortByRating(); 
		
		//Show Menu by restaurant : 
		ArrayList<Restaurant> rests = index.getRestaurants(); 
		for (Restaurant rest : rests) {
			System.out.println(rest.getName());
			rest.getMenu().displayAllToCustomers();
		}
		
		//Generate Customers 
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
		ISearchable casaMia;
		
		//search with a non existing name : 
//		try {
//			casaMia = index.findByName("Дон Вито–2");
//			System.out.println(((Restaurant) casaMia).getId() + " " + ((Restaurant) casaMia).getName() + "  " + ((Restaurant) casaMia).getRating());
//		} catch (Exception e) {
//			System.out.println("Exception");
//			e.printStackTrace();
//		} 
		
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
		rest1.getOrderFromCustomer(cust1, mandja);
		rest1.getOrderFromCustomer(cust1, vodka);
		rest1.getOrderFromCustomer(cust2, vodka);
		rest1.getOrderFromCustomer(cust3, juice);
		//System.out.println(rest1.getOrderManager().getCurrentOrders()); 
		
		//rest1.getOrderManager().sendFinishedOrdersToArchive();
		System.out.println("------ Show Orders By Client ------------");
		rest1.getOrderManager().showOrders();
		
		System.out.println("---------Show order by customer's username: iani_1--------");
		ArrayList<Order> ianisOrder =  rest1.getOrderManager().getOrdersByCustomer("iani_1");
		for (Order ord : ianisOrder) {
			ArrayList<Item> itemsOrdered = ord.getItems(); 
			for (Item item : itemsOrdered) {
				System.out.println(item.getName()  + " ... " + "$ " +  item.getPrice());
			}
			System.out.println("Total: " + ord.getSum());
		}
		
			
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
