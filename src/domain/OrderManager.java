package domain;

import java.util.ArrayList;
import java.util.List;

public class OrderManager  {
	private OrdersArchive archive;  // to be filled from the archive 
	private OrdersReporter report;  //prints a report in a given file type  
	private List<Order> orders; 
	
	public OrderManager() {
		this.orders = new ArrayList<>(); 
		this.archive = new OrdersArchive(); 
	}
	
	public void saveToArchive(Order order) {
		archive.addToList(order);;  
	}
	
	public Order findByIdFromArchive(int id) {
		Order ords = (Order) archive.findById(id);
		//Manager ords = archive.read(); 
		System.out.println(ords);
		return ords ; 
	}
	
	public void getAllOrdersFromArchive(){
		// fills the arrayList here 
		// now we can work ...
	}
	
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
	
	//find orders by day , on which days we have the most orders
	
	//readLineByLineFromFile()
	
	//getAllFromFile() -> fills them in an array , then we perform the operations on the array 
	//
}

////public void acceptOrder(){
////
////}
//
////check if order has status finished 
////serialize 
