
public class Rectangle extends Shape implements Drawable{

	private double width, height;
	
	public Rectangle(double x, double y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	
	public void draw(String color) {
		
		System.out.println("Rectangle drawn with upper-left corner at ( " + getX() + ", " + getY() + " ), with width " + this.width + ", with height " + this.height + 
				" and color " + color);
		
	}
	
	public double calculateArea() {
		return this.width * this.height;
	}


	public double getWidth() {
		return width;
	}


	public double getHeight() {
		return height;
	}
	
	public void as() {
		System.out.println("asd");
	}
	
	
	
	
	
	
	
	
	
}
