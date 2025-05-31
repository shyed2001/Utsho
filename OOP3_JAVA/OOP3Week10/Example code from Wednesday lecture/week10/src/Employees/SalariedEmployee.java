package Employees;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
	private int baseSalary;
	private double fte;
	
	public SalariedEmployee(String name, LocalDate dob, String email, String mobile, String address, int baseSalary,
			double fte) {
		super(name, dob, email, mobile, address);
		this.baseSalary = baseSalary;
		this.fte = fte;
	}
	

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + super.name + ", dob=" + super.dob + ", email=" + super.email + ", mobile=" + super.mobile + ", address="
				+ super.address + ", baseSalary=" + this.baseSalary + ", fte=" + this.fte + "]";
	}
	
	public double getActualSalary() {
		return baseSalary * fte;
	}


	public int getBaseSalary() {
		return baseSalary;
	}

	public double getFte() {
		return fte;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setFte(double fte) {
		this.fte = fte;
	} 
	

}
