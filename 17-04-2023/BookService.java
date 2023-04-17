package bookapplication;
import java.util.Scanner;

public class BookService {
	
	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	
//create book method
	public static void createBook()
	{
		System.out.println("Enter book id:");
		int id=sc.nextInt();
		sc.nextLine();
		boolean flag=false;
		//check id is alredy exist or not
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookId()==id)
			{
				
				flag=true;
				break;
				
			}
		}
		if(flag==false)
		{
		
		
		System.out.println("enter book name:");
		String bname=sc.nextLine();
		
		System.out.println("enter book price:");
		double price=sc.nextDouble();
		
		book[index]=new Book(id, bname, price);
		index++;
		System.out.println("book detail created successfully");
		}
		else {
			System.out.println("book id is alrady exist");
		}
		}
	//get all book details method
	public static void getAllBookDetails()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("book id:"+book[i].getBookId());
			System.out.println("book name:"+book[i].getBookName());
			System.out.println("book name:"+book[i].getBookPrice());
			System.out.println("==============================");
			
		}
	}
	//get book details based on id
	public static void getBookDEtailsById()
	{
		System.out.println("enter id to search:");
		boolean flag=false;
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookId()==id)
			{
				System.out.println("book details are:");
				System.out.println("book id:"+book[i].getBookId());
				System.out.println("book id:"+book[i].getBookName());
				System.out.println("book id:"+book[i].getBookPrice());
				System.out.println("=================================");
				flag=true;
				break;
			}
			else
			{
				if(flag==false)
					System.out.println("Book not found!!");
			}
		}
	}
		//get book detail using name
		public static void getBookDetailByName()
		{
			System.out.println("enter name to search:");
			boolean flag=false;
			sc.nextLine();
			String bname=sc.nextLine();
			for(int i=0;i<index;i++)
			{
				if(book[i].getBookName()!=bname)
				{
					System.out.println("book details are:");
					System.out.println("book id:"+book[i].getBookId());
					System.out.println("book id:"+book[i].getBookName());
					System.out.println("book id:"+book[i].getBookPrice());
					System.out.println("=================================");
					flag=true;
					break;
				}
				else
				{
					if(flag==false)
						System.out.println("Book not found!!");
				}
			}
		
	}
}
