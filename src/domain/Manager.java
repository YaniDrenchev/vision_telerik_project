package domain;

public class Manager {
	private String firstName;
	private String familyName;
	
	public Manager(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	public void createRestaurant(Restaurant restaurant, City city){
		System.out.println("Restaurant " + restaurant.getName() + " was created in " + city.getName());
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}
	
}
