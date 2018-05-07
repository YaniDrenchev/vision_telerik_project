package com.compan;

import domain.Restaurant;
import domain.food.Item;

public class Chef extends Person {
	private Restaurant restaurant; 
	
	public Chef() {
		super();
	}

	public Chef(String name, Gender gender, Restaurant restaurant) {
        super(name, gender);
        this.restaurant = restaurant;
    }
    
    public void takeOrder(Item item, Waiter waiter){
        cook(item, waiter);	
    }
    public void cook(Item item, Waiter waiter){
        System.out.println("Your " + item.getName() +  " will be ready in 15 min");
        Waiter waitr = callAWaiter(); 
        giveOrder(item, waitr);
    }
   
    public  void giveOrder(Item item, Waiter waiter){
    	waiter.giveItem(item);
        System.out.println("Your food is comming");
    }
    
    public Waiter callAWaiter(){
    	return new Waiter(); 
    }

}
