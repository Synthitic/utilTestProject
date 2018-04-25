import java.util.Random;
import java.util.Scanner;

public class gambleGame {
	private static Scanner x = new Scanner(System.in);
	private static double y;

	
	public static void playGame(double t) {
		int a = 0;
		y = t;
		y = game(y);
		//System.out.println("Enter in -2 to stop playing. Any other integer to keep going.");
		//a = askInputInt("Enter in -2 to stop playing. Any other integer to keep going.");
		a = x.nextInt();
		while (a != -2) {
			y = game(y);
			//a = askInputInt("Enter in -2 to stop playing. Any other integer to keep going.");
			a = x.nextInt();
		}
	}

	private static double game(double u) {
		double w = -1;
		int choice = 0;
		int num = 0;
		int winner = 0;
		double gain = 0;
		boolean win = false;

		final double bAndRWinGain = 1.9;
		final double gWin = 14.0;
		Random r = new Random();
		while (w == -1) {
			System.out.println("Enter how much you would like to gamble. (Can not be greater than what you have)");
			w = x.nextDouble();
			if (w > u) {
				System.out.println("Invalid input, please try again.");
				w = -1;
			}
		}
		u -= w;

		System.out.println("Enter 1 for black (x1.9), 2 for red (x1.9), and 3 for green (x14).");
		choice = x.nextInt();

		num = r.nextInt(24);

		if (num == 0) {
			winner = 3;
		} else if (num % 2 == 0) {
			winner = 2;
		} else if (num % 2 != 0) {
			winner = 1;
		}
		if (winner == 1) {
			System.out.println("Black is the winning choice!");
		} else if (winner == 2) {
			System.out.println("Red is the winning choice!");
		} else if (winner == 3) {
			System.out.println("Green is the winning choice!");
		}
		if (choice == winner) {
			win = true;

			if (choice == 1) {
				u += w * bAndRWinGain;
				gain = (w * bAndRWinGain) - w;
			} else if (choice == 2) {
				u += w * bAndRWinGain;
				gain = (w * bAndRWinGain) - w;
			} else if (choice == 3) {
				u += w * gWin;
				gain = (w * gWin) - w;
			}
			System.out.println("You win! You have won " + gain + "!" + " You now have a balance of " + u);
		} else if (choice != winner) {
			win = false;
			System.out.println("You lose! You have lost " + w + " and have a balance of " + u);

		}
		System.out.println("Enter in -2 to stop playing. Any other integer to keep going.");
		return u;
	}

	/*private Boolean isType(String testStr, String type) {
		try {
			if (type.equalsIgnoreCase("int")) {
				Integer.parseInt(testStr);
			}
			return true;
		} catch (Exception e) {
			return false;
		}

	}*/
	/*public int askInputInt(String informationText) {
		Boolean error = false;
		String userInp = "";
		do {
			System.out.print(informationText);
			userInp = x.nextLine();
			if (!this.isType(userInp, "int")) {
				error = true;
				System.err.println("Error: must be an integer.");
			} else {
				error = false;
			}
		} while (error == true);
		return Integer.parseInt(userInp);
	}*/
}
