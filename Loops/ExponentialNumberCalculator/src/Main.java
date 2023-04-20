import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the floor number: ");
		int floor = scanner.nextInt();
		
		System.out.println("Enter exponential number: ");
		int exponential = scanner.nextInt();
		scanner.close();
		
		System.out.println("The result of " + floor + "^" + exponential + " =  " + Math.pow(floor, exponential));
		
	}

}
