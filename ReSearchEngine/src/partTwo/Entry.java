package partTwo;

import java.util.HashMap;
import java.util.HashSet;

public class Entry {
	
	private HashMap<String,Integer> tokenMap = new HashMap<String,Integer>(); 
	private HashSet<String> allTokens = new HashSet<String>();
	
	
	void addText(String initialText) {
		int num;
		// TODO Auto-generated method stub
		String lower = initialText.toLowerCase();
		String[] text = lower.split(" ");
		for (String token : text) {
			if (tokenMap.containsKey(token)) {
				num = tokenMap.get(token) + 1;
				tokenMap.put(token, num);
			}else {
				tokenMap.put(token, 1);
				allTokens.add(token);
			}
		}
		
	}
	public HashSet <String> getTokens(){
		return allTokens;
	}
	
//	public void addToken(String token, int times) {
//		tokenMap.put(token, times);
//	}
}
