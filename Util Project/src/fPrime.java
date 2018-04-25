import java.math.BigInteger;
import java.util.Random;

public class fPrime {

	public static void fPrime(int t) {
		BigInteger z;
		
		Random rdm = new Random();
		z = BigInteger.probablePrime(t, rdm);
		System.out.println(z.toString());
	}

}
