import java.util.Scanner;


public class Main {
	 	public static void main(String[] args) {
	 		 
	 		//Mini project - JAVA QUIZ GAME
	 		
	 			String[] questions = {"Question 1", "Question 2", "Question 3"};	 		
	 			String[][] options = {{"Option1", "Option2", "Option3", "Option1"},
	 					{"Option1", "Option2", "Option3", "Option1"},
	 					{"Option1", "Option2", "Option3", "Option1"}};	
	 			int score = 0;
	 			int guess;
	 			int[] answers = {3, 1, 2};
	 			
	 			Scanner scanner = new Scanner(System.in);
	 			
	 			System.out.println("****************");
	 			System.out.println("Welcome to the quiz! ");
	 			System.out.println("****************");

	 			for(int i = 0; i < questions.length; i++) {
	 				System.out.println(questions[i]);
	 				
	 				for(String option : options[i]) {
	 					System.out.println(option);
	 				}
	 				
	 				System.out.print("Enter your guess: ");
	 				guess = scanner.nextInt();
	 				
	 				if(guess == answers[i]) {
	 					System.out.println("************");
	 					System.out.println("CORRECT!");
	 					System.out.println("************");
	 					score ++;
	 				} else {
	 					System.out.println("************");
	 					System.out.println("INCORRECT!");
	 					System.out.println("************");
	 				}
	 			}
	 			
	 				System.out.println("Your final score is " + score + " of" + questions.length);
	 				scanner.close();
	 	}

	}