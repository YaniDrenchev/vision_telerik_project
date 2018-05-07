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
    }
    
    public void giveOrderToChef(Item item, Chef chef){
        chef.takeOrder(item, this);
    }
    
    public void giveItem(Item item){
        logItemInTheSystem(item);
    }
    
    public void logItemInTheSystem(Item item){
    }
    
    public Chef callAChef(){
    	return new Chef(); 
    }
}
