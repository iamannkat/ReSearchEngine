package partOne;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
	private static ArrayList<Entry> entries = new ArrayList<Entry>();
	private static HashMap<String,Object> data = new HashMap<String,Object>();
	
	static public void createDB(String author, String conf_name, String title, int year) {

		Conference conference = new Conference(conf_name);
		Paper paper = new Paper(title,year);
		Researcher research = new Researcher(author);

		paper.addAuthor(research);
		research.addPaper(paper);
		conference.addPaper(paper);
		entries.add(research);
		entries.add(conference);
		entries.add(paper);
		data.put(conf_name, conference);
		data.put(title, paper);
		data.put(author, research);
		
	}
	
	static public void printDB() {
		for (Entry entry : entries) {
			entry.display();
		}
	}
	
	public static void main(String[] args) {
//		String[] authors = {"hawkins","staes"};
		String author = "johanssen";
		String conf_name = "KDD";
		String title = "data mining applications";
		int year = 2018;
		createDB(author,conf_name,title,year);
		printDB();
	}
	

}
