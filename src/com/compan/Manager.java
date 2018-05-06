package com.compan;

public class Manager extends Person implements Serializable {

    public Manager(String name, Gender gender) {
        super(name, gender);
    }

    public void createRestaurant(String name, long id, int rating,
                                 String address, String workingHours,
                                 int numberOfClientsPerWeek,
                                 int capacity,
                                 String contactInfo,
                                 String typeDescpription,
                                 String shortDescription) {
        Restaurant.create(name, id, rating, address, workingHours,
                numberOfClientsPerWeek, capacity,
                contactInfo, typeDescpription,
                shortDescription);
    }
    public static String getName(){
        return name;
    }
}
