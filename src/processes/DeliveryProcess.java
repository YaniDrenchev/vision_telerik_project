package processes;

import staff.Courier;
import staff.Customer;

public class DeliveryProcess extends GeneralOrderProcess {
	public void findLocation(){};
	
	public void cofirmLocation(){}; 
	
	public void confirmCustomer(){}; // if not in Black List  
	
	public void findCourier(){};// he delivers
	
	public boolean isOrderComplete(Customer customer , Courier courier) {
		return true ;
	}
	
	public void payCourier(){}; 

	public void rateCourier(){};
	
}
