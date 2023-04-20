import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int enteredNumber;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		enteredNumber = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("The numbers divisible by 3 and 4 from 0 to " + enteredNumber + ": ");
		for(int i = 0; i < enteredNumber; i++) {
			if(i % 3 == 0 && i % 4 == 0)
				System.out.println(i);
			else 
				continue;
		}
		
	}

}
