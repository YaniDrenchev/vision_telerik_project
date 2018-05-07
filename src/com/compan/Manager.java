package com.compan;

import java.io.Serializable;

import domain.Restaurant;
import domain.Type;

public class Manager extends Person implements Serializable {

    public Manager(String name, Gender gender) {
        super(name, gender);
    }

    public Restaurant createRestaurant(String name, Type type, String webSite, String phone, String address,  String description, Manager manager) {
    	return new Restaurant(name, type, webSite, phone, address, description, manager) ; 
    }
    
    public static String getName(){
        return name;
    }
}
