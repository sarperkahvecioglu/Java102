
import java.util.Scanner;

public class Display {
	
	private SalesRecord salesRecord;
	Scanner scanner = new Scanner(System.in);
	
	public Display() {
		salesRecord = new SalesRecord();
	}
	
	
	public void display() {
		
		
		boolean willContinue = true;
		
		while(willContinue) {
			System.out.println("Please press,");
			System.out.println("1 to see all sold vehicles list");
			System.out.println("2 to see all sold sedan list");
			System.out.println("3 to see all sold hatchback list");
			System.out.println("4 to see all sold minivan list");
			System.out.println("5 to see all sold pickup list");
			System.out.println("6 to see all sold bicycle list");
			System.out.println("7 to exit.");
			System.out.println("\nPlease enter your choice: ");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1 : salesRecord.displayArray(salesRecord.getVehicleArray());break;
			case 2 : salesRecord.displayArray(salesRecord.getSedanArray());break;
			case 3 : salesRecord.displayArray(salesRecord.getHatchbackArray());break;
			case 4 : salesRecord.displayArray(salesRecord.getMinivanArray());break;
			case 5 : salesRecord.displayArray(salesRecord.getPickupArray());break;
			case 6 : salesRecord.displayArray(salesRecord.getBicycleArray());break;
			case 7 : System.out.println("Program closed!"); willContinue = false;break;
			}
		}
		
	}
	
	

}
