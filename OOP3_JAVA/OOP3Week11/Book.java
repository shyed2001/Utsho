package BookStore;


public class Book {

	private int ID;
	private String Title;
	private String Author; 
	private String Publisher;
	private int Year; 
	private double Price; 
	
	
	public Book(int ID,String Title,String Author,String Publisher,int Year, double Price)
	{
		this.ID = ID; 
		this.Title = Title; 
		this.Author = Author; 
		this.Publisher = Publisher;
		this.Year = Year; 
		this.Price = Price; 
	}
	
	
	public int getID()
	{
		return ID;
	}
	
	
	public String getTitle()
	{
		return Title;
	}
	
	public String getAuthor()
	{
		return Author;
	}
	
	public String getPublisher()
	{
		return Publisher;
	}
	
	public int getYear()
	{
		return Year;
	}
	
	public double getPrice()
	{
		return Price; 
	}
	
	
	public String toString()
	{
		return ID +"\n"+Title+"\n"+Author+"\n"+Publisher+"\n"+Year; 
	}
	
}

