
public class Sedan extends Vehicle{
	
	private String roofType;
	private double engineVolume;
	private final double BASE_PRICE = 200000;
	
	
	public Sedan(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String roofType, double engineVolume, double vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, vat);
		this.roofType = roofType;
		this.engineVolume = engineVolume;
	}

	@Override
	public double calculateSct() {
		// TODO Auto-generated method stub
		
		double roofTypeDouble = 1;
		double prodYearDouble = 1;
		
		switch(this.roofType) {
		case "regular" : roofTypeDouble = 0.5;break;
		case "moonroof" : roofTypeDouble = 0.6;break;
		case "sunroof" : roofTypeDouble = 0.8;break;
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
		
		
		double sct = (this.engineVolume * (0.2) * roofTypeDouble) / prodYearDouble;
		
		return sct;
		
		
		
		
	}

	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		
		double total_price = (this.BASE_PRICE) * (1 + (calculateSct() * (0.8))) + (1 + (super.getVat() / 100));
		
		return total_price;
	}

	public String getRoofType() {
		return roofType;
	}

	public double getEngineVolume() {
		return engineVolume;
	}
	
	
	
	
	

}
