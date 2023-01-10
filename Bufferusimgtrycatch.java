package educatiio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bufferusimgtrycatch {

	public static void main(String[] args) {
	
		int n=0;
		System.out.println("Enter the number");// TODO Auto-generated method stub
BufferedReader br=null;
br =new BufferedReader(new InputStreamReader(System.in));
try {
	n=Integer.parseInt(br.readLine());
} 
catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println(e);
}
finally {
	try {
		 
		br.close();
		System.out.println("Wed closed");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
} System.out.println("Number="+n);

	}
}
