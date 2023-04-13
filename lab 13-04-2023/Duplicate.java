package Arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int i,j;
				Scanner sc=new Scanner(System.in);
				System.out.println("enetr the size of array:");
				int size=sc.nextInt();
				int ar[]=new int[size];
				System.out.println("enter the "+size+"element:");
				for(i=0;i<size;i++)
				{
					ar[i]=sc.nextInt();
					
				}
				int count=0;
						
				for(i=0;i<size;i++)
					{
					  for(j=i+1;j<size;j++)
					  {
						  if(ar[i]==ar[j])
						  {
						  count++;
						  break;
						  }
						
					  }
					
				 }
				System.out.println("no of repetade element in array is; "+count);
			
	        }

}
