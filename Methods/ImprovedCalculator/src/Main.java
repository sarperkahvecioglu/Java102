import java.util.Scanner;
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean willContinue = true;
		
		while(willContinue) {
			
			System.out.println("1- Addition");
			System.out.println("2- Subtraction");
			System.out.println("3- Multiplication");
			System.out.println("4- Division");
			System.out.println("5- Powered Number");
			System.out.println("6- Factorial");
			System.out.println("7- Mod");
			System.out.println("8- Rectangle area and environment");
			System.out.println("9- Quit\n");
			System.out.println("Enter the number you want to do: \n");
			
			int process = scanner.nextInt();
			
			switch(process) {
			case 1 : addition();break;
			case 2 : subtraction();break;
			case 3 : multiplication();break;
			case 4 : division();break;
			case 5 : poweredNumber();break;
			case 6 : factorial();break;
			case 7 : mod();break;
			case 8 : rectangleAreaAndEnvironment();;break;
			case 9 : System.out.println("Thanks for the process. Have a nice day!");
			willContinue = false;break;
			default: break;
		}
		}
	}

	public static void addition() {
		System.out.println("Enter first number: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int number2 = scanner.nextInt();
		
		System.out.println(number1 + number2);
	}
	
	public static void subtraction() {
		
		System.out.println("Enter first number: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int number2 = scanner.nextInt();
		
		System.out.println(number1 - number2);
	}
	
	public static void multiplication() {
		
		System.out.println("Enter first number: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int number2 = scanner.nextInt();
		
		System.out.println(number1 * number2);
	}
	
	public static void division() {
		
		System.out.println("Enter first number: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int number2 = scanner.nextInt();
		
		System.out.println(number1 / number2);
	}
	
	public static void poweredNumber() {
		
		System.out.println("Enter first number: ");
		int number = scanner.nextInt();
		
		System.out.println("Enter the power of that number: ");
		int power = scanner.nextInt();
		
		
		System.out.println(Math.pow(number, power));
	}
	
	public static void factorial() {
		
		System.out.println("Enter the number you want to get it's factorial: ");
		int number = scanner.nextInt();
		
		int result = 1;
		for(int i = 2; i <= number; i++)
			result *= i;
		
		System.out.println(result);
	}
	
	public static void mod() {
		
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		
		System.out.println("Enter mod: ");
		int mod = scanner.nextInt();
		
		
		System.out.println(number % mod);
	}
	
	public static void rectangleAreaAndEnvironment() {
		System.out.println("Enter short side: ");
		int shortSide = scanner.nextInt();
		
		System.out.println("Enter long side: ");
		int longSide = scanner.nextInt();
		
		System.out.println("Area: " + (shortSide * longSide));
		System.out.println("Environment: " + ((shortSide + longSide) * 2));
		
	}
	
	
}
