package basic_java;
import java.util.Scanner;

class Operator{
	public int addition(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mult(int a,int b)
	{
		return a*b;
	}
	public double div(int a,int b)
	{
		return a/b;
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator op=new Operator();
		System.out.println("welcome to our calculater");
		Scanner sc=new Scanner(System.in);
		int a,b;
		do
		{
		System.out.println("which operation you would like to perform?");
		System.out.println("1) addition \n2) substraction\n3)multiplication\n4) division\n5)exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enetr first no:");
			a=sc.nextInt();
			System.out.println("Enetr second no:");
			b=sc.nextInt();
			System.out.println("sum:"+op.addition(a, b));
			break;
		case 2:
			System.out.println("Enetr first no:");
			a=sc.nextInt();
			System.out.println("Enetr second no:");
			b=sc.nextInt();
			System.out.println("difference:"+op.sub(a, b));
			break;
		case 3:
			System.out.println("Enetr first no:");
			a=sc.nextInt();
			System.out.println("Enetr second no:");
			b=sc.nextInt();
			System.out.println("mult:"+op.mult(a, b));
			break;
		case 4:
			System.out.println("Enetr first no:");
			a=sc.nextInt();
			System.out.println("Enetr second no:");
			b=sc.nextInt();
			System.out.println("div:"+op.div(a, b));
			break;
		case 5:
			System.exit(0);
			break;
			default:
				System.out.println("invalid case!");
		
		
		}
		}while (true);
		

	}

}
