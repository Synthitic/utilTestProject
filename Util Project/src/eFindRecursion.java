import java.math.BigDecimal;
import java.math.BigInteger;

public class eFindRecursion {

	public static void eFindRecursion(int x) {
		//BigDecimal sum = new BigDecimal(0);
		double sum = 0;
		for(int y = 0; y < 25000; y++) {
			//sum = sum.add(BigDecimal.valueOf(1).divide(fact(BigInteger.valueOf(y))));
			sum += 1 / fact(y);
		}
		
		//BigDecimal yes = new BigDecimal(fact(BigInteger.valueOf(10)));
		BigDecimal sum1 = new BigDecimal(sum).setScale(x, BigDecimal.ROUND_HALF_UP);
		System.out.println(sum1);
	}



	private static double fact(double x) {
		/*if (x.equals(0))
			return BigInteger.ONE;
		else
			return (x.multiply(fact(x.subtract(BigInteger.valueOf(1))))); */
		/*if (x.equals(0) || x.equals(1))
            return BigInteger.ONE;
      else
            return x.multiply(fact(x.subtract(BigInteger.ONE)));
            */
		if (x <= 1)
            return 1;
      else
            return x * fact(x - 1);
	}
}
