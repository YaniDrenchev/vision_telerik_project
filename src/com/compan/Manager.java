package com.compan;

import domain.Restaurant;
import domain.Type;

public class Manager extends Person {
	
    public Manager(String name, Gender gender) {
        super(name, gender);
    }

    public Restaurant createRestaurant(String name, Type type, String webSite, String phone, String address,  String description, Manager manager) {
    	return new Restaurant(name, type, webSite, phone, address, description, manager) ; 
    }
    
    public String getName(){
        return super.getName();
    }
}
