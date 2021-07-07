package partTwo;
import java.util.ArrayList;

public class Conference {
	private String name;
	private ArrayList<Paper> paperList = new ArrayList<Paper>();
	
	public Conference(String name) {
		this.name = name;
	}
	
	public void addPaper(Paper paper) {
		paperList.add(paper);
	}
	
	 public String toString(){
		  return name;  
	}  
	 
	public void display() {
		  System.out.println("Researcher: " + name);  
		  for (int i =0; i<paperList.size(); i++) {
//			  if (paperList.get(i).equals(conf_name))
			  System.out.println("Paper: " + paperList.get(i).toString());  
		  }
	}
}
