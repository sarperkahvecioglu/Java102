
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fighter marc = new Fighter("Marc" , 10 , 100, 90, 0);
	    Fighter alex = new Fighter("Alex" , 11 , 95, 100, 0);
	    Ring r = new Ring(marc,alex , 90 , 100);
	    r.run();
		
		
	}

}
