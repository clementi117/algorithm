import java.util.HashSet;
import java.util.Set;

public class longest {
	private static int N (String s) {
		Set<Character> hs = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		
		while(i<s.length() && j<s.length()) {
			if(!hs.contains(s.charAt(j))) {
				hs.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
			}
			else {
				hs.remove(s.charAt(i++));
				
			}
		}
		
		return ans;
	}
	
	public static void main(String[]args) {
		String s = "abbced";
		String s1 = "bbbbb";
		String s2 = "abcabcd";
		
		
		System.out.println(s + " / " + N(s));
		System.out.println(s1 + " / " + N(s1));
		System.out.println(s2 + " / " + N(s2));

	}
}
