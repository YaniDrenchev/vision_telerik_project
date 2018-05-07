package com.compan;

public class Person {
    protected String name;
    protected Gender gender;

    public Person() {
		super();
	}
//
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
    
}
