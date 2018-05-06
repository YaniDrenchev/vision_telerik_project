package com.compan;

import domain.Restaurant;
import domain.foodIvelin.Item;

public class Customer extends Person {
    private String username;

    public Customer(String name, Gender gender, String username) {
        super(name, gender);
        if (username.length() > 12 || username.length() < 3){
            System.out.println("Invalid username");
            // Ivaylo will show a window "Invalid username"
        }else{
            this.username = username;
        }
    }
    public void order1(Item item){
        Weiter.takeOrder(item);
    }

    public void order2(Item item){
        Order.addItem(item);
    }

    /
    public void pay(Order order){
        order.finalize();
    }

    public  void checkTime(Restaurant rest){
        rest.getWorkingHours();
    }

    public void evaluate(Restaurant rest, double rating){
        if (Order.getStatus() == Status.FINISHED){
            rest.getEvaluationFromUser(rating);
        }else{
            //Open a window and tell the client that it is not possible to evaluate
            System.out.println("You dint't visit that rest!!! Stop cheating");
        }
    }

    public  void writeAComment(Restaurant rest, String comment){
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