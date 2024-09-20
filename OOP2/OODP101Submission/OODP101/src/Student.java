/**
 * The Student class represents students on the campus.
 * It inherits from the People class and adds course and number of units information.
 */
public class Student extends People {
    private String course;
    private int numberOfUnits;

    /**
     * Default constructor for Student class.
     */
    public Student() {}

    /**
     * Parameterized constructor for Student class.
     * 
     * @param name          the name of the student
     * @param id            the ID of the student
     * @param phoneNumber   the phone number of the student
     * @param course        the course the student is enrolled in
     * @param numberOfUnits the number of units the student is taking
     */
    public Student(String name, String id, String phoneNumber, String course, int numberOfUnits) {
        super(name, id, phoneNumber, null);
        this.course = course;
        this.numberOfUnits = numberOfUnits;
        determineAttendance(course);
    }

    /**
     * Overrides the setDaysAttending method to assign specific days for students based on their course.
     * 
     * @param course the course the student is enrolled in
     */
    @Override
    public void determineAttendance(String course) {
        if (course.equals("BIT")) {
            super.setDaysAttending(new String[] { "Monday", "Tuesday" });
        } else if (course.equals("BACT")) {
            super.setDaysAttending(new String[] { "Wednesday", "Thursday" });
        } else if (course.equals("BBUS")) {
            super.setDaysAttending(new String[] { "Friday" });
        } else {
            super.setDaysAttending(new String[] { "Unknown Course" });
        }
    }


    /**
     * Overrides the toString method to include course and number of units.
     * 
     * @return string representation of Student object
     */
    @Override
    public String toString() {
        return super.toString() + ", Course: " + course + ", Units: " + numberOfUnits;
    }
}
