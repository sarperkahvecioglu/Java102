
public class Circle extends Shape implements Drawable{

	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public void draw(String color) {
		System.out.println("Circle drawn  at ( " + getX() + ", " + getY() + " ), with radius " + this.radius + 
				" and color " + color);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	
}
