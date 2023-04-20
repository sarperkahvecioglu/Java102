import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of integers you want to sort: ");
		int size = scanner.nextInt();
		int[] list = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter number " + (i+1) + ": ");
			list[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list.length; j++) {
				if(list[i] < list[j]) {
					int temporaryValue = list[i];
					list[i] = list[j];
					list[j] = temporaryValue;
				}
			}
				
		}
		scanner.close();
		
		System.out.println("Sorted list: ");
		
		for(int number : list) {
			System.out.print(number + " ");
		}
		
		
		
	}

}
