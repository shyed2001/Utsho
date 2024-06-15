package BookStore;


public class PaperBook extends Book {

	private int Pages;
	private int Edition; 

	
	public PaperBook(int ID,String Title,String Author,String Publisher,int Year, int Pages, int Edition, double Price)
	{
		super( ID, Title, Author, Publisher, Year, Price);
		this.Pages = Pages;
		this.Edition = Edition; 
		
	}
	
	public String toString()
	{		
		String Print = "\nPaper Book" + "\nID: " + getID() + "\nTitle: " + getTitle() + 
				"\nAuthor: " + getAuthor() + "\tPublisher: " + getPublisher() + 
				"\tYear: " + getYear() + "\nEdition: " + Edition + "\tPages: " + Pages +
				"\nPrice: " + getPrice() ;
		
		return Print; 
	}
	
		
}
