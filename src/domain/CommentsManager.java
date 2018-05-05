package domain;

import java.util.ArrayList;

public class CommentsManager implements ICRUD  {
	private ArrayList<IAddable> allComments ;
	
	public CommentsManager() {
		super();
		this.allComments = new ArrayList<>();
	}

	public IAddable findById(int id){
		IAddable found = new Comment();
		for (IAddable comment : allComments){
			if(  ((Comment) comment).getId() == id ){
				found = comment ; 
			} 
		}
		return found;
	}
	
	@Override
	public void displayAll() {
		for (IAddable comment : allComments) {
			System.out.println( ((Comment) comment).getTimestamp() + " ->  " +  
					"author:  "  + ((Comment) comment).getAuthorName()  + ":  " + 
					((Comment) comment).getContent());
		}
	}

	@Override
	public void addToList(IAddable obj) {
		allComments.add(obj); 
	}

	@Override
	public void deleteFromList(int id) {
		int indexToDelete = 0;
		for (IAddable comment : allComments){
			if( ((Comment) comment).getId() == id ){
				indexToDelete =  allComments.indexOf(comment);
			} 
		}
		allComments.remove(indexToDelete);  
	}
	
	public ArrayList<IAddable> findByName(String userName) {
		ArrayList<IAddable> found = new ArrayList<>(); 
		for (IAddable comment : allComments) {
			if (((Comment) comment).getAuthorName().equals(userName)){
				found.add(comment); 
			} 
		}
		return found;
	}
	
	public ArrayList<IAddable> getAllComments() {
		return allComments;
	}
	
}
