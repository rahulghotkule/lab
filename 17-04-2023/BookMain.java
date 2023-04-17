package bookapplication;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bService=new BookService();
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("welcome to book management system");
		System.out.println("press :\n) to create book \n"
				+"2)to get all book details\n"
				+"3) to get book details using id\n"
				+"4)to get book detais using name\n"
				+"5)to exit ");
		System.out.println("==============================");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			bService.createBook();
			System.out.println();
			break;
			
		case 2:
			bService.getAllBookDetails();
			System.out.println();
			break;
			
		case 3:
			bService.getBookDEtailsById();
			System.out.println();
			break;
		case 4:
			bService.getBookDetailByName();
			System.out.println();
			break;
		case 5:
			System.out.println("Thank you for visiting!");
		    System.exit(0);
		    
		    break;
		default:
			System.out.println("Invalid choice");
			
		}
		
		}while(true);
		
	}

}
