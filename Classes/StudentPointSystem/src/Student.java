
public class Student {
	
	private String name;
	private String stuNo;
	private int classes;
	private Course math;
	private Course physics;
	private Course chem;
	private double average;
	private boolean hasPassed;
	
	public Student(String name, int classes, String stuNo, Course math, Course physics, Course chem) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.math = math;
		this.physics = physics;
		this.chem = chem;
		this.average = calcAverage();
		this.hasPassed = hasPassed();
	}
	

	
	public String getName() {
		return name;
	}



	public String getStuNo() {
		return stuNo;
	}



	public int getClasses() {
		return classes;
	}



	public Course getMath() {
		return math;
	}



	public Course getPhysics() {
		return physics;
	}



	public Course getChem() {
		return chem;
	}



	public double getAverage() {
		return average;
	}



	public boolean isHasPassed() {
		return hasPassed;
	}



	public void addBulkExamNote(int mat, int fizik, int kimya) {
		
		if(this.math.note >= 0 && this.math.note <= 100)
			this.math.note = mat;
		
		if(this.physics.note >= 0 && this.physics.note <= 100)
			this.physics.note = fizik;
		
		if(this.chem.note >= 0 && this.chem.note <= 100)
			this.chem.note = kimya;
	}
	
	public boolean hasPassed() {
		
		return calcAverage() >= 55;
		
	}
	
	private double calcAverage() {
		
		double average = (this.math.note + this.physics.note + this.chem.note) / 3 ;
		return average;
	}
	
	public void printNote() {
		
		System.out.println("Your math note: " + math.note);
		System.out.println("Your physics note: " + physics.note);
		System.out.println("Your chem note: " + chem.note);
		System.out.println("Your average: " + calcAverage());
		System.out.println("Your passing situation: " + hasPassed());
	}
	
	
	

}
