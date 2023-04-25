import java.util.ArrayList;

public class SalesRecord {
	
	private FileIO file;
	private ArrayList<Vehicle> vehicleArray;
	private ArrayList<Vehicle> sedanArray;
	private ArrayList<Vehicle> hatchbackArray;
	private ArrayList<Vehicle> minivanArray;
	private ArrayList<Vehicle> pickupArray;
	private ArrayList<Vehicle> bicycleArray;
	
	public SalesRecord() {
		file = new FileIO();
		vehicleArray = file.readFile();
		sedanArray = new ArrayList<>();
		hatchbackArray = new ArrayList<>();
		minivanArray = new ArrayList<>();
		pickupArray = new ArrayList<>();
		bicycleArray = new ArrayList<>();
		seperateArrays();
	}
	
	
	public void seperateArrays() {
		
		
		
		for(Vehicle v : this.vehicleArray) {
			char firstLetter = v.getVehicleID().charAt(0);
			
			switch(firstLetter) {
			case 'S' : sedanArray.add((Sedan) v);break;
			case 'H' : hatchbackArray.add((Hatchback) v);break;
			case 'M' : minivanArray.add((Minivan) v);break;
			case 'P' : pickupArray.add((Pickup) v);break;
			case 'B' : bicycleArray.add((Bicycle) v);break;
			default : break;
			}
			
		}
		
		
	}


	public ArrayList<Vehicle> getSedanArray() {
		return sedanArray;
	}


	public ArrayList<Vehicle> getHatchbackArray() {
		return hatchbackArray;
	}


	public ArrayList<Vehicle> getMinivanArray() {
		return minivanArray;
	}


	public ArrayList<Vehicle> getPickupArray() {
		return pickupArray;
	}


	public ArrayList<Vehicle> getBicycleArray() {
		return bicycleArray;
	}


	public ArrayList<Vehicle> getVehicleArray() {
		return vehicleArray;
	}
	
	public void displayArray(ArrayList<Vehicle> arrayList) {
		
		for(Vehicle v : arrayList) {
			
			System.out.println("\nVehicle: " + v.getClass() + " Vehicle ID: " + v.getVehicleID() +
					" Month: " + v.getMonthOfSale() + " City: " + v.getCityOfSale() + " Production Year: " +
					v.getProductionYear() + " SCT: " + v.calculateSct() + "\n" + 
					"The total price paid for " + v.getVehicleID() + " is" + v.calculateTotalPrice() + "TL\n" );
			
		}
		
	}
	
	
	
	

}
