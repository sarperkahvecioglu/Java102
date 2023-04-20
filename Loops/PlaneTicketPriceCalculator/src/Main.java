import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distance;
		int age;
		int roadType;
		double priceEveryKM = 0.10;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the places' distance you wanna go: ");
		distance = scanner.nextDouble();
		
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		
		System.out.println("Enter the road type: ");
		System.out.println("1 - One Way");
		System.out.println("2 - Round Trip");
		roadType = scanner.nextInt();
		
		scanner.close();
		
		if(!(distance > 0 && age > 0 && roadType == 1 || roadType == 2))
			System.out.println("Invalid option.");
		
		double totalCost = distance * priceEveryKM;
		double discountPercentage = 0;
		
		if(age < 12)
			discountPercentage = 50;
		else if(age >= 12 && age < 24)
			discountPercentage = 10;
		else if(age > 65)
			discountPercentage = 30;
			
		double ageDiscountedCost = totalCost - (totalCost * (discountPercentage/100));
		
		int roadTypeDiscountPercentage = 0;
		if(roadType == 1) {
	
			double lastPrice = ageDiscountedCost;
			System.out.println("Final price : " + lastPrice);
		}
		
		else if(roadType == 2) {
			roadTypeDiscountPercentage = 20;
			double lastPrice = (ageDiscountedCost - (ageDiscountedCost * roadTypeDiscountPercentage / 100)) * 2;
			System.out.println("Final price " + lastPrice);
		}
		
		else
			System.out.println("Invalid type.");
		
		
		
		
		
		
	}

}
