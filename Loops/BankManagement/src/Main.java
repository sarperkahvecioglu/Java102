import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String username, password;
		Scanner scanner = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		boolean willContinue = true;
		
		while(right > 0 && willContinue == true) {
			System.out.println("Enter username: ");
			username = scanner.nextLine();
			
			System.out.println("Enter password: ");
			password = scanner.nextLine();
			
			
			if(username.equals("java") && password.equals("123456")) {
				System.out.println("Welcome to Java Bank!");
				while(willContinue) {
					
					
					System.out.println("Enter the operation you want to do: \n");
					System.out.println("1 - Deposit");
					System.out.println("2 - Withdraw money");
					System.out.println("3 - Balance inquiry");
					System.out.println("4 - Sign out");
					
					select = scanner.nextInt();
					
					switch(select) {
					case 1 : System.out.println("Enter amount of money you want to deposit: ");
							 int depositMoney = scanner.nextInt();
							 balance += depositMoney;break;
					case 2 : System.out.println("Enter amount of money you want to withdraw: ");
							 int withdrawAmount = scanner.nextInt();
							 if(balance >= withdrawAmount) {
								 System.out.println("You succesfull withdrawed");
								 balance -= withdrawAmount;
							 }
							 else
								 System.out.println("There is no such money in account!");
							 break;
					case 3 : System.out.println("You have " + balance + " dollars in your account.");
							 break;
							 
					case 4 : System.out.println("Have a nice day!");
							 willContinue = false;break;
					}
				}
			}
			
			else {
				right--;
				if (right > 0) {
					System.out.println("Your information is wrong!");
					System.out.println("You have " + right + " more chance to log in");
				}else if(right == 0) {
					System.out.println("Your account has been blocked!");
					System.out.println("You should communicate with bank");
				}
				
			}
		
		
	}

	}
	}
