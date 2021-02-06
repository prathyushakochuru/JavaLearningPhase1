package TypeCasting;
import java.util.*;

public class Numbergame {
	
	//print numbers 1 to 100 - if multiple of 3, then print 'fizz' only. 
	//If multiple of 3 and 5, then print 'fizz buzz'
	

	public static void main(String[] args) {
		int i = 1;
		
		for(i=1; i<=100; i++) {
			if(i%3 != 0 & i%5 !=0)
			{
			System.out.println(i);
			}else
				if(i%5 ==0 & i%3 != 0)
				{
					System.out.println(i);
				}else
			if(i%3 == 0 & i%5 !=0)
			{
				System.out.println("fizz");
			}
			else if(i%3 ==0 & i%5==0)
			{
				System.out.println("fizz buzz");
			}
			
		}

	}

}
