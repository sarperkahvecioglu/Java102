
public class Employee {
	
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	private int currentYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.currentYear = 2021;
	}
	
	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}
	
	public int getWorkHours() {
		return this.workHours;
	}
	
	public int getHireYear() {
		return this.hireYear;
	}
	
	public int getCurrentYear() {
		return this.currentYear;
	}
	
	
	public double tax() {
		if(this.salary < 1000) {
			return 0;
			
		}else if(this.salary >= 1000) {
			
			return this.salary * (3d/100);}
		else
			return 0;
		
	}
	
	
	public double bonus() {
		if(this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}else
			return 0;
	}
	
	
	public double raiseSalary() {
	
		int workedYears = this.currentYear - this.hireYear;
		
		if(workedYears < 10) {
			return this.salary * (5d/100);
			
		}else if(workedYears >= 10 && workedYears < 20) {
			return this.salary * (10d/100);
			
		}else if(workedYears > 19) {
			return this.salary * (15d/100);
			}
		else
			return 0;
		
		
		
	}
	
	
	public String toString() {
		return  "Name: " + this.name + "\n" +
				"Salary: " + this.salary + "\n" +
				"Working hours: " + this.workHours + "\n" +
				"Hire Year: " + this.hireYear + "\n" +
				"Tax: " + tax() + "\n" +
				"Bonus amount: " + bonus() + "\n" +
				"Salary Raise: " + raiseSalary() + "\n" +
				"Taxes and Bonuses included salary: " + (this.salary + bonus() - tax()) + "\n" +
				"Total salary: " + (raiseSalary() + this.salary);
				
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
