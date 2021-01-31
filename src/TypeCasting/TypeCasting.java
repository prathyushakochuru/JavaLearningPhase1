
package TypeCasting;
import java.util.Scanner;

public class TypeCasting {
	
	public static void main(String[] args) {
		String s1 = "";
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a string value in number:");  
		s1 = scanner.next();
		
		//parsing integer to string
		int x = Integer.parseInt(s1);
		System.out.println("x = " + x);
		
		//changing s1 value here
		s1 = "0.90";
		
		float f = Float.parseFloat(s1);
		System.out.println("f = " + f);
	}

}
