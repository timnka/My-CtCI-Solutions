import java.util.HashMap;

public class q1_1 {

	public static void main(String[] args) {
		// Implement an algorithm to determine if a string has all unique characters
		// What if you cannot use additional data structures?
		
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		System.out.println("Contains unique characters testing...");
		String one = "asdf";
		System.out.println(one + ": " + uniqueCharacters(one));
		String two = "aabbcc";
		System.out.println(two + ": " + uniqueCharacters(two));
		String three = "Jj";
		System.out.println(three + ": " + uniqueCharacters(three));
	}
	
	
	public static boolean uniqueCharacters(String str) {
		
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			if (mp.containsKey(str.charAt(i)))
				return false;
			else
				mp.put(str.charAt(i), 1);
		}
		
		return true;
	}

}
