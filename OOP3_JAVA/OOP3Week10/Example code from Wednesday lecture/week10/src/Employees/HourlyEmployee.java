package Employees;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	private float hourlyRate;

	public HourlyEmployee(String name, LocalDate dob, String email, String mobile, String address, float hourlyRate) {
		super(name, dob, email, mobile, address);
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [name=" + name + ", dob=" + dob + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + ", hourlyRate=" + hourlyRate + "]";
	}

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
}
