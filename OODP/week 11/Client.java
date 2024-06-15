package BookStore;

public class Client {

	private int ClientID;
	private String Name;
	private String Status;
	private double Discount; 
	
	public void setID(int ID)
	{
		this.ClientID = ID; 
	}
	
	public void setName(String Name)
	{
		this.Name = Name; 
	}
	
	public void setStatus(String Status)
	{
		this.Status = Status; 
		setDiscount();
	}
	
	private void setDiscount()
	{
		if (Status.equals("Active"))
			Discount = 0.05;
		else if (Status.equals("VIP"))
			Discount = 0.1; 
		else
			Discount = 0; 
	}
	
	public double getDiscount()
	{
		return Discount; 
	}
	
	public String toString()
	{
		return "\nID: " + this.ClientID +
				"\tNAME: " + this.Name +
				"\nSTATUS: " + this.Status + 
				"\tDISCOUNT: " + (this.Discount*100) + "%"; 
	}
}
