import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteredYear;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		enteredYear = scanner.nextInt();
		
		scanner.close();
		
		if(enteredYear % 4 == 0) {
			if(enteredYear % 100 == 0 && enteredYear % 400 != 0) {
				System.out.println("Not leap year!");
			}
			else
				System.out.println("Leap year!");
		}
		else
			System.out.println("Not leap year!");
			

	}

}
