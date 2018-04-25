import java.util.concurrent.TimeUnit;

public class measureTime {
	
	static long sT;
	static long eT;
	
	public static void measureTime() {
		eT = TimeUnit.NANOSECONDS.toMillis(eT);
		System.out.println("Operation completed in approximately " + eT + " milliseconds.");
		eT = 0;
		sT = 0;
	}
	
	public static void startTime() {
		sT = System.nanoTime();
		
	}
	
	public static void endTime() {
		eT = System.nanoTime() - sT;
	}
	
}
