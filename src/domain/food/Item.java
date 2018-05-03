package domain.food;

import domain.dao.IAddable;

public abstract class Item implements IAddable {
	private static long counter = 0; 
	private long id; 
	private String name; 
	private double price;
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.id = ++counter ; 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}  
	
}
