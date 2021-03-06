package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import com.compan.Customer;
import com.compan.Order;
import com.compan.Status;
import domain.food.Item;

public class OrderManager  {
	private HashMap<String, Order> currentOrders;  
	private OrdersArchive archive;   
	
	public OrderManager() {
		//this.orders = new ArrayList<>(); 
		this.archive = new OrdersArchive();
		this.currentOrders = new HashMap<>(); 
	}
	
	public void processOrder(Restaurant restaurant , Customer customer, Item item){
		Order order = new Order(restaurant, restaurant.getManager()); 
		if(orderExists(customer.getUsername())) {
			currentOrders.get(customer.getUsername()).addItem(item);
		} else {
			order.addItem(item);
			currentOrders.put(customer.getUsername(), order);
		}
	}
	
	private boolean orderExists(String username) {
		for (Entry<String, Order> name : currentOrders.entrySet()) {
		    if(name.getKey().equals(username)){
		    	return true;
		    }
		}
		return false; 
	}
	
	public HashMap<String, Order> getCurrentOrders() {
		return currentOrders;
	}
	
	public void showOrders(){
		currentOrders.forEach((key,value) -> {
			System.out.println(key + " ordered:  " ); 
			for (Item item : value.getItems()){
				System.out.println(item.getName()  + "......." +  item.getPrice());
			}
			System.out.println();
		});
	}
	
	public ArrayList<Order> getOrdersByCustomer(String userName){
		ArrayList<Order> ordersByName = new ArrayList<>(); 
		for (Entry<String, Order> element : currentOrders.entrySet()) {
		    if(element.getKey().equals(userName)){
		    	ordersByName.add( element.getValue()); 
		    }
		}
		return ordersByName; 
	}
	
	public void checkForFinishedOrders(){
		currentOrders.forEach((key,value) -> {
			if(isFinished(value)){
				saveToArchive(value);
			}
		});
	}
	
	public boolean isFinished(Order order){
		if(order.getStatus() == Status.FINISHED ){
			return true; 
		}
		return false; 
	}
	
	//If an order is finalized we send it to the archive 
	public void saveToArchive(Order order) {
		archive.addToList(order);
	}
	
	public Order findByIdFromArchive(int id) {
		Order order = (Order) archive.findById(id);
		return order ; 
	}
	
	public ArrayList<Order> sortOrdersByMaxTotal(){
		ArrayList<Order> sorted = new ArrayList<>(); 
		for (Entry<String, Order> element : currentOrders.entrySet()) {
		    	sorted.add( element.getValue()); 
		}
		 Collections.sort(sorted);
		 return sorted; 
	}
	
	//TODO
//	public ArrayList<Customer> sortByHighestSpendingCustomers(){
//	
//	}	
		
	public void sortOrdersByMostFrequentlyBoughtFood(){
		//find the customer
	}
	//find the customer with the most orders
	
	//find orders by day , on which days we have the most orders
}
