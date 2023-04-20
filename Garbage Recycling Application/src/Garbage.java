
/***
 * 
 * CENG 112 - Homework1
 * 
 * @author Mehmet Sarper Kahvecioğlu 270201035
 * 
 * @author Umut Baris Urem 270201049
 * 
 * 
 */

public class Garbage {

	private String name;
	private String type;

	public Garbage(String name, String type) {
		this.name = name;
		this.type = type;

	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String toString() {

		return "Garbage name: " + this.getName() + "\n" + "Garbage type: " + this.getType() + "\n";

	}

	public boolean equals(Object obj) {

		if (obj == this)
			return true;
		else if (!(obj instanceof Garbage))
			return false;

		Garbage garbage = (Garbage) obj;

		return this.name.equals(garbage.name) && this.type.equals(garbage.type);

	}

}
