import java.util.Scanner;

public class FindSumOfOddNumbers {
	
	public static void main(String[] args) {
		
		boolean willContinue = true;
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while(willContinue) {
			
			System.out.println("Enter number: ");
			int enteredNumber = scanner.nextInt();
			
			if(enteredNumber >= 0) {
				if(enteredNumber % 2 == 1)
					sum += enteredNumber;
				else
					continue;
			}
			else {
				willContinue = false;
				System.out.println("The sum of entered odd numbers is : " + sum);
			}
			
			
			
		}
		scanner.close();
		
		
		
	}

}
