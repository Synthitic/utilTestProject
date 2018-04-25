
public class stringReverse {
	public static void stringReverse(String s) {
		String sA = "";
		for(int x = 0; x < s.length(); x++) {
			sA += s.substring(s.length() - 1 - x, s.length() - x);
		}
		System.out.println(sA);
	}
}
