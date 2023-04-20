import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int enteredNumber = scanner.nextInt();
		
		for(int i = 0; i < enteredNumber; i++) {
			int num = (2 * i) + 1;
			for(int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}

}
