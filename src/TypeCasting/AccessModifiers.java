package TypeCasting;
import java.util.Scanner;

public class AccessModifiers {
	//public variable 
	public int id = 10;
	//public variable
	public String strname = "Neena";
	//private variable
	private String strSSN = "XXXX-XXX-XX";
	//protected variable
	protected String username = "neenak";
	//protected variable
	protected String password = "password123";
	
	//default class
	 void getAddress(int id)
	{
		//default variable
		String addr1 = "102 Mohegan Street";
		String addr2 = "Cope Cod";
		String state = "MA";
		String country = "USA";
		int zipcode = 12233;
		System.out.println("Address:");
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(state);
		System.out.println(country);
		System.out.println(zipcode);
	}

	
}

