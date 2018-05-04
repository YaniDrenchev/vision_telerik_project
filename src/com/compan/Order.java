package com.compan;
import domain;
import java.util.ArrayList;
import java.util.Date;

public class Order implements Serializable {
    private Date date;
    private static ArrayList<Item> items = new ArrayList(); //all items orderd
    private int sum;
    private long ID = 1000; //specific ID in order to surch for the orders by ID
    static String restaurantName;
    static String managerName;
    String address;
    private Restaurant rest;
    private Status status;
//constructor
    public Order(Restaurant rest, Manager man){
        this.restaurantName = rest.getName;
        this.managerName = man.getName();
        this.address = rest.getAddress;
        items = new ArrayList<Item>();
        sum = 0;
        this ID ++;
        this rest = rest;
    }
    //paying the bill and adding the current Order to the current Rest order manager
    public static void pay(){
        System.out.println(restaurantName);
        System.out.println(managerName);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
            System.out.print(items.get(i).getPrice());
        }
        status = Status.COMPLETE;// Complete order
        rest.OrderManager.saveOrder;
        rest.addOrder(this);// adding the current order to the ArrayList Orders
    }
    public static void addItem(Item item){
          items.add(item);
    }
}
