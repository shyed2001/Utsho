/**
 * The Admins class represents administrative staff on the campus.
 * It inherits from the People class and adds department and responsibilities information.
 */
public class Admins extends People {
    private String responsibilities;
    private String department;

    /**
     * Default constructor for Admins class.
     */
    public Admins() {}

    /**
     * Parameterized constructor for Admins class.
     * 
     * @param name            the name of the admin
     * @param id              the ID of the admin
     * @param phoneNumber     the phone number of the admin
     * @param department      the department of the admin
     * @param responsibilities the responsibilities of the admin
     */
    public Admins(String name, String id, String phoneNumber, String department, String responsibilities) {
        super(name, id, phoneNumber, null);
        this.department = department;
        this.responsibilities = responsibilities;
        determineAttendance(department);
    }

    /**
     * Overrides the setDaysAttending method to assign specific days for admins based on their department.
     * 
     * @param department the department of the admin
     */
    @Override
    public void determineAttendance(String department) {
        if (department.equals("Enrolment")) {
            super.setDaysAttending(new String[] { "Monday", "Tuesday" });
        } else if (department.equals("Higher Education")) {
            super.setDaysAttending(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday" });
        } else if (department.equals("Reception")) {
            super.setDaysAttending(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" });
        } else {
            super.setDaysAttending(new String[] { "Unknown Department" });
        }
    }


    /**
     * Overrides the toString method to include department and responsibilities.
     * 
     * @return string representation of Admins object
     */
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Responsibilities: " + responsibilities;
    }
}
