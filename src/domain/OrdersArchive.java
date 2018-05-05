package domain;

import java.io.File;
import java.util.ArrayList;


public class OrdersArchive implements ICRUD {
	private File file; 
	private ArrayList<IAddable> archive ;
	
	public OrdersArchive(){
		super();
		this.archive = new ArrayList<>(); 
		//this.file = new File("ordersArchive.txt");
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		
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


//NOTES 
/*
 * Data to be generated beforehand
 * skip serialization for now 
 * 
 * 
 */


