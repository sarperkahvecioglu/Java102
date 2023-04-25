
public class Pickup extends Vehicle{

	private String cabType;
	private String truckBedType;
	private final double BASE_PRICE = 250000;
	
	public Pickup(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String cabType, String truckBedType, double vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, vat);
		this.cabType = cabType;
		this.truckBedType = truckBedType;
	}

	@Override
	public double calculateSct() {
		// TODO Auto-generated method stub
		
		double cabTypeDouble = 0;
		double prodYearDouble = 0;
		double truckBedTypeDouble = 0;
		
		switch(this.cabType) {
		case "regular" : cabTypeDouble = 2.5;break;
		case "extended" : cabTypeDouble = 2.8;break;
		case "crew" : cabTypeDouble = 3;break;
		default : break;
		}
		
		switch(this.truckBedType) {
		case "regular" : truckBedTypeDouble = 0.5;break;
		case "tanker" : truckBedTypeDouble = 0.8;break;
		case "trailer" : truckBedTypeDouble = 1.0;break;
		default : break;
		
		}
		
		int year = super.getProductionYear();
		
		if(year <= 2008 && year >= 2001) {
			prodYearDouble = 1.0;
		}else if(year <= 2017 && year >= 2012) {
			prodYearDouble = 1.2;
		}else if(year <= 2022 && year >= 2018) {
			prodYearDouble = 1.6;
		}
		
		double sct = (truckBedTypeDouble * prodYearDouble) / (cabTypeDouble);
		
		return sct;
		
		
		
	}

	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		
		double total_price = (this.BASE_PRICE) * (1 + (calculateSct() * (0.8))) + (1 + super.getVat());
		return total_price;
		
	}

	public String getCabType() {
		return cabType;
	}

	public String getTruckBedType() {
		return truckBedType;
	}
	
}
