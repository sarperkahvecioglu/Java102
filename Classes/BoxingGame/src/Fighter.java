import java.util.Random;

public class Fighter {
	
	private String name;
	private int damage;
	public int health;
	private int weight;
	double dodge;
	
	public Fighter(String name, int damage, int health, int weight, double dodge) {
		
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;
	}
	
	public int hit(Fighter f) {
		
		System.out.println(this.name + " hits " + f.name);
		
		if(f.dodge()) {
			System.out.println(f.name + " dodged the hit!");
			return f.health;
		}
		
		if(f.health - this.damage <= 0)
			return 0;
			
		return f.health - this.damage;
	}
	
	public boolean dodge() {
		Random random = new Random();
		int number = random.nextInt(100);
		
		return number <= this.dodge;
	}

	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}

	public int getHealth() {
		return health;
	}

	public int getWeight() {
		return weight;
	}

	public double getDodge() {
		return dodge;
	}
	
	
	
	
	
	
}
