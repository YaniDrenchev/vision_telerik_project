package domain;

import com.compan.Customer;

public class Restaurant implements ISearchable, IAddable, Comparable<Restaurant> {
	private static int counter; 	
	private int id; 
	private String name;
	private Type type; 
	private WorkingStatus workingStatus;   //TODO 
	private String workingHours; 
	private String webSite; 
	private String phone; 
	private String description; 
	private Manager manager; 
	private Double rating ; 
	private String address; 
	private Menu menu; 
	//private Order order; 
	private OrderManager orderManager; 
	private RatingsManager ratingsManager; 
	private CommentsManager commentsManager; 
	//private OrdersArchive ordersArchive; 
	
	public Restaurant() {
		super();
	}
	
	public Restaurant(String name, Type type, String webSite, String phone, String address,  String description) {
		super();
		this.name = name;
		this.type = type;
		this.webSite = webSite;
		this.phone = phone;
		this.description = description;
		this.address = address; 
		this.id = ++counter + 100; 
		this.workingStatus = WorkingStatus.OPEN; 
		this.menu = new Menu(); 
		this.orderManager = new OrderManager();
		this.commentsManager = new CommentsManager(); 
		this.ratingsManager = new RatingsManager();
		this.rating = ratingsManager.getRating(); 
	}
	
	//same as above but with predefined rating, as if the restaurant has existed already , done for demonstration purposes
	public Restaurant(String name, Type type, String webSite, String phone, String address,  String description, Double rating) {
		super();
		this.name = name;
		this.type = type;
		this.webSite = webSite;
		this.phone = phone;
		this.rating = rating; 
		this.description = description;
		this.address = address; 
		this.id = ++counter + 1000; 
		this.workingStatus = WorkingStatus.OPEN; 
		this.commentsManager = new CommentsManager(); 
		this.menu = new Menu(); 
		this.orderManager = new OrderManager(); 
		this.ratingsManager = new RatingsManager(); 
	}
	
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
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
	
	//TODO change the id
	public Order createOrder(Customer customer){
		return new Order(id, this, manager,  customer);
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
	
	//TODO check if the rating from user is in range:  0 -5
	public String getEvaluationFromUser(Double ratingFromUser){
		ratingsManager.addRating(ratingFromUser);
		String msg = "Thanks for the evaluation! Your rating of our service is important to us"; 
		return msg; 
	}
	
	public Double getRating() {
		this.rating = ratingsManager.getRating();
		return rating ; 
	}
	
	//TODO
	public void getCommentFromCustomer(String commentContent, Customer customer) {
		Comment comment = new Comment( customer.getUsername(), commentContent);
		commentsManager.addToList(comment);
	}
	
	public void displayAllCustomerComments(){
		commentsManager.displayAll();
	} 
	
	//For demo purposes , 0.0 rating is boring
	public Double getInitialRating() {
		return this.rating; 
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
