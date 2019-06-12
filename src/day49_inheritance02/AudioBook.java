package day49_inheritance02;

public class AudioBook extends Book {
	
	private double length;
	private String narrator;
	
	public void listen() {
		//Listening to Java book by savitch and narrated by Marufjon
		
		System.out.println("listening to "+ getTitle() + " by "+ getAuthor() + " and narrated by "+ narrator);
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	
	

}
