package BookStore;


public class AudioBook extends Book {

	private double Size;
	private double Duration; 
	 
	
	public AudioBook(int ID,String Title,String Author,String Publisher,int Year, double Size, double Duration, double Price)
	{
		super( ID, Title, Author, Publisher, Year, Price);
		this.Size = Size;
		this.Duration = Duration; 
		 
	}
	
	public String toString()
	{		
		String Print = "\nAudio Book" + "\nID: " + getID() + "\nTitle: " + getTitle() + 
				"\nAuthor: " + getAuthor() + "\tPublisher: " + getPublisher() + 
				"\tYear: " + getYear() + "\nSize: " + Size + " MB\tDuration: " + Duration +
				" Min\nPrice: " + getPrice(); 
		
		return Print; 
	}

}
