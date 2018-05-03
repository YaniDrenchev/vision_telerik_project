package domain.dao;

import java.util.ArrayList;
import java.util.List;

import domain.Type;

public abstract class Finder {
		protected List<ISearchable> list ; 
		
		public abstract void displayAll(); 
		
		public abstract ISearchable findById(int id); 

		public abstract ISearchable findByName(String name); 

		public abstract ArrayList<ISearchable> findByType(Type type); 

}
