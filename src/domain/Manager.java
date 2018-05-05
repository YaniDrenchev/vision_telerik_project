package domain;

import java.io.Serializable;

public class Manager implements Serializable {
	private String firstName;
	private String familyName;
	
	public Manager(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	public void createRestaurant(Restaurant restaurant){
		System.out.println("Restaurant " + restaurant.getName() + " was created in " );
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}
	
}
