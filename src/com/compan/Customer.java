package com.compan;

import domain.Order;
import domain.Restaurant;

public class Customer extends Person {
    private String username;  //unique

    public Customer(String name, Gender gender, String username) {
        super(name, gender);
        this.username = username;
    }
    public  void order1(Item item){
        Weiter.takeOrder(item);
    }


    public void order2(Item item){
        Order.addItem(item);
    }
    public  void pay(){
        Order.finalize();
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

    public static void checkRating(Restaurant rest){
        rest.getRating();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}