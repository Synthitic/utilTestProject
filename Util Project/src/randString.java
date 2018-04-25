import java.util.Random;

public class randString {

	public static void randString(String s) {
		String sA = "";
		Random r = new Random();
		int z = 0;
		StringBuilder sb = new StringBuilder(s);
		for(int x = 0; x < s.length(); x++) {
			
			
			z = r.nextInt(sb.length());
			
			sA += sb.substring(z, z+1);
			sb.deleteCharAt(z);
		}
		System.out.println(sA);
	}

}
