
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course math = new Course("Math", "MATH101", "MATH");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chem = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Sir Jonas", "90550000000", "MATH");
        Teacher t2 = new Teacher("Sir Williams", "90550000001", "PHY");
        Teacher t3 = new Teacher("Sir Evans", "90550000002", "CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", math, physics, chem);
        s1.addBulkExamNote(50,20,40);
        System.out.println(s1.hasPassed());

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physics, chem);
        s2.addBulkExamNote(100,50,40);
        System.out.println(s2.hasPassed());

        Student s3 = new Student("Hayta İsmail", 4, "221121312", math, physics, chem);
        s3.addBulkExamNote(50,20,40);
        System.out.println(s3.hasPassed());

        

	}

}
