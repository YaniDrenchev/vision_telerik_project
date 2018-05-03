package staff;

import domain.Order;
import domain.Restaurant;
import domain.food.Item;

public class Customer extends Person {
    private double money;  // check if he has money to buy the things
	
	
	public Customer(String name, Gender gender) {
        super(name, gender);
    }
    
	public static void order(Item item, Wаiter waiter){
		waiter.takeOrder(item);
    }
    
	public static void order(Item item){
        Order.addItem(item);
    }
    
	public static void pay(){
        Order.pay();
    }
    
	// chek the time and if it is in the workingHours return TRUE
    public static void checkTime(Restaurant rest){
        rest.getWorkingHours();
    }
    
    //TODO who ? 
    public static void evaluate(Restaurant rest, double rank){
        rest.evaluate(rank);
    }
    
    public static void writeAComment(Restaurant rest, String comment){
        rest.setComment(comment);
    }
    
    public static void checkRank(Restaurant rest){
        rest.getRank();
    }
}
