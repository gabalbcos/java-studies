import java.util.Scanner;
import java.util.Random;

public class Main {
	 	public static void main(String[] args) {
	 		
	 		//ROCK PAPER SCISSORS GAME
	 		
	 		// DECLARE VARIABLES
	 		Scanner scanner = new Scanner(System.in);
	 		Random random = new Random();
	 		
	 		String[] choices = {"rock", "paper", "scissors"};
	 		String playerChoice;
	 		String computerChoice;
	 		int score;
	 		String playAgain = "yes";
	 		
	 		
	 		
	 		System.out.println("**************");
	 		System.out.println("Rock, Paper, Scissors Game!");
	 		System.out.println("**************");
	 		
	 		 do {  
		 			System.out.println("**************"); 
		 			System.out.println("Choose Rock, Paper or Scissors: ");
			 		System.out.println("**************");
			 		playerChoice = scanner.nextLine().toLowerCase( );
		 			 
			 		computerChoice = choices[random.nextInt(3)];
	 				System.out.println("Computer choice: " + computerChoice);
	 				
			 		
		 			if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
		 					System.out.println("Invalid choice");
		 					continue;
		 			}
		 				
		 			
		 				if(playerChoice.equals(computerChoice)) {
		 					System.out.println("It's a tie!");
		 				}
		 				else if(playerChoice.equals("rock") && computerChoice.equals("scissors") || playerChoice.equals("paper") && computerChoice.equals("rock") || playerChoice.equals("scissors") && computerChoice.equals("paper")) {
		 					System.out.println("You win!");
		 				}
		 				else {
		 					System.out.println("You lose!");
		 				}
		 				
		 				System.out.println("Play Again (yes/no): ");
		 				playAgain = scanner.nextLine().toLowerCase();
	 		 			
	 		 } while(playAgain.contains("yes"));
	 			
	 		 	System.out.println("Thanks for playing!");
	 		 
	 		 	scanner.close();
	 		 	
	 	}
} 		
	 		
	 		
	 		// GET CHOICE FROM THE USER
	 		// GET RANDOM CHOICE FOR THE COMPUTER
	 		// CHECK WIN CONDITIONS
	 		// ASK TO PLAY AGAIN
	 		// GOODBYE MESSAGE

	 	
	 	
