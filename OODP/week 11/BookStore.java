package BookStore;
import java.util.*; 


public class BookStore {
	
	private String StoreName;
	private String Address; 
	public ArrayList <Book> List = new ArrayList<>(); 
	
	
	public BookStore(String Name, String Address)
	{
		this.StoreName = Name;
		this.Address = Address; 
	}
	
	public String toString()
	{
		return "\nStore Name : " + this.StoreName +
				"\nAddress   : " + this.Address; 
	}

}
