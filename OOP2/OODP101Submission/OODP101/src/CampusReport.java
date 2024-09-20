import java.util.ArrayList;
import java.util.Scanner;

/**
 * The CampusReport class is the driver class for generating a report on people attending campus on a particular day as per user's search input.
 */
public class CampusReport {
    static ArrayList<People> peopleList = new ArrayList<>();

    public static void main(String[] args) {
        
        peopleList.add(new Admins("Jason", "AD01", "1234567890", "Enrolment", "Managing records"));
        peopleList.add(new Admins("Carla", "AD02", "0987654321", "Higher Education", "Supervising courses"));
        peopleList.add(new Admins("David", "AD03", "1122334455", "Reception", "Front desk"));
        
        peopleList.add(new Student("John", "ST01", "2233445566", "BIT", 6));
        peopleList.add(new Student("Riley", "ST02", "3344556677", "BACT", 5));
        
        peopleList.add(new TeachingStaff("Frank", "TC01", "4455667788", "full-time"));
        peopleList.add(new TeachingStaff("Bobby", "TC02", "5566778899", "part-time"));
        
        Scanner scanner = new Scanner(System.in);
        String inputDay;
        
        while (true) {
            System.out.print("\nEnter the day (e.g., Monday, Tuesday) or type 'Quit' to exit: ");
            inputDay = scanner.nextLine();
            
            if (inputDay.equalsIgnoreCase("Quit")) {
                System.out.println("\nThank you!");
                break;
            }
            
            boolean flag = false;
            System.out.println("\nPeople attending campus on " + inputDay + ":");
            for (People person : peopleList) {
                for (String day : person.getDaysAttending()) {
                    if (day.equalsIgnoreCase(inputDay)) {
                        String personType = person.getClass().getSimpleName();
                        System.out.println(personType + " - " + person);
                        flag = true;
                        break;
                    }
                }
            }
            
            if (!flag) {
                System.out.println("Sorry! Wrong entry or No one is attending the campus on " + inputDay);
            }
        }
        
        scanner.close();
    }
}
