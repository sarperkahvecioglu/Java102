
public class Minivan extends Vehicle{

	private int numberOfSeats;
	private double engineVolume;
	private final double BASE_PRICE = 200000;
	
	public Minivan(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, int numberOfSeats, double engineVolume, double vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, vat);
		this.numberOfSeats = numberOfSeats;
		this.engineVolume = engineVolume;
	}

	@Override
	public double calculateSct() {
		// TODO Auto-generated method stub
		double numberOfSeatsDouble = 0;
		double prodYearDouble = 0;
		
		switch(this.numberOfSeats) {
		case 4 : numberOfSeatsDouble = 0.1;break;
		case 5 : numberOfSeatsDouble = 0.4;break;
		case 6 : numberOfSeatsDouble = 0.6;break;
		case 7 : numberOfSeatsDouble = 0.8;break;
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
		
		double sct = ((0.6) * prodYearDouble) / (this.engineVolume + numberOfSeatsDouble);
		
		return sct;
		
	}

	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		double total_price = (this.BASE_PRICE) * (1 + (calculateSct() * (0.8))) + (1 + (super.getVat() / 100));
		
		return total_price;
		
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public double getEngineVolume() {
		return engineVolume;
	}
	
}
