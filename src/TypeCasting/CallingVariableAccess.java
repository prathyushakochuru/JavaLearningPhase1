package TypeCasting;
import java.util.Scanner;

public class CallingVariableAccess {

	//Access variables from AccessModifiers class
	public static void main(String[] args) {
		//Create a AccessModifiers class object
		AccessModifiers obj = new AccessModifiers();
		
		//call and print public variable id
		System.out.println("Public variable : ID = " + obj.id);
		
		//call and print public variable name
	    System.out.println("Public variable : Name = " + obj.strname);
	    
	    //You CANNOT CALL private variable as it is subjected to the class only - SSN number
	    
	    //call and print protected variable user name - it can only be accessed when accessing the class 
	    System.out.println("Protected variable : UserName = " + obj.username);
	    
	  //call and print protected variable pwd - it can only be accessed when accessing the class 
	    System.out.println("Protected variable : Password = " + obj.password);
	    
	    System.out.println("Defaiult Method and its vairables:");
	  //call and print default method getaddress 
	    obj.getAddress(obj.id);
	   
	    
		

	}

}
