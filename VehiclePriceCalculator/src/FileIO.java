import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
	
	public ArrayList<Vehicle> readFile() {
		
		ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
		File file = new File("HW2_SoldVehicles.csv");
		Scanner scanner;
		
		try {
			scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] seperatedLine = line.split(",");
				
				String vehicleID = seperatedLine[0];
				String monthOfSale = seperatedLine[1];
				String cityOfSale = seperatedLine[2];
				int productionYear = Integer.parseInt(seperatedLine[3]);
				double vat = Double.parseDouble(seperatedLine[6]);
				
				switch(vehicleID.charAt(0)){
				case 'S' : 
					String roofType = seperatedLine[4];
					Double engineVolume  = Double.parseDouble(seperatedLine[5]);
					
					Sedan sedan = new Sedan(vehicleID, monthOfSale, cityOfSale, productionYear, roofType, engineVolume, vat);
					vehicleArrayList.add(sedan);
					break;
				case 'H' : 
					String cityMode = seperatedLine[4];
					Double engineVolumeH  = Double.parseDouble(seperatedLine[5]);
					
					Hatchback hatchback = new Hatchback(vehicleID, monthOfSale, cityOfSale, productionYear, cityMode, engineVolumeH, vat);
					vehicleArrayList.add(hatchback);
					break;
				case 'M' : 
					int numberOfSeats = Integer.parseInt(seperatedLine[4]);
					Double engineVolumeM = Double.parseDouble(seperatedLine[5]);
					
					Minivan minivan = new Minivan(vehicleID, monthOfSale, cityOfSale, productionYear, numberOfSeats, engineVolumeM, vat);
					vehicleArrayList.add(minivan);
					break;
				case 'P' : 
					String cabType = seperatedLine[4];
					String truckBedType  = String.valueOf(seperatedLine[5]);
					
					Pickup pickup = new Pickup(vehicleID, monthOfSale, cityOfSale, productionYear, cabType, truckBedType, vat);
					vehicleArrayList.add(pickup);
					break;
				case 'B' : 
					String chainType = seperatedLine[4];
					String seatPost  = String.valueOf(seperatedLine[5]);
					
					Bicycle bicycle = new Bicycle(vehicleID, monthOfSale, cityOfSale, productionYear, chainType, seatPost, vat);
					vehicleArrayList.add(bicycle);
					break;
				}
				
			}
			
		}catch(FileNotFoundException e) {
			e.getMessage();
			
		}
		
		return vehicleArrayList;
	}
	
	

}
