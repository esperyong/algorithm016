package algorithm016.hash;

import java.util.*;

public class GroupAnagram {
	
    public List<List<String>> groupAnagrams(String[] strs) {
    	
    	Map<String, List> t = new HashMap<String, List>(); 
    	
    	for (int i = 0; i < strs.length; i++) {
    		char[] str = strs[i].toCharArray();
    		Arrays.sort(str);
    		String s = String.valueOf(str);
    		if (!t.containsKey(s)) {
    			t.put(s, new ArrayList<String>());
			}
    		t.get(s).add(strs[i]);
		}

    	return new ArrayList(t.values());
    }

}
