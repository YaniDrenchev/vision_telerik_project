package com.compan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import domain.IAddable;
import domain.Restaurant;

//TODO : add IAddable
public class Order implements Serializable, IAddable {
    private static int counter;
    private long id;
    private Date date;
    private static ArrayList<Item> items = new ArrayList(); //all items orderd
    private int sum;
    //private long ID = 1000; //specific ID in order to surch for the orders by ID
    private String restaurantName;
    private String managerName;
    private String address;
    private Restaurant restaurant;
    private Manager manager ;
    private static Status status;
    //constructor
    public Order(Restaurant restaurant, Manager manager){
        this.restaurant = restaurant ;
        this.manager = manager;
        this.restaurantName = restaurant.getName();
        this.managerName = restaurant.getName();
        this.address = restaurant.getAddress();
        items = new ArrayList<Item>();
        sum = 0;
        this.id = ++counter + 1000;
        this.status = Status.OPENED;
    }
    //paying the bill and adding the current Order to the current Rest order manager
    public void finalize(){
        System.out.println(restaurantName);
        System.out.println(managerName);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
            System.out.print(items.get(i).getPrice());
        }
        status = Status.FINISHED;// Complete order
        restaurant.getOrderManager().saveOrder(this);
    }

    public static Status getStatus() {
        return status;
    }

    public static void addItem(Item item){
        items.add(item);
    }
}