package domain;

import java.util.ArrayList;

public interface IFind extends IFindByName {
		
		public ISearchable findById(int id); 
		
		//public ISearchable findByName(String name); 
		
		public ArrayList<ISearchable> findByType(Type type); 
}
