package domain;

import com.compan.Customer;
import com.compan.Manager;

import domain.food.Item;

public class Restaurant implements ISearchable, IAddable, Comparable<Restaurant> {
	private static int counter; 	
	private int id; 
	private String name;
	private Type type; 
	private String workingHours; 
	private String webSite; 
	private String phone; 
	private String description; 
	private Manager manager; 
	private Double rating ; 
	private String address; 
	private Menu menu; 
	private OrderManager orderManager; 
	private RatingsManager ratingsManager; 
	private CommentsManager commentsManager; 
	
	public Restaurant() {
		super();
	}
	
	public Restaurant(String name, Type type, String webSite, String phone, String address,  String description, Manager manager) {
		super();
		this.name = name;
		this.type = type;
		this.webSite = webSite;
		this.phone = phone;
		this.description = description;
		this.address = address; 
		this.id = ++counter + 100; 
		this.menu = new Menu(); 
		this.orderManager = new OrderManager();
		this.commentsManager = new CommentsManager(); 
		this.ratingsManager = new RatingsManager();
		this.rating = ratingsManager.getRating(); 
	}
	
	//same as above but with predefined rating, as if the restaurant has existed already , done for demonstration purposes
//	public Restaurant(String name, Type type, String webSite, String phone, String address,  String description, Double rating) {
//		super();
//		this.name = name;
//		this.type = type;
//		this.webSite = webSite;
//		this.phone = phone;
//		this.rating = rating; 
//		this.description = description;
//		this.address = address; 
//		this.id = ++counter + 1000; 
//		this.commentsManager = new CommentsManager(); 
//		this.menu = new Menu(); 
//		this.orderManager = new OrderManager(); 
//		this.ratingsManager = new RatingsManager(); 
//	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Menu getMenu() {
		return menu;
	}
	
	public OrderManager getOrderManager() {
		return orderManager;
	}
	
	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}
	
	public String getEvaluationFromUser(Double ratingFromUser){
		String msg = ""; 
		if(ratingFromUser >= 0 && ratingFromUser <= 5 ){
			ratingsManager.addRating(ratingFromUser);
			msg = "Thanks for the evaluation! Your rating of our service is important to us"; 
		}else {
			msg = "Rating should be between 0 and 5."; 
		}
		return msg; 
	}
	
	public Double getRating() {
		this.rating = ratingsManager.getRating();
		return rating ; 
	}
	
	
	public void getCommentFromCustomer(String commentContent, Customer customer) {
		Comment comment = new Comment( customer.getUsername(), commentContent);
		commentsManager.addToList(comment);
	}
	
 
//	public void getCommentFromCustomer(String commentContent, String username) {
//		Comment comment = new Comment( username, commentContent);
//		commentsManager.addToList(comment);
//	}
	
	public void displayAllCustomerComments(){
		commentsManager.displayAll();
	} 
	
	public Double getInitialRating() {
		return this.rating; 
	}
	
	public CommentsManager getCommentsManager() {
		return commentsManager;
	}
	
	public void getOrderFromCustomer(Customer customer, Item item){
		orderManager.processOrder(this, customer, item);
	}
	
	@Override
	public int compareTo(Restaurant restaurant) {
		if(rating == restaurant.getInitialRating()){
			return 0; 
		}else if(rating > restaurant.getInitialRating()){
			return -1;
		}else {
			return 1; 
		}	
	}
}
