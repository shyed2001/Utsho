package week11;

public class Course {
	private int maximumEnrolment=50;
	private String courseName;
	private String courseNumber;
	private Student[] students = new Student[maximumEnrolment];
	private int numEnrolled=0;
	
	// default values in constructor
	public Course(){
		
	}
	
	// parametrised constructor
	public Course(){
	
	}
	
	//getters for coursename and coursenumber


	//setters for coursename and coursenumber


	
	public void addStudent(Student aStudent){
		students[numEnrolled]=aStudent;
		numEnrolled++;
	}
	
	
	public Student getStudentAt(int anIndex){
		return students[anIndex];
	}
	
	/
	public int numberOfStudents(){
		return numEnrolled;
	}
	
	//method to display all students
	
	public String toString(){
		return courseName + " " + courseName + " has " + numberOfStudents() + " students";
	}
	
	
	}
	
}
	

