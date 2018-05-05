package domain;

import java.sql.Timestamp;

public class Comment implements IAddable {
	private static int counter; 	
	private int id; 
	private Timestamp timestamp; ;
	private String authorName; // == name of customer
	private String content;
	
	public Comment() {
		super();
	}

	public Comment(String authorName, String content) {
		super();
		this.id = ++counter;
		this.authorName = authorName;
		this.content = content;
		this.timestamp =  new Timestamp(System.currentTimeMillis()); 
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public int getId() {
		return id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getContent() {
		return content;
	} 
	
}
