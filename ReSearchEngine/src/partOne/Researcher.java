package partOne;
import java.util.ArrayList;

public class Researcher extends Entry{
	private String name;
	private ArrayList<Paper> paperList = new ArrayList<Paper>();
	
	public Researcher(String author) {
		this.name = author;
	}
	
	public void addPaper(Paper paper) {
		paperList.add(paper);
	}
	
	 public String toString(){
		  return name;  
	}  
	 
	@Override
	public void display() {
		  System.out.println("Researcher: " + name);  
		  for (int i =0; i<paperList.size(); i++) {
//			  if (paperList.get(i).equals(name))
			  System.out.println("Paper: " + paperList.get(i).toString());  
		  }
	}
}
