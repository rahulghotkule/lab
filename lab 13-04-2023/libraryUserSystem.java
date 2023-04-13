/* A library needs to develop an online application for two types of users/roles, Adults and
children. Both of these users should be able to register an account. Any user who is less than 12
years of age will be registered as a child and they can borrow a “Kids” category book for 10 days,
whereas an adult can borrow “Fiction” category books which need to be returned within 7 days.
Note: In future, more users/roles might be added to the library where similar rules will be enforced.
Develop Interfaces and classes for the categories mentioned above*/

/*Test case #1:
• Create an instance of KidUser class.
• Set the age as specified in the below table and invoke the registerAccount
method of the KidUser object

Age
10
18

• Set the book Type as specified in the below table and invoke the requestBook
method of the KidUser object,

BookType
“Kids”
“Fiction”

Test case #2:
• Create an instance of AdultUser class.
• Set the age as specified in the below table and invoke the registerAccount
method of the AdultUser object

Age
5
23
• Set the book Type as specified in the below table and invoke the requestBook

method of the AdultUser object
BookType
“Kids”
“Fiction”
*/

package inheritance;


interface LibraryUser
{
	void registerAccount();
	void requestBook();
}

class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	
	
	
	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount() {
		if(age < 12) {
			System.out.println("You have Successfully Registered under a Kids Account ");
		}
		
		if(age > 12) {
			System.out.println("Sorry, Age must be less then 12 to register as a kid ");
		}
		
	}

	public void requestBook() {
		if(bookType.equalsIgnoreCase("kids")&&age<=12) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}


class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	
	

	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	
	public void registerAccount() {
		if(age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		
		if(age < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}


	public void requestBook() {
		if(bookType.equalsIgnoreCase("fiction")&&age>12) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	
}

public class libraryUserSystem {

	public static void main(String[] args) {

            //		Test case 1
		KidUsers kid =  new KidUsers(10,"kids"); // set the value
		System.out.println("Kids Age : "+kid.age);
		System.out.println("Book type : "+kid.bookType);
		kid.registerAccount();
		kid.requestBook();
		
		
		
		System.out.println("#########################################################################################");
		
		KidUsers kid2 =  new KidUsers(18,"fiction"); // set the value
		System.out.println("Kids Age : "+kid2.age);
		System.out.println("Book type : "+kid2.bookType);
		kid2.registerAccount();
		kid2.requestBook();
		
		System.out.println("#############################################################################################");
		System.out.println();
           //		Test case 2
		AdultUser adult = new AdultUser(5,"kids"); // set the value
		System.out.println("User Age : "+adult.age);
		System.out.println("User Age : "+adult.bookType);
		adult.registerAccount();
		adult.requestBook();
		
		System.out.println("####################################################################################################");
		System.out.println();
		
		AdultUser adult2 = new AdultUser(23,"fiction"); // set the value
		System.out.println("User Age : "+adult2.age);
		System.out.println("User Age : "+adult2.bookType);
		adult2.registerAccount();
		adult2.requestBook();

		
		
		
	}

}

