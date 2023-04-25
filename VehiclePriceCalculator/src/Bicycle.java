
public class Bicycle extends Vehicle{

	private String chainType;
	private String seatPost;
	private final double BASE_PRICE = 10000;
	
	public Bicycle(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String chainType, String seatPost, double vat) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, vat);
		this.chainType = chainType;
		this.seatPost = seatPost;
	}

	@Override
	public double calculateSct() {
		// TODO Auto-generated method stub
		
		double chainTypeDouble = 0;
		double seatPostDouble = 0;
		double monthOfSaleDouble = 0;
		
		switch(this.chainType) {
		case "derailleur": chainTypeDouble = 1.1;break;
		case "onechain" : chainTypeDouble = 1.2;break;
		case "doublechain" : chainTypeDouble = 1.3;break;
		default : break;
		
		}
		
		
		switch(this.seatPost) {
		case "carbonfiber" : seatPostDouble = 0.8;break;
		case "steel" : seatPostDouble = 0.7;break;
		case "aluminum" : seatPostDouble = 0.9;break;
		case "titanium" : seatPostDouble = 0.6;break;
		default : break;
		}
		
		switch(super.getMonthOfSale()) {
		case "January" : monthOfSaleDouble = 0.3;break;
		case "May" : monthOfSaleDouble = 0.4;break;
		case "August" : monthOfSaleDouble = 0.5;break;
		case "October" : monthOfSaleDouble = 0.6;break;
		case "December" : monthOfSaleDouble = 0.7;break;
		default : break;
		}
		
		
		double sct = (chainTypeDouble * seatPostDouble * (0.1)) + monthOfSaleDouble;
		return sct;
		
	}

	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		double totalPrice = (this.BASE_PRICE * (0.9)) * (1 + calculateSct()) + (1 + (super.getVat() / 100));
		return totalPrice;
	}

	public String getChainType() {
		return chainType;
	}

	public String getSeatPost() {
		return seatPost;
	}
	
	
}
