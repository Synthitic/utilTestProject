import java.math.*;

public class piFind {
	public static void findPI(int x) {

		BigDecimal sum = new BigDecimal((Math.log(Math.pow(5280, 3) * Math.pow((236674 + 30303 * Math.sqrt(61)), 3)+744) / Math.sqrt(427))).setScale(x, BigDecimal.ROUND_HALF_UP);

		//BigDecimal sum2 = new BigDecimal((4 * Math.atan(1))).setScale(x, BigDecimal.ROUND_HALF_UP);
		/*BigDecimal a = new BigDecimal((1.0 / 2.0) * (23 + 4 * Math.sqrt(34))).setScale(200, BigDecimal.ROUND_HALF_UP);
		BigDecimal b = new BigDecimal((1.0 / 2.0) * (19 * Math.sqrt(2) + 7 * Math.sqrt(17))).setScale(200, BigDecimal.ROUND_HALF_UP);
		BigDecimal c = new BigDecimal(429 + 304 * Math.sqrt(2)).setScale(200, BigDecimal.ROUND_HALF_UP);
		BigDecimal d = new BigDecimal((1.0 / 2.0) * (627 + 442 * Math.sqrt(2))).setScale(200, BigDecimal.ROUND_HALF_UP);
		BigDecimal u = new BigDecimal(Math.pow((a.add(BigDecimal.valueOf((Math.sqrt(a.doubleValue() - 1)))).doubleValue()), 2))
				.multiply(BigDecimal.valueOf(Math.pow((b.add(BigDecimal.valueOf((Math.sqrt(b.doubleValue() - 1)))).doubleValue()), 2)))
				.multiply(BigDecimal.valueOf(Math.pow((c.add(BigDecimal.valueOf((Math.sqrt(c.doubleValue() - 1)))).doubleValue()), 2)))
				.multiply(BigDecimal.valueOf(Math.pow((d.add(BigDecimal.valueOf((Math.sqrt(d.doubleValue() - 1)))).doubleValue()), 2)));
		
		BigDecimal sum = new BigDecimal((Math.log(Math.pow((u.multiply(BigDecimal.valueOf(2))).doubleValue(), 6.0)) + 24) / Math.sqrt(3502)).setScale(x, BigDecimal.ROUND_HALF_UP); */
		System.out.println(sum);
		//System.out.println(sum2);
	}
}
