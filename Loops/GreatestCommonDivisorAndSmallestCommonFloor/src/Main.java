import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int secondNumber = scanner.nextInt();
		scanner.close();
		
		
		int smallestNumber = Math.min(firstNumber, secondNumber);
		int biggestNumber = Math.max(firstNumber, secondNumber);
		int biggestCommonDivisor = 1;
		
		for(int i = 1; i <= smallestNumber; i++) {
			if(smallestNumber % i == 0 && biggestNumber % i == 0)
				biggestCommonDivisor = i;
			else
				continue;
		}
		
		System.out.println("Greatest common divisor of these numbers is: " + biggestCommonDivisor);
		

	}

}
