
public abstract class Vehicle {
	
	private String vehicleID;
	private String monthOfSale;
	private String cityOfSale;
	private int productionYear;
	private double vat;
	
	public Vehicle(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, double vat) {
		this.vehicleID = vehicleID;
		this.monthOfSale = monthOfSale;
		this.cityOfSale = cityOfSale;
		this.productionYear = productionYear;
		this.vat = vat;
	}
	
	public abstract double calculateSct();
	public abstract double calculateTotalPrice();

	public String getVehicleID() {
		return vehicleID;
	}

	public String getMonthOfSale() {
		return monthOfSale;
	}

	public String getCityOfSale() {
		return cityOfSale;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public double getVat() {
		return vat;
	}
	
	
	
	
	
}
