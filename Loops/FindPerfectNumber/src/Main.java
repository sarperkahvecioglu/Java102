import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteredNumber;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		enteredNumber = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < enteredNumber; i++) {
			if(enteredNumber % i == 0)
				sum += i;
			else 
				continue;
		}
		
		if(sum == enteredNumber) {
			System.out.println("Perfect Number!");
		}else
			System.out.println("Not perfect number!");
		
	}

}
