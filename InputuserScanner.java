package educatiio;
import java.util.Scanner;
public class InputuserScanner {
	
public static void main(String[] args) {
	double ns=1;
	System.out.println("Chulindra please enter number");
	try{Scanner ss = new Scanner(System.in);
	{
		ns= ss.nextDouble();}
		
	}
	catch(Exception e) {
		System.out.println("Please enter number only");
	

	}
	System.err.println(ns + " is You entered ");
	
}
}
