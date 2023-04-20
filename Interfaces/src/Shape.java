
public abstract class Shape {
	
	private double x, y;
	
	Shape(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
				
	}
	
	public double getY() {
		return this.y;
	}
	
	public abstract double calculateArea();

}
