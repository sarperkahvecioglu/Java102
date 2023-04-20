import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int randomNumber = random.nextInt(100);
		System.out.println(randomNumber);
		
		Scanner scanner = new Scanner(System.in);
		
		int wrongNumber = 0;
		boolean isTrue = false;
		
		while(!isTrue) {
			
			System.out.println("Enter number between 0 - 99");
			int enteredNumber = scanner.nextInt();
			
			if(enteredNumber < 0 || enteredNumber > 99) {
				System.out.println("Invalid number. Try again.");
				System.out.println("Enter number: ");
				randomNumber = scanner.nextInt();
			}
			else if(enteredNumber != randomNumber) {
				wrongNumber++;
				System.out.println("Wrong guess!");
				if(wrongNumber == 5) {
					System.out.println("Game Over!");
					break;
				}
				else {
					if(enteredNumber < randomNumber) {
						System.out.println("Entered number is less than random number.");
					}else if(enteredNumber > randomNumber) {
						System.out.println("Entered number is bigger than random number.");
					}
					System.out.println("Remaining guess: " + (5 - wrongNumber));
					continue;
				}
			}
			else if(enteredNumber == randomNumber) {
				System.out.println("Congratulations! You guessed it with just " + (wrongNumber + 1) + " times trying!");
				isTrue = true;
			}
		}
		
		scanner.close();
		
		
		
		
		
		
		
	}

}
