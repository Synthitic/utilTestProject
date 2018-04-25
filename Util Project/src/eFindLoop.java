import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class eFindLoop {

	public static void eFindLoop(int t) {
		BigDecimal sum = new BigDecimal(0).setScale(t, BigDecimal.ROUND_HALF_UP);
				
				for(int y = 0; y < 5000; y++) {
					//sum = sum.add(BigDecimal.valueOf(1).divide(fact(BigInteger.valueOf(y))));
					sum = sum.add(BigDecimal.ONE.divide(fact(y), t,RoundingMode.HALF_EVEN).setScale(t));
				}
				
				sum.setScale(t);
				//BigDecimal sum1 = new BigDecimal(sum).setScale(x, BigDecimal.ROUND_HALF_UP);
				System.out.println(sum);
	}

	private static BigDecimal fact(int x) {
		BigDecimal fact = BigDecimal.ONE;
		fact.setScale(1, BigDecimal.ROUND_HALF_UP);
		for (int i = 2; i <= x; i++) {
			fact = fact.multiply(BigDecimal.valueOf(i));
		}
		return fact;
	}
}
