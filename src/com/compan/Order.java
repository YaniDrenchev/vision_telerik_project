package com.compan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import domain.IAddable;
import domain.Restaurant;
import domain.food.Item;

public class Order implements Serializable, IAddable {
    private static int counter;
    private long id;
    private Date date;
    private ArrayList<Item> items; //all items ordered
    private double sum;

    private String restaurantName;
    private String managerName;
    private String address;
    private Restaurant restaurant;
    private Manager manager ;
    private static Status status;
    
    public Order() {
		super();
	}

	//constructor
    public Order(Restaurant restaurant, Manager manager){
        this.restaurant = restaurant ;
        this.manager = manager;
        this.restaurantName = restaurant.getName();
        this.managerName = manager.getName(); 
        this.address = restaurant.getAddress();
        this.items = new ArrayList<>();
        this.sum = 0.0;
        this.id = ++counter + 1000;
        this.status = Status.OPENED;
    }
    //paying the bill and adding the current Order to the current Rest order manager
//    public void finalize(){
//        System.out.println(restaurantName);
//        System.out.println(managerName);
//        for (int i = 0; i < items.size(); i++) {
//            System.out.println(items.get(i).getName());
//            System.out.print(items.get(i).getPrice());
//        }
//        status = Status.FINISHED;// Complete order
//        restaurant.getOrderManager().saveOrder(this);
//    }
    
    public ArrayList<Item> getItems() {
		return items;
	}
    
    public void finalize(){
	    calculateTotal();
		status = Status.FINISHED;// Complete order
		restaurant.getOrderManager().saveOrder(this);
    }
    
    private void calculateTotal(){
    	double total =  0.0;   
    	for (Item item : items) {
			sum += item.getPrice(); 
		}
    	this.sum = total;
    }

    public Status getStatus() {
        return status;
    }

    public void addItem(Item item){
        items.add(item);
    }
	
    public double getSum() {
		return sum;
	}

	public static int getCounter() {
		return counter;
	}

	public long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public String getAddress() {
		return address;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public Manager getManager() {
		return manager;
	}

//	public static void setItems(ArrayList<Item> items) {
//		Order.items = items;
//	}

	public static void setStatus(Status status) {
		Order.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", sum=" + sum + ", restaurantName=" + restaurantName
				+ ", managerName=" + managerName + ", address=" + address + ", restaurant=" + restaurant + ", manager="
				+ manager + "]";
	}
	

}
