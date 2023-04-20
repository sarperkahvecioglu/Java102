
public class Course {
	
	private String name;
	private String code;
	private String prefix;
	public double note;
	private Teacher teacher;
	
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getPrefix() {
		return prefix;
	}

	public double getNote() {
		return note;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	
	public void addTeacher(Teacher t) {
		
		if(t.getBranch().equals(prefix)) {
			this.teacher = t;
		}
		else
			System.out.println("This teacher is not allowed to give this course!");
		
	}
	
	public void printTeacher() {
		
		if(this.teacher != null) {
			System.out.println("Teacher of this course is " + this.teacher);
		}else
			System.out.println("There is no teacher in this course!");
		
	}
	
	
	

}
