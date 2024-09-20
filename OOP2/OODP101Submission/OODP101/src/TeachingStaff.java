/**
 * The TeachingStaff class represents teaching staff on the campus.
 * It inherits from the People class and adds type (full-time/part-time) information.
 */
public class TeachingStaff extends People {
    private String type;

    /**
     * Default constructor for TeachingStaff class.
     */
    public TeachingStaff() {}

    /**
     * Parameterized constructor for TeachingStaff class.
     * 
     * @param name        the name of the staff
     * @param id          the ID of the staff
     * @param phoneNumber the phone number of the staff
     * @param type        the type of staff (full-time or part-time)
     */
    public TeachingStaff(String name, String id, String phoneNumber, String type) {
        super(name, id, phoneNumber, null);
        this.type = type;
        determineAttendance(type);
    }

    /**
     * Overrides the setDaysAttending method to assign specific days for teaching staff based on their type.
     * 
     * @param type the type of teaching staff (full-time or part-time)
     */
    @Override
    public void determineAttendance(String type) {
        if (type.equalsIgnoreCase("full-time")) {
            super.setDaysAttending(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" });
        } else if (type.equalsIgnoreCase("part-time")) {
            super.setDaysAttending(new String[] { "Thursday", "Friday" });
        } else {
            super.setDaysAttending(new String[] { "Unknown Type" });
        }
    }

    /**
     * Overrides the toString method to include the type of teaching staff.
     * 
     * @return string representation of TeachingStaff object
     */
    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}
