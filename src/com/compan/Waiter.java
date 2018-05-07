package com.compan;

import domain.Restaurant;
import domain.food.Item;

public class Waiter extends Person {
    private String currentOrder;
    private Item item;
    private Restaurant restaurant; 
    
    public Waiter() {
		super();
	}

	public Waiter(String name, Gender gender, Restaurant restaurant) {
		super(name, gender);
		this.restaurant = restaurant; 
    }
    
    public void takeOrder(Item item){
    	Chef chef1 = callAChef(); 
        giveOrderToChef(item , chef1);
        System.out.println("I gave the order to the chef");
    }
    
    public void giveOrderToChef(Item item, Chef chef){
        chef.takeOrder(item, this);
        System.out.println("The chef took the order");
    }
    
    public void giveItem(Item item){
        logItemInTheSystem(item); 
    	System.out.println("Here you are");
    }
    
    public void logItemInTheSystem(Item item){
    	System.out.println("Item served  to client"); 
    }
    
    public Chef callAChef(){
    	return new Chef(); 
    }
}
