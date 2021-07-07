package partTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Index {
	
	private HashMap<String,HashSet<Entry>> index = new HashMap<String,HashSet<Entry>>();
	private HashSet<String> entryTokens;
	private HashSet<Entry> entries;
	
	public void indexDB(ArrayList<Entry> db) { // get all the entry objects
		for (Entry entry: db) {
			entryTokens = entry.getTokens();

			for (String token: entryTokens) {
				if (index.get(token) == null) {
					entries = new HashSet<Entry>(); 
					entries.add(entry);
					index.put(token, entries);
				}else {
					entries = index.get(token);
					entries.add(entry);
					index.put(token, entries);
				}
			}
			entryTokens.clear();
		}
	}
	
	public void printIndex() {
		System.out.println("The Entry Index: ");

		for (String key: index.keySet()){  
			System.out.println(key+ " = " + index.get(key).toString());
		} 
	}

}
