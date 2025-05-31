package week10;

import java.util.ArrayList;

public class Course {
	private int maximumEnrolment=50;
	private String courseName;
	private String courseNumber;
	//private Student[] students = new Student[maximumEnrolment];
	
	private ArrayList<Student> students= new ArrayList<>(maximumEnrolment);
	
	private int numEnrolled=0;
	
	
	// default values in constructor
	public Course(){
		this.courseName="Unknown";
		this.courseNumber="Unknown";
		this.maximumEnrolment=50;
		this.students=new ArrayList<>(maximumEnrolment);
		this.numEnrolled=0;
		
	}
	
	// parametrised constructor
	public Course(String name, String number,int maxEnrollment){
		this.courseName=name;
		this.courseNumber=number;
		this.maximumEnrolment=maxEnrollment;
		this.students=new ArrayList<>(maximumEnrolment);
		this.numEnrolled=0;
	
	}
	
	//getters for coursename and coursenumber
	public String getCourseName(){
		return this.courseName;
	}
	
	public String getCourseNumber(){
		return this.courseNumber;
	}

	//setters for coursename and coursenumber
	public void setCourseName(String name){
		this.courseName=name;
	}
	
	public void setCourseNumber(String number){
		this.courseNumber=number;
	}

	// method to add the objects into the array of objects
	public void addStudent(Student aStudent){
		
		students.add(numEnrolled, aStudent);
		numEnrolled++;
	}
	
	
	public Student getStudentAt(int anIndex){
		return students.get(anIndex);
	}
	
	
	public int numberOfStudents(){
		return numEnrolled;
	}
	
	//method to display all students
	
	public String toString(){
		String output="";
		for(int i=0;i<this.numberOfStudents();i++){
			output="The details of the student no "+(i+1)+"is---------------";
			output=output+students.toString();
					}
		
		
		return output;
		
	}
	
	
	}
	

	

