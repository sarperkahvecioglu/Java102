import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double enteredNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		enteredNumber = scanner.nextDouble();
		scanner.close();
		
		System.out.println("Even numbers from 0 to " + (int) enteredNumber + ": ");
		
		for(int i = 0; i <= enteredNumber; i++) {
			
			if(i % 2 == 0)
				System.out.println(i + " ");
			else 
				continue;
		}
		
		
		
		
		
	}

}
