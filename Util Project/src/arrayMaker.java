import java.util.Random;

public class arrayMaker {
	public static void makeArray (int choice, int lowerBound, int upperBound, int dimx, int dimy) {
		Random r = new Random();
		int b[];
		int c[][];
		if (choice == 1) {
			int a[] = new int[dimx];
			b = a;
			for (int x = 0; x < b.length; x++) {
				int randomNum = r.nextInt(upperBound) + lowerBound;
				b[x] = randomNum;
				System.out.print(b[x] + " ");
			}
		} else if (choice == 2) {
			int a[][] = new int[dimx][dimy];
			c = a;
			for (int x = 0; x < c.length; x++) {
				for (int y = 0; y < c[0].length; y++) {
					int randomNum = r.nextInt(upperBound) + lowerBound;
					c[x][y] = randomNum;
					System.out.print(c[x][y] + " ");
				}
				System.out.println();
			}
		}
		
		
		
		
	}
}
