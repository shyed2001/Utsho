package BookStore;
import java.util.*; 

public class Order {
	
	public static void main(String[] args) { 
			
		Scanner input = new Scanner(System.in);
		int ID; 
		String Name, Status; 
		int Choice = -1; 
		boolean Flag = false; 
		double Total = 0, Discount, DisAmount, PayAmount; 
		
		//Creating order arraylist
		ArrayList <Book> Order = new ArrayList<>(); 
		
		//Creating bookstore object
		BookStore Cengage = new BookStore("Cengage","Sydney");
		
		//Creating objects 
		Book TITP = new AudioBook(1, "Ethics", "Fitzroy","Cengage",2016,300, 243,115.59);
		Book JAVA = new AudioBook(2, "Java Programming", "Ferrel","Cengage",2017,450, 350.35,145.60);
		Book CPlus = new PaperBook(3, "C++ Programming", "Stroustrup","Princeton Hill",2018,479,11,215.15);
		Book CARC = new PaperBook(4, "Computer Fundamental", "Tenenbamn","McGrath Hill",2015,275,15,175.59);
		Book CTEC = new PaperBook(5, "Communication as Professional", "Archee","Cengage",2013,195,3,150.0);
		
		//Adding Customer 
		Client Cus = new Client(); 
		System.out.print("\nEnter Client ID: ");
		ID = input.nextInt(); 
		input.nextLine();
		
		System.out.print("\nEnter Clinet Name: ");
		Name = input.nextLine();
				
		System.out.print("\nEnter Client Status(VIP/Active/New): ");
		Status = input.nextLine(); 
		
		//Creating Customer 
		Cus.setID(ID);
		Cus.setName(Name);
		Cus.setStatus(Status);
		
		//Adding books to bookstore 
		Cengage.List.add(TITP);
		Cengage.List.add(CARC);
		Cengage.List.add(JAVA);
		
		//Printing the booklist 
		printstar(); 
		System.out.printf("%25s","BOOK LIST");
		printstar(); 
		System.out.println(Cengage); 
		Iterator<Book> B = Cengage.List.iterator();
		
		while(B.hasNext())
		{			
			System.out.println(B.next()); 
		}
		
		
		//Book Selection
		while(Choice != 0)
		{
			System.out.print("\nEnter Book ID (For Exit Press 0): ");
			Choice = input.nextInt();
			
			if(Choice == 0)
				System.out.println("\nBook Selection is Complete."); 
			else
			{
				Flag = false; 
				for(int i = 0; i < Cengage.List.size(); i++)
				{
					if (Choice == Cengage.List.get(i).getID())
					{
						Total += Cengage.List.get(i).getPrice();
						
						Order.add(Cengage.List.get(i));
						
						System.out.println(Cengage.List.get(i).getTitle() +" -- Added.");
						
						Flag = true; 
					}
				}
				
				if (!Flag)
					System.out.println("\nBook Does Not Exist..");
			}
		}
		
		
		//Printing the Selection
		
		printstar(); 
		System.out.printf("%25s","INVOICE");
		printstar(); 
		
		Iterator<Book> O = Order.iterator();
		while(O.hasNext())
		{			
			System.out.println(O.next()); 
		}
				
		printstar(); 
				
		System.out.println(Cus); 
		Discount = Cus.getDiscount();
		DisAmount = Total * Discount; 
		PayAmount = Total - DisAmount;
		
		printstar();
		System.out.printf("%s: %15.2f","Total",Total); 
		System.out.printf("\n%s: %12.2f","Discount",DisAmount);
		System.out.printf("\n%s: %13.2f","Payable",PayAmount);
		printstar(); 
		
		
		input.close();
	}
	
	public static void printstar()
	{
		System.out.println();
		for(int i = 0 ; i < 50; i++)
			System.out.print("*"); 
		System.out.println();
	}
	
}
