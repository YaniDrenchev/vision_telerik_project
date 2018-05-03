package staff;

public class Person {
    static String name;
    private Gender gender;
    
    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		Person.name = name;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}
    
}
