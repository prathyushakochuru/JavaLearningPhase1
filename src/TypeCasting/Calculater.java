package TypeCasting;
import java.util.Scanner;

public class Calculater {

	public Calculater() {
		// TODO Auto-generated constructor stub
	}
	// ** Calculator program ** //

	public static void main(String[] args) 
			
	{
		//variable declaration
		
		double n1;
		double n2;
		double result;
		char op;
		
		//creating scanner class object
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		n1 =s.nextDouble();
		
		System.out.println("Enter second number:");
		n2 =s.nextDouble();
		
		System.out.println("Enter any one operator(+,-,*,/,%):");
		op = s.next().charAt(0);
		// Error handling - Arithmetic operations
		try {
			//calling Calcmethod by passing two user numbers and the input operator char
			
			result = Calcmethod(n1,n2,op);
		
		    System.out.println("Answer : " + result);
		    }
		catch (Exception ex)
		{
			//throws exception
			System.out.println("Error occured- " + ex.getMessage());
		}
		finally {
			System.out.println("Done!");
		}		

	}
	
	//method to perform arithmetic calculations and the result
	//static method in order to directly call from the main method without creating the class object
	
   public static double Calcmethod(double a, double b, char o)
		  
   {
	   double x = 0;
	   //using switch statement to switch from operators based on the user input
	   switch(o)
	   {
	   //Addition
	   case '+' : x = a + b;
	   break;
	   //Subtraction
	   case '-' : x = a - b;
	   break;
	   //Multiplication
	   case '*' : x = a * b;
	   break;
	   //Division
	   case '/' : x = a / b;
	   break;
	   //Modulo - returns the reminder once divided
	   case '%' : x = a % b;
	   break;
	   //adding default case when an error occurs
	   }
	   //returns the result x
	   return x;
   }
}
