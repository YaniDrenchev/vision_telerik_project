package com.compan;


public class Customer extends Person {
    private String username;
    public Customer(String name, Gender gender, String username) {
        super(name, gender);
        this.username = username;
    }
    public static void order(Item item){
        Weiter.takeOrder(item);
    }
    public static void order(Item item){
        Order.addItem(item);
    }
    public static void pay(){
        Order.pay();

    }
        chek the time and if it is in the workingHours return TRUE
    public static void checkTime(Restaurant rest){
        rest.getWorkingHours();
    }
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
