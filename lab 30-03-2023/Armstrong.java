package basic_java;

//WAP to print armstrong number from 1 to 1000

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,b, sum = 0;
        
		System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n != 0)
            {
                b = n % 10;             // to separate digit  
                sum = sum + (b * b * b);//calculate sum of each digit wit length times
                n = n / 10;
            }
            if(sum == i)// compare sum of no with current no
            {
                System.out.println(i);
            }
            sum = 0;
        }

	a=153;
		
		System.out.println(n=a%10);

	}

}
