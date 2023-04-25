
public class Hatchback extends Vehicle{

	private String cityMode;
	private double engineVolume;
	private final double BASE_PRICE = 200000;
	
	public Hatchback(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String cityMode, double engineVolume, double vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, vat);
		this.cityMode = cityMode;
		this.engineVolume = engineVolume;
	}

	@Override
	public double calculateSct() {
		// TODO Auto-generated method stub
		
		double cityModeDouble = 0;
		double prodYearDouble = 0;
		
		switch(cityMode) {
		case "yes" : cityModeDouble = 0.15;break;
		case "no" : cityModeDouble = 0.1;break;
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
		
		double sct = (this.engineVolume * (0.3) * prodYearDouble) + (cityModeDouble);
		return sct;
		
	}

	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		double total_price = (this.BASE_PRICE) * (1 + (calculateSct() * (0.8))) + (1 + (super.getVat() / 100));
		
		return total_price;
	}

	public String getCityMode() {
		return cityMode;
	}

	public double getEngineVolume() {
		return engineVolume;
	}
	
}
