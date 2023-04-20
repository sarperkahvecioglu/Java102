import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to know if it's palindrome or not: ");
		isPalindrome(scanner.nextInt());
		scanner.close();
		
		
	}
	
	
	public static void isPalindrome(int number) {
		
		int numberWillBeUsed = number;
		int numberWillBeUsedTwo = number;
		int reverseOfNumber = 0;
		boolean willContinue = true;
		boolean digitWillContinue = true;
		int howManyDigit = 0;
		
		while(digitWillContinue) {
			if(numberWillBeUsedTwo / 10 != 0){
				howManyDigit++;
				numberWillBeUsedTwo /= 10;
			}else {
				howManyDigit++;
				digitWillContinue = false;
			}
			
		}
		
		System.out.println(howManyDigit);
		
		
		
		while(willContinue) {
			reverseOfNumber += (numberWillBeUsed % 10) * (Math.pow(10, (howManyDigit - 1)));
			howManyDigit--;
			numberWillBeUsed /= 10;
			
			if(numberWillBeUsed / 10 == 0) {
				willContinue = false;
			}
			
		}
		
		reverseOfNumber += numberWillBeUsed;
		
		if(reverseOfNumber == number) {
			System.out.println("Palindrome Number!");
		}else
			System.out.println("Not Palindrome Number!");
		
		
	}

}
