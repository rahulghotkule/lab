package Arrays;
import java.util.Scanner;
public class MaxMinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size of array:");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("enter the "+size+"element:");
		for(i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		
		int max=ar[0];
		int min=ar[0];
		for(i=0;i<size;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
			else if(min>ar[i])
				min=ar[i];
			
		}
		
		System.out.println("maximum no in array is:"+max);
		System.out.println("minimum no in afray is :"+min);
		
		
		
		
