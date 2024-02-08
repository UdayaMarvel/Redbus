package git.Sriram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DSection {
	public static void main(String[] args) {
		String name = "My name is Sri Ram";
		Map<Character, Integer>mp = new LinkedHashMap<>();
		char[] cs = name.toCharArray();
		
		for (char c : cs) {
			if (mp.containsKey(c)) {
				Integer x = mp.get(c);
				mp.put(c, x+1);
				
			}
			else {
				mp.put(c, 1);
			}
			
		}
		System.out.println(mp);
		StringBuilder s1 = new StringBuilder();
		Set<Entry<Character, Integer>> entry1 = mp.entrySet();
		for (Entry<Character, Integer> entry : entry1) {
			Character key = entry.getKey();
			if (mp.containsKey(key)) {
				Integer value = mp.get(key);
				s1=s1.append(key).append(value);
				
			}
			
		}
		System.out.println(s1.toString());
		
	}

}
