package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import com.compan.Customer;
import com.compan.Order;
import com.compan.Status;
import domain.food.Item;

public class OrderManager  {
	//private Order order;
	private HashMap<String, Order> currentOrders;  
	private OrdersArchive archive;   
	//private List<Order> orders;  // current orders , sill open 
	
	public OrderManager() {
		//this.orders = new ArrayList<>(); 
		this.archive = new OrdersArchive();
		this.currentOrders = new HashMap<>(); 
	}
	
	public void processOrder(Restaurant restaurant , Customer customer, Item item){
		System.out.println(restaurant.getManager());
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
		    	//System.out.println(element.getValue());
		    	ordersByName.add( element.getValue()); 
		    	//ordersByName.add((Order) currentOrders.values()); 
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
	
	public void saveToArchive(Order order) {
		archive.addToList(order);
	}
	
	public Order findByIdFromArchive(int id) {
		Order order = (Order) archive.findById(id);
		return order ; 
	}
	
//	public void getAllOrdersFromArchive(){
//		// fills the arrayList here 
//		// now we can work ...
//	}
	
	//findOrderByCustomer
	public void findOrderByCustomer(){
		
	}
	
	public void sortOrdersByMaxTotal(){
		//find the customer
	}
	
	// ??? 
	public void sortOrdersByTypeFood(){
		//find the customer
	}
	//find the customer with the most orders

	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
	}
	
	//find orders by day , on which days we have the most orders
}
