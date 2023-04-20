import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int enteredNumber = scanner.nextInt();
		scanner.close();
		double sum = 0;
		
		for(int i = 0; i <= enteredNumber; i++) {
			sum += (1.0 / (1 + i));
		}
		
		System.out.println("Sum of serial: " + sum);
		
		
	}

}
