package domain;

import java.security.Timestamp;

public class Order {
	
	private long id;
	private Timestamp timestamp;  // new Timestamp(System.currentTimeMillis()); in the constructor 
	private Status status; 
	private Restaurant restaurant; //get the Restaurant's manager from here 
	private Manager manager; 
	
}
