
/***
     * 
     * CENG 112 - Homework1
     * 
     * @author Mehmet Sarper Kahvecioğlu  270201035
     * 
     * @author Umut Baris Urem   270201049
     * 
     * 
     */

public class Display {
	//This class is for reducing code redundancies in main method.
	
	
	
	public void display() {
		
		FileIO f = new FileIO();
		
		TrashCan<Garbage> t = (TrashCan<Garbage>) f.readTrashCan();
		
		
		
		System.out.println("The Trash Can: " + t.getItemCount() + "\n");
		t.displayItems();
		System.out.println("---------------------------------");
		
		f.updateTrashCan(t);
		
		System.out.println("Plastic recycle bin: " + f.getPlastic().getItemCount());
		System.out.println("---------------------------------");
		f.getPlastic().displayItems();
		System.out.println("---------------------------------");
		
		System.out.println("Paper recycle bin: " + f.getPaper().getItemCount());
		System.out.println("---------------------------------");
		f.getPaper().displayItems();
		System.out.println("---------------------------------");
		
		System.out.println("Glass recycle bin: " + f.getGlass().getItemCount());
		System.out.println("---------------------------------");
		f.getGlass().displayItems();
		System.out.println("---------------------------------");
		
		System.out.println("Fabric recycle bin: " + f.getFabric().getItemCount());
		System.out.println("---------------------------------");
		f.getFabric().displayItems();
		System.out.println("---------------------------------");
		
		System.out.println("Metal recycle bin: " + f.getMetal().getItemCount());
		System.out.println("---------------------------------");
		f.getMetal().displayItems();
		System.out.println("---------------------------------");
		
		System.out.println("Organic recycle bin: " + f.getOrganic().getItemCount());
		System.out.println("---------------------------------");
		f.getOrganic().displayItems();
		System.out.println("---------------------------------");
		
		System.out.println("The Trash Can: " + t.getItemCount() + "\n");
		System.out.println("---------------------------------");
		t.displayItems();
		
	}
	

}
