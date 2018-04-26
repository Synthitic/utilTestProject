import java.util.Random;
import java.util.Scanner;

public class blackJack {
	private static Scanner x = new Scanner(System.in);
	private static double y;
	static int cards[][] = new int[13][5]; // card value, spades, clubs, hearts, diamonds

	public static void playGame(double t) {
		int a = 0;
		y = t;
		y = game(y);
		System.out.println("Enter in -2 to stop playing. Any other integer to keep going.");
		// a = askInputInt("Enter in -2 to stop playing. Any other integer to keep
		// going.");
		a = x.nextInt();
		while (a != -2) {

			y = game(y);
			// a = askInputInt("Enter in -2 to stop playing. Any other integer to keep
			// going.");
			System.out.println("Enter in -2 to stop playing. Any other integer to keep going.");
			a = x.nextInt();

		}

	}

	private static double game(double u) {
		double w = -1;
		double orignalU = u;
		while (w == -1) {
			System.out.println("Enter how much you would like to gamble. (Can not be greater than what you have)");
			w = x.nextDouble();
			if (w > u) {
				System.out.println("Invalid input, please try again.");
				w = -1;
			}
		}
		u -= w;
		for (int z = 0; z < cards.length; z++) {
			cards[z][0] = z + 1;
			for (int m = 1; m < cards[0].length; m++) {
				cards[z][m] = 1;
			}
		}
		String humanCardHouse = "";
		String humanCardValue = "";
		String cCardHouse = "";
		String cCardValue = "";
		
		int humanCard1House;
		int humanCard2House;
		int humanCard3House;
		int humanCard1Val = 0;
		int humanCard2Val = 0;
		int humanCard3Val = 0;

		int cCard1House;
		int cCard2House;
		int cCard3House;
		int cCard1Val = 0;
		int cCard2Val = 0;
		int cCard3Val = 0;

		int humanTotalVal = 0;
		int cTotalVal = 0;

		int choice = 0;
		int hitOrStand = 0;

		boolean win = false;
		boolean loseType1 = false;
		boolean loseType2 = false;
		boolean tie = false;
		boolean dealerBust = false;
		boolean winType1 = false;
		boolean winType2 = false;
		boolean splitActivated = false;

		Random r = new Random();
		Random r2 = new Random();

		for (int d = 0; d < 2; d++) {
			boolean notMatch = false;
			int humanHouse = 0;
			int humanVal = 0;

			while (notMatch == false) {
				humanHouse = r.nextInt(4) + 1;
				humanVal = r.nextInt(13) + 1;

				if (cards[humanVal - 1][humanHouse - 1] == 0) {
					notMatch = false;
				} else {
					notMatch = true;
				}
			}
			cards[humanVal - 1][humanHouse - 1] = 0;
			if (humanHouse == 1) {
				humanCardHouse = "Spades";
			} else if (humanHouse == 2) {
				humanCardHouse = "Clubs";
			} else if (humanHouse == 3) {
				humanCardHouse = "Hearts";
			} else if (humanHouse == 4) {
				humanCardHouse = "Diamonds";
			}

			if (humanVal == 1) {
				humanCardValue = "Ace";
			} else if (humanVal == 11) {
				humanCardValue = "Jack";
			} else if (humanVal == 12) {
				humanCardValue = "Queen";
			} else if (humanVal == 13) {
				humanCardValue = "King";
			} else {
				humanCardValue = String.valueOf(humanVal);
			}
			if (humanCardValue == "Jack" || humanCardValue == "Queen" || humanCardValue == "King") {
				humanVal = 10;
			}
			if (d == 0) {
				humanCard1House = humanHouse;
				humanCard1Val = humanVal;
			} else if (d == 1) {
				humanCard2House = humanHouse;
				humanCard2Val = humanVal;
			}

			if (d == 0) {
				System.out.print("You have drawn a " + humanCardValue + " of " + humanCardHouse);
			} else if (d == 1) {
				System.out.println(" and a " + humanCardValue + " of " + humanCardHouse + "!");
			}
		}

		for (int d = 0; d < 2; d++) {
			boolean notMatch = false;
			int cHouse = 0;
			int cVal = 0;

			while (notMatch == false) {
				cHouse = r.nextInt(4) + 1;
				cVal = r.nextInt(13) + 1;

				if (cards[cVal - 1][cHouse - 1] == 0) {
					notMatch = false;
				} else {
					notMatch = true;
				}
			}
			cards[cVal - 1][cHouse - 1] = 0;
			if (cHouse == 1) {
				cCardHouse = "Spades";
			} else if (cHouse == 2) {
				cCardHouse = "Clubs";
			} else if (cHouse == 3) {
				cCardHouse = "Hearts";
			} else if (cHouse == 4) {
				cCardHouse = "Diamonds";
			}

			if (cVal == 1) {
				cCardValue = "Ace";
			} else if (cVal == 11) {
				cCardValue = "Jack";
			} else if (cVal == 12) {
				cCardValue = "Queen";
			} else if (cVal == 13) {
				cCardValue = "King";
			} else {
				cCardValue = String.valueOf(cVal);
			}
			if (humanCardValue == "Jack" || humanCardValue == "Queen" || humanCardValue == "King") {
				cVal = 10;
			}
			if (d == 0) {
				cCard1House = cHouse;
				cCard1Val = cVal;
			} else if (d == 1) {
				cCard2House = cHouse;
				cCard2Val = cVal;
			}
			if (d == 0) {
				System.out.print("The dealer has drawn a " + cCardValue + " of " + cCardHouse + ".");
			} // else if (d == 1) {
				// System.out.print(" and a " + cCardValue + " of " + cCardHouse + "!");
				// }
		}
		humanTotalVal = humanCard1Val + humanCard2Val;

		System.out.println();
		System.out.println("Your card total card value is " + (humanTotalVal) + ".");
		// System.out.println("The dealer has a total card value of " + (cCard1Val +
		// cCard2Val) + ".");

		System.out.println("1 to double your bet, 3 to do nothing");
		choice = x.nextInt();
		if (choice == 1) {
			u -= w;
			w *= 2;
			System.out.println("You have decided to double your bet with a bet of " + w + ".");
		}

		System.out.println("Enter in a 1 to hit and a 2 to stand.");
		hitOrStand = x.nextInt();
		for (hitOrStand = hitOrStand; hitOrStand < 2;) {
			if (hitOrStand == 1) {
				if (humanTotalVal > 21) {
					break;
				} else if (humanTotalVal == 21) {
					break; 
				}
				boolean notMatch = false;
				int humanHouse = 0;
				int humanVal = 0;

				while (notMatch == false) {
					humanHouse = r.nextInt(4) + 1;
					humanVal = r.nextInt(13) + 1;

					if (cards[humanVal - 1][humanHouse - 1] == 0) {
						notMatch = false;
					} else {
						notMatch = true;
					}
				}
				cards[humanVal - 1][humanHouse - 1] = 0;
				if (humanHouse == 1) {
					humanCardHouse = "Spades";
				} else if (humanHouse == 2) {
					humanCardHouse = "Clubs";
				} else if (humanHouse == 3) {
					humanCardHouse = "Hearts";
				} else if (humanHouse == 4) {
					humanCardHouse = "Diamonds";
				}

				if (humanVal == 1) {
					humanCardValue = "Ace";
				} else if (humanVal == 11) {
					humanCardValue = "Jack";
				} else if (humanVal == 12) {
					humanCardValue = "Queen";
				} else if (humanVal == 13) {
					humanCardValue = "King";
				} else {
					humanCardValue = String.valueOf(humanVal);
				}
				if (humanCardValue == "Jack" || humanCardValue == "Queen" || humanCardValue == "King") {
					humanVal = 10;
				}
				humanCard3House = humanHouse;
				humanCard3Val = humanVal;

				System.out.println("You have drawn a " + humanCardValue + " of " + humanCardHouse + ".");
				humanTotalVal += humanCard3Val;
				System.out.println("Your new total card value is " + humanTotalVal + ".");
				if (humanTotalVal > 21) {
					break;
				} else if (humanTotalVal == 21) {
					break; 
				}
				System.out.println("Enter in a 1 to hit and a 2 to stand.");
				hitOrStand = x.nextInt();

			} else if (hitOrStand == 2) {
				System.out.println("You have chosen to stand on your value of cards.");
				break;
			}

		}

		for (cTotalVal = cCard1Val + cCard2Val; cTotalVal < 17;)
			for (int d = 0; d < 1; d++) {
				boolean notMatch = false;
				int cHouse = 0;
				int cVal = 0;

				while (notMatch == false) {
					cHouse = r.nextInt(4) + 1;
					cVal = r.nextInt(13) + 1;

					if (cards[cVal - 1][cHouse - 1] == 0) {
						notMatch = false;
					} else {
						notMatch = true;
					}
				}
				cards[cVal - 1][cHouse - 1] = 0;
				if (cHouse == 1) {
					cCardHouse = "Spades";
				} else if (cHouse == 2) {
					cCardHouse = "Clubs";
				} else if (cHouse == 3) {
					cCardHouse = "Hearts";
				} else if (cHouse == 4) {
					cCardHouse = "Diamonds";
				}

				if (cVal == 1) {
					cCardValue = "Ace";
				} else if (cVal == 11) {
					cCardValue = "Jack";
				} else if (cVal == 12) {
					cCardValue = "Queen";
				} else if (cVal == 13) {
					cCardValue = "King";
				} else {
					cCardValue = String.valueOf(cVal);
				}
				if (humanCardValue == "Jack" || humanCardValue == "Queen" || humanCardValue == "King") {
					cVal = 10;
				}
				cTotalVal += cCard3Val;
			}
		if (humanTotalVal > 21) {
			win = false;
			loseType1 = true;
		} else if (cTotalVal > 21) {
			win = true;
			dealerBust = true;
		} else if (humanTotalVal == 21) {
			win = true;
			winType1 = true;
		} else if (humanTotalVal == cTotalVal) {
			tie = true;
		} else if (humanTotalVal < cTotalVal) {
			win = false;
			loseType2 = true;
		} else if (humanTotalVal > cTotalVal) {
			win = true;
			winType2 = true;
		}

		if (tie == true) {
			System.out.println("You have tied with the dealer, bets returned.");
			u = orignalU;
		} else if (dealerBust == true) {
			System.out.println("The dealer has bust with a score of " + cTotalVal + ", you win.");
			u = orignalU + w * 2;
		} else if (loseType1 == true) {
			System.out.println("You have bust with a score of " + humanTotalVal + ", you lose.");
		} else if (loseType2 == true) {
			System.out.println("The dealer scored higher than you with a card score total of " + cTotalVal
					+ " to your total of " + humanTotalVal + ", you lose.");
		} else if (winType1 == true) {
			System.out.println("You have Blackjack, you win.");
			u = orignalU + w * 2;
		} else if (winType2 == true) {
			System.out.println("You have scored higher than the dealer with a total of " + humanTotalVal
					+ " to the dealer's total of " + cTotalVal + ", you win.");
			u = orignalU + w * 2;
		}
		System.out.println("Your new balance is " + u + ".");
		return u;
	}
}
