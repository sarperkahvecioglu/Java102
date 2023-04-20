import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		num2 = scanner.nextInt();
		
		System.out.println("Enter third number: ");
		num3 = scanner.nextInt();
		
		scanner.close();
		
		if(num1 < num2 && num1 < num3) {
			if(num2 < num3)
				System.out.println(num1 + " " + num2 + " " + num3);
			else
				System.out.println(num1 + " " + num3 + " " + num2);
		}
		
		else if(num2 < num1 && num2 < num3) {
			if(num1 < num3)
				System.out.println(num2 + " " + num1 + " " + num3);
			else
				System.out.println(num2 + " " + num3 + " " + num1);
		}
		
		else if(num3 < num1 && num3 < num2) {
			if(num1 < num2)
				System.out.println(num3 + " " + num1 + " " + num2);
			else
				System.out.println(num3 + " " + num2 + " " + num1);
		}
		
	}

}
