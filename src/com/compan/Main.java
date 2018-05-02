package com.compan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Spaggeti", 7.0 , 7));
        items.add(new Item("Grozde", 7.0 , 7));
        items.add(new Item("marulq", 7.0 , 7));
	    Customer.order(items.get(2));
    }
}
