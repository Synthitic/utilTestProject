import java.util.*;

public class util {
	private static int run = 0;
	private static Scanner x = new Scanner(System.in);
	private static int option = -1;

	public static void run() {

		while (run != -1) {
			displayChoices();

			option = x.nextInt();
			x.nextLine();
			if (option == -1) {
				run = option;
			} else if (option == 1) {
				piFind();
			} else if (option == 2) {
				arrayMake();
			} else if (option == 3) {
				stringReverse();
			} else if (option == 4) {
				randString();
			} else if (option == 5) {
				eFindRecursion();
			} else if (option == 6) {
				qSort();
			} else if (option == 7) {
				fPrime();
			} else if (option == 8) {
				eFindLoop();
			} else if (option == 9) {
				gambleGame();
			} else if (option == 10) {
				blackJack();
			}
		}
	}

	private static void displayChoices() {
		System.out.println("Enter the corresponding number as to what you would like to do. (-1 to end)");
		System.out.println("1. Find PI to a number of decimal places.");
		System.out.println(
				"2. Generate and display random array or 2 dim array of int with lower bound and upper bound.");
		System.out.println("3. Take a string and reverse it.");
		System.out.println("4. Take a string and randomly scramble it.");
		System.out.println("5. Find e to a number of decimal places. (Recursion)");
		System.out.println("6. Sort a set of numbers.");
		System.out.println("7. Find a prime number of bitlength x with a 2^-100% chance of being composite.");
		System.out.println(
				"8. Find e to a number of decimal places. (accurate up to n decimal places ± 3, accuracy beyond 1000 not measured) (Loop)");
		System.out.println("9. Gamble against the computer in roulette!");
		System.out.println("10. Play blackjack against the computer.");
	}

	private static void piFind() {
		int t = -1;
		System.out.println("Number of decimal places? (Up to 51 and must be greater than 0)");

		while (t == -1) {
			t = x.nextInt();
			if (t > 51 || t < 1) {
				System.out.println("Invalid input please try again.");
				t = -1;
			}
		}
		measureTime.startTime();
		piFind.findPI(t);
		measureTime.endTime();
		measureTime.measureTime();
	}

	private static void arrayMake() {
		int lowerBound = -1;
		int upperBound = -1;
		int choice = -1;
		int dimx = -1;
		int dimy = -1;

		System.out.println("Enter 1 for 1 dimensional array, 2 for 2 dimensional array.");
		while (choice == -1) {
			choice = x.nextInt();
			if (choice != 1 || choice != 2) {
				System.out.println("Invalid input please try again.");
			}
		}
		System.out.println("Lower bound of int?");
		lowerBound = x.nextInt();
		System.out.println("Upper bound of int?");
		while (upperBound == -1) {
			upperBound = x.nextInt();
			if (upperBound <= lowerBound) {
				System.out.println("Upperbound can not be less than or equal to lowerbound.");
			}
		}
		if (choice == 1) {
			System.out.println("Number of elements? (must be greater than 0)");
			while (dimx == -1) {
				dimx = x.nextInt();
				if (dimx < 1) {
					System.out.println("Invalid input please try again.");
				}
			}
		} else if (choice == 2) {
			System.out.println("Number of rows? (must be greater than 0)");
			while (dimx == -1) {
				dimx = x.nextInt();
				if (dimx < 1) {
					System.out.println("Invalid input please try again.");
				}
			}
			System.out.println("Number of columns? (must be greater than 0)");
			while (dimy == -1) {
				dimy = x.nextInt();
				if (dimy < 1) {
					System.out.println("Invalid input please try again.");
				}
			}
		}
		measureTime.startTime();
		arrayMaker.makeArray(choice, lowerBound, upperBound, dimx, dimy);
		System.out.println();
		measureTime.endTime();
		measureTime.measureTime();
	}

	private static void stringReverse() {
		System.out.println("Input a string to reverse.");
		String s = "";
		s = x.nextLine();
		measureTime.startTime();
		stringReverse.stringReverse(s);
		measureTime.endTime();
		measureTime.measureTime();
	}

	private static void randString() {
		System.out.println("Input a string to scramble.");
		String s = "";
		s = x.nextLine();
		measureTime.startTime();
		randString.randString(s);
		measureTime.endTime();
		measureTime.measureTime();
	}

	private static void eFindRecursion() {
		int t = -1;
		System.out.println("Number of decimal places? (Up to 51 and must be greater than 0)");

		while (t == -1) {
			t = x.nextInt();
			if (t > 51 || t < 1) {
				System.out.println("Invalid input please try again.");
				t = -1;
			}
		}
		measureTime.startTime();
		eFindRecursion.eFindRecursion(t);
		measureTime.endTime();
		measureTime.measureTime();
	}

	private static void qSort() {
		System.out.println(
				"Enter in a set of integers to be sorted in acending order, press enter after each one, -777 to stop.");
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		int a = 0;
		do {
			int t = x.nextInt();
			x.nextLine();
			if (t == -777) {
				a = -777;
			} else {
				arrL.add(t);
			}
		} while (a != -777);
		Integer[] z = new Integer[arrL.size()];
		arrL.toArray(z);
		measureTime.startTime();
		qSort.quickSort(z);
		measureTime.endTime();
		measureTime.measureTime();
	}

	private static void fPrime() {
		System.out.println("Enter in a bitlength (greater than 1, less than 2048)");
		int t = -1;

		while (t == -1) {
			t = x.nextInt();
			if (t < 2 || t > 2048) {
				System.out.println("Invalid input please try again.");
				t = -1;
			}
		}
		measureTime.startTime();
		fPrime.fPrime(t);
		measureTime.endTime();
		measureTime.measureTime();
	}

	private static void eFindLoop() {
		int t = -1;
		System.out.println("Number of decimal places? (Must be greater than 0)");

		while (t == -1) {
			t = x.nextInt();
			if (t < 1) {
				System.out.println("Invalid input please try again.");
				t = -1;
			}
		}
		measureTime.startTime();
		eFindLoop.eFindLoop(t);
		measureTime.endTime();
		measureTime.measureTime();
	}

	private static void gambleGame() {
		double t = -1;
		System.out.println("Enter in starting amount of currency. (must be positive)");
		while (t == -1) {
			t = x.nextDouble();
			if (t < 1) {
				System.out.println("Invalid input please try again.");
				t = -1;
			}
		}
		gambleGame.playGame(t);
	}

	private static void blackJack() {
		double t = -1;
		System.out.println("Enter in starting amount of currency. (must be positive)");
		while (t == -1) {
			t = x.nextDouble();
			if (t < 1) {
				System.out.println("Invalid input please try again.");
				t = -1;
			}
		}
		blackJack.playGame(t);
	}
}