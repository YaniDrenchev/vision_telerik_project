package com.compan;

public class Person {
    static String name;
    private Gender gender;

    public Person(String name, Gender gender) {
    	if (name.length() > 32 || name.length() < 1){
            System.out.println("Invalid name");
            // Ivaylo will show a window "Invalid name"
        }else{
            this.name = name;
        }
        this.name = name; 
        this.gender = gender;
    }
}
