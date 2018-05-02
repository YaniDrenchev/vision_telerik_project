package com.compan;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date date;
    private static ArrayList<Item> items = new ArrayList();
    private int sum;
    static String restaurantName;
    static String managerName;
    String address;

    public Order(){
        this.restaurantName = Restaurant.getName;
        this.managerName = Manager.getName();
        this.address = Restaurant.getAddress;
        items = new ArrayList<Item>();
        sum = 0;
    }
    public static void pay(){
        System.out.println(restaurantName);
        System.out.println(managerName);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
            System.out.print(items.get(i).getPrice());
        }
    }
    public static void addItem(Item item){
          items.add(item);
    }
}
