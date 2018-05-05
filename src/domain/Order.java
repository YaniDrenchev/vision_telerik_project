package domain;

import com.compan.Customer;

public class Order implements IAddable {
	
	private long id;
	//private Timestamp timestamp;  // new Timestamp(System.currentTimeMillis()); in the constructor 
	//private Status status; 
	private Restaurant restaurant; //get the Restaurant's manager from here 
	private Manager manager;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(long id, Restaurant restaurant, Manager manager, Customer customer){
		super();
		this.id = id;
		this.restaurant = restaurant;
		this.manager = manager;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", timestamp=" +   ", status=" +   ", restaurant=" + restaurant
				+ ", manager=" + manager + "]";
	}
	
}
