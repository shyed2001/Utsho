package Employees;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate employeeDOB = LocalDate.of(2000, 5, 25);
		
		Employee myEmployee = new Employee("Elizabeth", employeeDOB, 
				"elizabeth.ditton@kent.edu.au", "0400 000 000", "123 Fake St, Melbourne");
		
		SalariedEmployee salarySam = new SalariedEmployee("Salary Sam", employeeDOB, "not.an.email@fake.io", "0412 345 678", "21 John Road, Footscray", 100000, .7);
		
		System.out.println(salarySam.getName() + " is on annualy: " + salarySam.getActualSalary());
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(myEmployee);
		employeeList.add(salarySam);
		employeeList.add(new HourlyEmployee("Hourly ham", employeeDOB, "N/A", "0498 765 432", "98 Seven St, Vermont", 23.80f));
		
		for (Employee e : employeeList) {
			System.out.println("\nContact details for: " + e.getName() + " of employee type: " + e.getClass());
			System.out.println(e.getContactInfo());
		}

	}

}
