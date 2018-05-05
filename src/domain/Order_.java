package domain;
import java.sql.Date;
import java.util.ArrayList;

import com.compan.Customer;
import com.compan.Item;

public class Order_ implements IAddable {
    private static int counter; 	
	private long id;
	private Date date;
    private static ArrayList<Item> items = new ArrayList(); //all items orderd
    private int sum;
    //private long ID = 1000; //specific ID in order to surch for the orders by ID
    private String restaurantName;
    private String managerName;
    private String address;
    private Restaurant restaurant;
    private Manager manager ; 
    // private Status status;   => add status as an eum 
//constructor
    public Order_(Restaurant restaurant, Manager manager,  Customer customer){
        this.restaurant = restaurant ;
        this.manager = manager; 
//    	this.restaurantName = restaurant.getName();
//        this.managerName = restaurant.getName();
        //this.address = restaurant.getAddress();
        items = new ArrayList<Item>();
        sum = 0;
        this.id = ++counter + 1000; 
    }
    //paying the bill and adding the current Order to the current Rest order manager
//    public static void pay(){
//        System.out.println(restaurantName);
//        System.out.println(managerName);
//        for (int i = 0; i < items.size(); i++) {
//            System.out.println(items.get(i).getName());
//            System.out.print(items.get(i).getPrice());
//        }
//        status = Status.COMPLETE;// Complete order
//        rest.OrderManager.saveOrder;
//        rest.addOrder(this);// adding the current order to the ArrayList Orders
//    }
    public static void addItem(Item item){
          items.add(item);
    }
}
