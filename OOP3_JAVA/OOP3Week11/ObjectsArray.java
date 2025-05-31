package week10;

public class ObjectsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// menu class object- 2
		Course aCourse= new Course("Bachelors of Information Technology","BIT123",100);
		
		// menu items objects -40
		Student s1=new Student("K200950","Bruno",8500,"Abc street");
		Student s2= new Student("K200905","Sankalpa", 8700, "hig street");
		Student s3= new Student("K200865","Nischal", 8550, "git Street");
		Student s4=new Student("K200778", "Siddartha", 8765, "jig street");
		Student s5= new Student("K190356","Sankosh",8986,"leekSteert");
		
		System.out.println(aCourse.toString());
		// population
		aCourse.addStudent(s1);
		aCourse.addStudent(s2);
		aCourse.addStudent(s3);
		aCourse.addStudent(s4);
		aCourse.addStudent(s5);
		
		System.out.println(aCourse.toString());
		
		
		
		
		
		
		
	}

}
