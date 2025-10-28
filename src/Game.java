import java.util.Scanner;
import java.util.Random;

class Game {
	
	/**
	 * Checks if the first number is greater than the second.
	 * @param number1 the first number to compare
	 * @param number2 the second number to compare
	 * @return true if number1 > number2, otherwise false
	 */
	public static boolean isGreater(int number1, int number2) {
		return number1 > number2;
	}
	
	
	/**
	 * Asks the player whether they want to play the game.
	 * Keeps prompting until the user enters "oui" or "non".
	 * 
	 * @param scan the Scanner used for user input
	 * @param prompt the question to display to the user
	 * @return the validated user input ("oui" or "non")
	 */
	public static String askToPlay(Scanner scan, String prompt) {
		System.out.println(prompt);
		String userInput = scan.next().toLowerCase().trim();
		
		// Loop until the user enters a valid answer
		while (!(userInput.equals("oui")) && !(userInput.equals("non"))) {
		    System.out.println("Réponse invalide, merci de choisir oui ou non !");
		    System.out.println(prompt);
		    userInput = scan.next().toLowerCase().trim();
		}
		return userInput;
		
	}
	
	/**
	 * Asks the user to enter a valid integer between 1 and 100.
	 * Continues to prompt until the user provides a valid number.
	 * 
	 * @param scan the Scanner used for user input
	 * @param prompt the message to display before asking for input
	 * @return a valid integer between 1 and 100 (inclusive)
	 */
	public static int askAvailableNumber(Scanner scan, String prompt) {
		int number;
		
		// Infinite loop that breaks only when input is valid
		while (true) {
				System.out.println(prompt);
				
				// Check if the next token is an integer
				if (!scan.hasNextInt()) {
					System.out.println("Veuillez entrer un nombre entier.");
					scan.next();
					continue;
				}
				
				number = scan.nextInt();
				
				// Check that the number is within the valid range
				if (number < 1 || number > 100) {
					System.out.println("Le nombre doit être compris entre 1 et 100 inclus.");
					continue;
				}
				
				break; 
			}
			
			return number;
	}
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String playGame;
		int userNumber;
		int numberToFind;
		int count;
		
		// Game introduction
		System.out.println("Bonjour, le but du jeu est simple, vous devez retrouver le chiffre mystère !!");
		
		// Ask if the player wants to start
		playGame = askToPlay(scan, "Souhaitez-vous jouer à mon jeu ? oui/non ");
		
		// Main game loop
		while(playGame.equals("oui")) {
			
			// Generate random number between 1 and 100
			numberToFind = rand.nextInt(100) + 1;
			
			// Initialize attempt counter (first guess counts as 1)
			count = 1;
			
			// System.out.println(numberToFind);
		
			// Ask user for the first guess
			userNumber = askAvailableNumber(scan, "Choisissez un chiffre entre 1 et 100");
			
			// Repeat until the correct number is found
			while(userNumber != numberToFind) {
				userNumber = askAvailableNumber(scan, ("Saisissez une valeur plus " + 
				(isGreater(numberToFind, userNumber) ?  "grande" : "petite")));
				
				// Increment the attempt counter
				count  += 1;
			}
			
			// User guessed correctly
			System.out.println("Bravo vous avez trouvé le chiffre mystère " + numberToFind + " -> en " + count + " coups.");
			
			// Ask if the player wants to play again
			playGame = askToPlay(scan, "Voulez-vous rejouer ? ");

		}
		// End of the game
		System.out.println("Le jeu est terminé !!");
		scan.close();
	}
}