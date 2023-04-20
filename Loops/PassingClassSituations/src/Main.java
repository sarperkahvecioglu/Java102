import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double math, physics, english, chemistry, music;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your math point: ");
		math = scanner.nextDouble();
		
		System.out.println("Enter your physics point: ");
		physics = scanner.nextDouble();
		
		System.out.println("Enter your english point: ");
		english = scanner.nextDouble();
		
		System.out.println("Enter your chemistry point: ");
		chemistry = scanner.nextDouble();
		
		System.out.println("Enter your music point: ");
		music = scanner.nextDouble();
		
		scanner.close();
		
		double total = math + physics + english + chemistry + music;
		double average = total / 5;
		
		System.out.println("Average: " + average);
		
		
	}

}
