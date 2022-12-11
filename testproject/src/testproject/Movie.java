package testproject;

public class Movie {
	
	String title;
	String studio;
	String rating;
	
	public Movie(String title, String studio, String rating) {
		super();
		this.title = title;
		this.studio = studio;
		this.rating = rating;
		
		
	}

	public Movie(String title, String studio) {
		super();
		this.title = title;
		this.studio = studio;
		rating = "PG";
	}
	

}
