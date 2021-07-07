package partTwo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Database {
	private static ArrayList<Entry> entries = new ArrayList<Entry>();
	private static HashSet<String> tokens = new HashSet<String>();
	private static String text;

	static public void createDB(String author, String conf_name, String title, int year) {

		Conference conference = new Conference(conf_name);
		Paper paper = new Paper(title,year);
		Researcher research = new Researcher(author);
		
		paper.addAuthor(research);
		research.addPaper(paper);
		conference.addPaper(paper);
		Entry entry1 = new Entry();
		text = title+" " + author+ " " +conf_name+ " " + year;
		entry1.addText(title);
		entries.add(entry1);
		Entry entry2 = new Entry();
		entry2.addText(text);
		entries.add(entry2);
		text = author+ " " + title;
		Entry entry3 = new Entry();
		entry3.addText(text);
		entries.add(entry3);
		text = conf_name;
		Entry entry4 = new Entry();
		entry4.addText(text);
		entries.add(entry4);

	}
	
	static public void printDB() {
		for (Entry entry : entries) {
			tokens = entry.getTokens();
			System.out.println(tokens);
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
		Index index = new Index();
		index.indexDB(entries);
		index.printIndex();
	}
	

}
