package basic_java;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to calculate factorial of no.:");
		int num=sc.nextInt();
		int i,fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of no "+num+" is:"+fact);

	}

}
