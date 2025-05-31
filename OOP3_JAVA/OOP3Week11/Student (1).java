package week10;

public class Student {
	private String ID;
	private String name;
	private double fees;
	private String address;
	
	//Default constructor
	public Student(){
		this.ID="Unknown";
		this.name="Unknown";
		this.fees=8500;
		this.address="Unknown";
	}
	
// parametrized constructor
	public Student(String anID, String aName, double aFees, String anAddress){
		this.ID=anID;
		this.name=aName;
		this.fees=aFees;
		this.address=anAddress;
	}
	
	// getter methods
	public String getID(){
		return this.ID;
	}
	
	public String getName(){
		return this.name;
	}
	public double getFees(){
		return this.fees;
	}
	public String getAddress(){
		return this.address;
	}
	
	// setter methods
	public void setId(String anID){
		this.ID=anID;
	}
	public void setName(String aName){
		this.name=aName;
	}
	public void setAddress(String anAddress){
		this.address=anAddress;
	}
	public void setFees(double aFees){
		if(aFees>8500){
			this.fees=aFees;
		}
		else{
			System.out.println("Error!!! you cannot set the value to lower value");
		}
	}
	
	//other methods
	// method overriding
	public String toString(){
		return "Name of the student is: "+this.getName()+"\n"+
				"The ID of the student is: "+this.getID()+"\n"+
				"The address of the student is: "+this.getAddress()+"\n"+
				"The fees of the student is: "+this.getFees();
	}
	
	
	
	
	
	
}
