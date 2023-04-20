import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int enteredNumber = scanner.nextInt();
		int enteredNumber2 = enteredNumber;
		int enteredNumber3 = enteredNumber;
		int digitFinder = 1;
		int sumOfExponentiation = 0;
		
		scanner.close();
		
		while(enteredNumber2 / 10 != 0) {
			digitFinder++;
			enteredNumber2 /= 10;
		}
		
		while(enteredNumber3 / 10 != 0) {
			
			sumOfExponentiation += Math.pow((enteredNumber3 % 10), digitFinder);
			enteredNumber3 /= 10;
		}
		
		sumOfExponentiation += Math.pow(enteredNumber3, digitFinder);
		
	
		
		if(enteredNumber == sumOfExponentiation)
			System.out.println("Armstrong number.");
		else
			System.out.println("Not armstrong number.");
		
		
		
		
		

	}

}
