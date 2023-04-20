import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, selection;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		n1 = scanner.nextInt();
		
		System.out.print("Enter second number: ");
		n2 = scanner.nextInt();
		
		System.out.println("Enter the operation number you want to do: ");
		System.out.println("1 - Summation");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
		selection = scanner.nextInt();
		scanner.close();
		
		switch(selection) {
		case 1 : System.out.println(n1 + n2);break;
		case 2 : System.out.println(n1 - n2);break;
		case 3 : System.out.println(n1 * n2);break;
		case 4 : System.out.println(n1 / n2);break;
		default : break;
		}
		
		
		
	}

}
