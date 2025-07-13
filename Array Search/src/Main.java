import java.util.Scanner;

public class Main {
	 	public static void main(String[] args) {
	 		 
	 // ADDING USER INPUT TO AN ARRAY
	 		Scanner scanner = new Scanner(System.in);
	 		
	 		int[] numbers = {1, 2, 4, 6, 88, 143, 266, 753};
	 		String target;
	 		String[] fruits = {"Abacaxi", "Pera", "Maçã", "Uva", "Laranja"};
	 		boolean isFound = false;
	 		
	 		System.out.print("What fruit do you want to find?: ");
	 		target= scanner.next();
	 				
	 		for(int i = 0; i < fruits.length; i++) {
	 			if(fruits[i].equals(target)) {
	 				System.out.println("Element found at the index: " + i);
	 				isFound = true;
	 				break;
	 				} 
	 			}
	 		if(!isFound) {
	 			System.out.println("Element is not part of the array.");
	 			}
	 		
	 		
	 		
	 		scanner.close();
	 		
	 		}

		}