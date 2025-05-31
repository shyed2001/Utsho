package Employees;

import java.time.LocalDate;

public class Employee {
	protected String name;
	protected LocalDate dob;
	protected String email;
	protected String mobile;
	protected String address;
	
	
	public Employee(String name, LocalDate dob, String email, String mobile, String address) {
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + "]";
	}
	
	public String getContactInfo() {
		return "Contact info \nemail: " + email + ", mobile: " + mobile + ", address: " + address;
	}


	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
