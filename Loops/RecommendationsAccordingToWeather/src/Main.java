import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temperature;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature: ");
		temperature = scanner.nextDouble();
		
		if(temperature <= 5)
			System.out.println("It's a great weather to ski!");
		else if(temperature > 5 && temperature <= 15)
			System.out.println("Let's go to cinema!");
		else if(temperature > 15 && temperature <= 25)
			System.out.println("It's a great weather to go picnic!");
		else if(temperature > 25)
			System.out.println("Let's go swim!");
		
		
	}

}
