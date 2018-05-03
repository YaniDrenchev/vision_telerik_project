package domain;

import domain.dao.IAddable;
import domain.dao.ISearchable;

public class Restaurant implements ISearchable, IAddable, Comparable<Restaurant>  {
	//private RestaurantDAO dao ; // ??? do i need 
	private static int counter; 	
	private int id; 
	private String name;
	private Type type;  
	private String webSite; 
	private String phone; 
	private String description; 
	private Manager manager; 
	private double rating ; 
	private String address; 
	private Menu menu; 
	
	public Restaurant() {
		super();
	}
	
	public Restaurant(String name, Type type, String webSite, String phone, String address,  String description, double rating) {
		super();
		this.name = name;
		this.type = type;
		this.webSite = webSite;
		this.phone = phone;
		this.description = description;
		this.address = address; 
		this.rating = rating ; // range: 0 to 10
		this.id = ++counter + 1000; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public int compareTo(Restaurant restaurant) {
		if(rating == restaurant.rating){
			return 0; 
		}else if(rating > restaurant.rating){
			return -1;
		}else {
			return 1; 
		}	
	}
}
