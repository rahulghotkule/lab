//WAP to print pattern using * (half pyramid)
package basic_java;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c;
		
        for(r=1;r<=5;r++)
        {
        	for(c=1;c<=r;c++)//in half pyramid value of row is equal to the value of column
        	{
        		System.out.print(" *");
        	}
        	System.out.println("");
        }
	}

}
