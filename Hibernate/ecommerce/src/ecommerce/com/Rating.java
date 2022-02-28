package ecommerce.com;

public class Rating {
	
	private String numberOfStars;
	private String rating;
	
	public Rating() {}
	
	public Rating(String numberOfStars, String rating) {
		super();
		this.numberOfStars = numberOfStars;
		this.rating = rating;
	}
	public String getNumberOfStars() {
		return numberOfStars;
	}
	public void setNumberOfStars(String numberOfStars) {
		this.numberOfStars = numberOfStars;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

}
