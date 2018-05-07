package com.compan;

import domain.Restaurant;
import domain.food.Item;

public class Customer extends Person {
    private String username;
    private Order order; 
    
    public Customer(String name, Gender gender, String username) {
        super(name, gender);
        this.order = new Order(); 
        
        if (username.length() > 32 || username.length() < 3){
            System.out.println("Invalid username");
            // Ivaylo will show a window "Invalid username"
        }else{
            this.username = username;
        }
    }
    public void order1(Item item, Waiter waiter){
        waiter.takeOrder(item);
    }

    public void order2(Item item){
        order.addItem(item);
    }



    public  void checkTime(Restaurant rest){
        rest.getWorkingHours();
    }

    public void evaluate(Restaurant rest, double rating){

            rest.getEvaluationFromUser(rating);

    }

    public void writeAComment(Restaurant rest, String comment){
        rest.getCommentFromCustomer(comment, this);
    }


    public void checkRating(Restaurant rest){
        rest.getRating();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}