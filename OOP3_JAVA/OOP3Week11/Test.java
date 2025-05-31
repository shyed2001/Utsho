import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Create an instance of the Scanner class for input
		Scanner in = new Scanner(System.in);
		
		//Declare local variables
		double aResult;
		
		//Create an instance of the Course class for OODP101
		Course aCourse = 		
		
		//Display the class in its initial state
		System.out.println(________________);
		
		//Add some students to the class
		//First way is to create an instance of the class and 
		//then add it to the course
		//Complete the following to create a student that
		//represents yourself
		Student me = new Student(____________);
		aCourse.addStudent(_______);
		
		//Alternatively all in one line
		//Add two of your class mates to the Course
		aCourse.addStudent(_______________);
		aCourse.addStudent(_______________);
		
			
		//Display the class after adding three students
		System.out.println(___________________);
		
		//Display the code of the course only

		
		//Display the name of the course only

		

		
		
		
		//Display the names of all of the students
		//Try using System.out.println(aCourse.getStudentAt(i));
		//What does this display?  Where does this information 
		//come from?
		for (int i=0;i < aCourse.numberOfStudents(); i++)
			___________________________________________;
		
		

 		//Display the name and ID of all students
 		for (int i=0;i < aCourse.numberOfStudents(); i++){
			____________________________________;
		}
		

	}

}
