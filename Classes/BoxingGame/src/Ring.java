
public class Ring {
	
	private Fighter f1;
	private Fighter f2;
	private int minWeight;
	private int maxWeight;
	
	public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	public boolean weightCheck() {
		return (f1.getWeight() >= this.minWeight && f1.getWeight() <= this.maxWeight
				&& f2.getWeight() >= this.minWeight && f2.getWeight() <= this.maxWeight);
	}
	
	public void run() {
		
		if(weightCheck()) {
			
			while(f1.getHealth() > 0 && f2.getHealth() > 0) {
				System.out.println("\n-----------NEW ROUND----------\n");
				f2.health = f1.hit(f2);
				if(isWin()) {
					break;
				}
				f1.health = f2.hit(f1);
				if(isWin()) {
					break;
				}
				
				printScore();
			}
			
		}else
			System.out.println("Weights are not appropriate!");
		
	}
	
	public boolean isWin() {
		if(f1.getHealth() <= 0 && f2.getHealth() > 0) {
			System.out.println(f1.getName() + " won the match!");
			return true;
		}
		else if(f1.getHealth() > 0 && f2.getHealth() <= 0) {
			System.out.println(f2.getName() + " won the match!");
			return true;
		}
		
		return false;
	}
	
	
	public void printScore() {
		System.out.println("\n--------------------------\n");
		System.out.println(f1.getName() + " remaining health: " + f1.getHealth());
		System.out.println(f2.getName() + " remaining health: " + f2.getHealth());
		
	}

}
