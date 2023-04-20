import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

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

public class FileIO {

	IBag<Object> plastic = new PlasticRecycleBin<>();
	IBag<Object> paper = new PaperRecycleBin<>();
	IBag<Object> glass = new GlassRecycleBin<>();
	IBag<Object> metal = new MetalRecycleBin<>();
	IBag<Object> organic = new OrganicRecycleBin<>();
	IBag<Object> fabric = new FabricRecycleBin<>();


	
	public IBag<Garbage> readTrashCan() {

        IBag<Garbage> garbageBag = new TrashCan<Garbage>();

  
        File file = new File("garbage.txt"); 
        Scanner scanner = null;

        try {
        	//Reading file
            scanner = new Scanner(file);
            
            //Traveling lines in .txt file
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                
                //Seperating lines by comma and creating objects from that information
                String[] seperatedLine = line.split(",");
                String objectName = seperatedLine[0];
                String objectType = seperatedLine[1];

                int objectNumber = Integer.parseInt(seperatedLine[2].trim());

                Garbage garbage = new Garbage(objectName, objectType);

                //Adding created object to bag according to their existing number
                for(int j = 0; j< objectNumber; j++) {
                    garbageBag.add(garbage);
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return garbageBag;
    }
	
	

	
	//Send items to their own bags according to their types and array sizes from main bag.
	public boolean updateTrashCan(TrashCan<Garbage> trashCan) {

        int counter = trashCan.getItemCount();
        
        //This "a" value stands for indexes when a special type of bag size fulled, a increases by 1 to get other types of objects.
        int a = 0;
        
        //Traveling items in bag
        for(int i = 0; i < counter; i++) {

            if((Garbage) trashCan.getNewList()[a] != null) {
            	
            	Garbage g = (Garbage) trashCan.getNewList()[a];
            	
            	String type = g.getType();

            	//Understand and processing according to type information coming from created object "g"
	            switch(type) {
	
	
	            case "plastic" :
	
	            	
	                if(plastic.contains(null)) {
	                	
	                    plastic.add(g);
	                    trashCan.remove(g);
	  
	                }else {
	                	a++;
	                	continue;
	                }
	
	                break;
	
	
	
	            case "paper" :
	
	            	
	                if(paper.contains(null)) {
	
	                	paper.add(g);
	                    trashCan.remove(g);
	  
	                }else {
	                	a++;
	                	continue;
	                }
	
	                break;
	
	            case "glass" :
	
	            	
	                if(glass.contains(null)) {
	
	                	glass.add(g);
	                    trashCan.remove(g);
	                    
	                    
	
	                }else {
	                	a++;
	                	continue;
	                }
	
	                break;
	
	
	            case "metal" :
	
	            	
	            	
	                if(metal.contains(null)) {
	
	                	metal.add(g);
	                    trashCan.remove(g);
	                    
	                    
	
	                }else {
	                	a++;
	                	continue;
	                }
	                break;
	
	
	            case "organic" :
	
	            	
	                if(organic.contains(null)) {
	
	                	organic.add(g);
	                    trashCan.remove(g);
	                   
	                    
	
	                }else {
	                	a++;
	                	continue;
	                }
	
	                break;
	
	
	            case "fabric" :
	
	            	
	                if(fabric.contains(null)) {
	
	                	fabric.add(g);
	                    trashCan.remove(g);
	                    
	                    
	
	                }else {
	                	a++;
	                	continue;
	                }
	
	                break;
	
	            default : break;
	
	            }
	            
	            }
        }
        
        

        return true;
    }
	
	
	

	public IBag<Object> getPlastic() {
		return plastic;
	}

	public IBag<Object> getPaper() {
		return paper;
	}

	public IBag<Object> getGlass() {
		return glass;
	}

	public IBag<Object> getMetal() {
		return metal;
	}

	public IBag<Object> getOrganic() {
		return organic;
	}

	public IBag<Object> getFabric() {
		return fabric;
	}

}
