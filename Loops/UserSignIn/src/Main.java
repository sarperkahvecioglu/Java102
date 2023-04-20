import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName = "admin123";
		String password = "admin456";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String enteredUserName = scanner.nextLine();
		
		System.out.print("Enter password: ");
		String enteredPassword = scanner.nextLine();
		
		
		if(userName.equals(enteredUserName) && password.equals(enteredPassword)) {
			System.out.println("You are in!");
		}
		else if(userName.equals(enteredUserName) && !(password.equals(enteredPassword))) {
			System.out.println("Create new password.");
			System.out.println("Enter new password: ");
			String newPassword = scanner.nextLine();
			
			if(newPassword.equals(password)) {
				System.out.println("Passwords are same. Couldn't change!");
			}
			else
				System.out.println("Password changed!");
		}
		else {
			System.out.println("Your informations wrong! Couldn't signed in.");
		}
		scanner.close();
		
	}

}
