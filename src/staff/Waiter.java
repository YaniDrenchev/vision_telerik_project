package staff;

import domain.food.Item;

public class Wаiter extends Person {
    
	private String currentOrder;
    private Item item;
    private Chef chef; 
    
    public Wаiter(String name, Gender gender) {
        super(name, gender);
    }
    
    public static void takeOrder(Item item){
        giveOrderToChef(item, chef);
        System.out.println("I gave the order to the chef");
    }
    
    public static void giveOrderToChef(Item item, Chef chef){
        chef.takeOrder(item);
        System.out  .println("The chef took the order");
    }
    
    public static void giveItem(Item item){
        Order.addItem(item);
        System.out.println("Here you are");
    }
}

