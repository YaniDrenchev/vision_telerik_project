package domain;

import java.util.ArrayList;

import com.compan.Order;

import domain.food.Item;

public class OrdersArchive implements ICRUD, IFindById {
	//private File file; 
	private ArrayList<IAddable> archive ;
	
	public OrdersArchive(){
		super();
		this.archive = new ArrayList<>(); 
		//this.file = new File("ordersArchive.txt");
	}

	@Override
	public void displayAll() {
		for (IAddable orderN : archive) {
			Order order = (Order) orderN ; 
			System.out.println( order.getDate() + " ->  " + order.getId()); 
			for (Item item : order.getItems()) {
				System.out.println(item.getName() +  "....."  +  item.getPrice());
			}
			System.out.println("$" + order.getSum());
		}
	}
	
	public IAddable findById(int id){
		IAddable found = new Order();
		for (IAddable order : archive){
			if( ((Order) order).getId() == id ){
				found = order ; 
			} 
		}
		return found;
	}

	@Override
	public void addToList(IAddable order) {
		archive.add(order);
	}

	@Override
	public void deleteFromList(int id) {
		// TODO Auto-generated method stub
	}

	
	
	
//	@Override
//	public IAddable read() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void write(IAddable order) throws IOException {
//		FileOutputStream f = new FileOutputStream(file);
//		ObjectOutputStream writer = new ObjectOutputStream(f);
//	}
	
//TODO use in the ReportsCreator
//	public void write(Order order) throws IOException {
//		//create a file 
//		FileOutputStream f = new FileOutputStream(file);
//		ObjectOutputStream writer = new ObjectOutputStream(f);
//		System.out.println("in write");
//		
//		//MOCK :  
//		Manager mgr = new Manager("Ivan", "Ivanov"); 
//		// 
//		////save each object on a new line 
//		writer.writeObject(order);
//		//writer.writeObject(mgr);
//		
//		System.out.println("after write");
//		writer.close();
//	}
//	
//	public Order read() throws IOException, ClassNotFoundException{
//		FileInputStream fi = new FileInputStream(file);
//		ObjectInputStream reader = new ObjectInputStream(fi);
//		
//		Order order = (Order) reader.readObject(); 
//		//Manager  order = (Manager) reader.readObject(); 
////		System.out.println(order.getManager().getFirstName());
////		System.out.println(order);
//		
//		return order;
//	}
}



