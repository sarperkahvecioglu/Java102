import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		boolean willContinue = true;
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while(willContinue) {
			
			System.out.println("Enter number: ");
			int newValue = scanner.nextInt();
			
			if(newValue % 2 == 0) {
				if(newValue % 4 == 0) {
					sum += newValue;
				}else
					continue;
			}
			else
				break;
			
		}
		scanner.close();
		
		System.out.println("The sum of entered even and divisible by 4 numbers : " + sum);
		
	}

}
