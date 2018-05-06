package com.compan;

public class Weiter extends Person {
    private String currentOrder;
    private Item item;
    public Weiter(String name, Gender gender) {
        super(name, gender);
    }
    public static void takeOrder(Item item){
        giveOrderToChef(item);
        System.out.println("I gave the order to the chef");
    }
    public static void giveOrderToChef(Item item){
        Chef.takeOrder(item);
        System.out.println("The chef took the order");
    }
    public static void giveItem(Item item){

        Order.addItem(item);
        System.out.println("Here you are");
    }
}
