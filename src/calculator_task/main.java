package calculator_task;
import java.util.Scanner;
public class main {
	private static Scanner sc;

	public static void main(String args[])
	{   float number1 = 0;
	    float number2 = 0;
		cal calc = new cal();
		System.out.println("--------------------");
		System.out.println("SIMPLE CALCULATOR");
		System.out.println("--------------------");
		System.out.println("AVAILABLE OPERATIONS");
	        System.out.println("1.ADDITION");
	        System.out.println("2.SUBTRACTION");
	        System.out.println("3.MULTIPLICATION");
	        System.out.println("4.DIVISION");
	        System.out.println("5.EXIT");
	  
         while(true) {
	    	  try {
	    	     System.out.println("SELECT AN OPTION(1-5)");
	    	     sc = new Scanner(System.in);
	            switch(sc.nextInt())
	    	     {
	    	       case 1:
	    		         System.out.println("please enter first num:");
	    		         number1=sc.nextFloat();
	    		         System.out.println("please enter second num:");
	    		         number2=sc.nextFloat(); 
	    		         System.out.println("sum of "+(int)number1+" + "+(int)number2+" = "+(calc.sum(number1,number2)));
	    		         break;
	    	       case 2:
	    		         System.out.println("please enter first num:");
	    		         number1=sc.nextFloat();
	    		         System.out.println("please enter second num:");
	    		         number2=sc.nextFloat(); 
	    		         System.out.println("difference of "+(int)number1+" - "+(int)number2+" = "+(calc.diff(number1,number2)));
	    	             break;
	    	       case 3:
	    	
	    		         System.out.println("please enter first num:");
	    		         number1=sc.nextFloat();
	    		         System.out.println("please enter second num:");
	    		         number2=sc.nextFloat(); 
	    		         System.out.println("multiplication  of "+(int)number1+" * "+(int)number2+" = "+(calc.mul(number1,number2)));
	    		         break;
	    	       case 4:
	    		         System.out.println("please enter first num:");
	    		         number1=sc.nextFloat();
	    		         System.out.println("please enter second num:");
	    		         number2=sc.nextFloat();
	    		         if(number2==0)
	    		           {
	    			         System.out.println("can't divide by 0");
	    			         break;
	    		           }
	    		         System.out.println("division of "+(int)number1+" / "+(int)number2+" = "+(calc.div(number1,number2)));
	    		         break;
	    	       case 5:
	    		   System.exit(1);
	    		  
	    		  
	    	       default:
	    		          System.out.println("please choose from given options(1-4)");
	    		          break;
	    	     }
	        }
	    	catch(Exception e){
	    		
	    		System.out.println("please enter valid input ");
	    		
	    	}
	}
	

}
}
