import java.util.Scanner;

public class Calculator 
{
	static int num1,num2,selection;
	

	public static void main(String args [])
	{
		
	
		
		Calculator.operation();
		
	
	
	
	}
	
	
	static void operation()
	{
		System.out.println("**************************************************");
		
		System.out.println("Enter the First Number : ");
	    
		Scanner sc = new Scanner(System.in);
	    num1  =  sc.nextInt();
	    
	    System.out.println("Enter the 2nd Numbers : ");
	   
	    num2 =  sc.nextInt();
		
	    System.out.println("!!!!Enter the Operation to be Performed ::::");
		System.out.println("Enter 1 for Addition :");	
		System.out.println("Enter 2 for Substraction :");	
		System.out.println("Enter 3 for Multiplication  :");	
		System.out.println("Enter 4 for Division  :");	
	    
		selection=sc.nextInt();
		Calculator.calculate();
	}
	
	static void calculate()
	{
		
		
		switch (selection)
	    {
	        case 1:
	          
	        	System.out.println("Result of Addition  :  \n");
	            System.out.println(num1+num2);
	            Calculator.operation();
	            break;
	            
	        case 2:
	            
	        	System.out.println("Result of Substraction : \n");
	           System.out.println(num1-num2);
	           Calculator.operation();
	            break;
	            
	        case 3:
	            
	            System.out.println(".....Result of Multiplication ...\n");
	            System.out.println(num1*num2);
	            Calculator.operation();
	            break; 
	            
	        case 4:
	            
	        	  System.out.println(".....Result of Division ...\n");
	              System.out.println(num1/num2);  
	              Calculator.operation();
	               break;
	        default:
	            System.out.println("You have made an invalid choice!");
	            break;
	    }
	}
	
}
