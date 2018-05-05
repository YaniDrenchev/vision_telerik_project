package domain;

import java.util.ArrayList;
import java.util.Random;

public class RatingsManager {
	private Double rating; 
	private ArrayList<Double> allRatings ;
	
	public RatingsManager() {
		super();
		this.rating = 0.00 ;
		this.allRatings = new ArrayList<>();
		generateRating();   //for demo purposes only, It is boring to start wiht rests with 0.0 rating each
	}
	
	 private void generateRating() {
		Random ran = new Random();
		int repetitions = ran.nextInt(6) ;
		
		for (int i = 0; i <= 12; i++) {
			Double userRating = (double) ran.nextInt(6) ;  //(double) (ran.nextInt(1) + 5);   
			allRatings.add(userRating); 
		}
	}

	public Double getRating() {
		calculateRating();
		return this.rating;
	}
	
	public void calculateRating(){
		Double sum = 0.0; 
		for (Double Rating : allRatings) {
			sum += Rating; 
		}
		Double avg =  sum / allRatings.size();
		Double res  = (int) Math.round(avg * 100) / (double) 100;  
		this.rating = res;    
	}
	
	public void addRating(double RatingFromUser){
		allRatings.add(RatingFromUser); 
	}
}
