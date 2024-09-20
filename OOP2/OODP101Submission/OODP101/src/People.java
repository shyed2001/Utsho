/**
 * The People class represents a generic person on the campus.
 * It serves as the parent class for Admins, TeachingStaff, and Student classes.
 */
public class People {
    private String name;
    private String id;
    private String phoneNumber;
    private String[] daysAttending;

    /**
     * Default constructor for People class.
     */
    public People() {}

    /**
     * Parameterized constructor for People class.
     * 
     * @param name          the name of the person
     * @param id            the ID of the person
     * @param phoneNumber   the phone number of the person
     * @param daysAttending the days the person is attending the campus
     */
    public People(String name, String id, String phoneNumber, String[] daysAttending) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.daysAttending = daysAttending;
    }

    /**
     * Gets the name of the person.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the ID of the person.
     * 
     * @return the ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the person.
     * 
     * @param id the ID to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the phone number of the person.
     * 
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the person.
     * 
     * @param phoneNumber the phone number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the days the person is attending the campus.
     * 
     * @return an array of days
     */
    public String[] getDaysAttending() {
        return daysAttending;
    }

    /**
     * Sets the days the person is attending the campus.
     * This method can be overridden by child classes for custom logic.
     * 
     * @param daysAttending the array of days to set
     */
    public void setDaysAttending(String[] daysAttending) {
        this.daysAttending = daysAttending;
    }
    
    /**
     * Determines the sub-type for employee and assigns attending days.
     * This method can be overridden by child classes for custom logic.
     * 
     * @param criteria the String of type, department or course
     */
    public void determineAttendance(String criteria) {
    	
    }

    /**
     * Returns a string representation of the person's details.
     * 
     * @return a string with the person's details
     */
    @Override
    public String toString() {
        String days = String.join(", ", daysAttending);
        return "Name: " + name + ", ID: " + id + ", Phone: " + phoneNumber + ", Days Attending: " + days;
    }
}
