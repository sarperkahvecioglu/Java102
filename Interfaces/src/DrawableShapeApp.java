
public class DrawableShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable[] drawables = {new Circle(10,20,15), new Circle(30,20,10), new Rectangle(5,8,8,9)};
		
		for(int i = 0; i < drawables.length; i++) {
			drawables[i].draw(Drawable.RED);
			drawables[i].draw(Drawable.GREEN);
		}
		
		for(int i = 0; i < drawables.length; i++) {
			Shape shape = (Shape) drawables[i];
			System.out.println("Area of " + shape.getClass() + " = " + shape.calculateArea());
		}
		
		
		Drawable s = new Rectangle(5,6,3,4);
		s.draw(Drawable.RED);
		

	}

}
