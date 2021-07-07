package partTwo;
import java.util.ArrayList;

public class Paper {
	private String title;
	private int year;
	private ArrayList<Researcher> authorList = new ArrayList<Researcher>();
	private Conference conf;
	
	public Paper(String title, int year) {
		this.title = title;  
		this.year = year;
	}
	
	public void addAuthor(Researcher author) {
		authorList.add(author);
	}
	
	 public String toString(){
		  return title + ". " + authorList.get(0) + ", " + conf + " "+ year;  
	}  
	 
	
	public void display() {
		  System.out.print("Paper: " + title +"\n" + "Authors: " +authorList.get(0) +
				  "\n" + "Conference: " + conf +" "+ year);  
	}
}
