import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int enteredNumber = scanner.nextInt();
		scanner.close();
		
		for(int i = 0; i < enteredNumber; i++) {
			System.out.println("2^" + i + " = " + Math.pow(2, i));
		}

	}

}
