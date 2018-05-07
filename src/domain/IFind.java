package domain;

import java.util.ArrayList;

public interface IFind extends IFindByName {
		
		public ISearchable findById(int id); 
		
		public ArrayList<ISearchable> findByType(Type type); 
}
