package com.compan;

public class Cashier extends Person {

    public Cashier(String name, Gender gender) {
        super(name, gender);
    }

    public static void createOrder(){
        Order.pay();
    }
}
