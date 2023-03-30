//WAP to print strong number from 1 to 1000
package basic_java;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<1000;i++) {
			checkNumber(i);
		}

	}
    static int fact(int number)   
    {   
        int cal= 1;   
        while (number != 0) {   
            cal= cal * number;   
            number--;   
        }   
        return cal;   
    }   
  
   
    static void checkNumber(int num)   
    {   
        int sum = 0;     
          
        int tempNumber = num;      
          
        
        while (tempNumber != 0) {   
            
            sum = sum + fact(tempNumber % 10);   
  
            
            tempNumber = tempNumber / 10;   
        }   
  
        if(sum == num)  
            System.out.println("Strong number is:"+num);    
    }  

}

