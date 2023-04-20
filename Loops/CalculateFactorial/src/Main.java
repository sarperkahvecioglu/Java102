import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to find it's factorial: ");
		int enteredNumber = scanner.nextInt();
		int multiplication = 1;
		
		for(int i = enteredNumber; i > 0; i--) {
			multiplication *= i;
		}
		
		System.out.println("Factorial of entered number is: " + multiplication);

	}

}
