package Arrays;
import java.util.Scanner;
public class AddElementSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20]; 
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of elements upto "+(arr.length-1)+":");
		int size = sc.nextInt(); 
		
			if(size<(arr.length-1))
			{
				System.out.println("Enter "+size+" elements:");
				for (i=0;i<size;i++)
					{
					arr[i]= sc.nextInt();
					} 
			}
			else
			{
				System.out.println("Size cannot be greater than the length of array!!");
				System.exit(0);
			}
		
			
		System.out.println("Array before insertion: "); 
			for(i=0;i<size; i++)
			{
					System.out.print(arr[i]+" ");
			}
		
			
		System.out.println();
		System.out.println("Enter element you want to insert:");
		int num= sc.nextInt();
		System.out.println("Enter the position where you want to insert: ");

		int pos = sc.nextInt();
		if(pos<size+1 && pos>0)

		{

		//making room for new element: shifting 
			for(i=size;i>=pos;i--)
			{
		      arr[i]=arr[i-1];

		    } //inserting new element at the given position 
			arr[pos-1]=num;

		//printing the array after insertion 
			for(i=0;i<=size;i++)

			{

				System.out.print(arr[i]+ " ");
			} 
			System.out.println();
		}
		else
			System.out.println("invalid num");
	}
}


